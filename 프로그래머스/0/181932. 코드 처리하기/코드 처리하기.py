def solution(code):
    answer = ''
    mode=0
    for idx in range(0,len(code)):
        if code[idx]=="1":
            mode=not mode 
            continue
        if mode==0:
            if idx%2==0:
                answer+=code[idx]
        else:
            if idx%2!=0:
                answer+=code[idx]
    if answer=="":
        return "EMPTY"
    return answer