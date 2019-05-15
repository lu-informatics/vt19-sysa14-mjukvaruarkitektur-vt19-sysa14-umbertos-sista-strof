package ErrorHandling;

import javax.ejb.EJBTransactionRolledbackException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class ErrorHandling implements ExceptionMapper<EJBTransactionRolledbackException>{

	@Override
	public Response toResponse(EJBTransactionRolledbackException exception) {
		return Response.status(Status.NOT_FOUND).entity("Error: "+exception.getMessage()).build();
	}

}
