public class GenericVariableTypeToRethrowException {
  public static void main(String args[])
    throws java.io.IOException, java.sql.SQLException { String source = "DBMS";
      try {
        if (source.equals("DBMS"))
          throw new java.sql.SQLException();
        else
          throw new java.io.IOException();
      }
      catch (Exception e) { 
        throw e;  }
    } }
