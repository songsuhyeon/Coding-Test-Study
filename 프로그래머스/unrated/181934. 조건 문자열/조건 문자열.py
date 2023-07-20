def solution(ineq, eq, n, m):
    answer = 0
    
    if ineq == "<":
        answer = n <= m if eq == "=" else n < m
    else:
        answer = n >= m if eq == "=" else n > m
    return int(answer)