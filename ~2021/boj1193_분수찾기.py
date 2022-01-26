
t = int(input())

layer = 1
value = 0
for i in range(1, 100000):
    value += i
    if t <= value:
        break
    layer += 1
# print(value)
order = value+1 - (t)
# print(order)
# 짝수
if layer % 2 == 0:
    ans = str(layer+1-order)+'/'+str(order)
else:
    ans = str(order)+'/'+str(layer+1-order)
print(ans)
