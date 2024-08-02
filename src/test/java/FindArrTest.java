import org.junit.jupiter.api.Test;

public class FindArrTest {

    @Test
    void test1(){
        int [] arr = {1,2,3,4,5};
        Bai5.ARR.FindArr(1,arr);
    }
    @Test
    void test2(){
        int [] arr = {1,2,3,4,5,3};
        Bai5.ARR.FindArr(3,arr);
    }
    @Test
    void test3(){
        int [] arr = {4,5,6};
        Bai5.ARR.FindArr(4,arr);
    }
    @Test
    void test4(){
        int [] arr = {3,4,5};
        Bai5.ARR.FindArr(3,arr);
    }
    @Test
    void test5(){
        int [] arr = {1,2,10};
        Bai5.ARR.FindArr(10,arr);
    }
    @Test
    void test6(){
        int [] arr = {1,2,3,3,2,1};
        Bai5.ARR.FindArr(1,arr);
    }
    @Test
    void test7(){
        int [] arr = {6,2,7,8,5};
        Bai5.ARR.FindArr(6,arr);
    }
    @Test
    void test8(){
        int [] arr = {10,5,9,8};
        Bai5.ARR.FindArr(10,arr);
    }
    @Test
    void test9(){
        int [] arr = {9,9,2,2,3};
        Bai5.ARR.FindArr(9,arr);
    }
    @Test
    void test10(){
        int [] arr = {};
        Bai5.ARR.FindArr(10,arr);
    }
}
