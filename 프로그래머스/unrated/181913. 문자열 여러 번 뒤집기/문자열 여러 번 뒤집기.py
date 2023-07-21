def solution(my_string, queries):
    for a, b in queries:
        tmp = my_string[a:b+1]
        reverse_tmp = tmp[::-1]
        my_string = my_string[:a] + reverse_tmp + my_string[b+1:]
    return my_string