def solution(num_list):
    answer = 0
    m = 1
    p = 0
    for i in num_list:
        m *= i
        p += i
    p = p ** 2
    return 1 if m <= p else 0