n=int(input(''))
S = (input("").split())
for i in range(len(S)):
    S[i]=int(S[i])
    
m=int(input(''))
Q = (input("").split())
for i in range(len(Q)):
    Q[i]=int(Q[i])

    
list2=[]
for i in range(len(S)):
    if S[i] not in Q:
        list2.append(str(S[i]))
print(' '.join(list2))