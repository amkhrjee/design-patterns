public class StatsDisplay implements Observer, DisplayElement {
    private float totalTemperature = 0, totalHumidity = 0, totalPressure = 0;
    private int count = 0;

    public StatsDisplay(Subject weatherData) {
        weatherData.addObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        totalTemperature += temperature;
        totalHumidity += humidity;
        totalPressure += pressure;
        count++;
        display();
    }

    public void display() {
        System.out.println("=========StatsDisplay=========");
        System.out.println("Average Temperature: " + totalTemperature / count);
        System.out.println("Average Humidity: " + totalHumidity / count);
        System.out.println("Average Pressure: " + totalPressure / count);
    }
}