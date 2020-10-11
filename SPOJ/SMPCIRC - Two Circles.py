import math
t=int(input(''))
while t!=0:
    numbers = (input("").split())
    x1=int(numbers[0])
    y1=int(numbers[1])
    r1=int(numbers[2])
    x2=int(numbers[3])
    y2=int(numbers[4])
    r2=int(numbers[5])
    #finding for inner tangent assuming that 1 is bigger than 2
    a= abs(x1-x2)
    b= abs(y1-y2)
    c=a**2+b**2
    c=math.sqrt(c)

    if c+r2 == r1:
        print('E')
    elif c+r1== r2:
        print('E')

    #finding if it is inside
    elif c+r2 < r1:
        print('I')
    elif c+r1 < r2:
        print('I')

    else:
        print('O')
    t-=1