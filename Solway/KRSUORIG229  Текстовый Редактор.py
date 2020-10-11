temp=(input("").split())
n=int(temp[0])
m=int(temp[1])

list1=[]
counter=0
for i in range(n):
    com=input("").split()
    com[0]=int(com[0])
    if len(com)==3:
        for i in range(com[0]):
            list1.insert(counter,com[2])
            counter += 1
        counter-= 1
#This part for 2 sized things    
    else:
        if com[1]=="H":
            if counter-com[0]>0:
                counter -= com[0]
            else:
                counter=0
        else:
            if counter+com[0] < len(list1):
                counter += com[0]
            else:
                counter = len(list1)-1
for i in range(m):
    pos= int(input(""))
    print(list1[pos-1])