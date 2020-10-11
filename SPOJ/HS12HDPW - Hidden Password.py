t=int(input(""))
while t!=0:
    size = int(input(""))
    words=(input("")).split()
    dictionary=list(input(""))
    l=input("")

    list2=[]
    for k in range(len(words)):
        a = [0,0,0,0,0,0] #Это ашка в перевернутом ввиде
        b = [0,0,0,0,0,0] # Это бшка в перевернутом ввиде
        for i in range(6):
            letters=list(words[k])
            for m in range(len(letters)):
                #Начиная отсюда работа идет отдельно с буквами
                c = list(bin(ord(letters[m])))
                c.reverse()
                while len(c) != 6:
                    c.pop()
                #это наш бинарник буквы и размер бинарника только 6 в перевернутом ввиде
                for i in range(len(c)):
                    if i==m:
                        a[m]=c[i]
                for i in range(len(c)):
                    if i==m:
                        b[m]=c[(i+3)%6]
        a.reverse()
        b.reverse()

        a=int(''.join(a),2)
        b=int(''.join(b),2)
        list2.append(dictionary[a])
        list2.append(dictionary[b])
    print(''.join(list2))
    t -=1

