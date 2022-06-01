package triangletest;



import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;

@RunWith(org.junit.runners.Parameterized.class)
public class TriangleClassifierTest {
    private double side1;
    private double side2;
    private double side3;
    private String expected;

    public TriangleClassifierTest(double side1, double side2, double side3, String expected) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.expected = expected;
    }


    @org.junit.runners.Parameterized.Parameters
    public static Collection<Object[]> classifierAllTriangle() {
        return Arrays.asList(new Object[][]{
                {2, 2, 2, "Equilateral Triangle"},
                {2, 2, 3, "Isosceles Triangle"},
                {3, 4, 5, "Right Triangle"},
                {8, 2, 3, "not Triangle"},
                {0, 2, 1, "not Triangle"},
                {2, 3000, 1, "not Triangle"},
                {-4, -3, -5, "not Triangle"},
                {1, 2, 123, "not Triangle"},
                {0, 0, 0, "not Triangle"},
                {9, 7, 6, "Normal Triangle"}
        });
    }


    @Test
    public void classifier() {
        assertEquals(this.expected,TriangleClassifier.Triangle.TypeOfTriangle(side1, side2, side3));

    }


//
//        @Test
//    @DisplayName("2,2,2")
//    public void classifierTriangle2_2_2(){
//        double side1 = 2;
//        double side2 = 2;
//        double side3 = 2;
//        String expected = "Equilateral Triangle";
//        String result = TriangleClassifier.Triangle.TypeOfTriangle(side1,side2,side3);
//        Assertions.assertEquals(expected,result);
//    }
//
//    @Test
//    @DisplayName("2,2,3")
//    public void classifierTriangle2_2_3(){
//        double side1 = 2;
//        double side2 = 2;
//        double side3 = 3;
//        String expected = "Isosceles Triangle";
//        String result = TriangleClassifier.Triangle.TypeOfTriangle(side1, side2,side3);
//        Assertions.assertEquals(expected,result);
//    }
}
