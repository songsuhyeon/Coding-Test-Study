def solution(num_list):
    even = ""
    odd = ""
    for i in num_list:
        if i&1:
            even += str(i)
        else:
            odd += str(i)
    return int(even) + int(odd)