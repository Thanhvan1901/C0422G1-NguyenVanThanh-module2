package Bai_tap_them_CongAn;

public abstract class Vehicle {
    private String SeaOfControl = "g2";
    private String ProduceName = "Honda";
    private int ProduceYear = 2022;
    private String Owner = "Thanh";

    public Vehicle() {
    }

    public Vehicle(String seaOfControl, String produceName, int produceYear, String owner) {
        SeaOfControl = seaOfControl;
        ProduceName = produceName;
        ProduceYear = produceYear;
        Owner = owner;
    }

    public String getSeaOfControl() {
        return SeaOfControl;
    }

    public void setSeaOfControl(String seaOfControl) {
        SeaOfControl = seaOfControl;
    }

    public String getProduceName() {
        return ProduceName;
    }

    public void setProduceName(String produceName) {
        ProduceName = produceName;
    }

    public int getProduceYear() {
        return ProduceYear;
    }

    public void setProduceYear(int produceYear) {
        ProduceYear = produceYear;
    }

    public String getOwner() {
        return Owner;
    }

    public void setOwner(String owner) {
        Owner = owner;
    }

    @Override
    public String toString() {
        return "Vehicle" +
                "SeaOfControl='" + SeaOfControl + '\'' +
                ", ProduceName='" + ProduceName + '\'' +
                ", ProduceYear='" + ProduceYear + '\'' +
                ", Owner='" + Owner + '\'';
    }

    public abstract int getId();
}
