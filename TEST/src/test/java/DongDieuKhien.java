import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

public class DongDieuKhien {
    FindXY findXY = new FindXY();
    @ParameterizedTest
    @CsvFileSource(resources = "/data3.csv", numLinesToSkip = 1)
    @Test
    void test1(int a1, int b1, int c1, int a2, int b2, int c2,String expectX, String expectY){
        XAndY res = findXY.Cal(a1, b1, c1, a2, b2, c2);
        assertAll(
                () -> {
                    String X = res.getX();
                    String Y = res.getY();

                    String XX = expectX;
                    String YY = expectY;

                    assertEquals(X, XX);
                    assertEquals(Y, YY);
                }
        );
    }
}