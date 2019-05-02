package UserDefinedArray;

public class UserDefinedArray {

    public static void main(String[] args) {

        Student[] arr;

        arr = new Student[2];

        arr[0] = new Student(1,"Karishma");
        arr[1] = new Student(2,"Saarthak");

        for (int i=0; i<arr.length; i++) {
            System.out.println("Student object at index "+i+" is : "+arr[i].getRoll_no() +" - "+arr[i].getName());
        }
    }
}
