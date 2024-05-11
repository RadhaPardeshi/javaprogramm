package exception;

public class OutOfServiceException extends Exception {
	
	OutOfServiceException (String reason)
	{
		super(reason);
	}

}
