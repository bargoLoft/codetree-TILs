import java.io.*;
import java.util.*;

public class Main {

    static class SecretAgent{
        String secretCode;
        String meetingPoint;
        int time;

        public void Print(){
            System.out.printf("secret code : %s\n", secretCode);
            System.out.printf("meeting point : %s\n", meetingPoint);
            System.out.printf("time : %d\n", time);
        }
    }


    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        SecretAgent WillSmith = new SecretAgent();

        WillSmith.secretCode = st.nextToken();
        WillSmith.meetingPoint = st.nextToken();
        WillSmith.time = Integer.parseInt(st.nextToken());

        WillSmith.Print();
    }
}