import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test5 {
    public static void main(String[] args) {
        int a = 0, b = 1, n, num;
        String str;
        BufferedReader buf;
        buf = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("请输入一个正整数: ");
            str = buf.readLine();
            num = Integer.parseInt(str);
        } catch (IOException e) {
            System.err.println("输入时发生错误，请确保输入正确并重试。");
            return; // 终止程序执行
        } catch (NumberFormatException e) {
            System.err.println("输入的不是一个有效的整数，请重试。");
            return; // 终止程序执行
        }

        while (b < num) {
            n = a + b;
            a = b;
            b = n;
        }

        if (num == b) {
            System.out.println(num + "是Fibonacci数");
        } else {
            System.out.println(num + "不是Fibonacci数");
        }
    }
}