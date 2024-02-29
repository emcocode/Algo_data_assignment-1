public class Problem3 {
    // Note: This class is mainly to test the timer class, which is called TimeMeasuring.java

    public static void main(String[] args) {
        TimeMeasuring tm = new TimeMeasuring();
        tm.startTimer();
        long timeTaken = 0;
        for (int i = 0; i < 10000; i++) {
            for (int j = 0; j < 1000; j++) {
                for (int k = 0; k < 1000; k++) {
                    for (int l = 0; l < 1000; l++) {
                        
                    }
                }
            }
        }
        timeTaken += tm.stopTimer();
        System.out.println(timeTaken + " milliseconds");
        tm.startTimer();
        for (int i = 0; i < 10000; i++) {
            for (int j = 0; j < 1000; j++) {
                for (int k = 0; k < 1000; k++) {
                    for (int l = 0; l < 1000; l++) {
                        
                    }
                }
            }
        }
        timeTaken += tm.stopTimer();
        System.out.println(timeTaken + " milliseconds");

    }
}
