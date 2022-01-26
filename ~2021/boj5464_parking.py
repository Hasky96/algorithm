# N 주차공간 // M 차량의 수
N, M = tuple(map(int, input().split()))

Rs = []
# index 맞추기 위함
Wk = [0] * (M+1)
# 단위무게당 가격 Rs
for _ in range(N):
    Rs.append(int(input()))

# 차량 무게 Wk = Wk
for i in range(1, M+1):
    Wk[i] = int(input())

# 수익
revenue = 0
# 주차공간
parking_lot = [0] * N

Q = []
for _ in range(M*2):
    inp = int(input())
    # 주차
    if inp > 0:
        # 주차공간 확인
        for pa in range(N):
            if not parking_lot[pa]:
                # 빈자리 주차
                parking_lot[pa] = inp
                revenue += Wk[inp]*Rs[pa]
                break
        # 자리없음
        else:
            # 대기하는 Queue에 추가
            Q.append(inp)
# -------------------------------------------------------------------
    # 출차
    else:
        inp *= -1
        # 주차공간 확인하여 출차하는차 위치 확인
        for pa in range(N):
            if parking_lot[pa] == inp:
                # 대기중인 차량여부 확인
                if Q:
                    inp = Q.pop(0)
                    # 빠진 자리에 대기중이던 차 주차
                    parking_lot[pa] = inp
                    revenue += Wk[inp]*Rs[pa]
                else:
                    # 자리 비움
                    parking_lot[pa] = 0
                break
print(revenue)
