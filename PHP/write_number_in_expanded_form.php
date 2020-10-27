<?php

// https://www.codewars.com/kata/5842df8ccbd22792a400024

function expanded_form(int $n) : string {
	$zeroes = '';
	$result = [];
	$digits = str_split(strrev($n));
	
	foreach($digits as $digit) {
  
	  if($digit === '0') {
		$zeroes .= '0';
		continue;
	  }
  
	  $result[] = $digit.$zeroes;
	  $zeroes .= '0';
	}
	
	return implode(' + ', array_reverse($result));
}