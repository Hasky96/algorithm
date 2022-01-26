

N = int(input())
arr = [[0]*500 for _ in range(500)]
start = (250, 250)

d1 = []
d2 = []
d3 = []
d4 = []


for _ in range(6):
    a, b = (map(int, input().split()))
    if a == 1:
        d1.append(b)
    elif a == 2:
        d2.append(b)
    elif a == 3:
        d3.append(b)
    elif a == 4:
        d4.append(b)
print(d1,d2,d3,d4)
