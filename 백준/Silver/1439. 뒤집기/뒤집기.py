n = list(input())

tmp=n[0]
l=[n[0]]
for i in n:
    if tmp != i:
        l.append(i)
        tmp = i
    
cnt0, cnt1 = 0, 0
for i in range(len(l)):
    if int(l[i]) == 0:
        cnt0 += 1
    else:
        cnt1 += 1
        
print(min(cnt0, cnt1))