var mean = 10; 
var x = 3; // number of successes in given period of time 

function distribution(mean, x) {
	probability = Math.pow(Math.e, -mean) * Math.pow(mean, x);
	probability = probability / factorial(x);
	return probability;
}

function factorial(n) {
   if(n==0) {
      return 1;
   }
   return n * factorial(n-1);
}

distribution(mean, x);
