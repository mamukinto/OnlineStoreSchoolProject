package Models;

public abstract class Product {
    private String Brand;
    private String Model;
    private String Color;
    private String OperatingSystem;
    private int Weight;
    private int Warranty;
    private String RAM;
    private int Price;

    public Product() {

    }

    public Product(String brand, String model, String color, String operatingSystem, int weight, int warranty, String RAM, int price) {
        Brand = brand;
        Model = model;
        Color = color;
        OperatingSystem = operatingSystem;
        Weight = weight;
        Warranty = warranty;
        this.RAM = RAM;
        Price = price;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getOperatingSystem() {
        return OperatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        OperatingSystem = operatingSystem;
    }

    public int getWeight() {
        return Weight;
    }

    public void setWeight(int weight) {
        Weight = weight;
    }

    public int getWarranty() {
        return Warranty;
    }

    public void setWarranty(int warranty) {
        Warranty = warranty;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    @Override
    public String toString() {
        return "Models.Product " +
                "Brand-" + Brand + '\'' +
                " Model-" + Model + '\'' +
                ", Color-" + Color + '\'' +
                ", Operating System-" + OperatingSystem + '\'' +
                ", Weight-" + Weight +
                ", Warranty-" + Warranty +
                ", RAM-" + RAM + '\'' +
                ", Price-" + Price +" ";
    }
}
