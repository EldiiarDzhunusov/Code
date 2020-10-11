t=int(input(""))
x=1
while t!=0:
    list1 = (input("").split())
    numbers = (input("").split())
    for i in range(len(numbers)):
        numbers[i]= int(numbers[i])
    size = int(list1[0])
    count = int(list1[1])
    counter = 0
    list2=[]
    numbers.append("mishka")

    for i in range(len(numbers)):
        if numbers !="mishka":
            if numbers[i] == count: #вот сюда не заходит
                a = numbers[i]
                for k in range(count):
                    a=a-1
                    if numbers[i+k+1] !="mishka":
                        if numbers[i+k+1] == a:
                            if numbers[i+k+1] == 1:
                                list2.append(True)
                        else:
                            break
                    else:
                        break
        else:
            break
    ans=list2.count(True)
    print("Case #{}: {}".format(x,ans))
    x = x+1
    t = t-1
