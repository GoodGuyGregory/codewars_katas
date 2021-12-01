// Kata: https://www.codewars.com/kata/515decfd9dcfc23bb6000006/train/javascript

function isValidIP(str) {
    const ipRegex = /([1-9]+).([1-9]+).([1-9]+).([1-9]+)/g;
    const foundIp = [...str.matchAll(ipRegex)];
    if (foundIp.length != 0) {
        let foundstring = foundIp[0][0];
        if (str.length > foundstring.length) {
            return false;
        }

        // check for leading zeros within the ip address groups
        for (let i = 1; i < 5; i++) {
            if (foundIp[0][i] < 100 && foundIp[0][i].charAt(0) == '0') {
                return false;
            }
            else if (foundIp[0][i] > 255) {
                return false;
            }
            else {
                continue;
            }
        }
    }
    else if (foundIp.length == 0) {
        return false;
    }
    return true;
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
console.log(isValidIP('1e0.1e1.1e2.2e2'));