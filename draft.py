f = open("input.txt", "r")
ans = f.read()
#To print the content of the whole file
ans = ans.split(" ")
a = int(ans[0])
b = int(ans[1])
answer = a+b
answer = str(answer)

out = open("output.txt", "w")
out.write(answer)

