console.log("main.js loaded")

//Variables

let clicks = 0;

//end 

function add(){
    clicks= clicks + 1;
   document.getElementById("Clickcount").innerHTML = 'Clicks: ' + clicks;
};