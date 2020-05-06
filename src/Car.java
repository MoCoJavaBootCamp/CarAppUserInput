public class Car extends Vehicle {
    private String owner;
    private boolean needsOilChange;

    Car(){
        this.setType("car");
    };

    Car(String owner) {
        this.owner = owner;
        this.needsOilChange = false;
        this.setType("car");
    }

    public String getCarInfo() {
        return String.format("%s's %s %d %s %s with %s was purchased for $%.2f.",
                this.owner, this.getColor(), this.getYear(), this.getMake(),
                this.getModel(), this.getFeatures(), this.getPrice());
    }

    @Override
    public String currentSpeed(int speed) {
        return String.format("%s is going %d mph.", this.toString(), speed);
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public boolean getNeedsOilChange() {
        return needsOilChange;
    }

    public void setNeedsOilChange(boolean needsOilChange) {
        this.needsOilChange = needsOilChange;
    }

}
