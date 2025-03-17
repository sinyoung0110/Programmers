def solution(box, n):
    answer = 1
    for b in box:
        if b>=n:
            answer*=b//n
        else:
            answer=0
    return answer