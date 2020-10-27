<?php 

// https://www.codewars.com/kata/55908aad6620c066bc00002a

function XO($input) : bool {
  	$input = strtolower($input);
  
  	return substr_count($input, 'x') === substr_count($input, 'o');
}