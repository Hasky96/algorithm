
test_case = int(input())

for case in range(test_case):
    length, position = tuple(map(int, input().split()))

    print_list = list(map(int, input().split()))
    # 조건에 중요도 1~9 해당하지 않는 숫자로 치환하여 원하는 값 마킹
    print_list[position]= print_list[position]*10+print_list[position]
    count =0
    while True:
        #뽑기
        max_value = max(print_list)

        check = print_list.pop(0)

        if check%10 == max_value:
            count+=1
            if  check >10:
                print(count)
                break
            count += 1
        else :
            print_list.append(check)
        5