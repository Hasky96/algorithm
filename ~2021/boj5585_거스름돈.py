# 거스름돈 문제

# 500, 100, 50, 10, 5, 1 엔

# input

price = int(input())

change = 1000 - price

total = 0

yens = [500, 100, 50, 10 ,5 ,1]
for yen in yens:

    total += change // yen
    change %= yen

print(total)

# total += change // 500
# change %= 500

# total += change // 100
# change %= 100

# total += change // 50
# change %= 50

# total += change // 10
# change %= 10

# total += change // 5
# change %= 5

# total += change // 1
# change %= 1


