public class Main {

    static int fact(int i){
        if (i<=1) {
            return 1;
        } else {
            return i*fact(i-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}
