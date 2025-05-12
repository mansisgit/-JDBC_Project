//a. Insert the data from the database using JDBC
Program:
package Mysql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class SQLPreparedStatementInsert {
public static void main(String[] args) {
try{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection(
"jdbc:mysql://localhost:3306/test?characterEncoding=latin1","root","ro
ot");

PreparedStatement stmt = con.prepareStatement("insert into userinfo
values (?,?,?,?,?)");

stmt.setString(1,"user4");
stmt.setString(2,"pass4");
stmt.setString(3,"user4@gmail.com");
stmt.setString(4, "Nagpur");
stmt.setString(5, "60");
int i = stmt.executeUpdate();
System.out.println(i + "Records inserted..");
con.close();
}
catch(Exception e){
System.out.println(e);

}
}
}

//b. Rretrieve the data from the database using JDBC.
Program:
package Mysql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
public class SQLPreparedStatementSelect {
public static void main(String[] args) {
try{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection(
"jdbc:mysql://localhost:3306/test?characterEncoding=latin1","root","ro
ot");

PreparedStatement stmt = con.prepareStatement("select * from userinfo");
ResultSet rs = stmt.executeQuery();
while(rs.next())
{
System.out.println(rs.getString(1) + " " +
rs.getString(2) + " " + rs.getString(3) + " " +
rs.getString(4) + " ");
}
con.close();
}
catch(Exception e){

System.out.println(e);
}
}
}

//C. Update the data from the database using JDBC.
Program:
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
public class SQLPreparedStatementUpdate {
public static void main(String[] args) {
try{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection(
"jdbc:mysql://localhost:3306/test?characterEncoding=latin1","root","root");
PreparedStatement stmt = con.prepareStatement("update userinfo set city=? where username=?");
stmt.setString(1,"Chennai");
stmt.setString(2,"user7");
int i = stmt.executeUpdate();
System.out.println(i + "Records updated");
con.close();
}
catch(Exception e){
System.out.println(e);
}
}
}

//D. Delete the data from the database using JDBC.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
public class SQLPreparedStatementDelete {
public static void main(String[] args) {
try{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection(
"jdbc:mysql://localhost:3306/logininfo?characterEncoding=latin1","root","root");
PreparedStatement stmt = con.prepareStatement("delete from userinfo where username=?");
stmt.setString(1,"user2");
int i = stmt.executeUpdate();
System.out.println(i + "Records deleted");
con.close();
}
catch(Exception e){
System.out.println(e);
}
}
}
