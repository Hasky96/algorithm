string = input()

alphabets = 'abcdefghijklmnopqrstuvwxyz'

for alpha in alphabets :
    if alpha in string:
        print(string.index(alpha),end=' ')
    else:
        print('-1',end=' ')
        