import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(targetNamespace = "test")
public class max {

    @WebMethod
    public int getMAx(int a,int b) {
        return a>b?a:b;
    }
}
