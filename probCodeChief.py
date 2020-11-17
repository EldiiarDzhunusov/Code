import math

t= int(input(""))
while(t!=0):
        size = int(input(""))
        a1 = (input("").split())
        arr= []
        allcandies=0
        for i in range(len(a1)):
                arr.append(int(a1[i]))
                allcandies+=arr[i]
        
        candies = math.ceil(allcandies/size)
        ans = 0
        extra = 0
        for i in range(len(arr)):
                if arr[i]>candies:
                        ans+=arr[i]-candies
                        extra +=arr[i]-candies
                
                if arr[i]<candies:
                        extra-= candies- arr[i]
        
        if extra<0:
                ans+=abs(extra)
        print(ans)
        print(arr)
        t-=1
                