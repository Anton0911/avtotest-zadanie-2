public class BmiService {
    public double calculate(int ves, double rost) {
        double imt = (double) ves / (rost * rost);
        return imt;
    }
}
