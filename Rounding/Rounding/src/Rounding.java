public class Rounding {
    public static void main(String[] args) throws Exception {
        double x = 3.14159;
        double y = 4.5;

        // round to nearest integer
        System.out.println(Math.round(x));

        // round to number UP to nearest integer
        System.out.println(Math.round(Math.ceil(x)));
        
        // round number DOWN to nearest integer
        System.out.println(Math.round(Math.floor(y)));

        // round y to nearest integer
        System.out.println(Math.round(y));

        // to round to decimal
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
