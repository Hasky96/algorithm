a, b = input().split(' ')

#solution 1
# print(a[::-1] if int(a[::-1])>int(b[::-1]) else b[::-1])

#solution 2
def reverse(Num):
    newNum =''
    for i in Num:
        newNum=i+newNum
    return int(newNum)

print(reverse(a) if reverse(a) > reverse(b) else reverse(b))