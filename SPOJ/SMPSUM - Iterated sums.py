numbers = (input("").split())
a=int(numbers[0])
b=int(numbers[1])
c=0
for i in range(b-a+1):
    c=c+((a+i)**2)
print(c)