# template-interview
 Create application with some REST endpoints which takes input for each problem and returns the results.  
- Keep soutionfor each `problem` in separate package/directory.
- Implement tests for each `problem`  where you able to test the results.
- Expose swagger-ui to interact with the REST API.
- Please create separate Pull Requests for each problem.

## Problem 1: "Sorted list squared"
You have a sorted list of integers. Create a sorted list with all elements squared. Try to do it without explicitly using .sort() and if possible in O(n).


## Problem 2: "26 letters"
"The quick brown fox jumps over the lazy dog" is an English-language pangram — a sentence that contains all of the letters of the English alphabet. Write a function that verifies that statement is correct in the most efficient way (cpu, memory).


## Problem 3: "Print FooBar Alternately"
You have the following code:
```
class FooBar {
    public void foo() {
        for (int i = 0; i < n; i++) {
            print("foo");
        }
    }
    
    public void bar() {
        for (int i = 0; i < n; i++) {
            print("bar");
        }
    }
}   
```

The same instance of `FooBar` will be passed to two different threads. Thread A will call foo() while thread B will call bar(). Modify the given program to output "foobar" `n` times.

#### Example 1:
**Input**: n = 1

**Output**: "foobar"

**Explanation**: There are two threads being fired asynchronously. One of them calls foo(), while the other calls bar(). "foobar" is being output 1 time.

#### Example 2:
**Input**: n = 2

**Output**: "foobarfoobar"

**Explanation**:  "foobar" is being output 2 times.
