// https://www.codewars.com/kata/51e0007c1f9378fa810002a9

// Return the output array, and ignore all non-op characters
const parse = data => {

	const result = [];
  
	for(let i = 0, initVal = 0; i < data.length; i++) {
  
	  switch(data[i]) {
		case 'i':
		  initVal++;
		  break;
		case 'd':
		  initVal--;
		  break;
		case 's':
		  initVal *= initVal;
		  break;
		case 'o':
		  result.push(initVal);
		  break;
	  }
	  
	}
	
	return result
  }