import "fmt"

func solution(seoul []string) string {
    index := 0
    
    for i := 0; i < len(seoul); i++ {
        if seoul[i] == "Kim" {
            index = i;
            break;
        }
    }
    
    return fmt.Sprintf("김서방은 %d에 있다", index)
}