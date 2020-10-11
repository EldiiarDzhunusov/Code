t=int(input(""))
x=1
while t!=0:
    n=int(input(""))
    print("Case #{}:".format(x))
    if n > 660:
        print("1 1")
        print("2 1")
        print("3 2")
        print("4 2")
        print("5 3")
        print("6 3")
        print("7 4")
        print("8 4")
        print("9 5")
        print("10 5")
        print("11 5")
        print("11 4")
        print("11 3")
        print("11 2")
        print("11 1")
        #sums is 660
        p=660
        print(p)
        for i in range(n-648):
            if i >11:
                print(i,1)
                p +=1
                
        x= x+1
        print(p)
        t=t-1
    elif n >401:
        print("1 1")
        print("2 1")
        print("3 2")
        print("4 2")
        print("5 3")
        print("6 3")
        print("7 4")
        print("8 4")
        print("9 5")
        print("10 5")
        print("10 4")
        print("10 3")
        print("10 2")
        print("10 1")
        #Here my sum is 404
        
        for i in range(n-393):
            if i >10:
                print(i,1)
                
        x= x+1
        t=t-1
    
    else:
        for i in range(n):
            print(i+1, 1)
        t=t-1
        x=x+1
