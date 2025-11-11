# Comparison of Recursive vs Iterative Solutions

This report compares the recursive and iterative implementations for two classic problems: Fibonacci sequence calculation and inserting a node at the end of a linked list. Both approaches are implemented in Java and demonstrate key differences in performance, memory usage, and stack depth.

---

## 1. Fibonacci Sequence

### Recursive Approach
- **File:** `RecursiveFibonacci.java`
- **Method:** Recursively computes `F(n) = F(n-1) + F(n-2)`
- **Complexity:** Exponential time $O(2^n)$, deep call stack
- **Pros:** Simple, elegant, closely matches mathematical definition
- **Cons:** Extremely slow for large $n$, risk of stack overflow, redundant calculations
- **Demo:** Stops if computation time for a single $n$ exceeds 10 seconds

### Iterative Approach
- **File:** `IterativeFibonacci.java`
- **Method:** Uses a loop to build up the sequence
- **Complexity:** Linear time $O(n)$, constant stack depth
- **Pros:** Fast, efficient, safe for large $n$
- **Cons:** Slightly less elegant, but much more practical
- **Demo:** Can compute large $n$ quickly (e.g., $n=50$)

| Approach   | Time Complexity | Stack Usage | Practical Limit | Elegance |
|------------|----------------|-------------|-----------------|----------|
| Recursive  | $O(2^n)$       | Deep        | Small $n$       | High     |
| Iterative  | $O(n)$         | Constant    | Large $n$       | Medium   |

---

## 2. Linked List: Insert at End

### Recursive Approach
- **File:** `RecursiveInsertLast.java`
- **Method:** Recursively traverses to the end, then inserts
- **Complexity:** Linear time $O(n)$, stack depth $O(n)$
- **Pros:** Simple code, matches recursive thinking
- **Cons:** Stack overflow risk for long lists, slower due to call overhead
- **Demo:** Reports observed recursion depth; may fail for very large lists

### Iterative Approach
- **File:** `IterativeInsertLast.java`
- **Method:** Uses a loop to traverse to the end, then inserts
- **Complexity:** Linear time $O(n)$, constant stack depth
- **Pros:** Safe for long lists, efficient
- **Cons:** Slightly more verbose code
- **Demo:** Stack depth is always 1 (no recursion)

| Approach   | Time Complexity | Stack Usage | Practical Limit | Elegance |
|------------|----------------|-------------|-----------------|----------|
| Recursive  | $O(n)$         | Deep        | Short lists     | High     |
| Iterative  | $O(n)$         | Constant    | Long lists      | Medium   |

---

## Summary Table

| Problem      | Recursive: Pros/Cons                | Iterative: Pros/Cons                |
|--------------|-------------------------------------|-------------------------------------|
| Fibonacci    | + Elegant, matches math<br>- Slow, stack overflow | + Fast, safe<br>- Less elegant |
| Linked List  | + Simple code<br>- Stack overflow   | + Efficient, safe<br>- More verbose |

---

## Key Takeaways
- **Recursive solutions** are elegant and intuitive for problems defined recursively, but suffer from performance and stack limitations in Java.
- **Iterative solutions** are generally more efficient and robust, especially for large inputs or long lists.
- For production code, prefer iterative solutions unless recursion is required or input sizes are guaranteed to be small.

---

