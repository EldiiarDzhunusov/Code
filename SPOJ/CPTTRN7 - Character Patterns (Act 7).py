t=int(input(""))
while t!=0:
    numbers = (input("").split())
    l=int(numbers[0])
    c=int(numbers[1])
    s=int(numbers[2])


    for i in range(l):
        for k in range(s*2):
            if k <= (s-1):
                #Первая половина ромба
                list2=[]
                for i in range(c*2):
                    if i%2 ==0:
                        #Для ивен чисел
                        list1=[]
                        for i in range(s):
                            if i == (k%s):
                                list1.append('/')
                            else:
                                list1.append('.')
                        list1.reverse()
                        list2.append(''.join(list1))
                        
                    else:
                        list1=[]
                        for i in range(s):
                            if i==(k%s):
                                list1.append('\\')
                            else:
                                list1.append('.')
                        list2.append(''.join(list1))
                        
                print(''.join(list2))
            else:
                # А это для второй половины ромба
                list2=[]
                for i in range(c*2):
                    if i%2 ==0:
                        #Для ивен чисел
                        list1=[]
                        for i in range(s):
                            if i == (k%s): #мод надо перепроверить
                                list1.append('\\')
                            else:
                                list1.append('.')
                        
                        list2.append(''.join(list1))
                        
                    else:
                        list1=[]
                        for i in range(s):
                            if i==(k%s):
                                list1.append('/')
                            else:
                                list1.append('.')
                        list1.reverse()
                        list2.append(''.join(list1))
                        
                print(''.join(list2))
    t -= 1
                            


