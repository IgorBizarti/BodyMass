public class BmiService {

    public double calculate(double mass, double high) {
        double result;

        result = mass / high * high;
        return result;
    }
}
