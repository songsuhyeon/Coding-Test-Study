H, M = map(int, input().split())

time = H*60 + M
time -= 45

if (time//60) >= 0:
    H = time//60
else:
    H = 24 + (time//60)
M = time%60

print(H, M, end=' ')
