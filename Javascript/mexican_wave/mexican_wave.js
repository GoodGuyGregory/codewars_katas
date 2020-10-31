// https://www.codewars.com/kata/58f5c63f1e26ecda7e000029

function wave(str){
	const result = [];
  
	str.split("").forEach((elem, index, arr) => {
	  let tempArr = [...arr];
  
	  if(elem !== " ") {
		tempArr[index] = elem.toUpperCase();
		result.push(tempArr.join(""));
	  } else {
		return;
	  }
  
	});
	
	return result;
}