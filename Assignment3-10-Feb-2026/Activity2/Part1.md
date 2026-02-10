# Data Structure Selection: ArrayList vs LinkedList

## 1. Real-time Chat Message Storage
**Chosen Data Structure:** ArrayList  
**Justification:**  
- Messages are mostly appended at the end → **O(1)** amortized insertion  
- Messages are frequently accessed by index (latest/previous messages) → **O(1)** access  
- LinkedList would require **O(n)** traversal for access

---

## 2. Music Playlist (Frequent Reordering)
**Chosen Data Structure:** LinkedList  
**Justification:**  
- Songs are frequently inserted, deleted, or moved → **O(1)** insertion/deletion (node known)  
- ArrayList requires shifting elements → **O(n)** for reordering

---

## 3. Student Database (Frequent Searching by Index)
**Chosen Data Structure:** ArrayList  
**Justification:**  
- Direct index-based access → **O(1)**  
- LinkedList index access takes → **O(n)** traversal

---

## 4. Browser Back and Forward Navigation
**Chosen Data Structure:** LinkedList  
**Justification:**  
- Back/forward navigation needs sequential movement → **O(1)**  
- Easy insertion and deletion of visited pages  
- ArrayList would require **O(n)** shifts on deletion

---

## 5. Online Exam System (Sequential Answer Storage)
**Chosen Data Structure:** ArrayList  
**Justification:**  
- Answers are stored sequentially → **O(1)** insertion at end  
- Fast retrieval for evaluation → **O(1)**  
- Better cache performance than LinkedList

---

## Summary Table

| Scenario | Data Structure | Key Time Complexity |
|--------|----------------|---------------------|
| Chat Messages | ArrayList | Insert O(1), Access O(1) |
| Music Playlist | LinkedList | Insert/Delete O(1) |
| Student Database | ArrayList | Access O(1) |
| Browser Navigation | LinkedList | Navigation O(1) |
| Online Exam System | ArrayList | Insert O(1), Access O(1) |
