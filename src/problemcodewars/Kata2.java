
package problemcodewars;

public class Kata2 {                               //Switch it Up!
    public static String switchItUp(int number) {
        switch (number) {
            case 0: return "Zero";
            case 1: return "One";
            case 2: return "Two";
            case 3: return "Three";
            case 4: return "Four";
            case 5: return "Five";
            case 6: return "Six";
            case 7: return "Seven";
            case 8: return "Eight";
            case 9: return "Nine";
            default: return "Tidak Ada"; 
        }
    }
    public static void main(String[] args) {
        System.out.println(switchItUp(5));
    }
}