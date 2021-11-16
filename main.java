import javax.xml.ws.Endpoint;

public class main {
    public static void main(String[] args) {
        Endpoint.publish("http://127.0.0.1:8088/max", new max());
        System.out.println("发布max函数成功...");
    }
}
