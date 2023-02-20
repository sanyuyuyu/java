class Test_20230219
{
    public static void main(String[] args)
    {
        for (int i = 100; i < 1000; i++)
        {
             int dd = (int)(Math.pow(i/100, 3) + Math.pow(i%100/10, 3) + Math.pow(i%10, 3));
             if (dd == i)
            {
                System.out.println(i);
             }
       	}

        int[] data = new int[] {2,34,12,442,23};
        System.out.println();
        cut(data);

        double data1[] = new double[]{8.0,9.9,9.0,8.9,9.2};
        double sum = 0;
        java.util.Arrays.sort(data1);
        for(int x = 1;x < data1.length;x++)
        {
            sum += data1[x];
        }
        System.out.println("平均分="+sum/(data.length-2));
    }

    private static void cut(int[] data)
    {
        int single[] = new int [data.length];
        int even[] = new int [data.length];
        int x = 0;
        int z = 0;
        for(int y = 0;y < data.length;y++)
        {
            if(data[y]%2==0)
            {
                single[x] = data[y];
                x++;
            }
            else
            {
                even[z] = data[y];
                z++;

            }

            java.util.Arrays.sort(single);
            for(int a = x;a <single.length;a++)
            {
                System.out.println(single[a]+" ");
            }
            System.out.println();
            java.util.Arrays.sort(even);
            for(int b = z;b < even.length;b++)
            {
                System.out.println(even[b]+" ");
            }
        }
    }
}