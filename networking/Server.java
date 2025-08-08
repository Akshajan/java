import java.net.*;
import java.io.*;
public class Server{
    public static void main(String[] args) throws Exception{
        ServerSocket s=new ServerSocket(1234);
        Socket c=s.accept();
        System.out.println("CLIENT CONNECTED");
        BufferedReader in=new BufferedReader(new InputStreamReader(c.getInputStream())); //getting input messages from client
        PrintWriter out=new PrintWriter(c.getOutputStream(),true);
        new Thread(()->{
            try{
            String m;
            while (true){
                m=in.readLine();
                if (m==null) break;
                System.out.println("CLIENT: "+m);
            }}
            catch(IOException e){}
        }).start();
         BufferedReader userIn=new BufferedReader(new InputStreamReader(System.in));//getting messages entered by server to buffered reader
         String msg;
         while((msg=userIn.readLine())!=null)
         out.println(msg);//sending messages from server to client
          }
}
