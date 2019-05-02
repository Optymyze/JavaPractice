package SerializationDeSerialization.Example1;

import java.io.*;

public class SeriaDeSeriaMain {

    public static void main(String[] args) {

        SerializationDeSerialization object = new SerializationDeSerialization(1,"Karishmaa");
        String fileName = "file.ser";

        //serialization
        try {

            FileOutputStream file = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(file);

            out.writeObject(object);

            out.close();
            file.close();

            System.out.println("Object has been Serialized");

        } catch (IOException e) {
            System.out.println("IOException is caught.");
        }

        //deserialization

        SerializationDeSerialization newObject = null;

        try {
            FileInputStream fileInputStream = new FileInputStream(fileName);
            ObjectInputStream in = new ObjectInputStream(fileInputStream);

            newObject = (SerializationDeSerialization) in.readObject();

            in.close();
            fileInputStream.close();

            System.out.println("Object has been DeSerialized");
            System.out.println("i = "+newObject.getI());
            System.out.println("name = "+newObject.getName());

        }  catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }


}
