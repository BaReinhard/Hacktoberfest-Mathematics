%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
%%%                   Secant Method                               %%%  
%%%   approximate the root of an arbitrary function using the     %%%
%%%                    Secant Method                              %%%
%%%                                                               %%%
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

clear all;
close all;


%% %% Function definition
%%f = @(x) x^3 + 2*x^2 - 3*x -1;
f =@(x) x^3 - 3*x^2 +x-3;
x0=2;
x1=4;                       %  x0,x1   initial approximations to location of root

%% Stopping criteria

TOL=10^(-8);               %  absolute error convergence tolerance
Nmax=100;                   %   maximum number of iterations to be performed

flag=0;
older = x0;   old = x1;
folder = feval(f,older);

%% Main loop i.e. Iteration Scheme

for i = 1 : Nmax
    fold = feval(f,old);
	dx = fold * ( old - older ) / ( fold - folder );
    new = old - dx;
	
	%%fprintf('\t\t %3d \t %.15f \n', i, new )
	fprintf('\t\t %3d \t %.4f \t %.5f \n', i, new,fold )
	if ( abs(dx) < TOL ) 
	   flag=1;
       break
	else
	   older = old;
	   old = new;
	   folder = fold;
	end
	
end

if flag == 0 
    disp('Maximum number of iterations exceeded') 
end