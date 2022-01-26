
students = int(input())
numbers = list(map(int, input().split()))

line = []
for idx in range(students):
    student = idx+1
    line.insert(len(line)-numbers[idx], student)
for i in line:
    print(i, end=' ')
