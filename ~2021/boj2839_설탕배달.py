# 설탕 배달

sugar = int(input())

# sugar bags
sugar5 =0
sugar3 =0

while True:
    # 5의 배수
    if sugar % 5 ==0:
        sugar5 = sugar // 5
        sugar %= 5
    
    # 5의 배수가 아닌경우
    else :
        sugar -= 3
        sugar3 += 1
    
    # 다 배달했을 경우 출력
    if sugar == 0 :
        print(sugar5+sugar3)
        break

    # 배달하지 못하고 남았을때
    elif sugar < 0:
        print('-1')
        break


# ex) 18 -> 3*6  //  5*3+3