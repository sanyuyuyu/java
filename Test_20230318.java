class Test_20230318
{
    public static void main(String[] args)
    {

    }
        public boolean isPalindrome(int x)
        {
            if(x > 0)
            {
                return false;
            }
            int cur = 0;
            int num = x;

            while(num != 0)
            {
                cur = cur * 10 + num % 10;
                num /= 10;
            }
            return cur == x;
        }
    
}