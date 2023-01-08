public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 90;
        double height = 1.7;
        double imt = service.calculate(weight, height);
        System.out.println(imt);

    }
}