import sys

# 회의가 끝나는 시간이 짧은 것 고르기
# 끝난 시간 이후부터 가장 빨리 시작되는 회의 고르기
n = int(input())
time = []

for _ in range(n):
    s, e = map(int, sys.stdin.readline().split())
    time.append([s, e])

# x[1] (회의가 끝나는 시간)을 기준으로 오름차순
# 회의가 끝나는 시간이 같다면, x[0] (회의 시작 시간)을 기준으로 오름차순
time.sort(key=lambda x:(x[1], x[0]))

answer = 0
endTime = 0

for i in range(len(time)):
    if endTime <= time[i][0]:
        endTime = time[i][1]
        answer += 1

print(answer)