package exercise.connections;

import exercise.TcpConnection;

import java.util.ArrayList;
import java.util.List;

// BEGIN
public class Connected implements Connection{
    TcpConnection tcpConnection;

    public Connected(TcpConnection tcpConnection) {
        this.tcpConnection = tcpConnection;
    }

    @Override
    public void connect() {
        System.out.println("Error! Try to connect when connection already established.");

    }

    @Override
    public void disconnect() {
        TcpConnection tcp = this.tcpConnection;
        tcp.setConnection(new Disconnected(tcp));
        System.out.println("disconnected");
    }

    @Override
    public void write(String data) {
        System.out.println(data + "added");
    }

    @Override
    public String getCurrentState() {
        return "connected";
    }
}
// END
