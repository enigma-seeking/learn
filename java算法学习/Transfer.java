public class Transfer{
    public static void main(String[] args) {
        int n = 3;
        int m = 4;
        int[][] a = new int[m][n];
        int[][] b = new int[n][m];
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++)
            {
                a[i][j] = i+j;
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("############A is above, B is below########################################### ");
        for (int j=0;j<n;j++){
            for (int i=0;i<m;i++)
            {
                b[j][i] = a[i][j];
                System.out.print(b[j][i]+" ");
            }
            System.out.println();
        }
    }
}