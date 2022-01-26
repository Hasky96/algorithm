#문자적힌 원판 최소 시간 맞추는 문제
string = input()

#알파벳은 26 개 !  A // N
prev = 'A'
seconds = 0
for i in range(len(string)):
    check = abs(ord(prev) - ord(string[i]))
    if check <13 :
        seconds += check
    elif check >= 13:
        seconds += 26-check 
    prev = string[i]
print(seconds)
        