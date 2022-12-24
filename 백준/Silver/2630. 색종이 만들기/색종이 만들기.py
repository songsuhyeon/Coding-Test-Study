import sys

n = int(sys.stdin.readline())
arr = [list(map(int, sys.stdin.readline().split())) for _ in range(n)]

white = 0
blue = 0


def function(x, y, n):
    global white, blue
    color = arr[x][y]
    for i in range(x, x + n):
        for j in range(y, y + n):
            if color != arr[i][j]:
                function(x, y, n // 2)
                function(x, y + n // 2, n // 2)
                function(x + n // 2, y, n // 2)
                function(x + n // 2, y + n // 2, n // 2)
                return
    if color == 0:
        white += 1
    else:
        blue += 1


function(0, 0, n)
print(white)
print(blue)
