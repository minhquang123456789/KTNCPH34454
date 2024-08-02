package Service;

import Model.SinhVien;

import java.util.ArrayList;
import java.util.List;

public class SinhVienService {
    private List<SinhVien> listSV = new ArrayList<>();

    public List<SinhVien> getAll(){
        return listSV;
    }

    public void AddSV(SinhVien sv, String maSV,String idSV) {

        if (!sv.getTenLop().matches("^[a-zA-Z0-9]*$")) {
            throw new IllegalArgumentException("Tên lớp không được chứa ký tự đặc biệt");
        }
        for (SinhVien check : listSV) {
            if (check.getMaSV().equals(maSV)) {
                throw new IllegalArgumentException("Mã SV không được trùng");
            }if(check.getId().equals(idSV)){
                throw new IllegalArgumentException("ID SV không được trùng");
            }
        }
        listSV.add(sv);
    }

    public SinhVien FindByMaSV(String maSV){
        for(SinhVien sv : listSV){
            if(sv.getMaSV().equals(maSV)){
                System.out.println("Mã Sinh Viên cần tìm là: " + maSV);
                return sv;
            }
        }
        throw new ArithmeticException("Mã SV Không có trong danh sách");
    }
}
