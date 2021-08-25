// kata: https://www.codewars.com/kata/55f3da49e83ca1ddae0000ad/train/java

function tankvol(h, d, vt) {
    let cylinderRadius = d / 2;
    let heightOfCylinder = vt / (Math.PI * (cylinderRadius * cylinderRadius));
    // determine area of segment with liquid
    let areaVolume = (cylinderRadius * cylinderRadius) * Math.acos((cylinderRadius - heightOfCylinder) / cylinderRadius) - (cylinderRadius - heightOfCylinder) * Math.sqrt(2 * (cylinderRadius * heightOfCylinder) - (heightOfCylinder * heightOfCylinder));

    let segmentVolume = heightOfCylinder * areaVolume;
    return Math.floor(segmentVolume);
}



//  Test Data:
// should return 1021 (calculation gives about: 1021.26992027)
console.log(tankvol(40, 120, 3500));

// should return 1750
tankvol(60, 120, 3500);

// should return 2478 (calculation gives about: 2478.73007973)
tankvol(80, 120, 3500);