1. what is the need of balanced bst? why normal bsts are inefficient ?discuss for various operations like insert/search/find min  etc?
 so usually binary search tree time complexity depends on the height if the tree
ex: 10,20 ,30 , 40 ,50
 then the BST will be
  10
   \
    20
     \
      30
        \
        40
          \
           50
   if you want to search for 50 10-20-30-40-50 so it uses time complexity O(n);
   similarly,
Search      → O(h)
Insert      → O(h)
Delete      → O(h)
Find Min    → O(h)
Find Max    → O(h)

balanced it looks somthing like
        30
       /  \
     20    40
    /        \
   10         50
Now, if you wanna search for 50 30-40-50
A balanced BST tries to keep the height small so,for this tree the time complexity is O(log n) because its height is decreased
now all time complexities become O(log n).


   
   
