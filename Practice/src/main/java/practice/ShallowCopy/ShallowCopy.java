package practice.ShallowCopy;

import java.util.Arrays;

public class ShallowCopy {

    private int[] data;


    public ShallowCopy(int[] values) {
        this.data = values;
    }

    public void showData() {
        System.out.println(Arrays.toString(data));
    }
}
