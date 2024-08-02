import Bai4.TBC;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TBCTest {
    Bai4.TBC tbc = new TBC();

    @Test
    void TBCTrue1(){
        int [] arr = {1,2,3,4,5};
        int ex = 3;
        int rs = tbc.TBC(arr);
        assertEquals(ex,rs);
    }
    @Test
    void TBCTrue2(){
        int [] arr = {2,3,4,5};
        int ex = 3;
        int rs = tbc.TBC(arr);
        assertEquals(ex,rs);
    }
    @Test
    void TBCTrue3(){
        int [] arr = {1,8,10,4,7};
        int ex = 6;
        int rs = tbc.TBC(arr);
        assertEquals(ex,rs);
    }
    @Test
    void TBCTrue4(){
        int [] arr = {3,2};
        int ex = 2;
        int rs = tbc.TBC(arr);
        assertEquals(ex,rs);
    }
    @Test
    void TBCTrue5(){
        int [] arr = {7,3,8,5};
        int ex = 5;
        int rs = tbc.TBC(arr);
        assertEquals(ex,rs);
    }
    @Test
    void TBCTrue6(){
        int [] arr = {1,1,3,3,6};
        int ex = 2;
        int rs = tbc.TBC(arr);
        assertEquals(ex,rs);
    }
    @Test
    void TBCTrue7(){
        int [] arr = {7,8,5,5,5};
        int ex = 6;
        int rs = tbc.TBC(arr);
        assertEquals(ex,rs);
    }
    @Test
    void TBCTrue8(){
        int [] arr = {3,3,3,2,1};
        int ex = 2;
        int rs = tbc.TBC(arr);
        assertEquals(ex,rs);
    }
    @Test
    void TBCTrue9(){
        int [] arr = {1,1,2,2,8};
        int ex = 2;
        int rs = tbc.TBC(arr);
        assertEquals(ex,rs);
    }
    @Test
    void TBCTrue10(){
        int [] arr = {};
        int ex = 3;
        int rs = tbc.TBC(arr);
        assertEquals(ex,rs);
    }
}
