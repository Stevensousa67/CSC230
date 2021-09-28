public class Main_SmartPhone {
    public static void main(String[] args){

        Apple_iPhone iPhone = new Apple_iPhone("11 Pro", "Silver");
        Google_Pixel Pixel = new Google_Pixel("4", "White");

        iPhone.turnOffBluetooth();
        Pixel.checkBattery();
        iPhone.deviceInfo();
        Pixel.deviceInfo();
    }
}
