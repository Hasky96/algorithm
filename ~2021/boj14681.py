#사분면 구하기
x = int(input())
y = int(input())

#곱해서 홀사분면 짝사분면 분리
value = x*y
if value>0:
    # 1 or 3
    if x>0:
        print(1)
    else:
        print(3)
else:
    # 2 or 4
    if x>0:
        print(4)
    else:
        print(2)