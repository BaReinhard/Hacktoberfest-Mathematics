# This gives you all the prime factors of a given number

def prime_factors( num )
  prime_array = []
  while num > 0

    2.upto(num) do |x|
      if num == x
        prime_array << x
        return prime_array
      end
      if num % x == 0
        num = num / x
        prime_array << x
        break
      end
    end
    
  end
  prime_array
end