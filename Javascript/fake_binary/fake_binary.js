function fakeBin(x) {
    let fakeBinary = "";
    for (let i = 0; i < x.length; i++) {
        let number = x.charAt(i);
        if (number < 5) {
            fakeBinary += '0';
        }
        else {
            fakeBinary += '1';
        }

    }
    return fakeBinary;
}

// test cases:
// '01011110001100111'
console.log(fakeBin('45385593107843568'));

// '101000111101101' 
console.log(fakeBin('509321967506747'));

// '011011110000101010000011011'
console.log(fakeBin('366058562030849490134388085'));