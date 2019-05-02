package SerializationDeSerialization.Example2;

import java.io.*;

public class EmployeeMain {

    public static void printData(Employee employee) {
        System.out.println("name (String) = "+employee.getName());
        System.out.println("i (int) = "+employee.getI());
        System.out.println("a (static) = "+employee.getA());
        System.out.println("b (transient) = "+employee.getB());
    }

    public static void main(String[] args) {

        Employee employee = new Employee("name",1,2,3);
        String fileName = "employee.txt";

        //Serialization
        try {

            FileOutputStream file = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(file);

            out.writeObject(employee);

            out.close();
            file.close();

            System.out.println("Object has been Serialized\n" + "Data before De-serialization is ");
            printData(employee);

            employee.setA(2000);
            employee.setName("new name");

        } catch (IOException i) {
            System.out.println("IOException is caught");
        }

        employee = null;

        //De-Serialization
        try {
            FileInputStream fileInputStream = new FileInputStream(fileName);
            ObjectInputStream in = new ObjectInputStream(fileInputStream);

            employee = (Employee) in.readObject();

            in.close();
            fileInputStream.close();

            System.out.println("Object has been De-Serialized\n Data after des-serialization is ");
            printData(employee);

        } catch (IOException e) {
            System.out.println("IOException is caught");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException is caught");
        }


    }

}
