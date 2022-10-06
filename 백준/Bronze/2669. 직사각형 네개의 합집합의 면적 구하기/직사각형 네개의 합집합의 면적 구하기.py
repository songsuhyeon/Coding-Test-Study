arr = [[0 for _ in range(100)] for _ in range(100)]
for i in range(4):
    x1, y1, x2, y2 = map(int, input().split())
    for j in range(x1, x2):
        for k in range(y1, y2):
            arr[j][k] = 1

res = 0
for i in arr:
    res += sum(i)

print(res)