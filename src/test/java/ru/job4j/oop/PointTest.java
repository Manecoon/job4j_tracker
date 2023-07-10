package ru.job4j.oop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

public class PointTest {

    @Test
    public void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double dist = a.distance(b);
        double expected = 2;
        assertThat(dist).isCloseTo(expected, offset(0.5));
    }

    @Test
    public void when03to20then3dot5() {
        Point a = new Point(0, 3);
        Point b = new Point(2, 0);
        double dist = a.distance(b);
        double expected = 3.5;
        assertThat(dist).isCloseTo(expected, offset(0.5));
    }

    @Test
    public void when41to20then2() {
        Point a = new Point(4, 1);
        Point b = new Point(2, 0);
        double dist = a.distance(b);
        double expected = 2;
        assertThat(dist).isCloseTo(expected, offset(0.5));
    }
}