import sys

n = int(input())

L = []
for i in range(n):
    start, finish = map(int, sys.stdin.readline().split())
    L.append([start, finish])

# 가장 빨리 끝나는 순으로 정렬
L.sort(key=lambda x:[x[1], x[0]])

s_time = L[0][0]
f_time = L[0][1]

count = 1

for i in range(1, n):
    if f_time <= L[i][0]:
        s_time = L[i][0]
        f_time = L[i][1]
        count += 1
        
print(count)