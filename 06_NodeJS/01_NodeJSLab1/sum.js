/**
 * a) 
 */
const mySum = (...nums) => {
  let sum = 0;
  
  nums.forEach( num => sum += num );

  return sum;
}

module.exports = mySum;