import math

n = int(input())
dp = [0, 1]

for i in range(2, n+1):
    minCnt=4
    for j in range(int(math.sqrt(i)), 0, -1):
        # 자신보다 작은 모든 제곱수의 1+dp[제곱수를 뺀 나머지] 값을 비교하여 최솟값을 찾아 저장
        minCnt = min(minCnt, dp[i - j ** 2]+1)
    dp.append(minCnt)

print(dp[n])