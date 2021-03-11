package model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="phones")
public class Phone extends Product {
  private String modelName;
  private String SimType;
  private String DualSim;
  private String WIFI;
  private String Bluetooth;
  private String GPS;

 public Phone() {

 }

 public Phone(String brand, String model, String color, String operatingSystem, int weight, int warranty, String RAM, int price, String modelName, String simType, String dualSim, String WIFI, String bluetooth, String GPS) {
  super(brand, model, color, operatingSystem, weight, warranty, RAM, price);
  this.modelName = modelName;
  SimType = simType;
  DualSim = dualSim;
  this.WIFI = WIFI;
  Bluetooth = bluetooth;
  this.GPS = GPS;
 }

 public String getModelName() {
  return modelName;
 }

 public void setModelName(String modelName) {
  this.modelName = modelName;
 }

 public String getSimType() {
  return SimType;
 }

 public void setSimType(String simType) {
  SimType = simType;
 }

 public String getDualSim() {
  return DualSim;
 }

 public void setDualSim(String dualSim) {
  DualSim = dualSim;
 }

 public String getWIFI() {
  return WIFI;
 }

 public void setWIFI(String WIFI) {
  this.WIFI = WIFI;
 }

 public String getBluetooth() {
  return Bluetooth;
 }

 public void setBluetooth(String bluetooth) {
  Bluetooth = bluetooth;
 }

 public String getGPS() {
  return GPS;
 }

 public void setGPS(String GPS) {
  this.GPS = GPS;
 }


 @Override
 public String toString() {
  return super.toString()+" " +
          "model Name-" + modelName + '\'' +
          ", Sim Type-" + SimType + '\'' +
          ", Dual Sim-" + DualSim + '\'' +
          ", WI-FI-" + WIFI + '\'' +
          ", Bluetooth-" + Bluetooth + '\'' +
          ", GPS-" + GPS;
 }
}
