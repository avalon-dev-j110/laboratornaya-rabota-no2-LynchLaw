package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.shapes.Circle;
import ru.avalon.java.dev.j10.labs.shapes.Rectangle;
import ru.avalon.java.dev.j10.labs.shapes.Shape;
import ru.avalon.java.dev.j10.labs.shapes.Triangle;

public class Application {
    public static Shape findMaxSquare(Shape[] shapes){
        Shape maxSquareShape = null;
        for(Shape n : shapes){
            if(maxSquareShape == null) maxSquareShape = n;
            else if(maxSquareShape.getArea() < n.getArea()) maxSquareShape = n;
        }
        return maxSquareShape;
    }

    public static void main(String[] args) {
        Shape[] shapes = null;

        /*
         * TODO: Выполнить действия над массивом 'shapes'
         *
         * 1. Проинициализировать переменную 'shapes' массивом
         *    содержащим 10 произвольных фигур. Массив должен
         *    содержать экземпляры классов Circle, Rectangle
         *    и Triangle.
         *
         * 2. Найти в массиве 'shapes' фигуру с максимальной
         *    площадью. Для поиска фигуры необходимо создать
         *    статический метод в текущем классе (Main).
         */

        try{
            shapes = new Shape[]{
                    new Triangle(2, 4, 3, -6, 7, 8),
                    new Rectangle(1, 6, 6, 2),
                    new Circle(5),
                    new Triangle(5, 4, 13, 6, 7, 8),
                    new Rectangle(1, 6, 6, 12),
                    new Circle(2),
                    new Triangle(0, 4, 3, 0, 7, 18),
                    new Rectangle(1, 16, 6, 2),
                    new Circle(15),
                    new Circle(4),
            };

            Shape maxSquareShape = findMaxSquare(shapes);
            System.out.println(maxSquareShape.getArea());
        }
        catch (Exception ex){
            System.out.println(ex.toString());
        }

    }
}
