function solution(s){
    let answer = true;
    let str = s.toUpperCase();
    let count = 0;
    
    for(let i = 0; i < s.length; i++){
        if(str[i] === 'P') count++;
        else if(str[i] === 'Y') count--;
    }
    
    if(count == 0) answer = true;
    else answer = false;
    
    return answer;
}