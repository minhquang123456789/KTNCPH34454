package Bai5;

public class ARR {
    public static int FindArr(double n,int [] arr){
        if(arr.length == 0){
            throw new ArithmeticException("Vui lòng nhập chuỗi");
        }else{
            for(int i = 0;i< arr.length;i++){
                if(arr[i] == n){
                    System.out.println("Số cần tìm là " + arr[i]);
                    return arr[i];
                }
            }
        }
        throw new IndexOutOfBoundsException("Số không nằm trong mảng");
    }
}
