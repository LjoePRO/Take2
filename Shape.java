
// Zack's Bitchin Class Demo
public class Shape {

    // Declaring a String variable named "name" in the Shape class
    public String name;

    // This is called a Constructor
    public ClassDemo(String name) {
        // We initialize the class here.
        this.name = name;
    }
    
    // This is called a method. 
    public String toString() {
        return "Shape: " + name;
    }

    // This is the entry to the whole program
    public static void main(String [] args) {

        // This is declaring a _new_ Shape object and saving it in the variable
        // myShape.
        Shape myShape = new Shape("Circle");

        // This is calling the special method "toString" on the myShape object.
        System.out.println(myShape);
    }
}
