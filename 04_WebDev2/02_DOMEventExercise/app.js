// const addBtn = document.getElementById('add-btn');
// // const text = document.getElementById('add-input').textContent;
// const list = document.getElementById('list');

const form = document.querySelector("#add")
const text = document.querySelector("#add-input")
const list = document.querySelector("#list")


addBtn.addEventListener('submit', function(e) {
    e.preventDefault()
    const inputValue = e.target[0].value;
    if(!inputValue) return;

    const addList = document.createElement('li')
    addList.innerHTML = `<p>${inputValue}</p>
    <p><i class="fa fa-pencil-square-o"></i><i class="fa fa-times"></i></p>
    <input type="text" class="edit-note" />`;
    list.appendChild(addList)

    e.target[0].value = ''

    // // add list tag
    // const addList = document.createElement('li');
    // // addList.textContent = "勉強する";

    // // add title
    // const title = document.createElement('p');
    // // title.textContent = document.getElementById('add-input').value;
    // title.textContent = inputValue;
    // addList.appendChild(title);

    // //add icons
    // const iconPara = document.createElement('p');
    // const icon1 = document.createElement('i');
    // const icon2 = document.createElement('i');
    // icon1.classList = "fa fa-pencil-square-o"; 
    // icon2.classList = "fa fa-times";
    // iconPara.appendChild(icon1);
    // iconPara.appendChild(icon2);
    // addList.appendChild(iconPara);

    // //add input tag
    // const input = document.createElement('input');
    // input.type = "text";
    // input.class = "edit-note";
    // addList.appendChild(input);

    // list.appendChild(addList);

    // return false;
})