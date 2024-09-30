public class GiangVien extends UET {

    GiangVien() {}

    GiangVien (String hoTen, String namSinh) {
        super(hoTen, namSinh);
    }

    @Override
    public void NgheNghiep() {
        System.out.println("GiangVien");
    }

}
