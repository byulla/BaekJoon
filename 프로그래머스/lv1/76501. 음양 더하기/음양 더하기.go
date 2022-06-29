func solution(absolutes []int, signs []bool) int {

	length := len(absolutes)
	var sum int = 0

	for i := 0; i < length; i++ {
		if signs[i] == true {
			sum = sum + absolutes[i]*1
		} else {
			sum += absolutes[i] * -1
		}
	}

	return sum
}
