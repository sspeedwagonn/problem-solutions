def swap_case(s):
    result = ""
    for i in str(s):
        if i.islower():
            result += i.upper()
        elif i.isupper():
            result += i.lower()
        else:
            result += i

    return result