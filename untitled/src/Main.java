//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Figure circle = new Circle();
        Figure square = new Square();
        Figure rectangle = new Rectangle();
        Figure ellipse = new Ellipse();
        circle.drawCircle();
        square.drawSquare();
        rectangle.drawRectangle();
        ellipse.drawCircle();
    }
}

class Figure {
    public void drawCircle() {
        System.out.println("Рисуем круг");
    }

    public void drawSquare() {
        System.out.println("Рисуем квадрат");
    }

    public void drawRectangle() {
        System.out.println("Рисуем прямоугольник");
    }
}

class Circle extends Figure {

}

class Square extends Figure {

}

class Rectangle extends Figure {

}

class Ellipse extends Circle {


    @Override
    public void drawCircle() {
        super.drawCircle();
        System.out.println("Превращаем круг в овал");
    }
}