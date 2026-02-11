# Part B: Dry Run Activity – Stack (Size = 5)

### Initial Condition:
- Stack size = 5
- TOP = -1 (Stack is empty)

---

## Step-by-Step Operations

### 1️⃣ Push(10)
- TOP = TOP + 1 → -1 + 1 = 0
- Stack[0] = 10

Stack: [10]
TOP = 0

---

### 2️⃣ Push(20)
- TOP = 0 + 1 = 1
- Stack[1] = 20

Stack: [10, 20]
TOP = 1

---

### 3️⃣ Push(30)
- TOP = 1 + 1 = 2
- Stack[2] = 30

Stack: [10, 20, 30]
TOP = 2

---

### 4️⃣ Pop()
- Remove element at TOP (30)
- TOP = 2 - 1 = 1

Stack: [10, 20]
TOP = 1

---

### 5️⃣ Push(40)
- TOP = 1 + 1 = 2
- Stack[2] = 40

Stack: [10, 20, 40]
TOP = 2

---

### 6️⃣ Peek()
- Peek returns element at TOP
- Element = Stack[2] = 40
- TOP does NOT change

Stack: [10, 20, 40]
TOP = 2

---

# Final Result

| Operation   | TOP Value | Stack Content        |
|------------|-----------|----------------------|
| Push(10)   | 0         | [10]                 |
| Push(20)   | 1         | [10, 20]             |
| Push(30)   | 2         | [10, 20, 30]         |
| Pop()      | 1         | [10, 20]             |
| Push(40)   | 2         | [10, 20, 40]         |
| Peek()     | 2         | [10, 20, 40]         |

---

### Final Stack State:
TOP = 2  
Stack = [10, 20, 40]
