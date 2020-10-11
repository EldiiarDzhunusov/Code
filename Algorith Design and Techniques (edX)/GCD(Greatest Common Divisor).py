def gcd(x,y):
    if x==0:
        return y
    elif y==0:
        return x
    else:
        if x>y:
            return gcd(x%y,y)
        else:
            return gcd(x,y%x)
print(gcd(3918848,1653264))

