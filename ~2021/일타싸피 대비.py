import math

# 1 라디안 계산된 값이 라디안으로 나오기 때문에 각도로 변환해 준것
rad = 180 / math.pi

p0 = (0, 0)
p1 = (1, 1)
p2 = (3, 4)


# 기준이 되는것 w -> 흰공의 좌표 white
# 찾는것 t -> 맞추고자 하는 공 target
def find_deg_len(w, t):
    deg = math.atan2(t[0] - w[0], t[1] - w[1]) * rad

    length = math.sqrt((t[0] - w[0]) ** 2 + (t[1] - w[1]) ** 2)

    return deg, length  # return (degree, length)


print(find_deg_len(p0, p2))
""" 각도 y 축을 기준으로 1사 방향 + // 2사 방향 -
            0
            |
            |
            |
-90 --------+-------- 90
            |
            |
            |
           180
"""
