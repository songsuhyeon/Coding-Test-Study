n, k = map(int, input().split())
number = list(input())

answer = []  # stack
cnt = k
for num in number:
    # 스택이 비어 있지 않고 k가 남아 있고 answer의 마지막 값이 num 보다 작은 경우
    while answer and cnt > 0 and answer[-1] < num:
        del answer[-1]  # answer의 마지막 값 삭제
        cnt -= 1
    answer.append(num)

print(''.join(answer[:n-k]))
