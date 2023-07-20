str = input()

for c in str:
    if c >= 'A' and c <= 'Z':
        print(c.lower(), end="")
    else:
        print(c.upper(), end="")