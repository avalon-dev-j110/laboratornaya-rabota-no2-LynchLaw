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

    private float[] first;
    private float[] second;
    private float[] third;

    public Triangle(float x1, float y1, float x2, float y2, float x3, float y3){
        this.first = new float[] {x1, y1};
        this.second = new float[] {x2, y2};
        this.third = new float[] {x3, y3};
    }

    @Override
    public float getArea() {
        float dif1 = this.second[1] - this.third[1];
        float dif2 = this.third[1] - this.first[1];
        float dif3 = this.first[1] - this.second[1];

        float x1 = this.first[0];
        float x2 = this.second[0];
        float x3 = this.third[0];

        float res = (x1 * dif1 + x2 * dif2 + x3 * dif3) / 2;

        return res;
    }
}
