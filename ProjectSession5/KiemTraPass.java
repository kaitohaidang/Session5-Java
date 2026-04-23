import java.util.Scanner;

public class KiemTraPass {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap pass can kiem tra :");
        String pass= sc.nextLine();
        String regex= "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%!]).{8,}$";
        if (pass.matches(regex))
        {
            System.out.println("Mat Khau Hop Le");

        }
        else  {
            System.out.println("Mat khau khong hop le");
        }
    }
}
