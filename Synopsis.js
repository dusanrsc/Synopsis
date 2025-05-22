// Variables
let a = 10;       // block-scoped variable
const PI = 3.14;  // constant
var legacy = 5;   // function-scoped variable (avoid using var)

// Data Types
let str = "Hello";
let num = 123;
let bool = true;
let arr = [1, 2, 3];
let obj = { name: "Alice", age: 25 };
let und = undefined;
let nul = null;

// Template Literals
let name = "John";
let greeting = `Hello, ${name}`;

// Functions
function add(x, y) {
  return x + y;
}

const multiply = (x, y) => x * y;

// Control Flow
if (a > 5) {
  console.log("Greater than 5");
} else {
  console.log("5 or less");
}

for (let i = 0; i < 5; i++) {
  console.log(i);
}

let i = 0;
while (i < 5) {
  console.log(i++);
}

// Arrays
let fruits = ["apple", "banana", "cherry"];
fruits.push("orange");
fruits.forEach(f => console.log(f));

let upperFruits = fruits.map(f => f.toUpperCase());

// Objects
let user = {
  name: "Bob",
  age: 30,
  greet() {
    console.log(`Hi, I'm ${this.name}`);
  }
};

user.greet();

// Destructuring
const { name: username, age } = user;
const [first, second] = fruits;

// Spread & Rest
let extended = [...fruits, "kiwi"];
function sum(...nums) {
  return nums.reduce((a, b) => a + b, 0);
}

// Classes
class Animal {
  constructor(name) {
    this.name = name;
  }

  speak() {
    console.log(`${this.name} makes a sound`);
  }
}

class Dog extends Animal {
  speak() {
    console.log(`${this.name} barks`);
  }
}

let dog = new Dog("Rex");
dog.speak();

// Promises
function asyncTask() {
  return new Promise((resolve, reject) => {
    setTimeout(() => resolve("Done!"), 1000);
  });
}

asyncTask().then(console.log);

// Async/Await
async function run() {
  let result = await asyncTask();
  console.log(result);
}

run();

// Try/Catch
try {
  throw new Error("Something went wrong");
} catch (e) {
  console.error(e.message);
}

// DOM Manipulation
document.getElementById("myBtn").addEventListener("click", () => {
  alert("Button clicked!");
});

// Query selectors
let div = document.querySelector(".my-div");
div.innerText = "Changed text";

// Local Storage
localStorage.setItem("key", "value");
let value = localStorage.getItem("key");

// JSON
let jsonString = JSON.stringify(user);
let parsedUser = JSON.parse(jsonString);

// Modules (in separate files)
// file1.js
export const PI = 3.14;
export function square(x) {
  return x * x;
}

// file2.js
// import { PI, square } from './file1.js';

// Set & Map
let unique = new Set([1, 2, 2, 3]);
let map = new Map();
map.set("a", 1);
map.set("b", 2);

// Nullish Coalescing and Optional Chaining
let userName = user.name ?? "Guest";
let city = user?.address?.city;

// Event Handling
document.addEventListener("keydown", (e) => {
  console.log(`Key pressed: ${e.key}`);
});
