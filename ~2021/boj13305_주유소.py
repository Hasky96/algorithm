# 도시수
city = int(input())
# 도시사이의 거리
dis_list = list(map(int, input().split()))
# for 문 인덱스를 맞추기위해 추가해줌
dis_list.append(0)
# 주요소 가격이 들어있는 리스트
cost_list = list(map(int, input().split()))
# 제일 비싼 가격
cost = 1000000000
# 최종가격
total = 0
for i in range(city):
    if cost_list[i] < cost:
        cost = cost_list[i]
    total += cost*dis_list[i]
print(total)
