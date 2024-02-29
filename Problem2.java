// I went with the quick union option for this task.
public class Problem2 {

    public int[] initArray(int length) {
        int[] numberArray = new int[length];
        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = i;
        }
        return numberArray;
    }

    public int root(int[] list, int a) {
        while (a != list[a]) {
            a = list[a];
        } return a;
    }

    public boolean connected(int[] list, int a, int b) {
        if (root(list, a) == root(list, b)) {
            return true;
        } else {
            return false;
        }
    }

    public void union(int[] list, int a, int b) {
        int ra = root(list, a);
        int rb = root(list, b);
        list[ra] = rb;
    }
    
}
