/* JavaScript DOM Exercises 01 */

/*
  Exercise 01
  -----------
  Highlight all of the words over 8 characters long in the paragraph text (with a yellow background for example)
*/

// *add mark tag*
const text = document.querySelector("p");
// console.log(text.textContent);
text.innerHTML = text.textContent.split(" ").map(function(word){
  if(word.length > 8 ){
    return `<mark>${word}</mark>`;
  }
  return word;
}).join(" ");



/*
  Exercise 02
  -----------
  Add a link back to the source of the text after the paragraph tag.
  (http://officeipsum.com/)
*/

const addLink = document.createElement("a");
addLink.href = "http://officeipsum.com/";
addLink.innerText = "link to officeipsum.com"
document.body.appendChild(addLink);

/*
  Exercise 03
  -----------
  Split each new sentence on to a separate line in the paragraph text.
  A sentence can be assumed to be a string of text terminated with a period (.)
*/

text.innerHTML = text.innerHTML.split(".").join(".<p></p>");



/* 
  Exercise 04
  -----------
  Count the number of words in the paragraph tag and display the count after the heading.
  You can assume that all words are separated by one singular whitespace.
*/

const counter = document.documentElement("p");
counter = counter.innerHTML.split(" ");


/*
  Exercise 05
  -----------
  Replace all question marks (?) with thinking faces (🤔) and exclamation marks (!) with astonished faces (😲) 
*/