t=int(input(""))
while t!=0:
    numbers = (input("").split())
    l=int(numbers[0])
    c=int(numbers[1])
    s=int(numbers[2])

    # просто нужно запринтить звездочки
    list3=[]
    for i in range(c*(s+1)+1):
        list3.append('*')
    print(''.join(list3))

    for i in range(l):
        if i%2 == 0:
            for k in range(s):
                #начиная отсюда работа с каждым рядом
                list2=[]
                print('*',end='')
                for i in range(c):
                    
                    if i%2==0:
                        #эта часть делает первый куб четной строки
                        list1=[]
                        for i in range(s):
                            if i == k:
                                list1.append('\\')
                            else:
                                list1.append('.')
                        list1.append("*")
                        list2.append("".join(list1))
                    
                    
                    else:
                        #Эта часть делает второй куб четной строки
                        list3=[]
                        for i in range(s):
                            list3.append(i)
                        list3.reverse()

                        list1=[]
                        for i in list3:
                            if i ==k:
                                list1.append("/")
                            else:
                                list1.append('.')
                        list1.append("*")
                        list2.append("".join(list1))
                print("".join(list2))
            list3=[]
            for i in range(c*(s+1)+1):
                list3.append('*')
            print(''.join(list3))                            
                    

        else: #начало работы с нечетными кубами в роув
            for k in range(s):
                #начиная отсюда работа с каждым рядом
                list2=[]
                print('*',end='')
                for i in range(c):
                    
                    if i%2==0:
                        #эта часть делает первый куб четной строки
                        list3=[]
                        for i in range(s):
                            list3.append(i)
                        list3.reverse()

                        list1=[]
                        for i in list3:
                            if i ==k:
                                list1.append("/")
                            else:
                                list1.append('.')
                        list1.append("*")
                        list2.append("".join(list1))
                    
                    else:
                        #Эта часть делает второй куб четной строки
                        

                        list1=[]
                        for i in range(s):
                            if i == k:
                                list1.append('\\')
                            else:
                                list1.append('.')
                        list1.append("*")
                        list2.append("".join(list1))
                print("".join(list2))
            list3=[]
            for i in range(c*(s+1)+1):
                list3.append('*')
            print(''.join(list3))
    print("")  
    t -= 1




