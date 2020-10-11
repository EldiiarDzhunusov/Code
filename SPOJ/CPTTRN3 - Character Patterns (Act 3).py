t=int(input(""))
while t!=0:
    numbers = (input("").split())
    l=int(numbers[0])
    c=int(numbers[1])

    list1=['*','..*']

    for i in range((l*3)+1):
        if i%3 ==0:
            list2=[]
            for i in range((c*3)+1):
                list2.append(list1[0])
            print("".join(list2))
        else:
            list2=[]
            list2.append(list1[0])
            for i in range(c):
                list2.append(list1[1])
            print("".join(list2))
    print("")
    t -=1