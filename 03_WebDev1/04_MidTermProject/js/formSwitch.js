// ************************************************
// Switch showing Items API
// ************************************************

function formSwitch() {
    var hoge = document.getElementsByName('marker')
    if (hoge[0].checked) {
        // if selected all
        document.getElementById('treeList').style.display = "";
        document.getElementById('ornamentList').style.display = "";
        document.getElementById('otherList').style.display = "";
    } else if (hoge[1].checked) {
        // if selected tree
        document.getElementById('treeList').style.display = "";
        document.getElementById('ornamentList').style.display = "none";
        document.getElementById('otherList').style.display = "none";
    } else if (hoge[2].checked) {
        // if selected ornament
        document.getElementById('treeList').style.display = "none";
        document.getElementById('ornamentList').style.display = "";
        document.getElementById('otherList').style.display = "none";
    } else if (hoge[3].checked) {
        // if selected other
        document.getElementById('treeList').style.display = "none";
        document.getElementById('ornamentList').style.display = "none";
        document.getElementById('otherList').style.display = "";
    } else {
        //nothing to do
        document.getElementById('treeList').style.display = "none";
        document.getElementById('ornamentList').style.display = "none";
        document.getElementById('otherList').style.display = "none";
    }
}
window.addEventListener('load', formSwitch());