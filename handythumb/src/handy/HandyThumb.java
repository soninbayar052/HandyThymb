package handy;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.annotation.security.RolesAllowed;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;


@RolesAllowed("ADMIN")
@Path("/users")
public class HandyThumb {

	
@POST
@Path("/add")
@Consumes(MediaType.APPLICATION_JSON)
public Response getUserInfo(User userinfo) throws Exception {
	UserData userdata = new UserData();
	userdata.insertUser(userinfo);
	return Response.status(200).entity("inserted").build();
}


@GET
@Path("{idnumber}")
@Produces(MediaType.APPLICATION_JSON) 
public User getJson(@PathParam("idnumber") int idnumber) throws Exception {
UserData userdata = new UserData();	
return userdata.getUserInfo(idnumber);
}


   
}
