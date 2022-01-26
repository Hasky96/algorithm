# A 65
alpha = [0] * 26

inp = list(input())
for char in inp:
    alpha[ord(char)-65] += 1
ans = ''
last = ''
# 홀수 이면
for i in range(65, 91):
    if last != '' and alpha[i-65] % 2:
        print("I'm Sorry Hansoo")
        exit()
    elif alpha[i-65] % 2:
        last = chr(i)
        alpha[i-65] -= 1
    ans += chr(i) * (alpha[i - 65] // 2)
print(ans+last+ans[::-1])
