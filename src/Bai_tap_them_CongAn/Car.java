package Bai_tap_them_CongAn;

public class Car extends Vehicle{
    private int NumberOfSeats ;
    private String type ;
    public Car() {
    }

    public Car(String seaOfControl, String produceName, int produceYear, String owner, int numberOfSeats, String type) {
        super(seaOfControl, produceName, produceYear, owner);
        NumberOfSeats = numberOfSeats;
        this.type = type;
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
        return super.toString() +
                "Car" +
                "NumberOfSeats=" + NumberOfSeats +
                ", type='" + type + '\'' ;
    }

    @Override
    public int getId() {
        return 0;
    }
}



