first =input("")
second = input("")
first = first.replace("?", "")
first = first.replace("*", "")
second = second.replace("?", "")
second = second.replace("*", "")

if first == second:
    print("yes")
else:
    print("no")