function solution(arr)
{
    var answer = [];
    let len = 0
    //answer[0] = arr[0];
    //len++;
    
    for(let i = 0; i < arr.length; i++){
        if(arr[i] != arr[i + 1]){
            answer[len] = arr[i];
            len++;
        }
    }
    
    return answer;
}