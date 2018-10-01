package handy;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class UserData {
	DbManager db = new DbManager();
	Connection con = db.getConnection();
	
	
	public User getUserInfo(int id) throws Exception{
	try {
    User user = new User();	
	PreparedStatement statement = con.prepareStatement("SELECT * FROM users WHERE id like " + id);
	ResultSet result = statement.executeQuery();
	while(result.next()) {
	user.setID(result.getInt("id"));
	user.setFirstName(result.getString("firstname"));
	user.setLastName(result.getString("lastname"));
	user.setEMail(result.getString("email"));
	user.setPassword(result.getString("password"));
	user.setAccountType(result.getString("accountype"));
	}
	return user;
	}catch(Exception e) {System.out.println(e);}
	return null;
}
	
	
	public boolean insertUser(User user) throws Exception{
		try {
PreparedStatement qry = con.prepareStatement("INSERT INTO users (firstname , lastname, email, password, accountype) "
+ "VALUES ('" + user.getFirstName() + "','" + user.getLastName() +  "','" + user.getEmail() + "','" + user.getPassword() + "','" + user.getAccountType() +   "') ");
		qry.executeUpdate();
		System.out.println("Inserted");
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
		return true;
	}
}

