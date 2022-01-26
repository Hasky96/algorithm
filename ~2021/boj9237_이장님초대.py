
n = int(input())

t = list(map(int, input().split()))
t.sort(reverse=True)

for idx in range(len(t)):
    t[idx] += idx+1

print(1+max(t))
