public class Problem7 {
    public static void main(String[] args) {
        
        TimeMeasuring t = new TimeMeasuring();
        int[] sizeList = {200, 400, 800, 1600, 3200, 6400};
        int reps = 250;

        // Brute force
        System.out.println("P5:");
        Problem5 p5 = new Problem5();
        for (int size : sizeList) {
            long time = 0;
            for (int i = 0; i < reps; i++) {
                int[] list1 = p5.initArray(size);
                t.startTimer();
                p5.threeSum(list1);
                time += t.stopTimer();
                System.out.print(" - " + (i+1));
            }
            System.out.println("\n" + size + " : " + time/(reps * 1000000));
        }

        // Caching
        System.out.println("P6:");
        Problem6 p6 = new Problem6();
        for (int size : sizeList) {
            long time = 0;
            for (int i = 0; i < reps; i++) {
                int[] list2 = p6.initArray(size);
                t.startTimer();
                p6.threeSum(list2);
                time += t.stopTimer();
                System.out.print(" - " + (i+1));
            }
            System.out.println("\n" + size + " : " + time/(reps * 1000000));
        }
    }
}
