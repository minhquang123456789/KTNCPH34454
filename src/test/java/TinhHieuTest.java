import Bai3.TinhHieu;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TinhHieuTest {
    Bai3.TinhHieu tinhHieu = new TinhHieu();

    @ParameterizedTest
    @CsvSource({
            "3,1,2",
            "3,2,1",
            "1,3,-2",
            "4,2,2",
            "4,4,0",
            "3,1,2",
            "3,1,2",
            "4,5,-1",
            "10,5,5",
            "3.5,1.5,2",
    })
    public void TinhHieuTest(double a, double b,double ex) throws Exception{
        Assertions.assertEquals(ex,tinhHieu.tinhHieu(a,b));
    }
}
