
N = int(input())

homes = list(map(int, input().split()))
homes.sort()

print(homes[(N-1)//2])