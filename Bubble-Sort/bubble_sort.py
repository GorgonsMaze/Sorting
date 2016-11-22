
# Bubble Sort - Python

def bubble_sort(lst):
    is_sorted = False
    while is_sorted is False:
        nswaps = 0
        for i in range(len(lst) - 1):
            if lst[i] > lst[i + 1]:
                temp = lst[i + 1]
                lst[i + 1] = lst[i]
                lst[i] = temp
                nswaps += 1
        if nswaps == 0:
            is_sorted = True
    return lst





print(bubble_sort([0]))
print(bubble_sort([1, 2, 3, 4, 5]))
print(bubble_sort([5, 4, 3, 2, 1]))
print(bubble_sort([4, 5, 3, 1, 2]))
