t = int(input())
data = [300, 60, 10]

num = 0
count = []
for i in data:
     num += t//i
     count.append(num)
     t %= i
     num = 0

if t%i == 0:
    for i in count:
        print(i, end=' ')
    print()
else:
    print(-1)