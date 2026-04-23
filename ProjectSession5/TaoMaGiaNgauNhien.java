import java.util.Random;
import java.util.Scanner;

public class TaoMaGiaNgauNhien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int n = sc.nextInt();
        String charSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int x = random.nextInt(charSet.length());
            char c = charSet.charAt(x);
            result.append(c);
        }
        System.out.println("Chuỗi ngẫu nhiên tạo ra là: " + result.toString());

    }
}
