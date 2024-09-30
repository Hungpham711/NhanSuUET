public class SinhVien extends UET{
    private String maSV;

    SinhVien() {}

    SinhVien (String hoTen, String namSinh) {
        super(hoTen, namSinh);
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    @Override
    public void NgheNghiep() {
        System.out.println("SinhVien");
    }
}
