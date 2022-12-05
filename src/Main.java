public class Main {

    public static void main(String[] args) {

        BmiService service = new BmiService();
        double mass = 114;
        double high = 192;
        double MyWeight = service.calculate(mass, high);

        System.out.println(" Индекс избыточного веса " + MyWeight  );

    }
}
