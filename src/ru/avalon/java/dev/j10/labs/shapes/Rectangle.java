package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о прямоугольнике.
 * <p>
 * Прямоугольник — четырехугольник, у которого все углы
 * прямые (равны 90 градусам).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9F%D1%80%D1%8F%D0%BC%D0%BE%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Прямоугольник</a>
 */
public class Rectangle implements Polygon {

    /*
     * TODO: Реализовать класс 'Rectangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */

    private Point first;
    private Point second;

    public Rectangle(float x1, float y1, float x2, float y2) throws IllegalArgumentException{
        if(x1 == x2 || y1 == y2) throw new IllegalArgumentException("Такие координаты не задают прямоугольник");
        first = new PointInfo(x1, y1);
        second = new PointInfo(x2, y2);
    }

    @Override
    public float getArea() {
        return (Math.abs(second.getX() - first.getX()) * Math.abs(second.getY() - first.getY()));
    }

    @Override
    public float getPerimeter() {
        float x1 = first.getX();
        float x2 = second.getX();

        float y1 = first.getY();
        float y2 = second.getY();

        float a = x2 - x1;
        float b = y2 - y1;


        return (2 * (a + b));
    }
}
