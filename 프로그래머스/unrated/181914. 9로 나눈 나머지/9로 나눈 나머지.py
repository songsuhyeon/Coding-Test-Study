def solution(number):
    s = 0
    for i in str(number):
        s += int(i)
    return s % 9