package model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="computers")
public class Computer extends Product {
    private String WebCamera;
    private String wifi;
    private String TypeOfProcessor;

    public Computer() {

    }

    public Computer(String brand, String model, String color, String operatingSystem, int weight, int warranty, String RAM, int price, String webCamera, String wifi, String typeOfProcessor) {
        super(brand, model, color, operatingSystem, weight, warranty, RAM, price);
        WebCamera = webCamera;
        this.wifi = wifi;
        TypeOfProcessor = typeOfProcessor;
    }

    public String getWebCamera() {
        return WebCamera;
    }

    public void setWebCamera(String webCamera) {
        WebCamera = webCamera;
    }

    public String getWifi() {
        return wifi;
    }

    public void setWifi(String wifi) {
        this.wifi = wifi;
    }

    public String getTypeOfProcessor() {
        return TypeOfProcessor;
    }

    public void setTypeOfProcessor(String typeOfProcessor) {
        TypeOfProcessor = typeOfProcessor;
    }

    @Override
    public String toString() {
        return super.toString()+ " " +
                "WebCamera" + WebCamera + '\'' +
                ", wi-fi-'" + wifi + '\'' +
                ", Type Of Processor-" + TypeOfProcessor ;
    }
}
