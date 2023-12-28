public class Singelton {

    public static void main(String[] args) {
        
       DatabaseConnection databaseConnection = DatabaseConnection.getInstance();
       databaseConnection.connect();

       DatabaseConnection databaseConnection_2 = DatabaseConnection.getInstance();
       databaseConnection_2.connect();


       DatabaseConnection databaseConnection_3 = DatabaseConnection.getInstance();
       databaseConnection_3.connect();


         DatabaseConnection databaseConnection_4 =  DatabaseConnection.getInstance();
          databaseConnection_4.connect();

    }

}