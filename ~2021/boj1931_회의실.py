def comparator(o):
    return o[1] + float('0.'+str(o[0])[::-1])
<<<<<<< HEAD
# 끝나는 시간으로 비교하고 시작하는 시간으로 비교
=======
>>>>>>> 77865bbd3b5e2f570cea88771e45f691bb16104f


N = int(input())

arr = []
for _ in range(N):
    arr.append(list(map(int, input().split())))

arr.sort(key=comparator, reverse=True)
# print(arr)
cnt = 0
end = 0
while arr:
    meeting = arr.pop()
    if meeting[0] >= end:
        cnt += 1
        end = meeting[1]
<<<<<<< HEAD
print(cnt)
=======
print(cnt)
>>>>>>> 77865bbd3b5e2f570cea88771e45f691bb16104f
