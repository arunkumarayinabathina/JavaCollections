## 1. Collection Interface (Root Interface)
 Collection<E> is the top-level interface in the Java Collections Framework. 
##  2. Set Interface
 A Set<E> is a Collection that does not allow duplicate elements. It models a mathematical set.
## 3. List Interface
 A List<E> is an ordered collection (sequence) that allows duplicate elements. Elements can be accessed by their index (0-based).
## 4. Queue Interface
 A Queue<E> is a collection used to hold elements before processing, typically in FIFO (First-In-First-Out) order.
## 5. Deque Interface (Double-Ended Queue)
 Deque<E> stands for double-ended queue, meaning you can add/remove elements at both ends.
## 6. Map Interface (Key-Value Pairs)
 A Map<K, V> is a collection that maps keys to values. Each key is unique, and maps to one value.
## 7. SortedSet Interface
 A SortedSet<E> is a Set that maintains its elements in ascending order.
## 8. SortedMap Interface
 A SortedMap<K, V> is a Map where the keys are sorted in natural or custom order.


## Collection Interface

### 1. Basic Collection Operations
- Adding elements (`add()`)
- Removing elements (`remove()`)
- Checking element existence (`contains()`)
- Getting collection size (`size()`)
- Checking if empty (`isEmpty()`)
- Clearing all elements (`clear()`)

### 2. Bulk Operations
- Adding multiple elements (`addAll()`)
- Removing multiple elements (`removeAll()`)
- Retaining common elements (`retainAll()`)
- Working with singleton collections
- animals1.removeAll(Collections.singleton("Lion"));
- animals1.removeAll(List.of("Lion","null"));

### 3. Collection Traversal Methods
- **Enhanced for-each loop**: Simple iteration through elements
- **Iterator pattern**: Safe iteration with removal capability
  - `hasNext()`: Checks if more elements exist
  - `next()`: Returns current element and moves to next
  - `remove()`: Safely removes last returned element
