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


## Set Interface
  A set is a collection of elements which cannot contain duplicate values.

### Types of Set
  - Hashset (no insertion order,not sorted,fastest)
  - LinkedHashSet (insertion order,not sorted,slightly slower)
  - TreeSet (no insertion order, sorted,slowest)
  
#### 1. HashSet Basic Operations
- Creating HashSet with `new HashSet<>()`
- Adding elements and automatic duplicate handling
- Basic operations: `add()`, `remove()`, `contains()`, `size()`, `isEmpty()`

#### 2. Set Traversal
- **Enhanced for-each loop** for simple iteration
- **Iterator pattern** for safe traversal with removal capability

#### 3. Set Mathematical Operations
- **Union**: Combining sets with `addAll()`
- **Intersection**: Finding common elements with `retainAll()`
- **Difference**: Removing elements with `removeAll()`

#### 4. Duplicate Removal from Collections
Two practical approaches:
- **Constructor method**: `Set<String> nodups = new HashSet<>(collection)`
- **Array conversion**: `new HashSet<>(Arrays.asList(array))`

#### 5. Set to Array Conversion
- Converting set back to array: `set.toArray(new String[0])`
- Printing arrays: `Arrays.toString(array)`

#### 6. Practical Application: Word Frequency Counter
- Using `HashMap<String, Integer>` to count occurrences
- `getOrDefault()` method for safe counting
- Processing arrays with duplicate elements

