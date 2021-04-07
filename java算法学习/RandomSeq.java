import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdOut;

public class RandomSeq {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        double lo = Double.parseDouble(args[1]);
        double hi = Double.parseDouble(args[2]);
        for(int i = 0;i < N;i++)
        {
            double x = StdRandom.uniform(lo,hi);
            StdOut.printf("%.2f\n",x);
        }
    }
}
