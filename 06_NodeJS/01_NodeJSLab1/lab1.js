/**
 * b)
 */
const mySum = require('./sum.js')

console.log('--------------------------------------------');
/**
 * c)
 */
console.log('c)');
const myArr = [1, 2, 3, 5, 7, 11, 13];
console.log('myArr: ' + myArr);

console.log('--------------------------------------------');
/**
 * d)
 */
console.log('d)');

let result = mySum(...myArr);
console.log('sum: ' + result);

console.log('--------------------------------------------');
/**
 * e)
*/
console.log('e)');
const mySecondArr = myArr.map((arr)=>{
  return arr * 2;
});
console.log('secondArr: ' + mySecondArr);

console.log('--------------------------------------------');
/**
 * f)
*/
console.log('f)');

const aveArr = mySum(...mySecondArr) / mySecondArr.length;
console.log('average Array: ' + aveArr);
const overAve = mySecondArr.filter((num) => {return num >= aveArr}); 
console.log('above average: ' + overAve);

console.log('--------------------------------------------');
/**
 * g)
*/
console.log('g)');

setTimeout(()=>{
  console.log('Goodbye');
},3000);

console.log('--------------------------------------------');
/**
 * h)
 */
console.log('h)');

const Employee = {
  name: 'Tom',
  email: 'tom@gmail.com',
  department: 'sales',
  startDate: '05-09-2023'
}
console.log(Employee);

console.log('--------------------------------------------');
/**
 * i)
 */
console.log('i)');

let {name, email} = Employee;
const Person = {name, email};
console.log(Person);