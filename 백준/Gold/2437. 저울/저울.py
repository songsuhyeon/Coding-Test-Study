n = int(input())
w = list(map(int, input().split()))

w.sort()  # 1 1 2 3 6 7 30

sum = 1

for i in range(n):
    if sum < w[i]:
       break

    sum += w[i]
    
print(sum)