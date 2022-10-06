T = int(input())

for i in range(T):
    s = input()
    check = 0
    for j in s:
        if j == '(':
            check += 1
        else:
            check -= 1
        if check < 0:
            print('NO')
            break
    if check == 0:
        print('YES')
    elif check > 0:
        print('NO')