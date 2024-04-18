package com_Tyss_Fiducia_GenericUtility;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.mysql.cj.jdbc.Driver;
public class DatabaseUtility {
   Connection con=null;
	public void connectionDB() throws SQLException {
		 //step1-Register database
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		//step2-get connection for database
	  con = DriverManager.getConnection(IPathConstant.DBURL,IPathConstant.DBusername,IPathConstant.DBpassword);
	}
		//step3-create statement
	public void executeAndGetData(String query,int colIndex,String expData) throws SQLException {
	 Statement state = con.createStatement();
		//step4-Execute Query/Update Query
	 ResultSet result = state.executeQuery(query);
	 boolean flag=false;
	 while(result.next()) {
		 String actual = result.getString(colIndex);
		 if(actual.contains(expData)) {
			 flag=true;
			 break;
		 }
	 }
if(flag==true) {
	System.out.println("data ispresent");
}
else {
	System.out.println("data is not present");
}
	} 
		//step5-Close DB connection
	public void dataBaseClose() throws SQLException {
	con.close();
}
}

