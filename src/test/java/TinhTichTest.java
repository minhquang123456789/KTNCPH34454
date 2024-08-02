import Bai2.TinhTich;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TinhTichTest {
    Bai2.TinhTich tinhTich = new TinhTich();

    @ParameterizedTest
    @CsvSource({
            "1,2,2",
            "2,2,4",
            "3,2,6",
            "3,3,9",
            "3,1,3",
            "2,4,8",
            "3,4,12",
            "4,4,16",
            "4,5,20",
            "1.2,2,2.4"
    })
    public void TinhTichTest(double a, double b,double ex) throws Exception{
        Assertions.assertEquals(ex,tinhTich.tinhTich(a,b));
    }
}
