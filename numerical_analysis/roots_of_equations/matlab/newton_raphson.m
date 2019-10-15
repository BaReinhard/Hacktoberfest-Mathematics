%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
%                Newton Raphson Method                  %%
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

clear all;
close all;

%% Plotting Graph
f = @(x) x^3 - 3*x^2 +x-3
X = [-1:0.1:3];
%Y = [-1:0.1:3];
n = 1;
for x = [-1:0.1:3];
    Y(n) = f(x);
    n = n + 1;
end
plot(X,Y); grid on;
xlabel("x"); ylabel("f(x)");

%% Analyzing results for different initial guess
NewtonRaphson(1,3);
NewtonRaphson(2,3);

%% The Newton Raphson Iteration Scheme
function y = NewtonRaphson(m, x0)

%% Function Defination
syms x;
f = @(x) x^3 - 3*x^2 +x-3;
fprime = eval(['@(x)' char(diff(f(x)))]);

%% Stopping criteria
x0 = 1.25 ; %  initial approximation to location of root
TOL = 10^(-8); % absolute error convergence tolerance
Nmax =50; % maximum number of iterations to be performed

%% Iteration Scheme

flag=0;
for i = 1 : Nmax
    fold=f(x0);
    fprimeold=fprime(x0);
    dx = m*(fold / fprimeold);
    x0 = x0 - dx;
    fprintf ( '\t\t %3d \t %.10f \n', i, x0 );
    
    if ( abs(dx) < TOL )
        flag=1;
        break
    end
end

%% Results
fprintf("# Taking the initial guess as x_0 = %.1f \n", x0);
if flag == 0
    disp('Maximum number of iterations exceeded.')
end
fprintf('\n The approximate solution is %f \n', x0)

end