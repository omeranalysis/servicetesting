package furqan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import com.ctc.wstx.io.BufferRecycler;

public class WebServiceTesting {

public static void main(String[] args) throws IOException
{

Scanner sc=new Scanner(System.in);
System.out.println("Enter the Paramert : ");
String param=sc.nextLine();
System.out.println("Enter the Default value : ");
String def=sc.nextLine();

URL u=new URL("https://api.nasa.gov/planetary/sounds?q="+param+"&api_key="+def);

HttpURLConnection con=(HttpURLConnection)u.openConnection();

InputStreamReader ir=new InputStreamReader(con.getInputStream());

BufferedReader br=new BufferedReader(ir);

String z;

while((z=br.readLine())!=null)
{
System.out.println(z);

}

con.disconnect();

}

}