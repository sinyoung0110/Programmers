def solution(num_list):
    odd=""
    even=""
    for i in num_list:
        if i%2==0:
            odd+=str(i)
            continue
        even+=str(i)
    result= int(odd) + int(even)
    return result