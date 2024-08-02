import Bai1.TinhTong;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TinhTongTest {

    Bai1.TinhTong tinhTong = new TinhTong();

    @ParameterizedTest
    @CsvSource({
            "1,2,3",
            "2,3,5",
            "3,3,6",
            "4,3,7",
            "4,4,8",
            "5,3,8",
            "6,3,9",
            "5,4,9",
            "5,5,10",
            "4.5,5,9.5"
    })
    public void TinhTong(double a, double b,double ex) throws Exception{
        Assertions.assertEquals(ex,tinhTong.tinhTong(a,b));
    }
}
