// kata: https://www.codewars.com/kata/55f3da49e83ca1ddae0000ad/train/java

function tankvol(h, d, vt) {
    let cylinderRadius = d / 2;
    let heightOfCylinder = vt / (Math.PI * (cylinderRadius * cylinderRadius));
    // determine area of segment with liquid
    let areaVolume = Math.pow(cylinderRadius, 2) * Math.acos((cylinderRadius - h) / cylinderRadius) - (cylinderRadius - h) * Math.sqrt(2 * (cylinderRadius * h) - (Math.pow(h, 2)));

    let segmentVolume = heightOfCylinder * areaVolume;
    return Math.floor(segmentVolume);
}



//  Test Data:
// should return 1021 (calculation gives about: 1021.26992027)
console.log(tankvol(40, 120, 3500));

// should return 1750
console.log(tankvol(60, 120, 3500));

// should return 2478 (calculation gives about: 2478.73007973)
console.log(tankvol(80, 120, 3500));