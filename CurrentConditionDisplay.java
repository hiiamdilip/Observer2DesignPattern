public class CurrentConditionDisplay implements Observer, DisplayElement{
    private float temp;
    private float humidity;
    private float pressure;
    private WeatherData weatherData;
    public CurrentConditionDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    public void update(float temp, float humidity, float pressure){
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
    public void display(){
        System.out.println("Current condition is: " +temp + humidity +pressure);
    }
}
