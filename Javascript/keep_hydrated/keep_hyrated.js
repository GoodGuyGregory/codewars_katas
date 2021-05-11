// Kata: https://www.codewars.com/kata/582cb0224e56e068d800003c/train/javascript

// Whoever made this has never biked in their life

function litres(time) {
    desiredWater = 0.5;
    hydration = time * desiredWater;
    return Math.floor(hydration);
}

// rounding up for water makes more sense ...
function noHeatStrokeliters(time) {
    desiredWater = 0.5;
    hydration = time * desiredWater;
    return Math.ceil(hydration);
}
//  Test Cases:

// time = 3 ----> litres = 1
console.log(litres(3));

// time = 6.7-- -> litres = 3
console.log(litres(6.7));

// time = 11.8-- > litres = 5
console.log(litres(11.8));
