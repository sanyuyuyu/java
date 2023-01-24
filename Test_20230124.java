/*class Test_20230124
{
    public static void main(String[] args) throws Exception
    {
        public String message;
            public Throwable caause;
        Exception origin = null;
        try
        {
            System.out.println(Integer.parseInt("abc"));
        }
        catch(Exception e)
        {
            origin = e;
            throw e;
        }
        finally
        {
            Exception e = new IllegalArgumentException();
            if(origin != null)
            {
                e.addSuppressed(origin);
            }
            throw e;
            
        }
    }
}

public class BaseException extends Test_20230124
 {
    public BaseException()
    {
        super();
    }

    public BaseException(String message, Throwable cause)
    {
        super(message, cause);
    }

    public BaseException(String message) 
    {
        super(message);
    }

    public BaseException(Throwable cause) 
    {
        super(cause);
    }
}
class UserNotFoundException extends BaseException
{
    public UserNotFoundException(String message) 
    {
        super(message);    
    }
}

 class LoginFailedException extends BaseException
 {
    public LoginFailedException(String message) 
    {
        super(message);   
    }
}*/
class Test_20230124

{
    public static void main(String[] args)
    {


    }
}
public class LoginFailedException extends Test_20230124
{

        private static final long serialVersionUID = -6394420745836257820L;

        private static final String loginFailedException = "LoginFailedException";

public LoginFailedException() 
{

        this(loginFailedException);

}

public LoginFailedException(String string) 
{

        super(string);

}

}

public class UserNotFoundException extends Test_20230124
 {


        private static final long serialVersionUID = 6027056797426145875L;

        private static final String userNotFoundException = "UserNotFoundException";

public UserNotFoundException()
 {

        this(userNotFoundException);

}

public UserNotFoundException(String string) 
{


        super(string);

}

}