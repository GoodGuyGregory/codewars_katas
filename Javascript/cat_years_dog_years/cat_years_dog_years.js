// Kata: https://www.codewars.com/kata/5a6663e9fd56cb5ab800008b

var humanYearsCatYearsDogYears = function (humanYears) {
    // [humanYears, catYears, dogYears]
    if (humanYears == 1) {
        return [1, 15, 15];
    }
    else if (humanYears == 2) {
        return [2, 24, 24];
    }
    else {
        let yearsAfterTwo = humanYears - 2;
        //  +4 years after second year
        let catYears = 24;
        //  +5 years after second year
        let dogYears = 24;
        for (let yearsAfter = 0; yearsAfter < yearsAfterTwo; yearsAfter++) {
            catYears += 4;
            dogYears += 5
        }
        return [humanYears, catYears, dogYears];
    }
}

var humanYearsCatYearsDogYearsCleverSolution = function (y) {
    if (y == 1) return [1, 15, 15]
    if (y == 2) return [2, 24, 24]
    //  implies that the year after can be multipled by 4 or 5 and added to the 24 
    return [y, (y - 2) * 4 + 24, (y - 2) * 5 + 24]
}



// TESTS:

//  base cases:
console.log(humanYearsCatYearsDogYears(1));

console.log(humanYearsCatYearsDogYears(2));

//  experimental values
// [10,56,64];
console.log(humanYearsCatYearsDogYears(10))