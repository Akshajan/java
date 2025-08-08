import java.net.*;
import java.io.*;
public class Client{
    public static void main(String[] args) throws Exception{
        Socket s=new Socket("localhost",1234);
        System.out.println("SERVER CONNECTED");
        
        BufferedReader in=new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter out=new PrintWriter(s.getOutputStream(),true);
        new Thread(()->{
            try{
            String m;
            while (true){
                m=in.readLine();
                if (m==null) break;
                System.out.println("SERVER: "+m);
            }}
            catch(IOException e){}
        }).start();
         BufferedReader userIn=new BufferedReader(new InputStreamReader(System.in));
         String msg;
         while((msg=userIn.readLine())!=null)
         out.println(msg);
          }
}
