package Collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args){
        LinkedList<Character> alphas = new LinkedList<>();

        alphas.add('A');
        alphas.add('B');
        alphas.add('C');
        alphas.add('D');

        // alphas.addFirst('E');
        // System.out.println(
            //     alphas.get(1)
            // );
            
        // alphas.remove(2);
        // alphas.removeIf(a -> a == 'A');
        // System.out.println(alphas);

        // Enhanced loop
        for(Character c:alphas){
            // System.out.println(c);
        }

        Iterator<Character> it = alphas.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println(alphas.contains('C'));
        alphas.set(0, null);

        System.out.println(alphas);


        LinkedList<String> names_queue = new LinkedList<>();
        names_queue.offer("Arun");
        names_queue.offer("Kumar");
        names_queue.poll();
        System.out.println(names_queue);

        LinkedList<String> names_queue_2 = new LinkedList<>();
        names_queue_2.push("one");
        names_queue_2.push("two");
        names_queue_2.pop();
        System.out.println(names_queue_2);


        LinkedList<Integer> numbers = new LinkedList<>(Arrays.asList(1,3,4,2,6,5));
        Collections.sort(numbers);
        System.out.println(numbers);
    }
}
