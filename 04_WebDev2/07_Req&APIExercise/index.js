const listElement = document.querySelector(".posts")
const fetchButton = document.querySelector("#available-posts button")
const postTemplate = document.querySelector("template")

async function sendHttpRequest(method, url){
    //with XHR
    // const promise = new Promise((resolve, reject) => {
    //     const xhr = new XMLHttpRequest()
    //     xhr.open(method, url)
    //     xhr.onload = function(){
    //         if(xhr.status >= 200 && xhr.status < 300){
    //             //return the data back
    //             resolve(xhr.response)
    //         }else{
    //             reject("Something went wrong..... :<")
    //         }
    //     }
    //     xhr.send();
    // })

    // return promise

    //with fetch() function
    // const response = await fetch(url, {method})
    // const result = await response.json()
    // return result

    // return await fetch(url, {method}).then(r => r.json())

    //with axios
    const { data } = await axios(url, { method })
    return data
    // return axios.get(url)
}

async function fetchPosts() {
    const responseData = await sendHttpRequest("GET", "https://jsonplaceholder.typicode.com/posts")

    console.log(responseData)
    if(responseData.length > 0){
        for(const post of responseData){
            const postElClone = document.importNode(postTemplate.content, true)
            postElClone.querySelector("h2").textContent = post.title
            postElClone.querySelector("p").textContent = post.body
            postElClone.querySelector("li").id = post.id
            listElement.appendChild(postElClone)
        }
    }
}


// READ/GET
fetchButton.addEventListener("click", fetchPosts)

/////////////////

const form = document.querySelector('form')
form.addEventListener("submit", addText)

function addText(e){
    e.preventDefault();

    //json data
    const data = {
        title: document.querySelector('#title').value,
        content: document.querySelector('#content').value
    };

    axios
    .post("https://jsonplaceholder.typicode.com/posts", data, {
        headers: {
        "Content-Type": "application/json",
        Accept: "application/json",
        },
    })
    .then((response) =>
        console.log(`Title:${response.data.title}, content:${response.data.content}`,response)
    )
    .catch((error) => console.log(error));
}




