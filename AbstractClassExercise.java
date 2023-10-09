package java_module.oop_part2.question;

public class AbstractClassExercise {

    /*

        Do not modify - for testing only

        Expected Output:

            I am a circle
            I am a triangle
            I am a square
            I am a rectangle

     */
    public static void main(String[] args) {
        // Uncomment to validate your code
        Shape[] shapes = {
                new Circle(),
                new Triangle(),
                new Square(),
                new Rectangle(),
        };

        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}

/*
    Do not modify this abstract class
 */
abstract class Shape {
    abstract void draw();
}


// TODO: Create a class named Rectangle which inherits from Shape
// Override the draw() method so that it prints "I am a rectangle"
class Rectangle extends Shape {
    @Override
    void draw (){
        System.out.println("I am a rectangle");
    }
}


// TODO: Create a class named Square which inherits from Shape
// Override the draw() method so that it prints "I am a square"
class Square extends Shape {
    @Override
    void draw (){
        System.out.println("I am a square");
    }
}

// TODO: Create a class named Circle which inherits from Shape
// Override the draw() method so that it prints "I am a circle"
class Circle extends Shape {
    @Override
    void draw (){
        System.out.println("I am a circle");
    }
}

// TODO: Create a class named Triangle which inherits from Shape
// Override the draw() method so that it prints "I am a triangle"
class Triangle extends Shape {
    @Override
    void draw (){
        System.out.println("I am a triangle");
    }
}
