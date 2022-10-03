func solution(n int, t int) int {
    var temp int
    temp = 1
    for i := 1; i <= t; i++ {
        temp = n * 2
        n = temp
    }
    return temp
}