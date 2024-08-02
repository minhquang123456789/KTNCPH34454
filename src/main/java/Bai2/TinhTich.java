package Bai2;

public class TinhTich {
    public int tinhTich(double a, double b) throws Exception{
        if(a % 1 == 0 && b % 1 == 0){
            return (int) (a*b);
        }
        throw  new ArithmeticException("Phải nhập số nguyên");
    }
}
