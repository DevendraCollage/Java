/*
 * Create interface EventListener with performEvent() method. Create MouseListener 
 * interface which inherits EventListener along with mouseClicked(), mousePressed(),
 * mouseReleased(), mouseMoved(), mouseDragged() methods. Also create KeyListener interface
 * which inherits EventListener along with keyPressed(), keyReleased() methods.
 * WAP to create EventDemo class which implements MouseListener and KeyListener and
 * demonstrate all the methods of the interfaces.
 */
interface EventListener {
    public void performEvent();
}

interface MouseListener extends EventListener {
    public void mouseClicked();

    public void mousePressed();

    public void mouseReleased();

    public void mouseMoved();

    public void mouseDragged();
}

interface KeyListener extends EventListener {
    void keyPressed();

    void keyReleased();
}

class Calling implements MouseListener, KeyListener {
    public void performEvent() {
        System.out.println("Perform event called");
    }

    public void mouseClicked() {
        System.out.println("Mouse clicked");
    }

    public void mousePressed() {
        System.out.println("Mouse Pressed");
    }

    public void mouseReleased() {
        System.out.println("Mouse Released");
    }

    public void mouseDragged() {
        System.out.println("Mouse dragged");
    }

    public void mouseMoved() {
        System.out.println("Mouse moved");
    }

    public void keyPressed() {
        System.out.println("Key Pressed");
    }

    public void keyReleased() {
        System.out.println("Key released");
    }
}

public class Pro4 {
    public static void main(String[] args) {
        Calling c = new Calling();
        c.performEvent();
        c.mouseClicked();
        c.mousePressed();
        c.mousePressed();
        c.mouseReleased();
        c.mouseDragged();
        c.mouseMoved();
        c.keyPressed();
        c.keyReleased();
    }
}
