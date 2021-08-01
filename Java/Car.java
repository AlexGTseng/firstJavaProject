public class Car {
    private String model;
    private double price;
    private int year;

    public Car(String model, double price, int year) {
        this.model = model;
        this.price = price;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public String toString() {
        return model + " made in " + year + " and costs " + price;
    }
}
