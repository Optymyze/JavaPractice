package ShallowCopy;

public class MainShallowCopy {

    public static void main(String[] args) {
        int[] val = {1,2,3};

        ShallowCopy shallowCopy = new ShallowCopy(val);

        shallowCopy.showData();

        val[0] = 10;

        shallowCopy.showData();
    }
}
