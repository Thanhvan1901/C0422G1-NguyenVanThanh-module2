package Furama.Model;

public class Room extends Facility {
    private String dichVuMienPhi;

    public Room() {
    }

    public Room(String dichVuMienPhi) {
        this.dichVuMienPhi = dichVuMienPhi;
    }

    public Room(String tendichvu, double dientichsudung, int chiphithue, int songuoitoida, String kieuthue, String dichVuMienPhi) {
        super(tendichvu, dientichsudung, chiphithue, songuoitoida, kieuthue);
        this.dichVuMienPhi = dichVuMienPhi;
    }

    public String getDichVuMienPhi() {
        return dichVuMienPhi;
    }

    public void setDichVuMienPhi(String dichVuMienPhi) {
        this.dichVuMienPhi = dichVuMienPhi;
    }

    @Override
    public String toString() {
        return super.toString() +
                "dichVuMienPhi='" + dichVuMienPhi + '\'' +
                '}';
    }
}
