var fibonacci = (n) => (n<=1) ? n : fibonacci(n-1) + fibonacci(n-2);

console.assert([0,1,2,3,4,5,6,7,8,9].map(n=>fibonacci(n)).toString()==[0,1,1,2,3,5,8,13,21,34].toString());
