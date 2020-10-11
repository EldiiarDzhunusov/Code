t= int(input(""))
while t!=0:
    word = input("")
    list1 =list(word)
    list2 =[]
    for i in range(int(len(list1)/2)):
        if i%2 == 0:
            list2.append(list1[i])
    print("".join(list2))
    t=t-1