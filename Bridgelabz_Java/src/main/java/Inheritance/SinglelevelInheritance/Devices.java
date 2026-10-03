
class Device{
    protected String deviceId;
    protected boolean status;

    public Device(String deviceId,boolean status){
        this.deviceId = deviceId;
        this.status = status;
    }
    public void display(){
        System.out.println("The device id  is : " + deviceId);
        System.out.println("Device Status is : " + status);
    }
}
class Thermostat extends Device{
    protected String temperatureSetting;
    public Thermostat(String deviceId,boolean status,String temperatureSetting){
        super(deviceId,status);
        this.temperatureSetting = temperatureSetting;
    }
    @Override
    public void display(){
        System.out.println("The device id  is : " + deviceId);
        System.out.println("Device Status is : " + status);
        System.out.println("Temperature setting is : " + temperatureSetting);
    }
}
public class Devices {
    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat("T001",false,"null");
        thermostat.display();
    }
}
