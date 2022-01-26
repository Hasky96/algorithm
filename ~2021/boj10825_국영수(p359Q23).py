import functools


def comparator(o1, o2):
    if o1[1]-o2[1]:  # 국어점수 비교
        return o2[1]-o1[1]
    else:
        if o1[2] - o2[2]:  # 영어점수 비교
            return o1[2] - o2[2]
        else:
            if o1[3] - o2[3]:  # 수학점수비교
                return o2[3] - o1[3]
            else:
                n1 = o1[0]
                n2 = o2[0]
                for i in range(min(len(n1), len(n2))):
                    if ord(n1[i]) - ord(n2[i]):  # 이름비교 ASCII
                        return ord(n1[i]) - ord(n2[i])
                else:
                    return len(n1) - len(n2)  # 모두 같다면 짧은거


N = int(input())

li = []
for _ in range(N):
    inp = input().split()
    name, scores = inp[0], map(int, inp[1:])
    temp = [name]
    temp.extend(scores)
    li.append(temp)

li = sorted(li, key=functools.cmp_to_key(comparator))
for name in li:
    print(name[0])
