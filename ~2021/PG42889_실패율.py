# https://programmers.co.kr/learn/courses/30/lessons/42889
import heapq

def solution(N, stages):
    answer = []
    stage_cnt = [0] * (N+1)
    total = 0
    for stage in stages:
        total += 1
        if stage > N:
            stage_cnt[0] += 1
        else:
            stage_cnt[stage] += 1
    heap = []
    for i in range(1, N+1):
        ans = stage_cnt[i]/total
        total -= stage_cnt[i]
        heapq.heappush(heap, [-ans, i])
    for _ in range(N):
        answer.append(heapq.heappop(heap)[1])
    return answer

print(solution(5, [2, 1, 2, 6, 2, 4, 3, 3]))
# answer = [3,4,2,1,5]