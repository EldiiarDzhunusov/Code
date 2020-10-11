t=int(input(""))
while t!=0:
    numbers = (input("").split())
    n=float(numbers[0])
    x=float(numbers[1])
    b=n+x
    if int(b) == b:
        b=int(b)
    print(b)
    t-=1