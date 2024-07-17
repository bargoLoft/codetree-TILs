import java.io.*;
import java.util.*;

public class Main {

    public static int gcd(int a,int b){
        if(b == 0){
            return a;
        } 
        return gcd(b, a% b);
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int lcm = lcm(n, m);

        // 결과 출력
        System.out.println(lcm);

    }
}