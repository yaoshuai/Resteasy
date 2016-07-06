package org.jboss.resteasy.client.exception;

/**
 * @author <a href="ron.sigal@jboss.com">Ron Sigal</a>
 * @version $Revision: 1.1 $
 *
 * Copyright Jul 28, 2012
 * 
 * @deprecated The JAX-RS 2.0 client proxy framework in resteasy-client module
 *             does not use org.jboss.resteasy.client.exception.mapper.ClientExceptionMapper. 
 */
@Deprecated
public class ResteasyConnectionPoolTimeoutException extends ResteasyConnectTimeoutException
{
	private static final long serialVersionUID = -5711578608757689465L;
	
	public ResteasyConnectionPoolTimeoutException()
	{
	}

	public ResteasyConnectionPoolTimeoutException(String message)
	{
		super(message);
    }
	
    public ResteasyConnectionPoolTimeoutException(String message, Throwable cause)
    {
        super(message, cause);
    }
    
    public ResteasyConnectionPoolTimeoutException(Throwable cause)
    {
        super(cause);
    }
}
