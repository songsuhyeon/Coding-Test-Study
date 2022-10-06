num = n = int(input())

count = 0
while True:
    ten = n // 10
    one = n % 10

    sum = ten + one
    count += 1

    n = int( str(one) + str(sum % 10) )

    if( num == n):
        break

print(count)