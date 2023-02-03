/**
 * Assign a click event handler to the add button with an id of addTask.
 *
 * When the add button is clicked:
 *  - If the textbox is empty, generate an alert with the text “Error: Please enter a task first”.
 *  - If the text box is not empty, generate an alert with the text containing the task name. For example, if the text in the input box is “Complete Assignment”, generate an alert with text “New Task: Complete Assignment”.
 *  - Clear the text inside the text box after the add button is clicked.
 */

$(document).ready(function () {
    // code goes here

    $("#addTask").on('click', function(e){
        e.preventDefault()
        const text = $('.textBox').val();
        
        if(!text){
            alert("Error: Please enter a task before clicking the 'Add' button.");
            return;
        }

        const taskBox = $('<div>',{
            "class": "task"
        });

        taskBox.html(`<p>${text}</p><p><i class="button fa-solid fa-check"></i><p><i class="button fa-solid fa-trash-can"></i></p>`)

        
        // console.log(taskBox.html)
        $('.notCompleted').append(taskBox);

    })

});