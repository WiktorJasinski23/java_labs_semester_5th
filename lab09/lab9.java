import java.io.*;
import java.util.*;
import java.lang.Math.*;

public class lab9{
    public static void main(String args[]) throws Exception{
        Scanner in = new Scanner(new File(args[0]));
        String[] param;
        int width, height;
        String name;
        int idx;
        int[][] punkty;
        param = in.nextLine().split(" ");

        
        width = Integer.parseInt(param[0]);
        height = Integer.parseInt(param[1]);
        name = param[2];

    idx = Integer.parseInt(in.nextLine());
    
    punkty = new int[idx][2];

    String[] tmp;
    String data = "";

    for(int i =0; i<idx; ++i){
        tmp = in.nextLine().split(",");
        punkty[i][0] = Integer.parseInt(tmp[0]);
        punkty[i][1] = Integer.parseInt(tmp[1]);
    }
 
    boolean check = false;
    FileWriter fw = new FileWriter(name);
    fw.write("P3\n#Wiktor Jasiński\n" + width + " "+ height +"\n"+"255"+"\n");
    for(int i = 0; i <width; ++i){
        for(int j =0; j<height; ++j){
            check = false;
            for(int k = 0; k < idx; ++k){
                if(i == punkty[k][0] && j == punkty[k][1]){
                    fw.write("0 0 0 ");
                    check = true;
                }
                
            }
            if(check == false)
                fw.write("255 255 255 ");
        }
    }
    fw.close();

    //252 	3 	0
    //  for(int i =0; i<idx; ++i){
        
    //     System.out.println(punkty[i][0]);
    //     System.out.println(punkty[i][1]);
   
    // }
   
    }

}
