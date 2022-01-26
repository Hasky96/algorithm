
def next(arr, next):
    arr.append(next)
    while True:
        arr.append(arr[-2]-arr[-1])
        if arr[-1] < 0:
            arr.pop()
            return arr


a = int(input())
count_list = []
for i in range(1, a+1):
    ar = [a]
    count_list.append(next(ar, i))
ans = max(count_list, key=lambda x: len(x))
print(len(ans))
for i in ans:
    print(i, end=' ')
