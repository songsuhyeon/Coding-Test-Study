array_list = [list(map(int, input().split())) for _ in range(5)]
score_list = []
for s in array_list:
    score_list.append(sum(s))
score = max(score_list)
n = score_list.index(score)
print(n+1, score)
