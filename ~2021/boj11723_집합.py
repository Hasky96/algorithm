import sys
input = sys.stdin.readline

N = int(input())

arr = [0] * 21
for _ in range(N):
    inp = input().split()
    if inp[0] == 'add':
        arr[int(inp[1])] = 1

    elif inp[0] == 'remove':
        arr[int(inp[1])] = 0

    elif inp[0] == 'check':
        print(arr[int(inp[1])])

    elif inp[0] == 'toggle':
        arr[int(inp[1])] = int(not arr[int(inp[1])])

    elif inp[0] == 'all':
        arr = [1]*21

    elif inp[0] == 'empty':
        arr = [0]*21

# python 은 pypy보다 느리지만 메모리가 많음
