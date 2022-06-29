package Furama.Model;

public abstract class Facility {
    private String tendichvu ;
    private double dientichsudung ;
    private int chiphithue;
    private int songuoitoida ;
    private String kieuthue ;

    public Facility() {
    }

    public Facility(String tendichvu, double dientichsudung, int chiphithue, int songuoitoida, String kieuthue) {
        this.tendichvu = tendichvu;
        this.dientichsudung = dientichsudung;
        this.chiphithue = chiphithue;
        this.songuoitoida = songuoitoida;
        this.kieuthue = kieuthue;
    }

    public String getTendichvu() {
        return tendichvu;
    }

    public void setTendichvu(String tendichvu) {
        this.tendichvu = tendichvu;
    }

    public double getDientichsudung() {
        return dientichsudung;
    }

    public void setDientichsudung(double dientichsudung) {
        this.dientichsudung = dientichsudung;
    }

    public int getChiphithue() {
        return chiphithue;
    }

    public void setChiphithue(int chiphithue) {
        this.chiphithue = chiphithue;
    }

    public int getSonguoitoida() {
        return songuoitoida;
    }

    public void setSonguoitoida(int songuoitoida) {
        this.songuoitoida = songuoitoida;
    }

    public String getKieuthue() {
        return kieuthue;
    }

    public void setKieuthue(String kieuthue) {
        this.kieuthue = kieuthue;
    }

    @Override
    public String toString() {
        return "Furama" +
                "tendichvu='" + tendichvu + '\'' +
                ", dientichsudung=" + dientichsudung +
                ", chiphithue=" + chiphithue +
                ", songuoitoida=" + songuoitoida +
                ", kieuthue='" + kieuthue + '\'';
    }
}
