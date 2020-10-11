t=int(input(""))
x=1
while t!=0:
    k=0
    r=0
    c=0
    listofc=[]

    n= int(input("")) #Size
    for i in range(n):
        list1=[]
        m = (input("").split())
        for p in range(len(m)):
            m[p]=int(m[p])
        
        #Fun starts here
        for b in range(len(m)):
            if m.count(m[b])>1:
                list1.append(True)
            if b == i:
                k = k + m[b]
        #K works!
        if True in list1:
            r= r+ 1
        listofc.append(m)

    for i in range(len(listofc)):
        list2=[]
        list3=[]
        for y in range(len(m)):
            list2.append(listofc[y][i])
        for p in range(len(list2)):
            if list2.count(list2[p]) > 1:
                list3.append(True)
        if True in list3:
            c = c +1


    print("Case #{}:".format(x),k,r,c)
    x= x+1
    t -= 1