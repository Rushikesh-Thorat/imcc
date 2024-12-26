# def binarySearch(arr,target):
#     left,right = 0,len(arr)-1
#
#     while left<=right:
#         mid = left+(right-left)//2
#         if target == arr[mid]:
#             return mid
#         elif arr[mid]< target:
#             left = mid
#         elif arr[mid]>target:
#             right = mid
#         else:
#             return -1
#
# arr=[1,5,2,4,8,7,9,10]
# target = 9
# result = binarySearch(arr,target)
# if result !=1:
#     print(f"{target} number present  in {result} index ")
# else:
#     print("number is not present")
from unittest.mock import right


# def quickSort(arr):
#     if len(arr)<=1:
#         return arr
#     else:
#         pivot = arr[len(arr)//2]
#         left = [x for x in arr if x<pivot]
#         middle = [x for x in arr if x == pivot]
#         right = [x for x in arr if x > pivot]
#         return quickSort(left) + middle + quickSort(right)
#
# arr=[1,5,2,4,8,7,9,10]
# print(arr)
# sortedArr = quickSort(arr)
# print(sortedArr)

# def hinoi(n,A,B,C):
#     if n ==1:
#         print(f"move disc 1 from {A} to {C}")
#         return
#     else:
#         hinoi(n-1,A,C,B)
#         print(f"move disc {n} from {A} to {C}")
#         hinoi(n - 1, B, A, C)
#
# n = 3
# hinoi(n,"a","b","c")

#
# def mergeSort(arr):
#     if len(arr)> 1:
#         mid = len(arr)//2
#         left= arr[:mid]
#         right = arr[mid:]
#
#         mergeSort(left)
#         mergeSort(right)
#
#         i=j=k=0
#
#         while len(left)>i and len(right)>j:
#             if left[i]<right[j]:
#                 arr[k]= left[i]
#                 i+=1
#             else:
#                 arr[k]=right[j]
#                 j+=1
#             k+=1
#
#         while len(left)>i:
#             arr[k] = left[i]
#             i+=1
#             k+=1
#
#         while len(right)>j:
#             arr[k]=right[j]
#             j+=1
#             k+=1
#
# arr=[1,2,4,5,3,7,5,4]
# print(arr)
# mergeSort(arr)
# print(arr)

#
# def mergeSort(arr):
#     if len(arr)>1:
#         mid = len(arr)//2
#         left = arr[:mid]
#         right = arr[mid:]
#
#         mergeSort(left)
#         mergeSort(right)
#
#         i = j = k = 0
#
#         while len(left)>i and len(right)>i:
#             if left[i]< right[j]:
#                 arr[k] = left[i]
#                 i+=1
#             else:
#                 arr[k] = right[j]
#                 i+=1
#             k+=1
#
#         while len(left)>i:
#             arr[k]= left[i]
#             i+=1
#             k+=1
#
#         while len(right)>i:
#             arr[k]= left[i]
#             i+=1
#             k+=1




# arr=[1,2,4,5,3,7,5,4]
# print(arr)
# mergeSort(arr)
# print(arr)
#

# def hinoi(n,a,b,c):
#     if n==1:
#         print(f"move 1 disk from {a} to {c}")
#         return
#
#     hinoi(n-1,a,c,b)
#     print(f"move {n} disk from {a} to {c}")
#     hinoi(n - 1, b, a, c)
#
# n=3
# hinoi(n,"A","B","C")
#


# def binarySearch(arr,target):
#     left,right = 0,len(arr)-1
#     while left<=right:
#         mid = left+(right-left)//2
#         if arr[mid] == target:
#             return mid
#         elif arr[mid]<target:
#             left = mid
#         elif arr[mid]>target:
#             right = mid
#         else:
#             return -1
#
#
# arr = [1,2,3,4,5,6,7,8,9]
# target = 7
# result = binarySearch(arr,target)
# if result != -1:
#     print(result,target)
# else:
#     print("number not found")

# def quickSort(arr):
#     if len(arr)<=1:
#         return arr
#     else:
#         pivot = arr[len(arr)//2]
#         left = [x for x in arr if x < pivot]
#         middle = [x for x in arr if x == pivot]
#         right= [x for x in arr if x > pivot]
#         return quickSort(left) + middle + quickSort(right)
#
#
# arr = [2,5,8,7,4,1,3,6,9]
# print(arr)
# sortedArr = quickSort(arr)
# print(sortedArr)

# n = space = 5
# for i in range(1,n+1):
#     for j in range(0,space):
#         print(" ",end="")
#
#     c=1
#     for j in range (1,i+1):
#         print(" ",c,sep="",end="")
#         c= c*(i-j)//j
#
#     space-=1
#     print()


