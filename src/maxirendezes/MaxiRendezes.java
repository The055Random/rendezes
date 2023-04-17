
package maxirendezes;


public class MaxiRendezes {

    
    public static void main(String[] args) {
        int[] tomb = {32, 5, 6};
        int[] rendTomb = maxiRendez(tomb);
        kiirTomb(rendTomb);
    }

    private static int [] maxiRendez(int[] tomb) {
        for (int i = tomb.length-1; i > 0; i--) {
            int max = 0;
            int seged;
            for (int j = 1; j <= i; j++) {
                if (tomb[max] < tomb[j]) {
                    max = j;
                }
            }
            seged = tomb[max];
            tomb[max] = tomb[i];
            tomb[i] = seged;
        }
        return tomb;
    }

    private static void kiirTomb(int[] rendTomb) {
        for (int i = 0; i < rendTomb.length; i++) {
            System.out.print(rendTomb[i]+" ");
        }
    }
    
}
