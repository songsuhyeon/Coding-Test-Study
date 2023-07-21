def solution(numLog):
    answer = ''
    for i in range(1, len(numLog)):
        before = numLog[i - 1]
        current = numLog[i]
        
        tmp = before - current

        if tmp == 1:
            answer += "s"
        elif tmp == -1:
            answer += "w"
        elif tmp == 10:
            answer += "a"
        elif tmp == -10:
            answer += "d"

    return answer