package np.cnblabs;

/**
 * Created by sanjogstha on 11/17/17.
 */
public class Squeeze {

    /*'aaabbbaaa'.squeeze('a') # => 'abbba'*/

    public static void main(String[] args) {
        String template = "aaabbbaaa";
        squeeze(template, 'a');
    }

    private static void squeeze(String template, Character requiredChar) {
        Character nextString;
        String desiredString = null;

        for (int stringCount = 0; stringCount < template.length(); stringCount++) {
            nextString = template.charAt(stringCount);
            if(stringCount == 0) {
                desiredString = String.valueOf(template.charAt(stringCount));
                continue;
            }

            if(nextString.equals(requiredChar)
                    && nextString.equals(desiredString.charAt(desiredString.length()-1))) continue;

            desiredString = desiredString + nextString;
        }

        System.out.println("des=" + desiredString);
    }
}
