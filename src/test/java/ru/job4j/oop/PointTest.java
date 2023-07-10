package ru.job4j.oop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PointTest {

    @Test
    public void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        a.distance(b);
        double dist = Math.round(a.distance(b));
        double expected = 2;
        assertThat(dist).isEqualTo(expected);
    }

    @Test
    public void when03to20then3dot5() {
        Point a = new Point(0, 3);
        Point b = new Point(2, 0);
        a.distance(b);
        double dist = Math.round(a.distance(b));
        double expected = 4;
        assertThat(dist).isEqualTo(expected);
    }

    @Test
    public void when41to20then2() {
        Point a = new Point(4, 1);
        Point b = new Point(2, 0);
        a.distance(b);
        double dist = Math.round(a.distance(b));
        double expected = 2;
        assertThat(dist).isEqualTo(expected);
    }
}