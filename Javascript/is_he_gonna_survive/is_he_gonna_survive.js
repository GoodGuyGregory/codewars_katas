// Kata: https://www.codewars.com/kata/59ca8246d751df55cc00014c/train/javascript

function hero(bullets, dragons) {
    let neededBullets = dragons * 2;
    console.log(neededBullets);
    if (neededBullets <= bullets) {
        console.log("Fight The Dragons, You Will Survive");
        return true;
    }
    else
        console.log("You Can't Beat the Dragons. You need more Ammunition")
    return false;
}


// Test Cases:


console.log(hero(10, 5));
console.log(hero(7, 4));
console.log(hero(4, 5));
console.log(hero(100, 40));
console.log(hero(1500, 751));
console.log(hero(0, 1));
