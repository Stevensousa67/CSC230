public class Celsius_Converter {
    public static void main(String[] args){
        int fahrenheit = 212;
        int celsius = 37;

        System.out.println(convertToCelsius(fahrenheit));
        System.out.println(convertToFahrenheit(celsius));

    }

    public static int convertToCelsius(int fahrenheit){
        return (int)(fahrenheit-32) * 5/9;
    }

    public static int convertToFahrenheit(int celsius){
        return (int) (celsius * 1.8 + 32);
    }
}
