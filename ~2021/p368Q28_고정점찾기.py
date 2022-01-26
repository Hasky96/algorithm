
def solution(array, start, end):
    mid = (start + end)//2
    if start > end:
        return -1
    elif array[mid] == mid:
        return mid
    elif array[mid] > mid:
        return solution(array, start, mid-1)
    elif array[mid] < mid:
        return solution(array, mid+1, end)

# arr = [-15, 6, 1, 3, 7]
# arr = [-15, -4, 2, 8, 9, 13, 15]
arr = [-15, -4, 3, 8, 9, 13, 15]
print(solution(arr, 0, len(arr)-1))
# 蔣河錫