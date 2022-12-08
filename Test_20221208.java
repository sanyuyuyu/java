
System.arraycopy(arr1,0,arr2,0,m);
class Test_20221208
{
    public static void main(String[] args)
    {
            // int[] arr1 = {11,22,33,44,55};
            // int[] arr2 = {1,2,3,4,5,6,7};
            // System.out.println("替换后的arr1"+arraycopy(arr1,2,arr2,4,3));
    //     int[] arr1 ={1,2,3,4,5};
    //    //arrayCopy(arr1, 3, arr1, 2, 2);
    //     System.out.println(arrayCopy(arr1, 3, arr1, 2, 2));

            int[] arr1 = {11,22,33,44,55};
            int[] arr2 = {1,2,3,4,5,6,7};
            System.arraycopy(arr1,2,arr1,2,3);
            System.out.println(Arrays.toString(arr2));
    }
}
