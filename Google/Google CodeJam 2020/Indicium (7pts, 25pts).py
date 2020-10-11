x=1
t=int(input(""))
while t!=0:
    try:
        dadada = (input("").split())
        k = int(dadada[1])
        n = int(dadada[0])
        listofn=[]


        for i in range(n):
            listofn.append(i+1)





        k = k/n
        if k != int(k):
            raise ValueError("")
        k=int(k)
        list1=[]
        listofn.remove(k)


        cake=[]

        #заполняет k в нужных местах
        for r in range(n):
            cake=[]
            for c in range(n):
                if r==c:
                    cake.append(k)
                else:
                    cake.append(0)
            list1.append(list(cake))

        #До сюда вроде норм работает
        for r in range(len(list1)):
            index1=list1[r].index(k)
            for c in range(len(list1)-1):
                c=c+1
                list1[r][index1-c]=listofn[-c]


        #просто переводит в стринг что бы потом распечатать
        for k in range(len(list1)):
            for i in range(len(list1)):
                list1[k][i]=str(list1[k][i])
        print("Case #{}: POSSIBLE".format(x))
        for k in range(len(list1)):
            print(" ".join(list1[k]))

        x = x+1
        t = t-1
    except:
        print("Case #{}: IMPOSSIBLE".format(x))
        x = x+1
        t = t-1