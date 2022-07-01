func solution(x int, n int) []int {
    
    var answer []int = make([]int, n)
    
    for i := 1; i <= n; i++ {
        answer[i - 1] = x * i
    }
    
    return answer
}