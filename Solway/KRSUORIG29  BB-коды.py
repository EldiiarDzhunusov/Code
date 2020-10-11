# Выдает Wrong Answer; пока не знаю почему
name = input("")
name=name.replace('[b]', '_eldiiar_[b]_eldiiar_')
name=name.replace('[B]', '_eldiiar_[b]_eldiiar_')
name=name.replace('[/b]', '_eldiiar_[/b]_eldiiar_')
name=name.replace('[/B]', '_eldiiar_[/b]_eldiiar_')
name=name.replace('[i]', '_eldiiar_[i]_eldiiar_')
name=name.replace('[I]', '_eldiiar_[i]_eldiiar_')
name=name.replace('[/i]', '_eldiiar_[/i]_eldiiar_')
name=name.replace('[/I]', '_eldiiar_[/i]_eldiiar_')
name=name.replace('[u]', '_eldiiar_[u]_eldiiar_')
name=name.replace('[U]', '_eldiiar_[u]_eldiiar_')
name=name.replace('[/u]', '_eldiiar_[/u]_eldiiar_')
name=name.replace('[/U]', '_eldiiar_[/u]_eldiiar_')

name = name.split("_eldiiar_")
while "" in name:
    name.remove("")
    
a='m'
while '[b]' in name and '[/b]' in name and a=='m':
    
    for i in range(len(name)):
        if name[i] == '[b]':
            a=i
        elif name[i] == '[/b]' and a!='m':                
            name[a]='<b>'
            name[i]='</b>'
            a='m'
            break
a='m'      
while '[i]' in name and '[/i]' in name and a=='m':
    for i in range(len(name)):
        if name[i] == '[i]':
            a=i
        elif name[i] == '[/i]' and a!='m':
            name[a]='<i>'
            name[i]='</i>'
            a='m'
            break
a='m'
while '[u]' in name and '[/u]' in name and a=='m':
    a=0
    for i in range(len(name)):
        if name[i] == '[u]':
            a=i
        elif name[i] == '[/u]' and a!='m':
            name[a]='<u>'
            name[i]='</u>'
            a='m'
            break

print(''.join(name).lower())

# VER 2.0
text=list(input(""))
list4=["i","b","u","I","B","U"]
i=0
while i < len(text):
    if text[i]=="[":
        if text[i+1]=='/' and text[i+3]=="]" and ((text[i+2]) in list4):
            text[i]=(text[i]+text[i+1]+text[i+2]+text[i+3])
            text.pop(i+1)
            text.pop(i+1)
            text.pop(i+1)
        elif text[i+2]=="]" and (text[i+1] in list4):
            text[i]=(text[i]+text[i+1]+text[i+2])
            text.pop(i+1)
            text.pop(i+1)
        i +=1
    else:
        i+=1

#Start to work
b=-1
i=-1
u=-1
t=4
while t!=0:

    for k in range(len(text)):
        if text[k]=="[b]" or text[k]=="[B]":
            b=k
        elif (text[k]=="[/b]" or text[k]=="[/B]") and b> -1:
            text[b]="<b>"
            text[k]="</b>"
            b=-1
            i=-1
            u=-1
            break
        
        elif text[k]=="[i]" or text[k]=="[I]":
            i=k
        elif (text[k]=="[/i]" or text[k]=="[/I]") and i> -1:
            text[i]="<i>"
            text[k]="</i>"
            b=-1
            i=-1
            u=-1
            break
            
        elif text[k]=="[u]" or text[k]=="[U]":
            u=k
        elif (text[k]=="[/u]" or text[k]=="[/U]") and u> -1:
            text[u]="<u>"
            text[k]="</u>"
            b=-1
            i=-1
            u=-1
            break
        elif k==len(text)-1:
            t=0

print("".join(text))