s = int(input())

n = 1
while n * (n+1) / 2 <= s:
    n+=1 
    
print(n-1)

# 1부터 n까지의 합 = n * (n+1) / 2