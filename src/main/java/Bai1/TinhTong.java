package Bai1;

public class TinhTong {
    public int tinhTong(double a,double b) throws Exception{
        if(a % 1 == 0 && b % 1 == 0){
            return (int) (a+b);
        }
        throw new ArithmeticException("Phải nhập số nguyên");
    }
}
