package com.ashokit.collectionall.introduction;

public class ArrayExample {

    public static void main(String[] args) {
        //array
        /*
          array of index of collection
          array are fixed size , memory point array concept is not recommended
          performance point array is recommmnded
          array can hold only homogennous element

          collection is grwable nature
          memory point collection is recommended
          performanace point collectin is not recommende

          collections : utilty class present inside utill package
          collection - is interface group of individual object in single etity

          list  - interface , insertion order preserve , and allow duplicate
          ex:   arraylist, LinkeList ,vector , stack

          arraylist - its class , grouwable by nature , order maintain , duplicate allowd , null insertion
          not synchronised, not thread safe , perfomance is good, retrive operatio it is good.
          capacity 10 and increase by 50%

          LinkedList - used doublelinkedlist,  class , order maintain, duplicate allowd , null insertional
          sutaoble for insertion or deletion in middle
          no intiali capacity its work on pointer

          Vectory - class - order maintain, duplicate allowd , null insertion
          sybchronized, threadsafe , performace not good
          capacity default is 10 after capacity will be double
          best alternate use copyonwriteArraylist performance points
          
           cursor type
           iterator  - forward direction hasnecxt  next()
           listiterator - cursor move next and backward  list
           enumeration  - move only forward direction applicable only for legacy vector stack, hashtable

          set - interface  , insertion order is not persevr , and duplicate not allow
          ex: HashSet ,LinkedHashSet
          
          HashSet - duplicate not allow , order is not maintaine , internally uses hashtable performance is good 
          null allow only once, not synchronized
          
          LinkedHashSet - duplicate not allow, order is maintaine , internally uses hashtable and doubly linkelist ,
          null allow only one , not synchronized

          Sorted set - interface , you wan in sorting orde then you go
          null is not allow

          NavigableSet - interface , for navigation purpose
           ex : treeset
           
           treeset - you wan in sorting orde then you go
           null is not allow 
           
           comparable  - natural sorting order CompareTo(Object o)
           comparator  - customize order Compare(Object o1,Object o2) 
           creaet a class implement comparable  inside compareto creat amethod copare(o1,o2)
           //assending order
            return (x.getEmpId()< x.getEmpId()) ? -1 : (x.getEmpId()==x.getEmpId() ? 0 :1);
            
            //for object compare
            return o1.toString().compareTo(o2.toString());
            
            

           Queue - Interface priorty process
           priorty queue , Blocking Queue, PriorityBlockingQueue , LinkedBLockingQueue

           Map  - interface  , key value pair , both are object, duplicat  key not allowd but value
           Hashmap - is class , key value pair , duplicate key not allowd but value , ds using hashtable
           non synchronized , order not maintain reasomn hashcode , one null key allow and multiple value allow null 
           not threadsage , perfomance is high 
           emplty hashmap object size is 16  
           
           linkedHashmap
           order is maintain , ds uses hashtable +doubly linklist
           
           SortedMap - interface sorting in order , sorting by key not value
           
           NavigableMap - interface , for navigation purpose
           ex : trreMap
           
           trreMap  - ds tree strucure RED-BLACK
           hashtable  - is class , key value pair , duplicate key not allowd but value , ds using hashtable
            synchronized , order not maintain reasomn hashcode ,  null key  and null value  not allow  
            threadsage , perfomance is low   
           empty hashtable object size is 11  
           
           IdentityHashMap -  same as hashmap differnce is jvm use == operator to identify the duplicate key
           
           WeakHashMap  - same as hashmap differnce is object doesnt have refernce its eligble for GC
           
           
           
          
           
           

         */

    }
}
