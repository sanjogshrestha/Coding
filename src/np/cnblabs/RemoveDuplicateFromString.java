package np.cnblabs;

import java.util.LinkedHashSet;

/**
 * Created by sanjogstha on 11/25/17.
 */
public class RemoveDuplicateFromString {
    public static void main(String[] args) {
        String[] dummyList= {"ABCA", "BCABA", "ABC", "DBCABA"};
        for (String s : dummyList) {
            System.out.println("Result=" + removeDuplicate(s));
        }
    }

    private static String removeDuplicate(String s) {
        /*
        Java LinkedHashSet class is a Hash table and Linked list implementation of the set interface.
        It inherits HashSet class and implements Set interface.

        The important points about Java LinkedHashSet class are:
            Contains unique elements only like HashSet.
            Provides all optional set operations, and permits null elements.
            Maintains insertion order.
        */
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for(char c: s.toCharArray()){
            set.add(c);
        }

        String string = "";
        for (Character c : set) {
            string = string + c;
        }

        return string;
    }
}
