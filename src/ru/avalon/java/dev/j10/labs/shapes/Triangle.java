package ru.avalon.java.dev.j10.labs.shapes;

import java.nio.channels.Pipe;

/**
 * Представление о треугольнике.
 * <p>
 * Треуго́льник (в евклидовом пространстве) — геометрическая
 * фигура, образованная тремя отрезками, которые соединяют
 * три точки, не лежащие на одной прямой. Указанные три
 * точки называются вершинами треугольника, а отрезки —
 * сторонами треугольника. Часть плоскости, ограниченная
 * сторонами, называется внутренностью треугольника: нередко
 * треугольник рассматривается вместе со своей внутренностью
 * (например, для определения понятия площади).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A2%D1%80%D0%B5%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Треугольник</a>
 */
public class Triangle implements Shape {

    /*
     * TODO: Реализовать класс 'Triangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */

    private Point first;
    private Point second;
    private Point third;

    public Triangle(float x1, float y1, float x2, float y2, float x3, float y3){
        first = new PointInfo(x1, y1);
        second = new PointInfo(x2, y2);
        third = new PointInfo(x3, y3);
    }

    private float sideLength(Point first, Point second){
        float x1 = first.getX();
        float x2 = second.getX();

        float y1 = first.getY();
        float y2 = second.getY();

        double length = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        return (float)length;
    }

    @Override
    public float getArea() {
        float a = sideLength(first, second);
        float b = sideLength(second, third);
        float c = sideLength(first, third);

        float p = (a + b + c) / 2;

        double res = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        return (float)res;
    }
}
