// Kata: https://www.codewars.com/kata/5616868c81a0f281e500005c/train/javascript

function rank(st, we, n) {
    // array of letters
    let letters = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h',
        'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'x', 'y', 'z'];
    // create map object
    let letterValues = new Map();
    let j = 1;
    for (let i = 0; i < letters.length; i++) {
        letterValues.set(letters[i], j);
        j++;
    }

    st = st.toLowerCase();
    let names = st.split(",")
    console.log(names);
    let total = 0;
    for (let char of st) {
        if (letterValues.get(char)) {
            total = total + letterValues.get(char);
        }

    }


}

// Test Cases:


console.log(rank("Lagon, Lily"));