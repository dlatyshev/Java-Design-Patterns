package org.dmytroqa.state;

public class Controller implements Connection {

   public static Accounting accounting;
   public static Sales sales;
   public static Management management;

   private static Connection connection;

   public Controller() {
       accounting = new Accounting();
       sales = new Sales();
       management = new Management();
   }

   public void setAccountingConnection() {
       connection = accounting;
   }

   public void setSalesConnection() {
       connection = sales;
   }

   public void setManagementConnection() {
       connection = management;
   }

    @Override
    public void open() {
        connection.open();
    }

    @Override
    public void close() {
        connection.close();
    }

    @Override
    public void log() {
        connection.log();
    }

    @Override
    public void update() {
        connection.update();
    }
}
