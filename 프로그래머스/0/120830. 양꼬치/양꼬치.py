def solution(n, k):
    answer = 12000*n+2000*k
    if n>=10:
        answer-=n//10*2000
    return answer