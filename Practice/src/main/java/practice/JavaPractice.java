package practice;

class Practice {
    public String what = "Something";

    public Object whatAmIDoing(){
        return what;
    }

    public void doPractice(String subject){
        System.out.println("Nothing to practice");
    }

    boolean doINeedToDoAnyThing(Boolean isWorkRequired) throws Exception {
        if (!isWorkRequired) {
            throw new RuntimeException();
        }
        return true;
    }

}

public class JavaPractice extends Practice {


    //Case 1
    public String what = "Java"; // We cannot override the field, only method can be overridden

    // Case 2

    @Override
    public void doPractice(String subject) {
        System.out.println("Practicing "+ subject);
    }

    // Case 3

    @Override
    public String whatAmIDoing() {
        return "I'm practicing java";
    }

    // Case 4
    @Override
    boolean doINeedToDoAnyThing(Boolean isWorkRequired) throws  RuntimeException{ // Opposite will not work
        return true;
    }

    /**
     * Concept :
     * Whenever you try to use inheritance, so at that time java compiler (At compile time) first check your parent class method....
     *
     * Case 1 : You cannot override fields
     *
     * Case 2 : Your parameter type should be same
     *
     * Case 3 :
     *   Covariant return type, Before java version 1.**,
     *   It was compulsion that return type should be same as your parent class method,
     *   but now you may have return type as sub type of your parent class method
     *
     *
     * Case 4 : Method cannot throw broader exception
     *
     * Reason for 3 and 4
     *
     *  When you call practice1.whatAmIDoing() so at compile time it will check the return type,
     *  Suppose form parent class method you'er returning String type Example : "Faizan"
     *
     *  And from child class you'er return new Object
     *
     * */

    public static void main(String[] args) {
        Practice practice = new Practice();
        Practice practice1 = new JavaPractice();  // Dynamic (Runtime) binding :
        JavaPractice javaPractice = new JavaPractice();


        System.out.println(practice.whatAmIDoing());
        System.out.println(practice1.whatAmIDoing());

        System.out.println(practice1.what);
        System.out.println(practice.what);
        try {
            System.out.println(practice.doINeedToDoAnyThing(true));
        } catch (Exception e) {
            e.printStackTrace();
        }
        practice1.doPractice("Java");



    }




}
