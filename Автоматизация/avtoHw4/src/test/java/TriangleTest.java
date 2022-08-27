import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static java.lang.Double.NaN;
import static java.lang.Double.isNaN;


public class TriangleTest {
    private static Logger logger = LoggerFactory.getLogger(Triangle.class);


    // Positive test
    @Test
    void test() throws MyException {

        logger.info("Инфо");
        logger.error("ошибка");

        Triangle triangle = new Triangle();

        Assertions.assertEquals(60.794736614282655, triangle.someMethod(10, 20, 15));
    }

    // Negative test, side > 0
    @Test
    void test2() throws MyException {

        logger.info("Инфо");
        logger.error("ошибка");

        Triangle triangle = new Triangle();

        Assertions.assertEquals(50, triangle.someMethod(55, 60, 70));
    }

    // Negative test, side = 0
    @Test
    void test3() throws MyException {

        logger.info("Инфо");
        logger.error("ошибка");

        Triangle triangle = new Triangle();

        Assertions.assertEquals(55, triangle.someMethod(0, 35, 20));
    }

    // Negative test, side with a negative value
    @Test
    void test4() throws MyException {

        logger.info("Инфо");
        logger.error("ошибка");

        Triangle triangle = new Triangle();

        Assertions.assertEquals(35, triangle.someMethod(-10, 35, 20));
    }

}
