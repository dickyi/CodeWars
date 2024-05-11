
package problemcodewars;

public class TotalPoints {                                 
    public static int points(String[] games) {
        int totalPoints = 0; 
        for (String game : games) {
            String[] scores = game.split(":"); 
            int x = Integer.parseInt(scores[0]); 
            int y = Integer.parseInt(scores[1]); 
            if (x > y) {
                totalPoints += 3; 
            } else if (x == y) {
                totalPoints += 1; 
            }
           
        }
        return totalPoints; 
    }
    public static void main(String[] args) {
        String[] games = {"3:1", "2:2", "0:1", "1:0", "3:3", "4:0", "1:3", "2:2", "0:0", "2:1"};
        int totalPoints = TotalPoints.points(games);
        System.out.println("Total poin yang didapat: " + totalPoints);
    }
}
