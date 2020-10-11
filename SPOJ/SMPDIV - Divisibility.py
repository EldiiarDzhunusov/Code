t=int(input(""))
while t!=0:
    numbers = (input("").split())
    n=int(numbers[0])
    x=int(numbers[1])
    y=int(numbers[2])
    list2=[]
    for i in range(n):
        if i%x ==0 and i%y !=0:
            list2.append(str(i))
    print(' '.join(list2))
    t-=1