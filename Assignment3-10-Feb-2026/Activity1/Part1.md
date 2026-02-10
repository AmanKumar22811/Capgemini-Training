# ACTIVITY 1 – Part 1: Concept Analysis  
**Course:** Java with AWS   
**Subject:** Problem Solving & Data Structures with Java  
**Topic:** Lists, ArrayList vs LinkedList  

---

## 📌 Comparison Table

| Feature | ArrayList | LinkedList |
|----------|------------|-------------|
| **Internal Structure** | Dynamic Array | Doubly Linked List (Node-based) |
| **Access Time Complexity** | O(1) | O(n) |
| **Insertion Time Complexity** | O(n) (shifting required) | O(1) at beginning, O(n) at end |
| **Deletion Time Complexity** | O(n) | O(1) at beginning |
| **Memory Usage** | Less (stores only data) | More (stores data + references) |

---

## 📌 Choose the Correct Data Structure

### 1️⃣ Student Record System  
**Answer:** ArrayList  
**Reason:** Fast random access (O(1)) required for fetching student data.

---

### 2️⃣ Browser History  
**Answer:** LinkedList  
**Reason:** Frequent insertions and deletions are required.

---

### 3️⃣ Online Shopping Cart  
**Answer:** ArrayList  
**Reason:** More read operations and quick access to items.

---

### 4️⃣ Undo/Redo Feature  
**Answer:** LinkedList (or Stack implementation)  
**Reason:** Fast insertion and removal operations.