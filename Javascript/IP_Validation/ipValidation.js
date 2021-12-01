// Kata: https://www.codewars.com/kata/515decfd9dcfc23bb6000006/train/javascript

function isValidIP(str) {
    const ipRegex = /([1-9]+).([1-9]+).([1-9]+).([1-9]+)/g;
    const foundIp = [...str.matchAll(ipRegex)];
    if (foundIp.length != 0) {
        let foundstring = foundIp[0].input;
        if (str.length > foundstring.length) {
            return false;
        }
    }

    for (const index in foundIp[0]) {
        console.log(foundIp[0][index]);
    }

    return result;
}

// Test Cases:
// ============================
// valid ips:
console.log(isValidIP("1.2.3.4"));
console.log(isValidIP("123.45.67.89"));

// invalid ips:
console.log(isValidIP("1.2.3"));
console.log(isValidIP("1.2.3.4.5"));
console.log(isValidIP("123.456.78.90"));
console.log(isValidIP("123.045.067.089"));


