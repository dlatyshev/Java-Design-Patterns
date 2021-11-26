package org.dmytroqa.state;

public class Sales implements Connection {

    @Override
    public void open() {
        System.out.print("Open database for sales");
    }

    @Override
    public void close() {
        System.out.println("Close the database");
    }

    @Override
    public void log() {
        System.out.println("logging activities");
    }

    @Override
    public void update() {
        System.out.println("Sales has been updated");
    }
}
