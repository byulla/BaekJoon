func solution(num int) int {
    
    var cnt int = 0;
    /*cnt := 0
    answer := 0*/
    
    for num != 1 {
        if num % 2 == 0 {
            num /= 2
        } else {
            num = num * 3 + 1
        }
        
        cnt++;
    }
    
    if cnt >= 500 {
        cnt = -1
    }
    
    return cnt
}