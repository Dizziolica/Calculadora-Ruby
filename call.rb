
puts "Hello, World!"

puts("Escolha um numero")
num1 = gets.chomp().to_i 
puts("Escolha um operador")
opera = gets.chomp()
puts("Escolha mais um numero")
num2 = gets.chomp().to_i

puts "Seu numero é  "
  
if opera == "+"
  puts(num1 + num2)

elsif opera == "/"
  puts(num1 / num2)

elsif opera == "-"
  puts(num1 - num2)

else
  puts num1 * num2

end
  
  
