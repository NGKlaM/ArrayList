package ArrayLish;

public class HocSinh {
    private String Tên;
    private String Điêm;

    public HocSinh(String tên, float điêm) {
        Tên = tên;
        Điêm = điêm;
    }

    public String getTên() {
        return Tên;
    }

    public void setTên(String tên) {
        Tên = tên;
    }

    public String getĐiêm() {
        return Điêm;
    }

    public void setĐiêm(String điêm) {
        Điêm = điêm;
    }
    public void inthongtinSV(){
        System.out.println("in thong tin sinh vien"+"Ten:"+this.getTên() + "Diêm :"+this.getĐiêm() );
    }
}
