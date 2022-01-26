
def find(i):
    global arr
    if i == 7:
        if sum(shorts[0:7]) == 100:
            arr = shorts[0:7]
    else:
        for j in range(i, len(shorts)):
            shorts[i],  shorts[j] = shorts[j],  shorts[i]
            find(i+1)
            shorts[i],  shorts[j] = shorts[j],  shorts[i]


# 난쟁이들의 키
shorts = []

# 입력
for _ in range(9):
    shorts.append(int(input()))

find(0)
for i in sorted(arr):
    print(i)

