# 컵홀더 문제

# 좌석 수
seats = int(input())
# 좌석 배치 리스트
line = list(input())
# 손님 수
people = len(line)

#컵홀더 수
cup_holder = 1
while len(line)>0 :
    seat = line.pop(0)

    if seat == 'L':
        line.pop(0)
    
    cup_holder += 1

# 사람보다 컵홀더가 작은 경우 -> 컵홀더
if cup_holder < people:
    print(cup_holder)

# 사람보다 컵홀더가 많은 경우 -> 사람
else:
    print(people)