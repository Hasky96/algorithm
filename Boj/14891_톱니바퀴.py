#14891 톱니바퀴
wheels_status = [0, 0, 0, 0]
wheels = []

def wheel_rotate(wheel_no, direction):
    wheel_no -= 1
    wheels_status[wheel_no] += direction

    if (wheels[wheel_no]


for _ in range(4):
    inp = input()
    wheels.append([int(char) for char in inp])

k = int(input())
for _ in range(k):
    wheel_no, rotation= map(int, input().split(' '))



    

