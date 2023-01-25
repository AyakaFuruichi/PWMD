const addBtn = document.getElementById('add-btn');
// const text = document.getElementById('add-input').textContent;
const list = document.getElementById('list');


addBtn.addEventListener(`click`, function addListFunc() {

    

    // add list tag
    const addList = document.createElement('li');
    // addList.textContent = "勉強する";

    // add title
    const title = document.createElement('p');
    title.textContent = document.getElementById('add-input').value;
    addList.appendChild(title);

    //add icons
    const iconPara = document.createElement('p');
    const icon1 = document.createElement('i');
    const icon2 = document.createElement('i');
    icon1.classList = "fa fa-pencil-square-o"; 
    icon2.classList = "fa fa-times";
    iconPara.appendChild(icon1);
    iconPara.appendChild(icon2);
    addList.appendChild(iconPara);

    //add input tag
    const input = document.createElement('input');
    input.type = "text";
    input.class = "edit-note";
    addList.appendChild(input);

    list.appendChild(addList);

    return false;
})