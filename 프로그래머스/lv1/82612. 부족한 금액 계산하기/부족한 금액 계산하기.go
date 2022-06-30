func solution(price int, money int, count int) int64 {

	var answer int = -1
	var summoney []int = make([]int, count)

	for i := 1; i <= count; i++ {
		summoney[i-1] = price * i
	}

	var sum int = 0
	for i := 0; i < len(summoney); i++ {
		sum += summoney[i]
	}

	answer = sum - money

	if money > sum {
		return 0
	} else {
		return int64(answer)
	}
}
