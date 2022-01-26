N = int(input())
def solution(X):
    #비교하기위한 변수
    check = 'O'
    #점수의 합계
    total = 0
    #더해지는 점수
    score = 1
    for i in X:
        if check == i:
            total += score
            #점수 가중됨
            score += 1
        else:
            #점수 초기화
            score = 1
    print(total)

for i in range(N):
    solution(input())