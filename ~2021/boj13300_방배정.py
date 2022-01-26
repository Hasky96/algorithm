import math
#  참석학생 N, 방 정원 K
def room(people, capacity):
    quotient, remainder = divmod(people, capacity)
    if remainder > 0:
        quotient +=1
    return quotient

N, K = tuple(map(int, input().split()))

stu_list = [[0] * 7 for _ in range(2)]
for student in range(N):
    # sex -> 0 : g / 1 : b
    sex, year = tuple(map(int, input().split()))
    # 학생들을 성별, 학년으로 담을 이차원 리스트
    stu_list[sex][year] += 1

total = 0
for i in range(1,7):#math.ceil(stu_list[0][i])
    total += room(stu_list[0][i], K)
    total += room(stu_list[1][i], K)
print(total)
