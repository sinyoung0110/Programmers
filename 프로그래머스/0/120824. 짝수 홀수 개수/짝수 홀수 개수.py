def solution(num_list):
    i = sum([1 for num in num_list if num % 2==0])
    j = sum([1 for num in num_list if num % 2])  
    return [i, j]
