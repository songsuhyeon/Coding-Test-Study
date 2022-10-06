c = int(input())

for i in range(c):
    n = input().split(' ')
    sum = 0
    avg = 0
    cnt = 0
    result = 0
    for j in range(1, int(n[0])+1):
        sum += int(n[j])
    
    avg = sum / int(n[0])
    
    for j in range(1, int(n[0])+1):
        if float(n[j]) > avg:
            cnt += 1
    result = cnt / int(n[0]) * 100
    print("%.3f" %result + "%")
    
    n.clear()