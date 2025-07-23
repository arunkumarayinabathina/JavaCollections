package SetInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class Main{
    public static void main(String[] args){
        // HashSet
        // Set<String> fruits = new HashSet<>();
        // fruits.add("Apple");
        // fruits.add("Apple");  // duplicates are ignored
        // // fruits.remove("Apple");
        // fruits.add("Orange");
        // fruits.add("Grapes");

        // System.out.println(fruits);
        // System.out.println(fruits.contains("Orange"));
        // System.out.println(fruits.size());
        // System.out.println(fruits.isEmpty());

        // Travesing the set

        // Using Enhanced for loop
        // for(String fruit:fruits){
        //     System.out.println(fruit);
        // }

        // Using iterator
        // Iterator<String> it = fruits.iterator();
        // while (it.hasNext()) {
        //     System.out.println(it.next());
        // }


    //     Set<Integer> setA = new HashSet<>();
    //     setA.addAll(List.of(1,2,3,4,5,4));
    //     // System.out.println(setA);
    //     Set<Integer> SetB = new HashSet<>(Arrays.asList(4,5,6,7,8));
    //     // setA.addAll(SetB);
    //     System.out.println(setA);
    //     System.out.println(SetB);
    //     setA.retainAll(SetB);
    //     System.out.println(setA);
    //     SetB.removeAll(setA);
    //     System.out.println(SetB);

    // Collection<String> alphas = new ArrayList<>(Arrays.asList("A","B","C","D","E","F","A"));

    // System.out.println(alphas);

    // Set<String> nodups = new HashSet<>(alphas);
    // System.out.println(nodups);

    // Set<String> fruits = new HashSet<>(Arrays.asList("Apple","Orage","Grapes"));

    // String[] array = fruits.toArray(new String[0]);
    // System.out.println(Arrays.toString(array));


    String[] words = {"apple","banana","grape","orange","apple","banana","grape"};
    // Set<String> nodups = new HashSet<>(Arrays.asList(words));
    // System.out.println(nodups);
    //  Print the elements count
     

    Map<String,Integer> wordCount = new HashMap<>();

    for(String word:words){
        wordCount.put(word,wordCount.getOrDefault(word, 0)+1);
    }
    System.out.println(wordCount);
    


    }
}