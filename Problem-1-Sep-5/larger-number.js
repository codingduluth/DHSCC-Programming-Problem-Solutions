// JavaScript: Find the largest of two numbers
function findLargest(num1, num2) {
  if (num1 > num2) {
    return num1;
  } else {
    return num2;
  }
}

// Test the function
let num1 = 10;
let num2 = 20;
console.log('The largest number is:', findLargest(num1, num2));
