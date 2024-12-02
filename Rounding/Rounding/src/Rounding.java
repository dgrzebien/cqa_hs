public class Rounding {
    public static void main(String[] args) throws Exception {
        double x = 3.14159;
        double y = 4.5;

        System.out.println(Math.round(x));
        System.out.println(Math.round(y));

        // round to tenths
        System.out.println(Math.round(x * 10.0) / 10.0);
        // round to hundredths
        System.out.println(Math.round(x * 100.0) / 100.0);

        // round to thousandths
        System.out.println(Math.round(x * 1000.0) / 1000.0);

        // round to  millionths
        System.out.println(Math.round(x * 10000.0) / 10000.0);

        // round to 100 millionths
        System.out.println(Math.round(x * 100000.0) / 100000.0);

        System.out.println(Math.round(x * 1000000.0) / 1000000.0);
    }
}
