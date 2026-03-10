package exercises;
interface Pay{
    void pay(double amount);
}
interface WxPay{
    void payWithWx(double amount);
}
class WxPayImpl implements WxPay{
    @Override
    public void payWithWx(double amount){
        System.out.println("微信支付："+amount);
    }
}
class Alipay implements Pay{
    @Override
    public void pay(double amount) {
        System.out.println("支付宝支付："+amount);
    }
}
class WxPayAdapter implements Pay{
    WxPay wxPay;
    public WxPayAdapter(WxPay wxPay){
        this.wxPay=wxPay;
    }
    @Override
    public void pay(double amount) {
        wxPay.payWithWx(amount);
    }
}
public class PayTest {
    public static void main(String[] args) {
        Pay alipay = new Alipay();
        alipay.pay(100.0);
        Pay wxPay=new WxPayAdapter(new WxPayImpl());
        wxPay.pay(200.0);
    }
}
