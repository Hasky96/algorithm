# 전자레인지 시간 맞추기

# input 값 
times = int(input())

# def solution(times):
#     a = 0
#     b = 0
#     c = 0
#     # 나누어 떨어지지 않는 경우
#     if times % 10 !=0:
#         return -1;
    
#     # 나누어 떨어지는 경우
#     else:
#         # 5분 -> 300 초
#         a = times // 300 
#         times %=300
#         # 1분 -> 60
#         b = times // 60
#         times %= 60
#         # 10초
#         c = times // 10

#         # tuple로 반환
#         return a, b, c

# result = solution(times)
# print('{} {} {}'.format(result[0], result[1], result[2]))

a = 0
b = 0
c = 0
# 나누어 떨어지지 않는 경우
if times % 10 !=0:
    print('-1');

# 나누어 떨어지는 경우
else:
    # 5분 -> 300 초
    a = times // 300 
    times %=300
    # 1분 -> 60
    b = times // 60
    times %= 60
    # 10초
    c = times // 10

    print(a, b, c, sep=' ')