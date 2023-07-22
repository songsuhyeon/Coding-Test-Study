def solution(arr, queries):
    answer = []


    for s, e, k in queries:
        copy = arr[s:e+1]
        copy.sort()

        tmp_len = len(answer)
        for i in copy:
            if k < i:
                answer.append(i)
                break

        if len(answer) == tmp_len:
            answer.append(-1)
    return answer