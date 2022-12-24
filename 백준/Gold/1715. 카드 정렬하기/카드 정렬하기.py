import sys
import heapq

n = int(input())
heap = []

for _ in range(n):
    num = int(sys.stdin.readline())
    heapq.heappush(heap, num)

answer = 0
while len(heap) != 1:
    sum = heapq.heappop(heap)
    top = heapq.heappop(heap)
    sum += top
    answer += sum
    heapq.heappush(heap, sum)

print(answer)