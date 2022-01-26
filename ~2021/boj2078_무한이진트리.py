A, B = map(int, input().split())

# input : 3 4
L, R = 0, 0
while A != 1 or B != 1:
    if A > B:
        L += 1
        A -= B
    elif B > A:
        R += 1
        B -= A
print(L, R, sep=' ')


