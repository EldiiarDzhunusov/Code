n= int(input(""))
numbers = (input("").split())
a=int(numbers[0])
b=int(numbers[1])
list1=[]
for i in range(n):
    k=(int(input("")))
    if k>a and k<b:
        list1.append(k)
print(len(list1))