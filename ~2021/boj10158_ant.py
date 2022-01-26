
w, h = tuple(map(int, input().split()))
now = tuple(map(int, input().split()))
t = int(input())
width = list(range(w))
height = list(range(h))

x, y = now[0], now[1]
print(width[divmod((width.index(x)+t), w)[1] if divmod((width.index(x)+t), w)[0] % 2 == 0 else w-divmod((width.index(x)+t), w)[0]], end=' ')
print(height[divmod((height.index(y)+t), h)[1] if divmod((height.index(y)+t), h)[0] % 2 == 0 else h-divmod((height.index(y)+t), h)[0]])

"""
6 4
4 1
11
"""