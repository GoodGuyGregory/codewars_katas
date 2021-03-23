// Kata: https://www.codewars.com/kata/55d24f55d7dd296eb9000030/train/javascript

var summation = function (num) {
    if (num > 1) {
        let sum = num;
        while (num > 1) {
            sum += num - 1;
            num -= 1;
        }
        return sum
    }
    else {
        return num;
    }

}

//  Test Cases:

console.log("Summation 1: " + summation(1));
console.log("Summation 8: " + summation(8));
