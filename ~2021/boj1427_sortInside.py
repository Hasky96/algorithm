# Counting Sort
arr = [0]*10
num = input()
for char in num:
    arr[int(char)] += 1

for idx in range(9, -1, -1):
    while arr[idx]:
        print(idx, end='')
        arr[idx] -= 1
