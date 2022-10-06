n = int(input())

roof = []
for i in range(n):
    w = int(input())
    roof.append(w)

roof.sort(reverse=True)

maxi = []
for i in range(n):  
    weight = roof[i]
    maxi.append(weight * (i + 1))

print(max(maxi))
