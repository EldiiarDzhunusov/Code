list1 = []
for i in range(100):
    line = input("")
    name = line.split(",")
    for j in range(len(name)):
        name[j]=int(name[j])
        if name[j]%7==0:
            list1.append(name[j])
    

print(min(list1))