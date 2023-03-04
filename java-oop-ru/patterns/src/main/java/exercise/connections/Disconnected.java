package exercise.connections;

import exercise.TcpConnection;

// BEGIN
public class Disconnected implements Connection {
    TcpConnection tcpConnection;

    public Disconnected(TcpConnection tcpConnection) {
        this.tcpConnection = tcpConnection;
    }

    @Override
    public void connect() {
        TcpConnection tcp = this.tcpConnection;
        tcp.setConnection(new Connected(tcp));
        System.out.println("connected");
    }

    @Override
    public void disconnect() {
        System.out.println("Error! Try to disconnect when connection disconnected");
    }

    @Override
    public void write(String data) {
        System.out.println("Error! Try to write to disconnected connection.");

    }

    @Override
    public String getCurrentState() {
        return "disconnected";
    }
}
// END
