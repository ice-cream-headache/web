package test;

public class test {

    public static void main(String[] args) {
        MaxService factory = new MaxService();
        Max servicePort = factory.getMaxPort();
        int max = servicePort.getMAx(10,20);
        System.out.println(max);
    }

}
