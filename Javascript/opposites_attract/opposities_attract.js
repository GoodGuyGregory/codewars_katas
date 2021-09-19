//  Kata: https://www.codewars.com/kata/555086d53eac039a2a000083/train/javascript

function lovefunc(flower1, flower2) {
    //  both even
    if ((flower1 % 2 == 0 && flower2 % 2 == 0) ||
        ((flower1 % 2 == 0) == false && (flower2 % 2 == 0) == false)) {
        return false;
    }
    //  either one is even or odd
    else if (((flower1 % 2 == 0) == false && (flower2 % 2 == 0) == true) ||
        ((flower1 % 2 == 0) == true && (flower2 % 2 == 0) == false)) {
        return true;
    }
}

// return flower1 % 2 !== flower2 % 2;

//  Test Cases:
//  should return true
console.log(lovefunc(1, 4));
//  should return false
console.log((lovefunc(2, 2)));
//  should return true
console.log((lovefunc(0, 1)));
//  should return false
console.log(lovefunc(0, 0));
