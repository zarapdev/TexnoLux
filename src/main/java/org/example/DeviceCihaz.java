package org.example;

public class DeviceCihaz {
    private static int idCounter=1;
    private final int id;
    private String name;
    private double powerUsage;
    private DeviceStatus status;

    public DeviceCihaz(int id, String name, double powerUsage, DeviceStatus status) {
        this.id = id;
        this.name = name;
        this.powerUsage = powerUsage;
        this.status = DeviceStatus .OFF;
    }
    public int getId() {return id; }
    public String getName() {return name;}
    public double getPowerUsage() {return powerUsage;}

    public DeviceStatus  getStatus() {
        return status;
    }
    public void toogle(){
        status=(status== DeviceStatus.ON) ? DeviceStatus.OFF : DeviceStatus.ON;
  //      if (status==org.example.DeviceCihaz.ON){
  //          status = org.example.DeviceCihaz.OFF;

 //       } else {
  //          status = org.example.DeviceCihaz.OFF;
 //       }else {
 //           status = org.example.DeviceCihaz.ON;
//        }
    }
}
