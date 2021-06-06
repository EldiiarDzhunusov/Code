


nums = (input("")).split()
n = int(nums[0])
m = int(nums[1])
l= int(nums[2])


list1 = []
for i in range(n):
        request = (input("")).split()
        request[1] = float(request[1])
        request[2] = int(request[2])
        request[3] = int(request[3])
        request.append(i)
        list1.append(request)
list1.sort()

list1 = sorted(list1, key=lambda a_entry: a_entry[1]) 
taken = []
for i in range(m+1):
        taken.append(False)
if(l==1):
        for i in range(n):
                if(list1[i][2]==1):
                        if(list1[i][3]==-1):
                                list1[i][2]=0
                                continue
                        if(list1[i][3]>m):
                                list1[i][3]=-1
                        elif(list1[i][3]!=0):
                                taken[list1[i][3]]=True
        index = 1   
                       
        for i in range(n):
                if(list1[i][2]==0):
                        if(index>m):
                                list1[i][3]=-1
                                continue
                        if(list1[i][3]!=0):
                                check =True
                                while(taken[index]):
                                        index+=1
                                        if(index>m):
                                                check =False
                                                break
                                if(check):
                                        taken[index]=True
                                        list1[i][3]=index
                                        index+=1
                                else:
                                        list1[i][3] = -1
else:
        index = 1
        for i in range(n):
                if(list1[i][3]==-1):
                        list1[i][2] = 0
                if(index>m):
                        list1[i][3]=-1
                elif(list1[i][3]!=0):
                        list1[i][3]=index
                        index+=1

# print(list1)

for i in range(n):
        print(list1[i][0]+" " + str(list1[i][1])+" " + str(list1[i][2])+" " + str(list1[i][3]))


# lst1 = sorted(lst, key=lambda a_entry: a_entry[1]) 
# print(lst1) 
