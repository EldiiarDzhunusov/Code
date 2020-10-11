#This is very efficient way of finding fibonacci numbers
n=int(input("Enter the position of Fibonacci number: "))
list1=[0,1]
for i in range(1,n): #As counting starts from 0
    list1.append(list1[-1]+list1[-2])
print(list1[-1])

#Finding it recursevly (Not efficient)
def fib(n):
    if n==0:
        return 0
    elif n==1:
        return 1
    else:
        return fib(n-1)+fib(n-2)
