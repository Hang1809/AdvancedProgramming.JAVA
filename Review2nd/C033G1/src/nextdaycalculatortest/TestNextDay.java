package nextdaycalculatortest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class TestNextDay {
    private int day;
    private int month;
    private int year;
    private String expected;

    public TestNextDay(int day, int month, int year, String expected) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.expected = expected;
    }
    @org.junit.runners.Parameterized.Parameters
    public static Collection<Object[]>getNextDay(){
        return Arrays.asList(new Object[][]{
                        {1,1,2018,"2-1-2018"},
                        {31,1,2018,"1-2-2018"},
                        {30,4,2018,"1-5-2018"},
                        {28,2,2018,"1-3-2018"},
                        {29,2,2020,"1-3-2020"},
                        {31,12,2018,"1-1-2019"}
                });
    }
    @Test
    public void checkNextDay(){
        assertEquals(this.expected,NextDayCalculator.nextDayCalculator(day,month,year));
    }




    //    @Test
//    @DisplayName("1/1/2018")
//    void nextDay1And1And2018() {
//        int day = 1;
//        int month = 1;
//        int year = 2018;
//        String expected = "2-1-2018";
//        String result = NextDayCalculator.nextDayCalculator(1, 1, 2018);
//        Assertions.assertEquals(expected, result);
//    }
//
//    @Test
//    @DisplayName("31/1/2018")
//    void nextDay31And1And2018(){
//        int day =31;
//        int month =1;
//        int year = 2018;
//        String expected ="1-2-2018";
//        String result =NextDayCalculator.nextDayCalculator(31,1,2018);
//        Assertions.assertEquals(expected,result);
//    }
//
//    @Test
//    @DisplayName("30/4/2018")
//    void nextDay30And4And2018(){
//        int day = 30;
//        int month = 4;
//        int year = 2018;
//        String expected = "1-5-2018";
//        String result = NextDayCalculator.nextDayCalculator(30,4,2018);
//        Assertions.assertEquals(expected,result);
//    }
//    @Test
//    @DisplayName("28/2/2018")
//    void nextDay28And2And2018() {
//        int day = 28;
//        int month = 2;
//        int year = 2018;
//        String expected = "1-3-2018";
//        String result = NextDayCalculator.nextDayCalculator(28, 2, 2018);
//        Assertions.assertEquals(expected, result);
//    }
//
//    @Test
//    @DisplayName("29/02/2020")
//    void nextDay29And2And2020() {
//        int day = 29;
//        int month = 2;
//        int year = 2020;
//        String expected = "1-3-2020";
//        String result = NextDayCalculator.nextDayCalculator(29, 2, 2020);
//        Assertions.assertEquals(expected,result);
//    }
//
//    @Test
//    @DisplayName("26/03/1996")
//    void nextDay26And3And1996() {
//        int day = 26;
//        int month = 3;
//        int year = 1996;
//        String expected = "27-3-1996";
//        String result = NextDayCalculator.nextDayCalculator(26, 3, 1996);
//        Assertions.assertEquals(expected,result);
//
//    }
//
//    @Test
//    @DisplayName("1/4/1996")
//    void nextDay1And4And1996() {
//        int day = 1;
//        int month = 4;
//        int year = 1996;
//        String expected = "2-4-1996";
//        String result = NextDayCalculator.nextDayCalculator(1, 4, 1996);
//        Assertions.assertEquals(expected,result);
//
//    }
//    @Test
//    @DisplayName("31/12/2018")
//    void nextDay31And12And2018(){
//        int day = 31;
//        int month = 12;
//        int year = 2018;
//        String expected ="1-1-2019";
//        String result = NextDayCalculator.nextDayCalculator(31,12,2018);
//        Assertions.assertEquals(expected,result);
//
//    }

}
