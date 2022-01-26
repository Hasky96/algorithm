# sorting by bubble sort


def bubble(arr):
    for end in range(len(arr)-1,0,-1):
        for idx in range(end):
            if arr[idx] > arr[idx+1]:
                arr[idx], arr[idx+1] = arr[idx+1], arr[idx]
    return arr


def recurtion_bubble(arr, size=0, flag = False):
    if not size:
        size = len(arr)
    if not flag:
        return arr

    for idx in range(size-1):
        if arr[idx] > arr[idx+1]:
            arr[idx], arr[idx + 1] = arr[idx+1], arr[idx]
            flag = True

    return recurtion_bubble(arr, size-1, flag)


test_case = [64, 243, 42, 26, 64]
print('Before sorting :', test_case)

print('#1 after sorting :', bubble(test_case))

print('#2 after sorting :', recurtion_bubble(test_case))
