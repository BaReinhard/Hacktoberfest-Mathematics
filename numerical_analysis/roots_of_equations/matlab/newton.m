%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
%%%                   Newton's Method                             %%%  
%%%   approximate the root of an arbitrary function using the     %%%
%%%                    Newton's Method                            %%%
%%%                                                               %%%
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

clear all;
close all;

%% %% %% Function definition

f=@(x) x^3 - 3*x^2 +x-3;
fprime =@(x) 3*x^2 -6*x +1;
x0 = 1.25 ;                 %  initial approximation to location of root

%% Stopping criteria

TOL = 10^(-8);             % absolute error convergence tolerance
Nmax =100;                 % maximum number of iterations to be performed
flag=0;

%% Main loop i.e. Iteration Scheme

for i = 1 : Nmax
    fold=f(x0);
    fprimeold=fprime(x0);
	dx = fold / fprimeold;
    %for raphson
    %dx = 2*(fold / fprimeold)
    x0 = x0 - dx;
	fprintf ( '\t\t %3d \t %.10f \n', i, x0 );
	
	if ( abs(dx) < TOL ) 
	   flag=1;
	   break
	end
end

%%
if flag == 0
    disp('Maximum number of iterations exceeded.')
end

fprintf('\n The approximate fixed point is %f', x0)