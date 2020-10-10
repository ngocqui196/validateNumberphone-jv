import java.util.Scanner;
import java.util.regex.Pattern;

public class MainTestNumberPhone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số điện thoại như mẫu sau: ");
        System.out.println("Ví dụ: (84)-(0978489648)");
        String num = sc.nextLine();

        Pattern pattern = Pattern.compile("[(][0-9]{2}[)]-[(0]{2}[0-9]{9}[)]$");
//        Matcher matcher = pattern.matcher(className);
        System.out.println("Tên số điện thoại " + num + ": " + pattern.matcher(num).matches());
    }
}
