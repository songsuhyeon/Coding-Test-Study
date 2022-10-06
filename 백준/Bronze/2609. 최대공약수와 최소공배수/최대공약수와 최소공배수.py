# 유클리드 알고리즘 : 2개의 자연수, 최대공약수(gcd) 구하기
    # A ÷ B = C ··· R1       ex) 15 ÷ 6 = 2 ··· 3
    # B ÷ R1 = D ··· R2      ex) 6  ÷ 2 = 3 ··· 0
    # 나머지가 0될 때까지 반복 - 나머지가 0이 되면 마지막으로 나누게 된 나머지가 최대공약수

# 최소공배수(lcm) = A × B ÷ 최대공약수    ex) (15 ÷ 3) × (6 ÷ 3) = 45

# 반복 방법
def gcd(x, y):
    a = max(x, y)
    b = min(x, y)

    while b != 0:
        temp = a
        a = b
        b = temp % b
    return a

def lcm(x, y):
    return (x*y) // gcd(x,y) # 연산자 // : 나누기 연산 후 소수점 이하의 수를 버리고, 정수 부분의 수만 구함

x, y = map(int, input().split())
print(gcd(x, y))
print(lcm(x, y))