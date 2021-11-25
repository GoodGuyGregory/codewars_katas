// Kata: https://www.codewars.com/kata/515decfd9dcfc23bb6000006/train/javascript

function isValidIP(str) {
    let ipRegex = '([1 - 9] +).([1 - 9] +).([1 - 9] +).([1 - 9] +)';
    let foundIp = ipRegex.matchAll(str);

    return foundIp;
}

// Test Cases:
// ============================
// valid ips:
console.log(isValidIP(1.2.3.4));
console.log(isValidIP(123.45.67.89));

// invalid ips:
console.log(isValidIP(1.2.3));
console.log(isValidIP(1.2.3.4.5));
console.log(isValidIP(123.456.78.90));
console.log(isValidIP(123.045.067.089));


