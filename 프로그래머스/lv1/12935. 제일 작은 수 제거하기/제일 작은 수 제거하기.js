function solution(arr) {
    var answer = [];
    let min = arr[0];
    let index = 0;
    
    for(let i = 0; i < arr.length; i++){
        if(min > arr[i]) {
            min = arr[i];
            index = i;
        }
    }
    
    for(let i = 0; i < arr.length; i++){
        if(arr[i] === min){
            arr.splice(i, 1);
            i--;
        }
    }
    answer = arr;
    if(answer == 10) answer = [-1];
    else if(answer == "") answer = [-1];
    
    return answer;
    
}