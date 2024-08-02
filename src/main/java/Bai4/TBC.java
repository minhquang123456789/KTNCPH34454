package Bai4;

public class TBC {
    public int TBC(int [] arr){
        if(arr.length == 0){
            throw  new ArithmeticException("Vui lòng không nhập chuỗi rỗng");
        }else{
            int tong = 0;
            for(int i=0;i<arr.length;i++){
                tong += arr[i];
            }
            return tong/arr.length;
        }
    }
}
