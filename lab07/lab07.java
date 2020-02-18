import java.util.Scanner;

public class lab07
{
    public static void main(String[] arg)
    {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int[][]tab = new int[m][n];


        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++) {
                tab[i][j] = in.nextInt();
            }
        }

        // for(int i = 0 ; i < m ; i++){
        //     System.out.print("[");
        //     for(int j = 0 ; j < n ; j++) {
        //         if(j <n-1)
        //             System.out.print(tab[i][j]+",");
        //         else
        //             System.out.print(tab[i][j]);
        //     }
        //     System.out.println("]");
        // }

        boolean[][] compare = new boolean[n][n];

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++) {
                if(i == j)
                    compare[i][j] = true;
                else
                    compare[i][j] = false;
            }
        }


        for(int i = 0 ; i < m ; ++i) {
            for (int j = 0; j < n / 2; ++j) {
                for (int k = 0; k < n / 2; ++k) {
                    int index1 = tab[i][k];
                    int index2 = tab[i][j+n/2];
                    
                    if(index2 <= index1)
                        compare[index1-1][index2-1] = true;
                    if(index1 <= index2)
                        compare[index2-1][index1-1] = true;
                }
            }
        }

        

        boolean check = true;

        for(int i = 0 ; i < n ; ++i){

            //System.out.print("[");
            for(int j = 0 ; j <= i ; ++j) {
                if(compare[i][j] == false)
                    check = false;
                // if(j <i)
                //     System.out.print(compare[i][j]+",");
                // else
                //     System.out.print(compare[i][j]);
            }
            //System.out.println("]");
        }

        System.out.println();

        if(check == true)
            System.out.println("TAK");
        if(check == false)
            System.out.println("NIE");
    }
}

