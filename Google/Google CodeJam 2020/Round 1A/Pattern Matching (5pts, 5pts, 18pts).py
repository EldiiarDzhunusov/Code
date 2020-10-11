n = int(input())
for j in range(1, n + 1):
    array = []
    for i in range(int(input())):
        array.append(input())
    array.sort(key=len, reverse = True)
    res = ''
    for i in range(len(array)):
        if i == 0:
            continue
        if array[0][len(array[0])-len(array[i])+1:] != array[i][1:]:
            res = "*"
            break
    if res == "*":
        print("Case #{}: {}".format(j, res))
    else:
        print("Case #{}: {}".format(j, array[0][1:]))