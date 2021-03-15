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
    let names = st.split(",");

    if (!st) {
        return "No participants";
    }
    else if (names.length == we.length && n < names.length) {
        let nameValues = [];

        let largestValue = 0;
        for (let i = 0; i < names.length; i++) {
            let name = names[i];
            let weight = we[i];

            let total = 0;
            for (let char of name) {
                if (letterValues.get(char)) {
                    total = total + letterValues.get(char);
                }
            }
            total *= weight;
            // assign name a value in map
            nameValues.push({
                "name": name,
                "total": total,
            });
        }
        nameValues.sort((a, b) => b.total - a.total);
        nameValues.forEach(name => {
            console.log(name);
        });


    }

    else {
        return "Not enought participants";
    }

}

// Test Cases:
console.log(rank("", [4, 2, 1, 4, 3, 1, 2], 6));
console.log(rank("Addison,Jayden,Sofia,Michael,Andrew,Lily,Benjamin", [4, 2, 1, 4, 3, 1, 2], 8));
console.log(rank("Addison,Jayden,Sofia,Michael,Andrew,Lily,Benjamin", [4, 2, 1, 4, 3, 1, 2], 4));