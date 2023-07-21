def solution(arr, queries):
    answer = []
    
    for q in queries:
        tmp = 0
        tmp = arr[q[0]]
        arr[q[0]] = arr[q[1]]
        arr[q[1]] = tmp
    
    return arr