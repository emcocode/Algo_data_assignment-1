public class Problem4 {
 

    public static void main(String[] args) {

        int listSize = 250_000;
        // int[] unionList = {50_000, 100_000, 150_000, 200_000, 250_000, 300_000, 350_000, 400_000, 450_000};
        int[] unionList = {25_000, 50_000, 75_000, 100_000, 125_000, 150_000, 175_000, 200_000, 225_000};
        // int[] unionList = {10_000, 20_000, 30_000, 40_000, 50_000, 60_000, 70_000, 80_000, 90_000};
        TimeMeasuring t = new TimeMeasuring();

        // UnionFind
        Problem1 p1 = new Problem1();
        int[] list1 = p1.initArray(listSize);

        System.out.print("UF:  | ");
        int reps_uf = 3;
        for (int union : unionList) {
            long t1Time = 0;
            for (int i = 0; i < reps_uf; i++) {
                int[] copiedList1 = list1.clone();
                for (int j = 0; j < union; j++) {
                    int rn1 = (int)(Math.random()*listSize);
                    int rn2 = (int)(Math.random()*listSize);
                    t.startTimer();
                    p1.union(copiedList1, rn1, rn2);
                    t1Time += t.stopTimer();
                }
            }
            System.out.print(((t1Time / 1000000) / reps_uf) + " | ");
        }
        

        // Quick union find
        Problem2 p2 = new Problem2();
        int[] list2 = p2.initArray(listSize);

        System.out.print("\nQUF:  | ");
        int reps_quf = 10;
        for (int union : unionList) {
            long t2Time = 0;
            for (int i = 0; i < reps_quf; i++) {
                int[] copiedList2 = list2.clone();
                for (int j = 0; j < union; j++) {
                    int rn1 = (int)(Math.random()*listSize);
                    int rn2 = (int)(Math.random()*listSize);
                    t.startTimer();
                    p2.union(copiedList2, rn1, rn2);
                    t2Time += t.stopTimer();
                }
            }
            System.out.print(((t2Time / 1000000) / reps_quf) + " | ");
        }
    }


}