
N = int(input())

expectations = [int(input()) for _ in range(N)]

complaints = 0

expectations.sort()
rank = 1
for expectation in expectations:
    complaints += abs(expectation-rank)
    rank += 1

print(complaints)

