def boy(num):
    for i in range(switch):
        if (i+1) % num == 0:
            arr[i] = not arr[i]
# val 0 1 0 1 0 0 0 1
# idx 0 1 2 3 4 5 6 7
#  i  1 2 3 4 5 6 7 8


def girl(num):
    num -= 1
    arr[num] = not arr[num]
    k = 1
    while num-k >= 0:
        try:
            if arr[num + k] == arr[num - k]:
                arr[num + k] = not arr[num + k]
                arr[num - k] = not arr[num - k]
            else:
                return
        except IndexError:
            return
        k += 1


switch = int(input())
arr = list(map(int, input().split()))
N = int(input())
for _ in range(N):
    gender, card = tuple(map(int, input().split()))
    if gender == 1:
        boy(card)
    else:
        girl(card)

for idx, ans in enumerate(arr):
    if ans:
        print('1', end=' ')
    else:
        print('0', end=' ')
    if (idx + 1) % 20 == 0:
        print()

