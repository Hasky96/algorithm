i = int(input())
maxLen = 2*i-1
for n in range(1,i+1):
    print(' '*((maxLen-(2*n-1))//2)+'*'*(2*n-1)+' '*((maxLen-(2*n-1))//2))


