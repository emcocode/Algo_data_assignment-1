import java.util.ArrayList;
import java.util.Random;

public class Problem5 {

    public int[] initArray(int length) {
        int[] numberArray = new int[length];
        Random r = new Random();
        for (int i = 0; i < length; i++) {
            int rn = r.nextInt((-2*length), (2*length));
            numberArray[i] = rn;
        }
        return numberArray;
    }

    public ArrayList<int[]> twoSum(int[] list, int tar) {
        ArrayList<int[]> res = new ArrayList<>();
        for (int i = 0; i < list.length; i++) {
            for (int j = (i+1); j < list.length; j++) {
                if (list[i] != list[j]) {
                    if (list[i] + list[j] == tar) {
                        int[] values = {list[i], list[j]};
                        res.add(values);
                    }
                }
            }
        }
        return res;
    }

    public ArrayList<int[]> threeSum(int[] list) {
        ArrayList<int[]> res = new ArrayList<>();
        for (int i = 0; i < list.length; i++) {
            ArrayList<int[]> twoSums = twoSum(list, list[i]);
            for (int[] twoSum : twoSums) {
                int[] triplet = {list[i], twoSum[0], twoSum[1]};
                res.add(triplet);
            }
        }
        return res;
    }
    
}
