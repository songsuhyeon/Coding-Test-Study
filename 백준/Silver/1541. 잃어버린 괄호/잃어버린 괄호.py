n = input().split('-')

result = 0
add_num=[]

for i in n:
    a = i.split('+')
    add = 0
    for j in a:
        add += int(j)
    add_num.append(add)

sub = add_num[0]
for i in range(1, len(add_num)):
    sub -= add_num[i]

print(sub)

