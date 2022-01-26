# 세탁소 거스름돈 문제
# 0.25 Quarter // 0.10 Dime // 0.05 Nickel // 0.01 Penny

# test-cases
test_cases = int(input())

for case in range(test_cases):
    change = int(input())

    # 초기화 각 금액 첫 알파펫
    Q = D = N = P =0

    # Quarter -> 25 센트
    Q = change // 25
    change %= 25
    
    # Dime -> 10 센트
    D = change // 10
    change %= 10
    
    # Nickel -> 5 센트
    N = change // 5
    change %= 5
    
    # Penny -> 1 센트
    P = change // 1
    change %= 1

    print(Q, D, N, P, sep=' ')

    

