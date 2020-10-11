t=int(input(""))
while t!=0:
    numbers = (input("").split())
    l=int(numbers[0])
    c=int(numbers[1])
    h=int(numbers[2])
    w=int(numbers[3])

    list1=['.','-','|','+']


    for i in range(h):
            list2=[]
            for i in range(w):
                list2.append(list1[0])
            for i in range(c):
                list2.append(list1[2])
                for i in range(w):
                    list2.append(list1[0])
            print(''.join(list2))
    for i in range(l):
        #Делает деления, Плюсики которые
        list2=[]
        for i in range(w):
            list2.append(list1[1])
        for i in range(c):
            list2.append(list1[3])
            for i in range(w):
                list2.append(list1[1])
        print(''.join(list2))


        for i in range(h):
            list2=[]
            for i in range(w):
                list2.append(list1[0])
            for i in range(c):
                list2.append(list1[2])
                for i in range(w):
                    list2.append(list1[0])
            print(''.join(list2))
    print("")
    t -=1
        
