package exercise;
import exercise.connections.Connected;
import exercise.connections.Connection;
import exercise.connections.Disconnected;

import java.util.List;
import java.util.ArrayList;

// BEGIN
public class TcpConnection implements Connection {
    String adress;
    int port;
    Connection connection;

    public TcpConnection(String adress, int port) {
        this.adress = adress;
        this.port = port;
        this.connection = new Disconnected(this);
    }
    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public Connection getConnection() {
        return connection;
    }

    @Override
    public void connect() {
        this.connection.connect();

    }

    @Override
    public void disconnect() {
        this.connection.disconnect();

    }

    @Override
    public void write(String data) {
        this.connection.write(data);
    }

    @Override
    public String getCurrentState() {
        return this.connection.getCurrentState();
    }
}
// END
