# 로프

# 로프의 수
ropes = int(input())

# 로프 무게 리스트
rope_list =[]
for rope in range(ropes):
    rope_list.append(int(input()))

#로프가 버틸수 있는 무게 -> 오름차순
rope_list.sort()

# 제일 낮은 무게 * 전체 로프의 수 -> 버틸 수 있는 무게
# 버틸 수 있는 무게 -> 평균 x
weight = []
while len(rope_list)>0:
    weight.append(rope_list.pop(0) * (len(rope_list)+1))

print(max(weight))


# test case
# 10 20 20 20 20 20 -> 60kg  // 100kg