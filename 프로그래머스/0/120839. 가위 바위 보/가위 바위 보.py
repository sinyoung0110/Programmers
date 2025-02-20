def solution(rsp):
    answer = ''
    
    for r in range(len(rsp)):
        if "2"==rsp[r:r+1]:
            answer+="0"
        elif "0"==rsp[r:r+1]:
            answer+="5"
        else:
            answer+="2"
    return answer