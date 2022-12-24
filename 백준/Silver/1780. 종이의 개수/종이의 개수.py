import sys

n = int(sys.stdin.readline())
arr = [list(map(int, sys.stdin.readline().split())) for _ in range(n)]

negativeOne = 0
zero = 0
positiveOne = 0


def dfs(x, y, n):
    global negativeOne, zero, positiveOne
    number = arr[x][y]

    if n == 1:
        if number == -1:
            negativeOne += 1
        elif number == 0:
            zero += 1
        else:
            positiveOne += 1
        return

    for i in range(x, x + n):
        for j in range(y, y + n):
            if number != arr[i][j]:
                for a in range(x, x + n, n // 3):
                    for b in range(y, y + n, n // 3):
                        dfs(a, b, n // 3)
                return

    if number == -1:
        negativeOne += 1
    elif number == 0:
        zero += 1
    else:
        positiveOne += 1


dfs(0, 0, n)
print(negativeOne)
print(zero)
print(positiveOne)
