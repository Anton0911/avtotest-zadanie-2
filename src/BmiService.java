public class BmiService {
    public double  calculate (int a, double b) {
        double imt = (double) a/(b*b);
        return imt;
}
}
