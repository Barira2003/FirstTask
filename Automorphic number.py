#Program to check the given number is an Automorphic number or not

num = int(input("Enter a number: \n"))

#find number of digits in num 
n = len(str(num))

#compute square
sqr = num**2

#Extract last n digits from the square
last = sqr%pow(10,n)

#compare last n digits with the input number
if last == num:
  print(num,"is an Automorphic Number")
else:
  print(num,"is Not an Automorphic Number")
