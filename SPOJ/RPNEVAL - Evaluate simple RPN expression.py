list1 = (input('').split())


d={ "/": lambda x,y: x/y,
    "*": lambda x,y: x*y,
    "+": lambda x,y: x+y,
    "-": lambda x,y: x-y}
try: #Trying to see if there are no other signs
    for i in range(len(list1)):
        if list1[i] not in d.keys():
            list1[i]= float(list1[i])
except:
    print("ERROR")
    exit()

#This is in case of signs > than needed
countint=0
countsigns=0
for i in range(len(list1)):
    if type(list1[i])==float:
        countint += 1
    else:
        countsigns +=1
if countsigns+1 != countint:
    print("ERROR")
    exit()

#Function
def a(list1):
    for i in range(len(list1)):
        if type(list1[0])==float and type(list1[1])==float: # To Prevent 2 / 3 and / 2 3 situations
            if ("+" in list1) or ("-" in list1) or ("/" in list1) or ("*" in list1):# Prevent Numbers > sings
                if list1[i] in d.keys(): 
                    list1[i-2]= d[list1[i]](list1[i-2],list1[i-1])
                    list1.pop(i)
                    list1.pop(i-1)
                    list1=list(list1) #I did it in just case to update list1, because Python points to the memory, not the object
                    
                    if len(list1)==1:
                        return list1
                    return a(list1)
                
            else:
                list1="ERROR"
                return list1
        else:
            list1="ERROR"
            return list1
b=a(list1)

if b=="ERROR":
    print(b)

else:
    c=float(b[0])
    print(("%.4f"%c))


