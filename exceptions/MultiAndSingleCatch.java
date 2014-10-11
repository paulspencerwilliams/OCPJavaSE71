import java.sql.SQLException;
import java.sql.Connection;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MultiAndSingleCatch {
  void myMethod(Connection con, String fileName) {
    try {

    }
    catch (IOException | SQLException e) {}                       
    catch (FileNotFoundException e) {}                            
  } }
