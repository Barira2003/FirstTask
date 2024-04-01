# To Check Whether A Number Is A Special Number Or Not.
n = int(input("Enter the number to be checked: "))
if n > 9:
    t = n
    sum = 0
    while t > 0:
        d = t % 10
        t = t // 10
        sum = sum + d
    t = n
    product = 1
    while t > 0:
        d = t % 10
        t = t // 10
        product = product * d
    if (sum + product) == n:
        print("Special Number.")
    else:
        print("Not a Special Number.")
else:
    print("Invalid Number.")