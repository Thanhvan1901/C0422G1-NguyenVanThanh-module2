package Bai_tap_them_CongAn;

public class Motorcycle extends Vehicle{
    private double congsuat ;

    public Motorcycle() {
    }

    public Motorcycle(String seaOfControl, String produceName, int produceYear, String owner, double congsuat) {
        super(seaOfControl, produceName, produceYear, owner);
        this.congsuat = congsuat;
    }

    public Motorcycle(String seaOfControl, String produceName, int produceYear, String owner) {
        super(seaOfControl, produceName, produceYear, owner);
    }

    @Override
    public String getSeaOfControl() {
        return super.getSeaOfControl();
    }

    @Override
    public void setSeaOfControl(String seaOfControl) {
        super.setSeaOfControl(seaOfControl);
    }

    @Override
    public String getProduceName() {
        return super.getProduceName();
    }

    @Override
    public void setProduceName(String produceName) {
        super.setProduceName(produceName);
    }

    @Override
    public int getProduceYear() {
        return super.getProduceYear();
    }

    @Override
    public void setProduceYear(int produceYear) {
        super.setProduceYear(produceYear);
    }

    @Override
    public String getOwner() {
        return super.getOwner();
    }

    @Override
    public void setOwner(String owner) {
        super.setOwner(owner);
    }

    @Override
    public String toString() {
        return super.toString() + "Motorcycle{" +
                "congsuat=" + congsuat +
                '}';
    }

    @Override
    public int getId() {
        return 0;
    }
}
