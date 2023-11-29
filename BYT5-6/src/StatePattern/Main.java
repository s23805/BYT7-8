package StatePattern;

public class Main {
    // you have to stop program manually, it runs infinitely
    public static void main(String[] args) {

        TrafficLight trafficLight = new TrafficLight();

        trafficLight.requestStateChange(); // Red to Green
        trafficLight.requestStateChange(); // Green to Yellow
        trafficLight.requestStateChange(); // Yellow to Red
    }
}
