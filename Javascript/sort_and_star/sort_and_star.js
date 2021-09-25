// Kata: https://www.codewars.com/kata/57cfdf34902f6ba3d300001e/train/csharp
function twoSort(s) {
    //  prevents touching the original array
    let sortableArray = s;
    //  sorts wuth compareFunc that will sort in ascending order by ascii values
    sortableArray.sort(function compareFunc(element1, element2) {
        return element1.charCodeAt(0) - element2.charCodeAt(0);
    });
    // corrupt the first element
    let firstWord = sortableArray[0];
    let firstWordLetters = []
    // push all the letters into an array
    for (let letter of firstWord) {
        firstWordLetters.push(letter);
    }
    let corruptedFirstWord = firstWordLetters.join("***");
    return corruptedFirstWord;


}

// Test Cases:
// should return "b***i***t***c***o***i***n", 
console.log(twoSort(["bitcoin", "take", "over", "the", "world", "maybe", "who", "knows", "perhaps"]));

// should return , 'a***r***e'
console.log(twoSort(["turns", "out", "random", "test", "cases", "are", "easier", "than", "writing", "out", "basic", "ones"]));