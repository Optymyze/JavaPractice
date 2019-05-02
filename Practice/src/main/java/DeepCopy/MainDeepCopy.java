package DeepCopy;

public class MainDeepCopy {

    public static void main(String[] args) {
        int[] vals = {1,2,3};

        DeepCopy deepCopy = new DeepCopy(vals);

        deepCopy.showData();

        vals[0] = 10;
        deepCopy.showData();
    }
}
