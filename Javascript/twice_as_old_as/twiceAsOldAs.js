// Kata: https://www.codewars.com/kata/5b853229cfde412a470000d0/train/javascript

function twiceAsOld(dadYearsOld, sonYearsOld) {
    let twiceSonAge = dadYearsOld - (sonYearsOld * 2);
    return Math.abs(twiceSonAge)
}

//  Test Data:
// "Testing for dad's age: 36 and son's age: 7": Should Yield 22
console.log(twiceAsOld(36, 7))
// "Testing for dad's age: 55 and son's age: 30": Should Yield 5
console.log(twiceAsOld(55, 30))
