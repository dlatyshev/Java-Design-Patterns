package org.dmytroqa.state;

public interface Connection {

    void open();
    void close();
    void log();
    void update();

}
