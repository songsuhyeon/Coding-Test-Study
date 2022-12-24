t = int(input())

for i in range(t):
    map = {}
    answer = 1
    n = int(input())

    for j in range(n):
        name, kind = input().split()
        if not kind in map:
            map[kind] = 1
        else:
            map[kind] += 1

    for k in map.keys():
        answer = answer * (map[k] + 1)

    print(answer - 1)