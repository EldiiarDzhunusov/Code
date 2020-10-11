x=1
t=int(input(""))
while t!=0:
    try:
        n=int(input(""))
        list1=[]
        for i in range(n):
            time= (input("").split())
            for i in range(len(time)):
                time[i]=int(time[i])
            list1.append([time[0],time[1]])

        check = list(list1)
        
        #sort
        list1=sorted(list1,key = lambda each: each[0])
        

        listc=[]
        listj=[]



        def intersection(lst1, lst2): 
            lst3 = [value for value in lst1 if value in lst2] 
            if lst3 != []:
                return True
            else:
                return False


        for k in range(len(list1)):
            list2=[]
        
            for m in range(len(listc)):
                if intersection(range(list1[k][0],list1[k][1]),range(listc[m][0],listc[m][1])):
                    list2.append(intersection(range(list1[k][0],list1[k][1]),range(listc[m][0],listc[m][1])))
                    for i in range(len(listj)):
                        if intersection(range(list1[k][0],list1[k][1]),range(listj[i][0],listj[i][1])):
                            raise ValueError("")
                            

            if True not in list2:
                listc.append([list1[k][0],list1[k][1]])
                
            else:
                listj.append([list1[k][0],list1[k][1]])
                
#Transforming list1 to list10
        list10=[]
        for i in range(len(check)):
            if check[i] in listc:
                list10.append("C")
                listc.pop(listc.index(check[i]))
            else:
                list10.append("J")
                listj.pop(listj.index(check[i]))
        print("Case #{}:".format(x),"".join(list10))
        x +=1
        t -=1
    except:
        print("Case #{}: IMPOSSIBLE".format(x))
        x +=1
        t -=1

    


#потом все закидывать в первый лист елс во второй