A =int(input())
B =int(input())

def multi(A, B):
    result1 = A*(B%10) 
    B//=10
    result2 = A*(B%10) 
    B//=10
    result3 = A*(B%10) 
    print(result1, result2, result3, result1+result2*10+result3*100,sep='\n')    

multi(A,B)
    
    

