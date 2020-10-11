a=int(input(""))
b=int(input(""))
if(a%b!=0):
    a+=b-(a%b)
else:
    a+=b
print(a)
