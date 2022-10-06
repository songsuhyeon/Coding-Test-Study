import sys

t = int(input())

for i in range(t):
    score = []
    n = int(input())
    count = 1

    for j in range(n):
        s1, s2 = map(int, sys.stdin.readline().split())
        score.append([s1, s2])
    
    score.sort()
    max = score[0][1]

    for i in range(1, n):
        if max > score[i][1]:
            count += 1
            max = score[i][1]
    
    print(count)