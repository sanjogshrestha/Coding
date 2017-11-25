package np.cnblabs;

import java.util.Hashtable;

/**
 * Created by sanjogstha on 11/25/17.
 */
public class RecurringChar {

    public static void main(String[] args) {
        String[] dummyList= {"ABCA", "BCABA", "ABC", "DBCABA"};
        for (String s : dummyList) {
            System.out.println("Result=" + findIfStringHasRecurringChar(s));
        }
    }

    private static Character findIfStringHasRecurringChar(String s) {
        Hashtable<Character, Integer> letters = new Hashtable<>();
        for (char c : s.toCharArray()) {
            // if we have not seen the character yet, we put it in the hash table else we will print it
            if (!letters.containsKey(c))
                letters.put(c, 1);
            else
                return c;

        }
        return null;
    }
}
