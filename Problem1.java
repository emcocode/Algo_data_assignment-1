public class Problem1 {

   public int[] initArray(int length) {
        int[] numberArray = new int[length];
        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = i;
        }
        return numberArray;
    }
    
    public boolean connected(int[] list, int a, int b) {
        if (list[a] == list[b]) {
            return true;
        } else {
            return false;
        }
    }

    public void union(int[] list, int a, int b) {
        // int a_id = list[a];
        // int b_id = list[b];
        // If I didn´t remove these, the result was really weird. Therefore, these are not assigned to variables.

        for (int i = 0; i < list.length; i++) {
            if (list[i] == list[a]) {
                list[i] = list[b];
            }
        }
    }    

}