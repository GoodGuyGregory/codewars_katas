// Kata: 

function towerBuilder(nFloors) {
    let tower = [];
    let level = 1;
    // keep stacking... 
    while (level <= nFloors) {
        // number of stars to print.
        // derived from generic arithmetic sequence forumla
        let contentsPerLevel = 1 + (level - 1) * 2;
        if (contentsPerLevel == 0) {
            contentsPerLevel = 1;
        }
        // adds beginning space
        let levelContents = ' ';
        for (let i = 0; i < contentsPerLevel; i++) {

            levelContents += '*';
        }
        // adds trailing space
        levelContents += ' ';
        tower.push(levelContents);
        // going up...
        level++;
    }
    return tower;
}



// Test Cases:

// towerBuilder(3) => [
//   "  *  ",
//   " *** ", 
//   "*****"
// ]

    console.log(towerBuilder(3));


// towerBuilder(6) => [
    //   "     *     ", 
    //   "    ***    ", 
    //   "   *****   ", 
    //   "  *******  ", 
    //   " ********* ", 
    //   "***********"
    // ]

 console.log(towerBuilder(6));