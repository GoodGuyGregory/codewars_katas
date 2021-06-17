//  Kata: https://www.codewars.com/kata/5a97387e5ee396e70a00016d/train/javascript

function pofi(n) {
    powersOfi = ['i', '-1', '-i', '1'];
    powerOfi = "";
    //  comes in with 0
    if (n == 0) {
        powerOfi = '1';
        return powerOfi;
    }
    else if (n == 1) {
        powerOfi = 'i';
        return powerOfi;
    }
    else {
        i = 1;
        while (i <= n) {
            for (let j = 0; j < powersOfi.length; j++) {
                if (i <= n) {
                    powerOfi = powersOfi[j];
                }
                i++;
            }
        }

        return powerOfi;
    }
}

// Clever Solution: apparently the modulus of  n % 4 can yield the resulting power of i 
//  if the array is formatted a certain way as follows
function pofi(n) {
    return ["1", "i", "-1", "-i"][n % 4];
}


//  TESTS:

//  i ^ 0 = 1
console.log(pofi(0));

//  i ^ 1 = i
console.log(pofi(1));

//  i ^ 2 = -1
console.log(pofi(2));

//  i ^ 3 = -i
console.log(pofi(3));

//  i ^ 4 = 1
console.log(pofi(4));

//  i ^ 5 = i
console.log(pofi(5));

//  i ^ 6 = -1
console.log(pofi(6));

//  i ^ 7 = -i
console.log(pofi(7));

//  i ^ 8 = 1
console.log(pofi(8));

//  i ^ 9 = i
console.log(pofi(9));

//  i ^ 10 = -1
console.log(pofi(10));
