Jawaban latihan Pengenalan AI and OpenAI

f you're a programmer, you make an sorce code using python like this :
import random
for i in range(21):
    a = random.randint(1,15)
    b = random.randint(1,15)
    question = "What is "+a+" x "+b+"? "
    answer = int(input(question))
    if answer == a*b:
        print ("Well done!")
    else:
        print("No.")
can you detect the bug that's inside source code?

The Python code snippet you've provided has a few issues that need to be corrected for it to function properly:

1. **Type Error in String Concatenation**:
   - Python does not allow concatenation of integers with strings directly. In the line constructing the `question` string, both `a` and `b` need to be explicitly converted to strings. Currently, this will throw a `TypeError`.

Here’s how you can correct the source code:

```python
import random
for i in range(21):
    a = random.randint(1, 15)
    b = random.randint(1, 15)
    question = "What is " + str(a) + " x " + str(b) + "? "
    answer = int(input(question))
    if answer == a * b:
        print("Well done!")
    else:
        print("No.")
```

**Corrections made**:
- Added `str()` around `a` and `b` in the concatenation to convert them to strings, thus avoiding the type error.

With these adjustments, your code should now run without errors and correctly ask the user to solve a series of multiplication problems, providing feedback based on the correctness of their responses.