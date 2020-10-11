t= int(input(""))
while t!=0:
    c=1
    size = int(input(""))
    lydia = list(input(""))
    myroad=[]

    for i in range(len(lydia)):
        if lydia[i]=="E":
            myroad.append("S")
        else:
            myroad.append("E")
        
    print("Case #{}:".format(c),"".join(myroad))
    c +=1
    t -=1