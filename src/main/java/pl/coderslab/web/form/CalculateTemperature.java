package pl.coderslab.web.form;

public class CalculateTemperature {

    public static String calculateInCelsius(double temperature){
        double temperatureInC = (5. / 9.) * (temperature - 32);
        return "Podana temperatura w stopniach Celsiusza to: " + temperatureInC;
    }

    public static String calculateInFahrenheit(double temperature){
        double temperatureInF = 32 + (9. / 5.) * temperature;
        return "Podana temperatura w stopniach Fahrenheita to: " + temperatureInF;
    }
}
