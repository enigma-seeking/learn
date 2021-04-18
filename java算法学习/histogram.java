public class histogram{
    public static void main(String[] args) {
        int al = Integer.parseInt(args[0]);
        int[] a = new int[al];
        for (int i = 0;i<al;i++)
        {
            a[i] = Integer.parseInt(args[i+1]);
        }
        int M = Integer.parseInt(args[al+1]);
        int[] ans = new int[M];

        for(int i = 0;i < M;i++)
        {
            int sum = 0;
            for (int j = 0;j <al ;j++)
            {
                if (i == a[j])
                {
                    sum++;
                }
            }
            ans[i] = sum;
        }
        System.out.println("###############################################");
        for(int i = 0;i < M;i++) {
            System.out.print(ans[i]+" ");
        }
    }
}