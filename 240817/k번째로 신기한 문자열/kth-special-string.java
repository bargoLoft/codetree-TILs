import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        String T = st.nextToken();

        String[] arr = new String[n];

        for(int i=0;i<n;i++){
            arr[i] = br.readLine();
        }

        Arrays.sort(arr);
        int cnt = 0;

        for(String s : arr){
            if(s.startsWith(T)){
                cnt++;
            }
            if(cnt == k){
                System.out.print(s);
                break;
            }
        }
    }
}