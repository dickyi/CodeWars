
package problemcodewars;

public class SmashWords {

    public static String smash(String[] words) {
       
        return String.join(" ", words);
    }

    public static void main(String[] args) {
        
        String[] words = {"hello", "world", "this", "is", "great"};
        System.out.println(smash(words));
    }
}
