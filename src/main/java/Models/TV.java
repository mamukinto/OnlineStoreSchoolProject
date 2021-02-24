package Models;

import Models.Product;

public class TV extends Product {
    private String ScreenSize;
    private String ScreenResolution;

    public TV() {

    }

    public TV(String brand, String model, String color, String operatingSystem, int weight, int warranty, String RAM, int price, String screenSize, String screenResolution) {
        super(brand, model, color, operatingSystem, weight, warranty, RAM, price);
        ScreenSize = screenSize;
        ScreenResolution = screenResolution;
    }

    public String getScreenSize() {
        return ScreenSize;
    }

    public void setScreenSize(String screenSize) {
        ScreenSize = screenSize;
    }

    public String getScreenResolution() {
        return ScreenResolution;
    }

    public void setScreenResolution(String screenResolution) {
        ScreenResolution = screenResolution;
    }

    @Override
    public String toString() {
        return super.toString()+" " +
                "ScreenSize='" + ScreenSize + '\'' +
                ", ScreenResolution='" + ScreenResolution;
    }
}
