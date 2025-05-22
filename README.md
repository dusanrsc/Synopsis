# QUICK SYNOPSISOF PROGRAMMING LANGUAGES...

# PYTHON3
```python
# Entry point
def main():
    print("Hello, Python!")
    message = greet("World")
    print(message)

# Variables and Types
an_int = 10
a_float = 3.14
a_string = "Python"
a_bool = True
a_list = [1, 2, 3]
a_dict = {"key": "value"}
a_set = {1, 2, 3}
a_tuple = (1, 2, 3)

# String formatting
name = "Alice"
greeting = f"Hello, {name}"

# Functions
def greet(name: str) -> str:
    return f"Hello, {name}"

def add(a, b):
    return a + b

# Lambda function
multiply = lambda x, y: x * y

# Conditionals
def check_number(n):
    if n > 0:
        return "Positive"
    elif n < 0:
        return "Negative"
    else:
        return "Zero"

# Loops
for i in range(5):
    print(i)

x = 0
while x < 5:
    print(x)
    x += 1

# Collections
my_list = [1, 2, 3]
my_list.append(4)

my_dict = {"a": 1, "b": 2}
my_dict["c"] = 3

# List comprehension
squares = [x*x for x in range(10)]

# Functions with default and keyword arguments
def power(base, exponent=2):
    return base ** exponent

# *args and **kwargs
def print_args(*args, **kwargs):
    print(args)
    print(kwargs)

# Classes and OOP
class Animal:
    def __init__(self, name):
        self.name = name

    def speak(self):
        return "..."

class Dog(Animal):
    def speak(self):
        return "Woof"

dog = Dog("Fido")
print(dog.speak())

# Static and class methods
class Utils:
    @staticmethod
    def say_hi():
        return "Hi!"

    @classmethod
    def description(cls):
        return f"This is {cls.__name__}"

# Exception Handling
try:
    result = 10 / 0
except ZeroDivisionError as e:
    print("Error:", e)
finally:
    print("Done")

# File I/O
with open("example.txt", "w") as f:
    f.write("Hello, file!")

with open("example.txt", "r") as f:
    content = f.read()

# Modules and Imports
import math
print(math.sqrt(16))

# Decorators
def decorator(func):
    def wrapper(*args, **kwargs):
        print("Before call")
        result = func(*args, **kwargs)
        print("After call")
        return result
    return wrapper

@decorator
def say_hello():
    print("Hello!")

# Generators
def counter():
    i = 0
    while i < 3:
        yield i
        i += 1

for num in counter():
    print(num)

# Context Managers
class MyContext:
    def __enter__(self):
        print("Entering")
        return self

    def __exit__(self, exc_type, exc_val, exc_tb):
        print("Exiting")

with MyContext():
    print("Inside context")

# Type Hints
def greet_user(name: str) -> str:
    return f"Hi, {name}"

# Main guard
if __name__ == "__main__":
    main()
```

# JAVASCRIPT
```javascript
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
```
