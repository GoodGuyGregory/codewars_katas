function towerBuilder(nFloors) {
    let tower = [];
    let level = 1;
    while (level <= nFloors) {
        let floor = "";
        console.log(`level: ${level}`);
        if (level == 1) {

            floor += "*";
            tower.push(floor);
        }
        else {
            floorNum = level;
            for (let i = 0; i < (floorNum+2) ; i ++) {
                floor += "*";
            }
            tower.push(floor);
        }
        level += 1;
    }
    console.log(tower);
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