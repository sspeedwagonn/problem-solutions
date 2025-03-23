def solve(s):
    return ''.join(s[i].upper() if i == 0 or not s[i - 1].isalnum() else s[i] for i in range(len(s)))