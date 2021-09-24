// Kata: https://www.codewars.com/kata/57cfdf34902f6ba3d300001e/train/csharp
function twoSort(s) {
    let sortableArray = s;
    sortableArray.sort(function compareElements(element1, element2) {
        return element1.charCodeAt(0) - element2.charCodeAt(0);
    });
    console.log(sortableArray);
}

// Test Cases:
// should return "b***i***t***c***o***i***n", 
twoSort(["bitcoin", "take", "over", "the", "world", "maybe", "who", "knows", "perhaps"]);

// should return , 'a***r***e'
twoSort(["turns", "out", "random", "test", "cases", "are", "easier", "than", "writing", "out", "basic", "ones"]);