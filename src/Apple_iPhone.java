public class Apple_iPhone implements SmartPhone{

    int volume = 100;
    int battery = 100;
    private String device;
    private String finish;

    Apple_iPhone(String model, String color){
        this.device = model;
        this.finish = color;
    }

    @Override
    public void call() {
        System.out.println("Calling...");
    }

    @Override
    public void text() {
        System.out.println("Text has been sent.");
    }

    @Override
    public void turnOnWiFi() {
        System.out.println("WiFi is on.");
    }

    @Override
    public void turnOffWiFi() {
        System.out.println("WiFi is off.");
    }

    @Override
    public void turnOnBluetooth() {
        System.out.println("Bluetooth is on.");
    }

    @Override
    public void turnOffBluetooth() {
        System.out.println("Bluetooth is off.");
    }

    @Override
    public void airplaneMode() {
        turnOffBluetooth();
        turnOffWiFi();
        System.out.println("Airplane mode is on.");
    }

    @Override
    public void power() {
        System.out.println("Shutting Down...");
    }

    @Override
    public void volumeUp() {
        if (this.volume >= 100){
            System.out.println("Volume is at its max.");
        }
        else{ this.volume ++;}
    }

    @Override
    public void volumeDown() {
        if(this.volume <= 0){
            System.out.println("Volume is at its min");
        }
        else{this.volume --;}
    }

    @Override
    public void goHome() {
        System.out.println("Home");
    }

    @Override
    public void checkBattery(){
        System.out.println("Battery is at " + this.battery + "%");
    }

    public void deviceInfo(){
        System.out.println("You have a " + this.finish + " iPhone " + this.device);
    }
}
