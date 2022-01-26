
myList = list(range(1,10000))
self = []

#if 12345 -> 12345 + 1+2+3+4+5
for i in range(10000):
    if i <10 :
        self.append(2*i)
    else :
        self.append(i+sum(list(map(int,('.'.join(str(i)).split('.'))))))
        
        '''
        a='.'.join(str(i))  -> '1.2.3.4.5.6.7'
        a=a.split('.')      -> ['1', '2', '3', '4', '5', '6', '7']
        a=list(map(int,a))  -> [1, 2, 3, 4, 5, 6, 7]
        i+sum(a)
        '''

# ans = myList-self
# list comprehension
ans = [i for i in myList if  i not in self] 
        # ans =[]
        # for i in myList:
        #     if i not in self:
        #         ans.append(i)

for i in ans:
    print(i)
    