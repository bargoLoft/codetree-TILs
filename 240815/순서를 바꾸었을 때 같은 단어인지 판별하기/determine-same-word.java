import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(br.readLine());
        
        char[] s1 = br.readLine().toCharArray();
        char[] s2 = br.readLine().toCharArray();

        Arrays.sort(s1);
        Arrays.sort(s2);

        boolean YesOrNo = true;

        if(s1.length != s2.length){
            YesOrNo = false;
        } else{
            for(int i=0;i<s1.length;i++){
                if(s1[i]!= s2[i]){
                    YesOrNo = false;
                    break;
                }
            }
        }

        System.out.print(YesOrNo ? "Yes" : "No");
        
    }
}