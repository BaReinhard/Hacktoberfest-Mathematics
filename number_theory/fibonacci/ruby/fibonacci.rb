
# Returns a list of n fibonacci numbers
def fibonacci(n)
    fib_numbers = [0, 1]
    (2..n-1).each do |i|
        fib_numbers[i] = fib_numbers[i-1] + fib_numbers[i-2]
    end
    fib_numbers
end

puts fibonacci 10
    
