public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int ves = 90;
        double rost = 1.7;
        double imt = service.calculate(ves, rost);
        System.out.println(imt);

    }
}