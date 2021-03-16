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
    else if (names.length == we.length && n < names.length + 1) {
        let nameValues = [];

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

        nameValues.sort((a, b) => {
            if (b.total > a.total) {
                return 1;
            }

            if (a.total > b.total) {
                return -1;
            }

            if (b.total == a.total) {
                if (b.name.length > a.name.length) {
                    for (let i = 0; i < b.name.length; i++) {
                        for (let letter of a.name) {
                            if (letter.localeCompare(b.name[i]) >= 1) {
                                return 1;
                            }

                        }
                    }
                }
                else if (b.name.length < a.name.length) {
                    for (let i = 0; i < a.name.length; i++) {
                        for (let letter of b.name) {
                            if (letter.localeCompare(a.name[i]) >= 1) {
                                return -1;
                            }
                        }
                    }
                }
                else {
                    for (let i = 0; i < b.name.length; i++) {
                        for (let letter of a.name) {
                            if (letter.localeCompare(b.name[i]) == 1) {
                                return 1;
                            }
                        }
                    }
                }


            }
        });

        return nameValues[n - 1].name.charAt(0).toUpperCase() + nameValues[n - 1].name.slice(1, nameValues[n - 1].name.length);

    }

    else {
        return "Not enough participants";
    }

}

// Test Cases:
console.log(rank("", [4, 2, 1, 4, 3, 1, 2], 6));
// console.log(rank("Addison,Jayden,Sofia,Michael,Andrew,Lily,Benjamin", [4, 2, 1, 4, 3, 1, 2], 8));
// console.log(rank("Lagon,Lily", [1, 5], 2));
// console.log(rank("Addison,Jayden,Sofia,Michael,Andrew,Lily,Benjamin", [4, 2, 1, 4, 3, 1, 2], 4));

// console.log(rank("aubrey,olivai,abigail,chloe,andrew,elizabeth", [3, 1, 4, 4, 3, 2], 4));

console.log(rank("william,willaim,olivia,olivai,lily,lyli", [1, 1, 1, 1, 1, 1], 1));

console.log(rank("Elijah,Chloe,Elizabeth,Matthew,Natalie,Jayden", [1, 3, 5, 5, 3, 6], 2));

console.log(rank("Mason,Sophia,Lagon,Lyli,Jayden,Joshua,Daniel,Ella,Mia,Naoh,Aiden,Jacob,Elizabeth,James", [1, 4, 3, 3, 1, 1, 1, 1, 2, 5, 5, 3, 1, 2], 7));