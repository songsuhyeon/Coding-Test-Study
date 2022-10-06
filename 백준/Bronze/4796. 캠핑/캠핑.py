i = 0
while True:
    i += 1
    l, p, v = map(int, input().split())

    if l==0 and p==0 and v==0:
        break
    if v%p >= l:
        res = (v//p*l)+l
    else:
        res = (v//p*l)+(v%p)

    print("Case %d: %d" %(i, res))