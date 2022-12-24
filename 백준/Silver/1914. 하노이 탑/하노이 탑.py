def hanoi(num, start, to, end):
    if num == 1:
        print(start, end)
        return
    else:
        hanoi(num - 1, start, end, to) # 원반 n-1 to 로 이동
        print(start, end) # 가장 큰 원반을 end 로 이동
        hanoi(num - 1, to, start, end) # to 에 있는 원반 n-1 개를 end 로 이동

num = int(input())
print(2 ** num - 1)
if num <= 20:
    hanoi(num, 1, 2, 3)
