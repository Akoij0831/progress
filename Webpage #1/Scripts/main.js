function clickMe() {
    alert("You clicked the button!");
    document.getElementById("myButton").addEventListener("click", clickMe);
}