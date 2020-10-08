// the function returns the value of an index n in the Tetranacci Sequence.
const tetranacciSequence = n =>{
    let lasts = [-1,1,0];
    let cont = 0;
    while(cont<n){
        let a=lasts[2];
        let b=lasts[1];
        let c=lasts[0];
        lasts[2]=a+b+c;
        lasts[1]=a;
        lasts[0]=b;
        cont=cont+1;
    }
    return lasts[2]+lasts[1]+lasts[0]
}