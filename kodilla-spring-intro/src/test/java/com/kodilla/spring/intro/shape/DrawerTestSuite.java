package com.kodilla.spring.intro.shape;
import org.junit.Assert;
import org.junit.Test;


public class DrawerTestSuite {
    @Test
    public void testDoDrawingWithCircle () {
        //Given
        Circle circle = new Circle();
        Drawer drawer = new Drawer(circle);
        //When
        String result = drawer.doDrawing();
        //Then
        Assert.assertEquals("This is the Circle", result);
    }

    @Test
    public void testDoDrawingWithTriangle() {
        //Given
        Triangle triangle = new Triangle();
        //When
        Drawer drawer = new Drawer(triangle);
        String result = drawer.doDrawing();
        //Then
        Assert.assertEquals("This is the Triangle", result);
    }
}

