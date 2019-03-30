t = int(input())

def solve(p,arr):
    arr.sort()

    sum = 0
    for i in range(p-1):
        sum+=arr[i]

    minHour = float("inf")
    for i in range(p-1,len(arr)):
        sum+=arr[i]
        minHour = min(minHour,arr[i]*p - sum)
        sum-= arr[i-p+1]
    return minHour

for i in range(1,t+1):
    n, p = map(lambda x : int(x),input().split(" "))
    arr = list(map(lambda x: int(x),input().split(" ")))
    print("Case #",i,": " ,solve(p, arr))
