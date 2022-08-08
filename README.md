# java-collections-framework


![](collections.jpg)

| Base Interface | Collection name | Backed by | Duplicates |
| --------------- | --------------- | --------------- | --------------- |
|List|||
|| ArrayList<E> | Array| yes | yes |
|| LinkedList<E> |  Double-linked list| yes | yes |
|| CopyOnWriteArrayList<E> |  Array| yes | yes |
|| Vector<E> |  Array| yes | yes |
|| Stack<E> | Array| yes | yes |
|Queue||
|| ConcurrentLinkedQueue<E> | Single-linked list| yes | no |
|| PriorityQueue<E> | Balanced binary heap based on array| yes | no |
|| LinkedBlockingQueue<E> | Single-linked list| yes | no |
|| PriorityBlockingQueue<E> | Balanced binary heap based on array | yes | no |
|| ArrayBlockingQueue<E> | Fixed-size array| yes | no |
|| DelayQueue<E> | PriorityQueue<E>| yes | no |
|| SynchronousQueue<E> | No internal capacity| yes | no |
|| LinkedTransferQueue<E> | Single-linked list| yes | no |
|| ArrayDeque<E> | Array | yes | no | 
|| ConcurrentLinkedDeque<E> | Double-linked list | yes | no |
|| LinkedBlockingDeque<E> | Double-linked list | yes | no |
| Map | |
|| HashMap<K,V> | Hash table | Only values | Null key and null values |
|| LinkedHashmap<K,V> | Hash table + doubly-linked list | Only values | | Null key and null values |
|| TreeMap<K,V> | Red-black tree | Only values | Doesnt permit null keys if natural sorting is used or Comparator doesnt accept nulls
|| ConcurrentHashMap<K,V> | Hash table | Only values | no |
|| ConcurrentSkipListMap<K,V> | Skip list | Only values | Null keys forbidden but values allowed |
|| WeakHashMap<K,V> | Hash table| Only values | Null key and null values |
|| IdentityHashMap<K,V> | Hash table | Only values | Null key and null values |
|| EnumMap<K,V> | Array | Only values | Null keys forbidden but values allowed |
|| Hashtable<K,V> |  Hash table| Only values | no |
|| Properties | ConcurrentHashMap<K,V> | Only values |no |
|Set||
|| HashSet<E> |  HashMap|  No | yes |
|| LinkedHashSet<E> | LinkedHashMap| No | yes |
|| TreeSet<E> | TreeMap| No | Doesnt permit null keys if natural sorting is used or Comparator doesnt accept nulls
|| EnumSet<E> | Bit array| No | No |
|| CopyOneWriteArraySet<E > | CopyOnWriteArrayList| No | yes |
|| ConcurrentSkipListSet<E> | ConcurentSkipListMap| No | No  |

