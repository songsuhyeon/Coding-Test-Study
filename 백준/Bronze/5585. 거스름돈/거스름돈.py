money = 1000 - int(input())
coin=[500, 100, 50, 10, 5, 1]
count = 0
for i in coin:
    if money //i >= 1:
        count += money//i
        money -= (money//i)*i
print(count)