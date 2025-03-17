const inputbox = document.getElementById("input-box");
const listul = document.getElementById("list");
function addTask() {
    if (inputbox.value === "") {
        alert('Please write something')
    }
    else {
        let li = document.createElement("li");
        li.innerHTML = inputbox.value;
        listul.appendChild(li);
        let span = document.createElement("span");
        span.innerHTML = "\u00d7";
        li.appendChild(span);
    }
    inputbox.value = " ";
}

list.addEventListener("click", function (ev) {
    if (ev.target.tagName === "LI") {
        ev.target.classList.toggle("checked");
        savedata();
    }
    else if (ev.target.tagName === "SPAN") {
        ev.target.parentElement.remove();
        savedata();
    }
}, false);


function savedata() {
    localStorage.setItem("data", listul.innerHTML);
}

function showtask() {
    listul.innerHTML = localStorage.getItem("data");
}

showtask();