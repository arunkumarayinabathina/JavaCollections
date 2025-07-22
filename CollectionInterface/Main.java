package CollectionInterface;

import java.util.ArrayList;
import java.util.Collection;
// import java.util.Collections;
import java.util.Iterator;
// import java.util.List;

public class Main {
    public static void main(String[] args){
        /*
        // Creating a collecton of fruits.
        Collection<String> fruits = new ArrayList<>();
        // For adding the elements into the collection
        System.out.println("Basic operations on collections.");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Grapes");
        System.out.println(fruits);
        // For removing the an element fron the collection
        fruits.remove("Grapes");
        System.out.println(fruits);
        // Contains returs true if the element present in the given collection
        System.out.println(fruits.contains("Grapes"));
        // Returns the size of the collection
        System.out.println(fruits.size());
        // Checks and returns the boolean value based on the collection is empty or not.
        System.out.println(fruits.isEmpty());
        // To clear all the elements in the collection
        fruits.clear();
        System.out.println(fruits);
        System.out.println("Bulk operations on collections.");
        Collection<String> animals1 = new ArrayList<>();
        animals1.add("Lion");
        animals1.add("Tiger");
        animals1.add("null");
        animals1.add("null");
        Collection<String> animals2 = new ArrayList<>();
        animals2.add("Zebra");
        animals2.add("Deer");
        // To add all the elements from the other collection
        // animals1.addAll(List.of("Zebra","Deer"));
        // System.out.println(animals1);
        // animals1.removeAll(List.of("Lion","Tiger"));
        // System.out.println(animals1);
        // retainAll() method keeps only the elements that are present in both collections
        // In this case, we're keeping only "Tiger" from animals1 collection
        // Any elements in animals1 that are not in the specified collection (List.of("Tiger")) will be removed
        // animals1.retainAll(List.of("Tiger"));
        // System.out.println(animals1);
        // animals1.removeAll(Collections.singleton("Lion"));
        // animals1.removeAll(List.of("Lion","null"));
        // System.out.println(animals1);
        */

        // Collection to array convertion.
        // Collection<String> Letters = new ArrayList<>();
        // Letters.add("A");
        // Letters.add("B");
        // Letters.add("C");
        // System.out.println(Letters);


        // Traversing through the collections

        Collection<String> names = new ArrayList<>();
        names.add("Arun");
        names.add("Raghu");
        names.add("Ravi");
        names.add("Kiran");
        // 1.ForEach Loop
        // for(String name:names){
        //     System.out.println(name);
        // }
        // 2.Iterator
        Iterator<String> it = names.iterator();
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }
        while(it.hasNext()){
            if(it.next() == "Ravi"){
                it.remove();
            }
        }
        System.out.println(names);
        // .hasNext()	Checks if more elements are left
        // .next()	Returns the current element and moves to next
        // .remove()	Removes the last returned element by next() safely
    }
}
