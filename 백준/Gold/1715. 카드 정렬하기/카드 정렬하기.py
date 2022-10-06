import heapq

n = int(input())

# 카드 묶음 별 크기
size = []
for i in range(n):
    heapq.heappush(size, int(input()))

result = 0
while len(size) > 1:
    a = heapq.heappop(size)
    b = heapq.heappop(size)
    result += (a+b)
    heapq.heappush(size, a+b)

print(result)