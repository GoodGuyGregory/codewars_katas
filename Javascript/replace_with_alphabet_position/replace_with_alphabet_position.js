// Problem: https://www.codewars.com/kata/546f922b54af40e1e90001da/javascript
// Solution:
function alphabetPosition(alphaString) {
    alphaString = alphaString.toLowerCase();
    // console.log(alphaString);
    // create switch case for values inside of the string 
    let stringValues = ""

    for (let i = 0; i < alphaString.length; i++) {
        let letter = alphaString.charAt(i);
        // console.log(letter);

        switch (letter) {
            case 'a':
                stringValues += 1;
                stringValues += " ";
                break;
            case 'b':
                stringValues += 2;
                stringValues += " ";
                break;
            case 'c':
                stringValues += 3;
                stringValues += " ";
                break;
            case 'd':
                stringValues += 4;
                stringValues += " ";
                break;
            case 'e':
                stringValues += 5;
                stringValues += " ";
                break;
            case 'f':
                stringValues += 6;
                stringValues += " ";
                break;
            case 'g':
                stringValues += 7;
                stringValues += " ";
                break;
            case 'h':
                stringValues += 8;
                stringValues += " ";
                break;
            case 'i':
                stringValues += 9;
                stringValues += " ";
                break;
            case 'j':
                stringValues += 10;
                stringValues += " ";
                break;
            case 'k':
                stringValues += 11;
                stringValues += " ";
                break;
            case 'l':
                stringValues += 12;
                stringValues += " ";
                break;
            case 'm':
                stringValues += 13;
                stringValues += " ";
                break;
            case 'n':
                stringValues += 14;
                stringValues += " ";
                break;
            case 'o':
                stringValues += 15;
                stringValues += " ";
                break;
            case 'p':
                stringValues += 16;
                stringValues += " ";
                break;
            case 'q':
                stringValues += 17;
                stringValues += " ";
                break;
            case 'r':
                stringValues += 18;
                stringValues += " ";
                break;
            case 's':
                stringValues += 19;
                stringValues += " ";
                break;
            case 't':
                stringValues += 20;
                stringValues += " ";
                break;
            case 'u':
                stringValues += 21;
                stringValues += " ";
                break;
            case 'v':
                stringValues += 22;
                stringValues += " ";
                break;
            case 'w':
                stringValues += 23;
                stringValues += " ";
                break;
            case 'x':
                stringValues += 24;
                stringValues += " ";
                break;
            case 'y':
                stringValues += 25;
                stringValues += " ";
                break;
            case 'z':
                stringValues += 26;
                stringValues += " ";
                break;

        }

    }
    return stringValues;
}



// Example:

console.log(alphabetPosition("The sunset sets at twelve o' clock."));


// Expected Results 
// "20 8 5 19 21 14 19 5 20 19 5 20 19 1 20 20 23 5 12 22 5 15 3 12 15 3 11" (as a string)
