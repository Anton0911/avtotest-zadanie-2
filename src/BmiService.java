public class BmiService {
    public double calculate(int weight, double height) {
        double imt = (double) weight / (height * height);
        return imt;
    }
}
