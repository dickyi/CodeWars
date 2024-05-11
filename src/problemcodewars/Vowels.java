package problemcodewars;

import javax.swing.JOptionPane;

public class Vowels {

    public static int getCount(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog(null, 
                "Silakan masukkan teks dengan huruf kecil saja untuk menghitung jumlah huruf vokal di dalamnya:");

        int vowelCount = getCount(input);

        JOptionPane.showMessageDialog(null, "Jumlah huruf vokal dalam teks yang dimasukkan adalah: \"" + input + "\": " + vowelCount);
    }
}
