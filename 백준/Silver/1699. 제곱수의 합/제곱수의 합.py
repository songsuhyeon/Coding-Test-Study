import math

n = int(input())
dp = [0, 1]

for i in range(2, n+1):
    minCnt=4
    for j in range(int(math.sqrt(i)), 0, -1):
        minCnt = min(minCnt, dp[i - j ** 2]+1)
    dp.append(minCnt)

print(dp[n])