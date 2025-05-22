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

```
