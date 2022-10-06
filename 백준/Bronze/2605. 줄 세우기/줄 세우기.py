T = int(input())
num = list(map(int, input().split()))
li = []
for i in range(T):
    li.insert(len(li)-num[i], i+1)

print(*li)