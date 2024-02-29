import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Problem6 {

    public int[] initArray(int length) {
        int[] numberArray = new int[length];
        Random r = new Random();
        for (int i = 0; i < length; i++) {
            int rn = r.nextInt((-2*length), (2*length));
            numberArray[i] = rn;
        }
        return numberArray;
    }

    public ArrayList<int[]> twoSumCache(int[] list, int tar) {
        Map<Integer, Integer> cache = new HashMap<>();
        ArrayList<int[]> res = new ArrayList<>();
        for (int i = 0; i < list.length; i++) {
            if (cache.containsKey(tar - list[i])) {
                int[] values = {list[i], cache.get(tar - list[i])};
                res.add(values);
            }
            cache.put(list[i], list[i]);
        }
        return res;
    }

    public ArrayList<int[]> threeSum(int[] list) {
        ArrayList<int[]> res = new ArrayList<>();
        for (int i = 0; i < list.length; i++) {
            ArrayList<int[]> twoSums = twoSumCache(list, list[i]);
            for (int[] twoSum : twoSums) {
                int[] triplet = {list[i], twoSum[0], twoSum[1]};
                res.add(triplet);
            }
        }
        return res;
    }

}