package QuanLyPizza.BUS;

import MyCustom.Helper;
import QuanLyPizza.DAO.CTHoaDonDAO;
import QuanLyPizza.DTO.CTHoaDon;
import QuanLyPizza.DTO.HoaDon;

import java.util.ArrayList;

public class CTHoaDonBUS {

    private ArrayList<CTHoaDon> listCTHoaDon;
    private CTHoaDonDAO ctHDDAO = new CTHoaDonDAO();
    private HoaDonBUS hdBUS = new HoaDonBUS();

    public CTHoaDonBUS() {
        docListCTHoaDon();
    }

    public void docListCTHoaDon() {
        this.listCTHoaDon = ctHDDAO.getListCTHoaDon();
    }

    public ArrayList<CTHoaDon> getListCTHoaDon() {
        return listCTHoaDon;
    }

    public ArrayList<CTHoaDon> getListCTHoaDonTheoMaHD(String maHD) {
        int ma = Integer.parseInt(maHD);
        ArrayList<CTHoaDon> dsct = new ArrayList<>();

        for (CTHoaDon cthd : listCTHoaDon) {
            if (cthd.getMaHD() == ma)
                dsct.add(cthd);
        }

        return dsct;
    }

    public void addCTHoaDon(String maSP, String soLuong, String donGia, String thanhTien) {
        int ma = hdBUS.getMaHoaDonMoiNhat();

        CTHoaDon cthd = new CTHoaDon();

        cthd.setMaHD(ma);
        cthd.setMaSP(Integer.parseInt(maSP));
        cthd.setDonGia(Helper.convertStringToInt(donGia));
        cthd.setSoLuong(Helper.convertStringToInt(soLuong));
        cthd.setThanhTien(Helper.convertStringToInt(thanhTien));

        ctHDDAO.addCTHoaDon(cthd);
    }
}
