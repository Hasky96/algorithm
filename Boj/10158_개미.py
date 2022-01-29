
w, h = map(int, input().split())
p, q = map(int, input().split())
t = int(input())

quotient, remainder = divmod((p + t), w)
if quotient%2:
    x = w - remainder
else:
    x = remainder

quotient, remainder = divmod((q + t), h)
if quotient%2:
    y = h - remainder
else:
    y = remainder

print(x, y)