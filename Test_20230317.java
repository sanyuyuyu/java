/*
class Test_20230317
{
    public static void main(String[] args)
    {

    }

    public int[] twoSum(int[] nums,int target)
    {
        int n = nums.length;
        for(int i = 0;i < n; ++i)
        {
            for(int j = i + 1; j < n; ++j)
            {
                if(nums[i] + nums[j] == target)
                {
                    return new int[]{i,j};
                }
            }
        }
        return new int[0];
    }
}*/

class Test_202303017
{
    public static void main(String[] args)
    {

    }

    public int[] countPoints(int[][] points,int[][] queries)
    {
        int m = points.length, n = points.length;
        int[] ans = new int[n];
        for(int i = 0; i < n; ++i)
        {
            int cx = queries[i][0],cy = queries[i][1], cr = queries[i][2];
            
            for(int j = 0; j < m; ++j)
            {
                int px = points[j][0], py = points[j][1];

                if((cx - px) * (cx - px) + (cy - py) * (cy - py) <= cr * cr)
                {
                    ++ans[i];
                }
            }
        }
        return ans;
    }
}