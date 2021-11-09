def fibonacci(n):
    if n < 0:
        print("Invalid Input!")
    elif n == 1:
        print(0)
    elif n == 2:
        print("0 1")
    else:
        a, b = 0, 1
        print(a, " ", b, " ", end =" ")
        for i in range(n - 2):
            c = a + b
            print(c, " ", end =" ")
            a, b = b, c

print("How many numbers of the Fibonacci Series do you want to print?")
n = input()
fibonacci(int(n))