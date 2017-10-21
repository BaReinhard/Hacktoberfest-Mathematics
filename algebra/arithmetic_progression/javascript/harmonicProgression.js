function sumHP(a,n,temp){
  sum = (n*(a+temp[temp.length-1]))/2
  HPSum =Math.pow(sum,-1)
}
function formHP(firstTerm,diff,numOfTerms){
  var terms
  for(i=1;i<=numOfTerms;i++){
    terms= firstTerm+(i-1)*diff
    HpTerms = Math.pow(terms,-1)
    resultHP.push(HpTerms);
  }
  sumHP(firstTerm,numOfTerms,resultHP)
}
