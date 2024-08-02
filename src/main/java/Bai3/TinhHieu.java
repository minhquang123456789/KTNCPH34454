package Bai3;

public class TinhHieu {
    public int tinhHieu(double a, double b) throws Exception{
        if(a % 1 == 0 && b % 1 == 0){
            return (int)(a-b);
        }
        throw  new ArithmeticException("Phải nhập số nguyên");
    }
}
