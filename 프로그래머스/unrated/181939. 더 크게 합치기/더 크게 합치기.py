def solution(a, b):
    num1 = int(str(a) + str(b))
    num2 = int(str(b) + str(a))
    answer = num1 if num1 >= num2 else num2
    
    return answer