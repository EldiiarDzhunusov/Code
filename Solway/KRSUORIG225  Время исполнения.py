#выдает compilation error, скорее всего изза того что между label and loop есть value C =? 
# и поэтому C никогда не уменьшается и луп не заканчивается
cost1= int(input(""))
cost2= int(input(""))
cost3= int(input(""))
cost4= int(input(""))
cost5= int(input(""))
A=0
B=0
C=0
D=0

counter=0
listofmoves=[]
def question(command):
    
    global counter
    global listofmoves
    global A
    global B
    global C
    global D
    
    if command[0]== "MOV":
        if command[1][0]=="A":
            A=int(command[1][2])
        elif command[1][0]=="B":
            B=int(command[1][2])
        elif command[1][0]=="C":
            C=int(command[1][2])
        elif command[1][0]=="D":
            D=int(command[1][2])
        counter+= cost1
        

    elif command[0]== "XCHG":
        
        
        if command[1][0] =='A':
            temp=A
            
            if command[1][2]=='B':
                A=B
                B=temp
            elif command[1][2]=='C':
                A=C
                C=temp
            elif command[1][2]=='D':
                A=D
                D=temp
        elif command[1][0] =='B':
            temp=B
            
            if command[1][2]=='A':
                B=A
                A=temp
            elif command[1][2]=='C':
                B=C
                C=temp
            elif command[1][2]=='D':
                B=D
                D=temp
        elif command[1][0] =='C':
            temp=C
            
            if command[1][2]=='B':
                C=B
                B=temp
            elif command[1][2]=='A':
                C=A
                A=temp
            elif command[1][2]=='D':
                C=D
                D=temp
        elif command[1][0] =='D':
            temp=D
            
            if command[1][2]=='B':
                D=B
                B=temp
            elif command[1][2]=='C':
                D=C
                C=temp
            elif command[1][2]=='A':
                D=A
                A=temp
            


        counter +=cost2
        

    elif ':' in command[0]:
        counter += cost3

    #create new list
    elif command[0]=="LOOP":

        while C>0:
            C -= 1
            for i in range(listofmoves.index([':'+command[1]]),(listofmoves.index(command))):
                
                question(listofmoves[i])
            
    elif command[0] =="NOP":
        counter += cost4
        
    
    
        

while True:
    command=(input("").split())
    listofmoves.append(command)
    if command[0] == "EXIT":
        counter+=cost5
        print(counter)
        break
    else:
        
        question(command)
