public class fractionOrNot {
    public static void main(String[] args) {
        double n0 = Double.parseDouble(args[0]);
        double n1 = Double.parseDouble(args[1]);

        if( n0 >0.0 && 1.0>n0 && n1<1.0 && n1>0.0)
        {
            System.out.println(true);
        }
        else
            System.out.println(false);
    }

}
