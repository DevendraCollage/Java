// todo: Demonstrate the use of Final Keyword.

public class Pro6 {
    final float PI = 3.1416f;

    public static void main(String[] args) {
        Pro6 p = new Pro6();
        // p.PI = 4512.25f; // This will be generate error because final cannot be
        // changed
        System.out.println(p.PI);
    }
}
