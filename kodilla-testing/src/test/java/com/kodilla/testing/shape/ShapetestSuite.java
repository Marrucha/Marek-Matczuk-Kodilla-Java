package com.kodilla.testing.shape;

import org.junit.*;

public class ShapetestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure(){
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape triangle = new Triangle(23, 12, "Trójkąt" );

        shapeCollector.addFigure(triangle);

        Assert.assertEquals(1,shapeCollector.getFiguresNumber());
    }

    @Test
    public void testRemoveFigure(){
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape triangle = new Triangle(23, 12, "Trójkąt" );

        shapeCollector.addFigure(triangle);
        shapeCollector.removeFigure(triangle);

        Assert.assertEquals(0,shapeCollector.getFiguresNumber());
    }

    @Test
    public void testGetFigure(){
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape triangle = new Triangle(23, 12, "Trójkąt" );
        Shape circle = new Circle(23, "Koło" );
        Shape square = new Square(4,  "Kwadrat" );
        Shape square2 = new Square(12,  "Kwadrat" );

        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(square2);

        Assert.assertEquals(circle,shapeCollector.getFigure(1));
    }

    @Test
    public void testGetFigureMinusIndex(){
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape triangle = new Triangle(23, 12, "Trójkąt" );
        shapeCollector.addFigure(triangle);
        Assert.assertEquals(null,shapeCollector.getFigure(-1));
    }

    @Test
    public void testGetFigureOverIndex(){
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape triangle = new Triangle(23, 12, "Trójkąt" );
        shapeCollector.addFigure(triangle);
        Assert.assertEquals(null,shapeCollector.getFigure(shapeCollector.getFiguresNumber()+1));
    }

    @Test
    public void showCount(){
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape triangle = new Triangle(23, 12, "Trójkąt" );
        Shape circle = new Circle(23, "Koło" );
        Shape square = new Square(4,  "Kwadrat" );
        Shape square2 = new Square(12,  "Kwadrat" );

        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(square2);

        System.out.println(shapeCollector.showFigures());
        Assert.assertEquals(5,shapeCollector.countLines(shapeCollector.showFigures()));
    }

}
