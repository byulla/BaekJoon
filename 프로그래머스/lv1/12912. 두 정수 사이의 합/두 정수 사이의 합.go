func solution(a int, b int) int {

	var answer int = 0

	if a > b {
		temp := a
		a = b
		b = temp
	}

	for i := a; i <= b; i++ {
		answer += i
	}

	return answer
}