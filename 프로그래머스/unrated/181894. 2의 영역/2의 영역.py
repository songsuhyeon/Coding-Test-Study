def solution(arr):
    try: 
        start = arr.index(2)
    except:
        return [-1]
    
    for i in range(len(arr)-1, 0, -1):
        if arr[i] == 2:
            end = i
            break
    
    return arr[start:end+1]