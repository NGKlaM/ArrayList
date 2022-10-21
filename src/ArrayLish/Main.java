package ArrayLish;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<HocSinh> hocSinh = new ArrayList<HocSinh>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong SV can nhap : ");
        int so = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < so; i++) {
            System.out.println("nhap thong tin sinh vien " + (i + 1));
            System.out.println("nhap ten SV : " + (i + 1));
            String name = sc.nextLine();
            System.out.println("nhap dien SV : " + (i + 1));
            float diem = Float.parseFloat(sc.nextLine());
            HocSinh hs = new HocSinh(name, diem);
            hocSinh.add(hs);
        }

        System.out.println("In thông tin sinh viên");
        for (int i = 0; i < hocSinh.size(); i++) {
            hocSinh.get(i).inthongtinSV();
        }
    }
}
