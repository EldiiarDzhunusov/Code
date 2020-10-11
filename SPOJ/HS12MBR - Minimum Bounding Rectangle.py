t=int(input(""))
while t!=0:
    list2=[0,0,0,0]
    m=int(input(""))

    while m!=0:
        numbers = (input("").split())
        l=(numbers[0])
        if l == 'p':
            #For points
            x=(numbers[1])
            y=(numbers[2])
            xl=x
            yl=y
            xr=x
            yr=y
            if xl < list2[0]:
                list2[0]=xl
            if yl < list2[1]:
                list2[1]=yl
            if xr > list2[2]:
                list2[2]=xr
            if yr > list2[3]:
                list2[3]=yr


        elif l=='c':
            #For circles
            x=int(numbers[1])
            y=int(numbers[2])
            r=int(numbers[3])
            xl=x-r
            yl=y-r
            xr=x+r
            yr=y+r
            if xl < list2[0]:
                list2[0]=xl
            if yl < list2[1]:
                list2[1]=yl
            if xr > list2[2]:
                list2[2]=xr
            if yr > list2[3]:
                list2[3]=yr

        elif l=="l":
            #For lines
            x1=(numbers[1])
            y1=(numbers[2])
            x2=(numbers[3])
            y2=(numbers[4])
            if x1>x2:
                xr=x1
                xl=x2
            elif x1<x2:
                xr=x2
                xl=x1
            if y1>y2:
                yr=y1
                yl=y2
            elif y1<y2:
                yr=y2
                yl=y1
            if xl < list2[0]:
                list2[0]=xl
            if yl < list2[1]:
                list2[1]=yl
            if xr > list2[2]:
                list2[2]=xr
            if yr > list2[3]:
                list2[3]=yr
        m= m-1
    for i in range(len(list2)):
        list2[i]=str(list2[i])
    print(" ".join(list2))
    print("")
    t-=1
