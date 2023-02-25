class Test_20230225
{
    public static void main(String[] args)
    {
        int code = processFile("C:\\test.txt");
        if (code == 0)
        {
            // ok:
        } 
        else
        {
            // error:
            switch (code) 
            {
            case 1:
                // file not found:
            case 2:
                // no read permission:
            default:
                // unknown error:
            }
        }
    }

    try 
    {
        String s = processFile(“C:\\test.txt”);
            // ok:
    } 
    catch (FileNotFoundException e)
    {
            // file not found:
    }
    catch (SecurityException e)
    {
            // no read permission:
    } 
    catch (IOException e)
    {
            // io error:
    } 
    catch (Exception e) 
    {
            // other error:
    }
}