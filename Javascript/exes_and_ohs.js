https://www.codewars.com/kata/55908aad6620c066bc00002a

const getCount = (str, regex) => (str.match(regex) || []).length;

const XO = str => getCount(str, /x/gi) === getCount(str, /o/gi);

XO('ooxXm'); // Returns true