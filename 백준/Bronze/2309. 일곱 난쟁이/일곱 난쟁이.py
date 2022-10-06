arr = []
for i in range(9):
    arr.append(int(input()))

arr.sort()
flag = 0
for i in range(9):
    tmp1 = arr[i]
    arr[i] = 0
    for j in range(i+1, 9):
        tmp2 = arr[j]
        arr[j] = 0
        if sum(arr) == 100:
            flag = -1
            break
        else:
            arr[j] = tmp2
    if flag != -1:
        arr[i] = tmp1
    else:
        break

for i in arr:
    if i != 0:
        print(i)