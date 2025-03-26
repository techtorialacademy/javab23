# Collections
* The collections framework in Java provides a standardized way to work with 
groups of objects, offering powerful tools to store data. Collections
are highly useful in scenarios where data size is unknow and structure changes.
* **NOTE** Arrays have a static size so we cannot change it.
## Key Collection Types
1. **List**
- A list is an ordered collection that **allows duplicates**. Elements are stored
in the order they added, and each element has an **index**.
- *Commonly used implementations**: `ArrayList`,`LinkedList`
- **Best for**: Maintaining an ordered list of items.

2. **Set**
- A **Set** is an **unordered** coolection tht **doesn't allow duplicates**.
It is useful when you need unique elements only.
- *Commonly used implementations*: `Hashset`,`Treeset`.
- **Best for**: Storing unique items(e.g., usernames, id numbers, etc.)

3. **Map**
- A **map** (is a collection?) that stores **key-value** pairs. Each key is 
unique, but values can be duplicated.
- *Commonly used implementation**: `HashMap`,`TreeMap`.
- **Best for**: Associating keys with specific values(e.g., id numbers and 
their descriptions.)

## Introduction to Lists In Java
- A list provides more flexibility than an array, allowing dynamic resizing,
and various methods for adding, removing, accessing elements. Lists can
store multiple items of same type and support **duplicate** values. 
## How Lists Compare to ArrayPractices

| Feature          | Array                               | List                                    |
|------------------|-------------------------------------|-----------------------------------------|
| Size             | Fixed (set at creation)             | Dynamic (can grow or shrink as needed)  |
| Flexibility      | Limited methods                     | Rich set of methods in Collections API  |
| Duplicate Values | Allowed                             | Allowed                                 |
| Index-Based      | Yes                                 | Yes                                     |
| Part of          | Core Java (not a Collection)        | Java Collections Framework              |

