
def PF_A(b, c)
  a = c.to_f**2 - b.to_f**2
  return Math.sqrt(a).round
end
def PF_B(a, c)
  b = c.to_f**2 - a.to_f**2
  return Math.sqrt(b).round
end
def PF_C(a, b)
  c = a.to_f**2 + b.to_f**2
  return Math.sqrt(c).round
end


def is_float?(fl)
  !!Float(fl) rescue false
end

def get_input
  user_input = nil
  until (is_float?(user_input))
      puts "Please enter a number"
      user_input = gets.chomp
  end
  user_input
end

side_a = nil
side_b = nil
side_c = nil


puts "What side are you tring to find? a, b, c?"
user_input = gets.chomp
until (user_input == 'a' or user_input == 'b' or user_input == 'c')
    puts "Please enter a or b or c"
    user_input = gets.chomp
end
puts "OK! now lets get what you know"
if user_input == 'a'
   puts "Side B?"
   side_b = get_input
   puts "Side C?"
   side_c = get_input
   puts "A is equal to #{PF_A(side_b, side_c)}"
elsif user_input == 'b'
   puts "Side A?"
   side_a = get_input
   puts "Side C?"
   side_c = get_input
   puts "B is equal to #{PF_B(side_b, side_c)}"
elsif user_input == 'c'
   puts "Side A?"
   side_a = get_input
   puts "Side B?"
   side_b = get_input
   puts "C is equal to #{PF_C(side_b, side_c)}"
end
