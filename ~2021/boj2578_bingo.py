
def num_check(k):
    for nci in range(5):
        for ncj in range(5):
            if bingo_board[nci][ncj] == k:
                bingo_board[nci][ncj] = 0
                return 0


def bingo_check():
    bingo_line = 0
    if bingo_board[0][0] == 0:
        for i in range(1, 5):
            if bingo_board[i][i] != 0:
                break
        else:
            bingo_line += 1

    if bingo_board[0][4] == 0:
        for i in range(1, 5):
            if bingo_board[i][4-i] != 0:
                break
        else:
            bingo_line += 1

    for i in range(0, 5):
        if bingo_board[0][i] == 0:
            for j in range(0, 5):
                if bingo_board[j][i] != 0:
                    break
            else:
                bingo_line += 1
        if bingo_board[i][0] == 0:
            for j in range(0, 5):
                if bingo_board[i][j] != 0:
                    break
            else:
                bingo_line += 1
    return bingo_line


bingo_board = []
for _ in range(5):
    arr = []
    arr.extend(list(map(int, input().split())))
    bingo_board.append(arr)

bingo_nums = []
for _ in range(5):
    bingo_nums.extend(list(map(int, input().split())))

for ans, num in enumerate(bingo_nums):
    num_check(num)
    if ans >= 10:
        if bingo_check() >= 3:
            print(ans+1)
            break
""" input
11 12 2 24 10
16 1 13 3 25
6 20 5 21 17
19 4 8 14 9
22 15 7 23 18
5 10 7 16 2
4 22 8 17 13
3 18 1 6 25
12 19 23 14 21
11 24 9 20 15
"""
# output 15
