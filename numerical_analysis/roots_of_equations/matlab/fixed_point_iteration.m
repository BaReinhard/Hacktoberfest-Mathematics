%Fixed Point Iteration Example

%   4x^2 = 10 - x^3    can be rewritten as      x^2 = 0.25*(10 - x^3) 
%   ===> x = 0.5*(10- x^3)^0.5   if we take the postive root only.

% Now we can use fixed point iteration.

%% Initial Conditions and Stopping Criteria


i = 1;         
p0 = 0.3;                                           % our guess is p = 1.5.
error = 10^-15;                                     %the precision we want to find our solution in.
N = 100;                                            %max number of iterations.

%% Function definition

%syms 'x'                                            % symbolic variable (could have also declared an inline function.)
%%g(x) = 0.5*((10 - (x^3))^0.5);                      % i.e. what we are trying to solve
%g(x) =  (x^2 + 2 -exp(x))/3;

g =@(t) (t^2 + 2 -exp(t))/3
%% Main loop i.e. Iteration Scheme

while i <= N
    p = g(p0);                                      % the next p value
    fprintf('\t\t %3d \t %.10f \n', i, p)
    if abs((p - p0)) < error                        % stopping criterion using the required precision
        fprintf('Solution is %f \n', double(p))     % the output p is symbolic so need ot force it into a decimal
        return
    end
    
i = i + 1;   
p0 = p;                                                %update the value of i and p to continue the loop with

end



fprintf('Solution did not converge to within precision = %d in %d iterations \n', error, N)



