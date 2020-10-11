x=1
t=int(input(""))
while t!=0:
    s= list(input(""))
    for i in range(len(s)):
        s[i]=int(s[i])

    s.append("ezhik")
    counter=0
    list1=[]
    for i in range(s[0]):
        list1.append("(")
        counter += 1
    list1.append(s[0])

    def a(i,counter):
        if s[i+1]=="ezhik":
            while counter!= 0:
                list1.append(")")
                counter -= 1
            return 0
        elif s[i]==s[i+1]:
            list1.append(s[i+1])
            a(i+1,counter)

        elif s[i]!= s[i+1]:
            if counter> s[i+1]:
                while counter != s[i+1]:
                    list1.append(")")
                    counter -= 1
                list1.append(s[i+1])
                a(i+1,counter)
            else:
                while counter != s[i+1]:
                    list1.append("(")
                    counter += 1
                list1.append(s[i+1])
                a(i+1,counter)

            
        
    a(0,counter)
    for i in range(len(list1)):
        if type(list1[i])== int:
            list1[i]=str(list1[i])
    print("Case #{}:".format(x),''.join(list1))
    t-=1
    x+=1