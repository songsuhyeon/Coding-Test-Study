cmd = input()
stack = []
answer = 0
for i in range(len(cmd)):
    if cmd[i] == '(':
        stack.append(cmd[i])
    else:
        if cmd[i-1] == '(':
            stack.pop()
            answer += len(stack)
        else:
            stack.pop()
            answer += 1
print(answer)