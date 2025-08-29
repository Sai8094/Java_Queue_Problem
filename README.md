# Queue Problems in Java

This repository contains implementations of **Queue problems** in Java, including queue-based data structures and interview-style problems.

---

## 📌 Problems

### 🔹 Core Implementations
1. **Implement Stack using Queues**  
   - Problem: Implement a stack using two queues with standard queue operations.  
   - Operations:  
     - `push(x)`  
     - `pop()`  
     - `top()`  
     - `isEmpty()`  
   - Approach: Use two queues — one for storage, the other for reordering elements.

2. **Circular Queue**  
   - Problem: Implement a circular queue with a fixed size `k`.  
   - Operations:  
     - `enQueue(x)` → Insert an element.  
     - `deQueue()` → Remove an element.  
     - `Front()` → Get the front item.  
     - `Rear()` → Get the last item.  
     - `isEmpty()` / `isFull()`  
   - Approach: Use an array with front and rear pointers modulo `k`.

---

### 🔹 Queue Applications
3. **First Non-Repeating Character in a Stream**  
   - Problem: Given a stream of characters, find the first non-repeating character at each step.  
   - Example:  
     Input → `a, a, b, c`  
     Output → `a -1 b b`  
   - Approach: Use a queue to store characters and a frequency map to track counts.

4. **Interleave Queue**  
   - Problem: Given a queue of integers, interleave the first half with the second half.  
   - Example:  
     Input → `1 2 3 4 5 6`  
     Output → `1 4 2 5 3 6`  
   - Approach: Use a stack or auxiliary queue to rearrange elements.

5. **Generate Binary Numbers (1 to n)**  
   - Problem: Generate binary numbers from `1` to `n` using a queue.  
   - Example:  
     Input → `n = 5`  
     Output → `1, 10, 11, 100, 101`  
   - Approach: Use a queue initialized with `"1"`, then repeatedly append `"0"` and `"1"`.

---
