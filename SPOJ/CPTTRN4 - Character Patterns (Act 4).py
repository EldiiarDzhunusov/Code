t=int(input(""))
while t!=0:
    numbers = (input("").split())
    l=int(numbers[0])
    c=int(numbers[1])
    h=int(numbers[2])
    w=int(numbers[3])

    list1=['*','.']
    # Этот лист отвечает за длину точек(наверное)
    list2=[]
    for i in range(w):
        list2.append(list1[1])
    list2.append(list1[0])
    list2="".join(list2)
    list3=[]
    for i in range(c*(w+1)+1):
        list3.append(list1[0])
    print(''.join(list3))
    for i in range(l):
        
        for i in range(h):
            list3=[]
            list3.append(list1[0])
            for i in range(c):
                list3.append(list2)
            print(''.join(list3))
        list3=[]
        for i in range(c*(w+1)+1):
            list3.append(list1[0])
        print(''.join(list3))
    print("")
    t-=1
