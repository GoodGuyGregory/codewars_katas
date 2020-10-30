https://www.codewars.com/kata/52b757663a95b11b3d00062d

function toWeirdCase(string){
	let arr = [...string];
	for(let i = 0; i < arr.length;) {
  
	  if(arr[i] === " ") {
		i++;
	  } else {
		arr[i] = arr[i].toUpperCase();
		i += 2;
	  }
  
	}
  
	return arr.join("");
}