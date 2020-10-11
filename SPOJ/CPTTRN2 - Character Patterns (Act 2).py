t=int(input(""))
while t!=0:
    numbers = (input("").split())
    l=int(numbers[0])
    c=int(numbers[1])

    list1=['*','.']
    if l > 1:
        list2=[]

        for i in range(c):
            list2.append(list1[0])
        print("".join(list2))

        

        for i in range(l-2):
            list2=[]
            if c == 1:
                list2.append(list1[0])
            else:
                list2.append(list1[0])
                for i in range(c-2):
                    list2.append(list1[1])
                list2.append(list1[0])
            print("".join(list2))
        
        list2=[]
        for i in range(c):
            list2.append(list1[0])
        print("".join(list2))

        print("")
        t -= 1
    else:
        list2=[]
        for i in range(c):
            list2.append(list1[0])
        print("".join(list2))
        t-=1