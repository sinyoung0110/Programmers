def solution(age):
    dic = "abcdefghij"  # 0~9를 a~j로 매핑
    return ''.join(dic[int(ch)] for ch in str(age))
