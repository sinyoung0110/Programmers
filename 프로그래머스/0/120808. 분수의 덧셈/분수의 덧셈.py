def solution(numer1, denom1, numer2, denom2):
    answer = []
    denom=denom1*denom2
    numer=numer1*denom2+numer2*denom1
    
    for i in range(denom,0,-1):
        if (denom%i==0)and(numer%i==0):
            denom=denom/i
            numer=numer/i
        else:
            continue
    answer=[numer,denom]
            
    return answer