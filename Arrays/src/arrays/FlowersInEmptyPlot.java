package arrays;

public class FlowersInEmptyPlot {

    public static void main(String[] args) {
        System.out.println();
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                boolean emptyLeftPlot = (i - 1 < 0 || flowerbed[i - 1] == 0);
                boolean emptyRightPlot = (i + 1 >= flowerbed.length || flowerbed[i + 1] == 0);
                if (emptyLeftPlot && emptyRightPlot) {
                    count++;
                    flowerbed[i] = 1;
                }
            }

        }
        return count >= n;
    }// TI: 0(n), SC: 0(1)

}
