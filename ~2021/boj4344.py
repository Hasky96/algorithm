C = int(input())

def solution(N, scores):
    avg =sum(scores)/N
    cnt = 0
    for i in scores:
        if i > avg:
            cnt+=1
    return round(cnt/N*100,3)

myList = []
for i in range(C):
    scores = list(map(int,input().split(' ')))
    print(f'{solution(scores.pop(0),scores):.3f}','%',sep='')
