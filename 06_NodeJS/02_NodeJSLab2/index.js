const http = require("http");
const fs = require("fs");

const server = http.createServer();
// .listen(8000, () => console.log("the request from localhost:8000"));

server.on("request", (req, res) => {
	if (req.url === "/") {
		res.statusCode = 200;
		res.setHeader("Content-Type", "text/html"); //MIME
		res.write(`
      <html>
        <body>
          <h1>Hello Node!</h1>
          <p><a href='/read-message' >> To read-message</a></p>
          <p><a href='/write-message' >> To write-message</a></p>
        </body>
      </html>
      `);
		res.end();
	}
	if (req.url === "/read-message") {
		res.statusCode = 200;
		res.setHeader("Content-Type", "text/html"); //MIME
    fs.readFile("message.txt", "utf-8", (err, data) => {
      if (err) throw err;
		res.write(`
      <html>
        <body>
          <h1>This is Read-message Page</h1>
          <p><a href='/'>>Back to home</a></p>
          <p><a href='/write-message' >>To write-message</a></p>
          <p>${data ? data : ''}</p>
        </body>
      </html>
      `);
		res.end();
	});
}
	if (req.url === "/write-message") {
		res.statusCode = 200;
		res.setHeader("Content-Type", "text/html"); //MIME
		res.write(`
      <html>
        <body>
          <h1>This is Write-message Page</h1>
          <p><a href='/'>>Back to home</a></p>
          <p><a href='/read-message' >>To read-message</a></p>

          <form method="POST">
          <input type="text" name="name"><br>
          <input type="submit">
        </form>
        </body>
      </html>
      `);
		res.end();
	}

	if (req.url === "/write-message" && req.method === "POST") {
		const body = [];

		req.on("data", (chunk) => {
			// console.log(chunk)
			body.push(chunk); //build up process
		});

		req.on("end", () => {
			const parsedBody = Buffer.concat(body).toString();
			console.log(">>> ", parsedBody);

			//pretend to save to db (saving to a local file)
			const message = parsedBody.split("=")[1];
      console.log(">>> ", message);

			fs.writeFile("message.txt", message, (err) => {
				if (err) throw err;
				// res.statusCode = 302;
				// res.setHeader("Location", "/");
				// return res.end();
			});
		});
	}

	if (req.url === "/read-message" && req.method === "POST") {
		req.on("end", () => {

			fs.readFile("message.txt", "utf-8", (err, data) => {
				if (err) throw err;
				// res.statusCode = 200;
				// res.setHeader("Content-Type", "text/html"); //MIME
        console.log('data'+data);
				res.write(`
          <html>
          <body>
            <h1>This is Read-message Page</h1>
            <p><a href='/'>>Back to home</a></p>
            <p><a href='/write-message' >>To write-message</a></p>
            <p>${data ? data : ''}</p>
          </body>
        </html>
      `);
				res.end();
			});
		});
	}
});

server.listen(8000);
