package com.kodilla.testing.forum.tdd;

import com.kodilla.testing.shape.*;
import org.junit.*;


public class ShapeTestSuite {
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
        //Given
        Shape triangle = new Triangle("Loki",2,3);
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        shapeCollector.addFigure(triangle);
        //Then
        Assert.assertEquals(triangle,shapeCollector.getFigure(0));
    }

    @Test
    public void testRemoveExistingFigure(){
        //Given
        Shape shape = new Circle("Hulk", 3.5);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(shape);
        //When
        boolean result = shapeCollector.removeFigure(shape);
        //
        Assert.assertTrue(result);
    }

    @Test
    public void testRemoveNonExistingFigure(){
        //Given
        Shape shape = new Circle("Black Widow", 3);
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        boolean result = shapeCollector.removeFigure(shape);
        //
        Assert.assertFalse(result);
    }

    @Test
    public void testGetFigure(){
        //Given
        Shape shape = new Square("Capt America",3);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(shape);
        //When
        Shape result = shapeCollector.getFigure(0);
        //Then
        Assert.assertEquals(shape,result);
    }


}
