public class WeatherStation {
    public static void main(String[] args) {
        WeatherData wData = new WeatherData();
        CurrentConditionsDisplay currDisp = new CurrentConditionsDisplay(wData);
        StatsDisplay statDisp = new StatsDisplay(wData);
        // setMeasurements notifies and updates the currDisplay everytime we change the
        // data
        wData.setMeasurements(10, 20, 30);
        wData.setMeasurements(20, 50, 40);
        wData.setMeasurements(50, 60, 70);

    }
}
