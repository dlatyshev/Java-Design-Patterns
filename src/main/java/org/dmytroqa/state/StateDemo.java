package org.dmytroqa.state;

import org.dmytroqa.state.*;

public class StateDemo {

    Controller controller;

    StateDemo(String con) throws Exception {
        controller = new Controller();
        switch (con) {
            case "management" -> controller.setManagementConnection();
            case "sales" -> controller.setSalesConnection();
            case "accounting" -> controller.setAccountingConnection();
            default -> throw new Exception("Invalid argument");
        }

        controller.open();
        controller.update();
        controller.log();
        controller.close();
    }

    public static void main(String[] args) throws Exception {
        new StateDemo(args[0]);
    }
}
