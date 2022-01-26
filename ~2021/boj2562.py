myList = []
for i in range(9):
    myList.append(int(input()))

print(max(myList),myList.index(max(myList))+1,sep='\n')