public class lg{
    public static void main(String[] args) {
        Integer num = Integer.parseInt(args[0]);
        int i = 0;
        while (num != 1)
        {
            i++;
            num = num/2;
        }
        System.out.println(i);
    }
}