package Collections;

import java.util.ArrayList;
import java.util.List;

// Collections Framework

// Iterable - Its is presented on top of the Collections interface collections interface extend this interface 

// Iterable interface is usually useful for traversing over the collections by the method Syntax : Iterator iterator();

// Collection interface 

// It extends the Iterablle and serves as the foundation of collections framework

// It defines the common methods like add(),remove(),clear() which ensures the reusabilty.

// List Interface 

// List interface extends the collection interface 
// which represents the ordered colection that allows the duplicate elements
// It is implemented by classes ArrayList,Vector,Stack,LinkedList

// Syntax:
       // 1. List <T> al = new ArrayList<>();
       // 2. List <T> ll = new LinkedList<>();
       // 3. List<T> v = new Vector<>();
       // 4. List<T> s = new Stack<>();

// Arraylist:
        // Arraylist provides the dynamic array in java that resizes automatically as elements are added or removed.
        // Although slower than the standard arrays.
        // It is efficient for the frequent modifications.
        //  It supports random access but cannot store primitive types directly wrapper classes like Integer or Character are required.

public class Main{
        public static void main(String[] args){
                ArrayListDemo ald = new ArrayListDemo();
                ald.addElementToArray(1);
                ald.addElementToArray(2);
                ald.addElementToArray(3);
                ald.removeElementFromArray(1);
                System.out.println(ald.displayArray());

                ArrayList <Character> alpha = new ArrayList<>();

                //add("element")
                alpha.add('a');
                alpha.add('b');
                alpha.add('c');
                alpha.add('d');
                alpha.add('e');
                
                // get(index)
                System.out.println(alpha.get(3));
                
                // set(index,"element")
                alpha.set(3, 'D');
                
                // remove(index) or remove(object)
                // alpha.remove(3);
                alpha.remove((Character)'D');
                System.out.println(alpha);

                //size()
                System.out.println(
                        alpha.size()
                );
                // isEmpty();
                System.out.println(
                        alpha.isEmpty()
                );
                // contains()
                System.out.println(alpha.contains('a'));

                // forEach()

                ArrayList<String> names = new ArrayList<>();
                names.add("Arun");
                names.add("Kumar");

                names.forEach(n ->  System.out.println("Hello "+ n));

                
        }
}

class ArrayListDemo{
        ArrayList<Integer> al = new ArrayList<>();
        public void addElementToArray(Integer a){
                al.add(a);
        }
        public void removeElementFromArray(Integer b){
                al.remove((int)b);
        }
        public ArrayList<Integer> displayArray(){
                return al;
        }
}