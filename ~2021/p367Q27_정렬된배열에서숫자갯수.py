# 정렬된 배열에서 이진탐색을 통해서 원하는 숫자의 갯수 찾기
arr = [1, 1, 2, 2, 2, 2, 3]


def solution(array, x) :  # 검색할 배열, 찾는 값
    length = len(array)

    first = find_first(array, x, 0, length - 1)

    if first is None:
        return 0

    last = find_last(array, x, 0, length - 1)

    if last is None:
        return 0

    return last - first + 1


def find_first(array, target, start, end):
    if start > end:
        return None
    mid = (start + end) // 2
    if (mid == 0 or target > array[mid - 1]) and array[mid] == target:
        return mid
    elif array[mid] >= target:
        return find_first(array, target, start, mid - 1)
    else:
        return find_first(array, target, mid + 1, end)


def find_last(array, target, start, end):
    m = end
    if start > end:
        return None
    mid = (start + end) // 2
    if (mid == m or target < array[mid + 1]) and array[mid] == target:
        return mid
    elif array[mid] > target:
        return find_last(array, target, start, mid - 1)
    else:
        return find_last(array, target, mid + 1, end)


count = solution(arr, 2)
print(count)
