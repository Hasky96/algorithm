# Counting sort 음수는 쓸 수 없나?


def count_sort(arr):
    count = [0] * (max(arr)+1)

    for i in arr:
        count[i] += 1

    result = []
    for i in range(len(count)):
        for j in range(count[i]):
            result.append(i)
    return result


test_case = [64, 243, 42, 26, 64]
print('Before sorting :', test_case)

print('#1 after sorting :', count_sort(test_case))
