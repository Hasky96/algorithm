
N = int(input())
buffer = []
while True:
    data = int(input())
    if data == -1:
        break
    elif data == 0:
        buffer.pop(0)
    elif len(buffer) < N:
        buffer.append(data)

if buffer:
    for num in buffer:
        print(num, end=' ')
else:
    print('empty')
