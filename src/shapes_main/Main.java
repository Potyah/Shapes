package shapes_main;

import shape_interface.Shape;
import shapes.Circle;
import shapes.Rectangle;
import shapes.Square;
import shapes.Triangle;

import java.util.Arrays;

/* Реализация иерархии классов для геометрических фигур.
функция находит фигуру с максимальной площадью и печатает информацию в консоль.
Аналогично для фигуры со вторым по величине периметром. */

public class Main {
    public static Shape getMaxAreaShape(Shape[] shapeArray) {
        Arrays.sort(shapeArray, new ShapesAreaComparator());
        return shapeArray[shapeArray.length - 1];
    }

    public static Shape getSecondPerimeterShape(Shape[] shapeArray) {
        Arrays.sort(shapeArray, new ShapesPerimeterComparator());
        return shapeArray[shapeArray.length - 2];
    }

    public static void main(String[] args) {
        Shape[] shapeArray = {new Circle(6),
                new Triangle(3, 5, 9, 7, 9, 10),
                new Square(45),
                new Rectangle(20, 60),
                new Circle(25)};

        System.out.println("Фигура с большей площадью: " + getMaxAreaShape(shapeArray));
        System.out.println("Фигура со вторым по величине периметром: " + getSecondPerimeterShape(shapeArray));
    }
}