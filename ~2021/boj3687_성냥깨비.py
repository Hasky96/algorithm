# boj 3687 성냥깨비

matche_num = ['',  # 0개
              '',  # 1개
              '1',  # 2개
              '7',  # 3개
              '4',  # 4개
              '2',  # 5개
              '0',  # 6개
              '8'  # 7개
              ]

T = int(input())  # test case


def find_max(m):
    # 최대한 많은 자릿수
    # 2 이상의 모든 수는 2와 3으로 표현할 수 있다.
    jaritsu, is_odd_num = divmod(m, 2)
    ans = "7" if is_odd_num else "1"
    ans += "1" * (jaritsu-1)
    return ans


def find_min(m):
    # 최대한 적은 자릿수
    # 9개 이상부터는 무조건 1자릿수 이상이다.
    global global_min_dp
    for i in range(2, m+1):
        try:
            global_min_dp[i] *= 1
        except IndexError:
            global_min_dp.append(str(min(
                int(global_min_dp[i-2] + matche_num[2]),
                int(global_min_dp[i-3] + matche_num[3]),
                int(global_min_dp[i-4] + matche_num[4]),
                int(global_min_dp[i-5] + matche_num[5]),
                int(global_min_dp[i-6] + matche_num[6]),
                int(global_min_dp[i-7] + matche_num[7]),
            )))
    return global_min_dp[m]


for _ in range(T):
    matches = int(input())  # 성냥깨비 수
    global_min_dp = ['0', '1', '1', '7', '4', '2', '6', '8']
    print(find_min(matches), find_max(matches), sep=' ')
