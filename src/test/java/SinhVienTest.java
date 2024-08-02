import Model.SinhVien;
import Service.SinhVienService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SinhVienTest {
    SinhVienService sinhVienService = new SinhVienService();

    @Test
    void TestADDSV(){
        SinhVien sv = new SinhVien("P1","Minh Quang","SD18407","SOF","PH34451");
        SinhVien sv1 = new SinhVien("P2","Minh Quang","SD18407","SOF","PH34452");
        SinhVien sv2 = new SinhVien("P3","Minh Quang","SD18407","SOF","PH34453");
        SinhVien sv3 = new SinhVien("P4","Minh Quang","SD18407","SOF","PH34454");
        SinhVien sv4 = new SinhVien("P5","Minh Quang","SD18407","SOF","PH34455");
        SinhVien sv5 = new SinhVien("P6","Minh Quang","SD18407","SOF","PH34456");
        SinhVien sv6 = new SinhVien("P7","Minh Quang","SD18407","SOF","PH34457");
        SinhVien sv7 = new SinhVien("P8","Minh Quang","SD18407","SOF","PH34458");
        SinhVien sv8 = new SinhVien("P9","Minh Quang","SD18407","SOF","PH34459");
        sinhVienService.AddSV(sv, sv.getMaSV(),sv.getId());
        sinhVienService.AddSV(sv1, sv1.getMaSV(),sv1.getId());
        sinhVienService.AddSV(sv2, sv2.getMaSV(),sv2.getId());
        sinhVienService.AddSV(sv3, sv3.getMaSV(),sv3.getId());
        sinhVienService.AddSV(sv4, sv4.getMaSV(),sv4.getId());
        sinhVienService.AddSV(sv5, sv5.getMaSV(),sv5.getId());
        sinhVienService.AddSV(sv6, sv6.getMaSV(),sv6.getId());
        sinhVienService.AddSV(sv7, sv7.getMaSV(),sv7.getId());
        sinhVienService.AddSV(sv8, sv8.getMaSV(),sv8.getId());

        assertEquals(9,sinhVienService.getAll().size());

    }

//TestTrue
    @Test
    void TestFindByMaSV1(){
        SinhVien sv = new SinhVien("P1","Minh Quang","SD18407","SOF","PH34451");
        SinhVien sv1 = new SinhVien("P2","Minh Quang","SD18407","SOF","PH34452");
        sinhVienService.AddSV(sv, sv.getMaSV(),sv.getId());
        sinhVienService.AddSV(sv1, sv1.getMaSV(),sv1.getId());
        sinhVienService.FindByMaSV("PH34452");
        assertEquals(2,sinhVienService.getAll().size());
    }
    @Test
    void TestFindByMaSV2(){
        SinhVien sv2 = new SinhVien("P3","Minh Quang","SD18407","SOF","PH34453");
        SinhVien sv3 = new SinhVien("P4","Minh Quang","SD18407","SOF","PH34454");
        sinhVienService.AddSV(sv2, sv2.getMaSV(),sv2.getId());
        sinhVienService.AddSV(sv3, sv3.getMaSV(),sv3.getId());
        sinhVienService.FindByMaSV("PH34454");
        assertEquals(2,sinhVienService.getAll().size());
    }
    @Test
    void TestFindByMaSV3(){
        SinhVien sv4 = new SinhVien("P5","Minh Quang","SD18407","SOF","PH34455");
        SinhVien sv5 = new SinhVien("P6","Minh Quang","SD18407","SOF","PH34456");
        sinhVienService.AddSV(sv4, sv4.getMaSV(),sv4.getId());
        sinhVienService.AddSV(sv5, sv5.getMaSV(),sv5.getId());
        sinhVienService.FindByMaSV("PH34455");
        assertEquals(2,sinhVienService.getAll().size());
    }
    @Test
    void TestFindByMaSV4(){
        SinhVien sv = new SinhVien("P1","Minh Quang","SD18407","SOF","PH34451");
        SinhVien sv1 = new SinhVien("P2","Minh Quang","SD18407","SOF","PH34452");
        sinhVienService.AddSV(sv, sv.getMaSV(),sv.getId());
        sinhVienService.AddSV(sv1, sv1.getMaSV(),sv1.getId());
        sinhVienService.FindByMaSV("PH34453");
        assertEquals(2,sinhVienService.getAll().size());
    }

    //TestFalse
    @Test
    void TestFindByMaSV5False(){
        SinhVien sv = new SinhVien("P1","Minh Quang","SD18407","SOF","PH34451");
        SinhVien sv1 = new SinhVien("P2","Minh Quang","SD18407","SOF","PH34452");
        sinhVienService.AddSV(sv, sv.getMaSV(),sv.getId());
        sinhVienService.AddSV(sv1, sv1.getMaSV(),sv1.getId());
        sinhVienService.FindByMaSV("PH34450");
        assertEquals(2,sinhVienService.getAll().size());
    }
}
