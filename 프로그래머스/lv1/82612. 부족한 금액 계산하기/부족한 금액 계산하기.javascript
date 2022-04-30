function solution(price, money, count) {
    let answer = -1;
    let summoney = [];
    
    for(let i = 1; i <= count; i++){
        summoney[i - 1] = price * i
    }
    
    let sum = 0;
    for(let i = 0; i < summoney.length; i++){
        sum += summoney[i];
    }

    answer = sum - money;
    
    if(money > sum) return 0;
    else return answer;
}