n1 = int(input())
n2 = input()

for i in reversed(range(len(n2))):
    tmp = n1 * int(n2[i])
    print(tmp)
    
print(n1*int(n2))