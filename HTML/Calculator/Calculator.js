
//to dosplay the clicked values on result box
function dis(val){
    document.getElementById("result").value += val;
}
function myFunction(event){

    if(event.key=='1' ||event.key =='2' ||event.key=='3' ||event.key=='.4' ||event.key=='5' ||event.key=='6' ||
    event.key=='7' ||event.key=='8' ||event.key=='9' ||event.key=='0' ||event.key=='.' ||event.key=='+' ||
    event.key=='-' ||event.key=='*' ||event.key=='/')
    
    document.getElementById("result").value += event.key;
}

//if key of == pressed the it should evaluate the expression
// var cal=document.getElementById("calc");
// cal.onkeyup=function (event){
//     if(event.key ===13)
//         solve();
// }

//evaluate the xpression and return result
function solve(){
    let x= document.getElementById("result").value;
    let y= eval(x);
    document.getElementById("result").value=y;
}
// clear the result box when clicked on clear button
function clr(){
document.getElementById("result").value ="";

}