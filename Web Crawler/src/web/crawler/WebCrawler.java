/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web.crawler;

/*
* To change this template, choose Tools | Templates
* and open the template in the editor.
*/

 
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
 
/**
*
* @author vimal
*/
public class WebCrawler {
 
    /**
    * @param args the command line arguments
    */
    public static void main(String[] args)  {
        try {
            URL my_url = new URL("http://www.umsl.edu"
                    + "");
            BufferedReader br = new BufferedReader(new InputStreamReader(my_url.openStream()));
            String strTemp = "";
            while(null != (strTemp = br.readLine())){
            System.out.println(strTemp);
        }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}