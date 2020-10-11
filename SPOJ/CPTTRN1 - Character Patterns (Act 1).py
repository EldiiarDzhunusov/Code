t=int(input(""))
while t!=0:
    numbers= (input("")).split()
    l = int(numbers[0])
    c = int(numbers[1])


    list0=['*','.']
    list1=['.','*']

    k=0
    for i in range(l):
        list3=[]
        if k == 0:
            for i in range(c):
                if i%2 == 0:
                    list3.append(list0[0])
                else:
                    list3.append(list0[1])
            k= 1
        else:
            for i in range(c):
                if i%2 == 0:
                    list3.append(list1[0])
                else:
                    list3.append(list1[1])
            k=0
        print("".join(list3))
    print("")
    t-=1