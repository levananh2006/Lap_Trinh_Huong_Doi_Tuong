import java.util.Scanner;

public class ViDu1 {
    // Phương thức tĩnh để thực hiện các phép tính
    public static void thucHienPhepTinh(int a, int b) {
        System.out.println("Tong = " + (a + b));
        System.out.println("Hieu = " + (a - b));
        System.out.println("Tich = " + (a * b));

        if (b != 0) {
            System.out.println("Thuong = " + ((double) a / b));
        } else {
            System.out.println("Thuong = Khong the chia cho 0!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.print("Nhap so nguyen a: ");
        a = sc.nextInt();

        System.out.print("Nhap so nguyen b: ");
        b = sc.nextInt();

        thucHienPhepTinh(a, b);

        sc.close();
    }
}