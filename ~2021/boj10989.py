import sys
input = sys.stdin.readline
print = sys.stdout.write
N = int(input())

inp = ''
arr = [0] * 10000
for _ in range(N):
    inp = int(input())
    arr[inp-1] += 1

for idx in range(10000):
    if arr[idx] != 0:
        for _ in range(arr[idx]):
            print('%s\n' % int(idx+1))

