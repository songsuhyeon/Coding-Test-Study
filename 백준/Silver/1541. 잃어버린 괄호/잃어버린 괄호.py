equtation = input().split('-')
answer = 0

for n in equtation[0].split('+'):
    answer += int(n)

for e in equtation[1:]:
    for n in e.split('+'):
        answer -= int(n)

print(answer)
