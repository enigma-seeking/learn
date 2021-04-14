public class toBinaryString {
    public static void main(String[] args) {
        //first calculate the ans, then convert the answer to String
//        int s=0;
//        int i=0;
//        double x=0.0;
//        int N = Integer.parseInt(args[0]);
//        for (int n=N;n != 0; n=n/2,i++)
//        {
//            s = (int) (Math.pow(10,i)*(n%2))+ s;
//        }
//        String a = String.valueOf(s);//the best convert
//        String b = Integer.toString(s);
//        String c = Double.toString(x);
//        System.out.println(a);

        //operate the string directly
        String s = "";
        int N = Integer.parseInt(args[0]);
        for (int n=N;n != 0; n=n/2,i++)
        {
            s = (n%2)+ s;  //though n%2 is a number but java convert it to String automatically
        }
        System.out.println(s);
    }

}