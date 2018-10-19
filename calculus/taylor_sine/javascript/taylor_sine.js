function taylor_sine(degree, x){
	
	//degree being the number of terms in the sum
	//x being the value whose sine is being calculated
	
	function factorial(n){
		if(n==0){
			return(1);
		}else{
			return(n*factorial(n-1));
		}
	}
	
	ans = 0;
	for(i=1;i<=degree;i++){
		ans += (-1)**(i-1) * (x**(2*i - 1))/factorial(2*i - 1);
	}
	return(ans);
}
