package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о прямоугольнике.
 * <p>
 * Прямоугольник — четырехугольник, у которого все углы
 * прямые (равны 90 градусам).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9F%D1%80%D1%8F%D0%BC%D0%BE%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Прямоугольник</a>
 */
public class Rectangle implements Shape {

    /*
     * TODO: Реализовать класс 'Rectangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */

    private float[] first;
    private float[] second;

    public Rectangle(float x1, float y1, float x2, float y2){
        if(x1 == x2 || y1 == y2) throw new IllegalArgumentException("Такие координаты не задают прямоугольник");
        this.first = new float[] {x1, y1};
        this.second = new float[] {x2, y2};
    }

    @Override
    public float getArea() {
        return (Math.abs(this.second[0] - this.first[0]) * Math.abs(this.second[1] - this.first[1]));
    }
}
