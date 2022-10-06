# 물이 새는 곳의 개수 N, 테이프의 길이 L, 물이 새는 곳의 위치 location
N, L = map(int, input().split())
location = list(map(int,input().split()))

location.sort()

cnt = 0
cover = 0
for i in location:
    if cover < i:
        cnt += 1
        cover = i + L - 1

print(cnt)