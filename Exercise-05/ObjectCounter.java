// todo: WAP that counts the number of objects created using static.  
public class ObjectCounter {
    private static int objectcout = 0;

    ObjectCounter() { // Constructor of Class
        objectcout++;
    }

    public static int getObjectCount() { // Method To Get The Current Count
        return objectcout;
    }

    public static void main(String[] args) {
        // Creating Objects Count
        ObjectCounter ob1 = new ObjectCounter();
        ObjectCounter ob2 = new ObjectCounter();
        ObjectCounter ob3 = new ObjectCounter();
        ObjectCounter ob4 = new ObjectCounter();
        ObjectCounter ob5 = new ObjectCounter();
        ObjectCounter ob6 = new ObjectCounter();

        // Retrieving The Object Count
        int count = ObjectCounter.getObjectCount();
        System.out.println("Number of objects created: " + count);
    }
}
