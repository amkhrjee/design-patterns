public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature, humidity, pressure;
    // private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        // this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    public void display() {
        System.out.println("=========CurrConditionsDisplay=========");
        System.out.println("Temperature: " + temperature);
        System.out.println("Humidity: " + humidity);
        System.out.println("Pressure: " + pressure);
    }
}
