function armstrong(num){
  var dataNum= num.toString();
  var result=0
  for(var i =0; i<dataNum.length;i++){
    result = result + Math.pow(dataNum[i],3) 
  }
  if(result === num){
    alert(dataNum+"is a armstrong number")
  }
  else{
    alert(dataNum+"is not an armstrong number")
  }
}
