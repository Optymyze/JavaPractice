package practice.Constructor.ConstructorOverLoading;

public class ConstructorOverLoading {

    public ConstructorOverLoading(int age) {
        System.out.println("practice.practice.Constructor with one argument : " +
                "Int : " + age);
    }

    public ConstructorOverLoading(String name) {
        System.out.println("practice.practice.Constructor with one " +
                "argument - String : " + name);
    }

    public ConstructorOverLoading(int age, String name) {
        System.out.println("practice.practice.Constructor with two arguments : " +
                " String and Integer : " + name + " "+ age);
    }

    public ConstructorOverLoading(Long id) {
        System.out.println("practice.practice.Constructor with one argument : " +
                "Long : " + id);
    }

}
