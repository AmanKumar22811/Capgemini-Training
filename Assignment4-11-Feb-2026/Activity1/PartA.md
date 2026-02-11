# Part A: Conceptual Questions – Stack

## 1. Define Stack and Explain LIFO Principle

A **Stack** is a linear data structure that follows the **LIFO (Last In, First Out)** principle.  
This means the element that is inserted last will be removed first.

In a stack:
- Insertion operation is called **Push**
- Deletion operation is called **Pop**
- The top element is accessed using **Peek/Top**

### LIFO Principle Example:
If we push elements in this order:
10 → 20 → 30  

The stack will look like:
Top → 30  
        20  
        10  

When we pop, **30** will be removed first.

---

## 2. What is Stack Overflow and Stack Underflow?

### Stack Overflow:
Stack Overflow occurs when we try to **push an element into a stack that is already full**.

Condition: top == size - 1


It usually happens in:
- Array implementation of stack
- Deep recursion in programming

---

### Stack Underflow:
Stack Underflow occurs when we try to **pop an element from an empty stack**.

Condition: top == -1


---

## 3. Real-Life Examples of Stack

1. **Stack of Plates**
   - The last plate placed on top is the first one removed.

2. **Browser Back Button**
   - Recently visited page is stored on top.
   - When pressing back, the last visited page opens first.

3. **Undo/Redo Operation**
   - The last action performed is undone first.

4. **Function Call Stack**
   - The most recent function call is executed and returned first.

---

## 4. Time Complexity of Push and Pop Operations

| Operation | Time Complexity |
|-----------|-----------------|
| Push      | O(1)            |
| Pop       | O(1)            |

Both operations take **constant time** because:
- They only modify the top pointer.
- No traversal of elements is required.

---

# Summary

- Stack follows **LIFO principle**.
- Push and Pop operations take **O(1)** time.
- Stack Overflow occurs when stack is full.
- Stack Underflow occurs when stack is empty.
