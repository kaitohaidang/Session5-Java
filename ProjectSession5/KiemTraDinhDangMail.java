import java.util.Scanner;
import java.util.regex.Pattern;

public class KiemTraDinhDangMail {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();
        String cleanedEmail= s.trim();
        String regexPattern = "^[a-zA-Z0-9._]+@[a-zA-Z0-9.]+\\.[a-zA-Z]{2,6}$";
        if (cleanedEmail.matches(regexPattern))
            System.out.println("Email Hop Le");
        else System.out.println("Email khong hop le");
    }
}