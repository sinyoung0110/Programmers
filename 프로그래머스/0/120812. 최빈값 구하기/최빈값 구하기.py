def solution(array):
    # 빈도수 딕셔너리
    index = {}
    
    # 값의 빈도 계산
    for num in array:
        index[num] = index.get(num, 0) + 1
    
    # 가장 큰 빈도수를 구하기
    max_count = max(index.values())
    
    # 최빈값이 여러 개 있으면 -1 리턴
    mode_values=[key for key, value in index.items() if max_count==value]
    if len(mode_values)>1:
        return -1
    
    # 최빈값 하나만 있으면 반환
    return mode_values[0]
