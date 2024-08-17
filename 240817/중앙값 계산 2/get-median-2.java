import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());

        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
            int flag = i;
            while(flag > 0 && arr[flag-1]>arr[flag]){
                int tmp = arr[flag-1];
                arr[flag-1] = arr[flag];
                arr[flag] = tmp;
                flag--;
            }
            if(i%2 == 0){
                System.out.printf("%d ",arr[i/2]);
            }
        }
    }
}