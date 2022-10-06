arr = [[0 for _ in range(100)] for _ in range(100)]
T = int(input())
for i in range(T):
    x, y = map(int, input().split())
    for j in range(x, x+10):
        for k in range(y, y+10):
            arr[j][k] = 1

res = 0
for i in arr:
    res += sum(i)

print(res)