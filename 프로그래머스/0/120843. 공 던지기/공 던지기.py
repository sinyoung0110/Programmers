def solution(numbers, k):
    return (k*2-1)%len(numbers) if (k*2-1)%len(numbers)!=0 else len(numbers)
    