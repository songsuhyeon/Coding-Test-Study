import sys

n = int(input())
arr = [int(i) for i in sys.stdin.readline().split()]

s = int(input())

while True:
    tof = False  # 종료 지점을 나타내기 위한 변수
    for i in range(n):
        idx = i
        cmp = 0
        for j in range(n-1, i, -1):
            if arr[idx] < arr[j] and j - i <= s:
                idx = j
                tof = True
                cmp = j - i
        if idx != i:
            tmp = arr[idx]
            del arr[idx]
            arr.insert(i, tmp)
            s -= cmp;
            break
    if not tof:
        break

print(*arr)