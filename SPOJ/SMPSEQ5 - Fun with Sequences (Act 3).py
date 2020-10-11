# It is wrong! it gives me Runtime Error NZEC
# It is right, but just does not work with python

n= int(input('')) # просто цифра
S= (input('').split()) # эта часть спрашивает инпут, затем этот стринг переводит в лист, разделяя пробелом
m=int(input('')) #просто цифра
Q=(input('').split()) # эта часть спрашивает инпут, затем этот стринг переводит в лист, разделяя пробелом

#А тут самое интересное :)

for i in range(len(S)):
# Сравнивает каждый элемент S c Q (Листы) и смотрит, похожие ли они и важно (важно что бы они были похожи по порядку: S[0]==Q[0] S[1]==Q[1])
# что бы число i+1 не превышало n и m
    if S[i]==Q[i] and (i+1)<= n and (i+1) <=m:   
        # ну и принтить i+1 в одну строку, не как:          >>>1
        #                                                   >>>2
        #                                                   >>>3
        #а вот так:                                         >>>1 2 3
        print((i+1),end=" ")

#Само Задание
'''
You are given a sequence of n integers S = s1, s2, ..., sn and a sequence of m integers Q = q1, q2, ..., qm. Please, print in the ascending order all such i, that si = qi, i<=n, i<=m.

Input data specification
In the first line you are given one integer 2<=n<=100, and in the following line n integers:
-100 <= si <= 100, si <= si+1.

In the third line you are given one integer 2<=m<=100, and in the following line m integers:
-100 <= qi <= 100, qi <= qi+1.

Output data specification
The sequence of requested integers separated by spaces.



Input:
5
-2 -2 -1 1 4 
6
-3 -2 -1 1 2 3

Output:
2 3 4 

'''