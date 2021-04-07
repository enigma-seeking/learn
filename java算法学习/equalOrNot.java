public class equalOrNot {

    public static void main(String[] args) {

//        In n0 = new In(args[0]);
//        In n1 = new In(args[1]);
//        In n2 = new In(args[2]);
        double n0 = Double.parseDouble(args[0]);
        double n1 = Double.parseDouble(args[1]);
        double n2 = Double.parseDouble(args[2]);

        if (n0 == n1 && n0 == n2) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }

    }
}