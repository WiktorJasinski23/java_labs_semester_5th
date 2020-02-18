import java.util.Scanner;

public class lab02{

    public static int findFirstOne(int[] array){
        boolean firstOne = false;
        int temp = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] == 1){
                firstOne = true;
            }
            if(array[i] == 0 && firstOne == true){
                temp++;
            }
        }

        return temp;
    }

     public static int[] makeNewArray(int[] array , int x){
         boolean firstOne = false;
         int temp = 0;
         int[]newArray = new int[array.length - x];
         
        for(int i = 0 ; i < array.length ; i++){
            if(array[i] == 1){
                firstOne = true;
            }


            if(array[i] == 0 && firstOne == true){
                
            } 
            else {
                newArray[temp] = array[i];
                temp++;
            }
        }

        return newArray;
     }

     public static int returnOnePosition(int[] array){
         for(int i = 0 ; i < array.length ; i++){
            if(array[i] == 1){
                return i;
            }
        }
        return array.length;
     }



    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        int y = in.nextInt();

        int[] arrayx = new int[x];
        int[] arrayy = new int[y];

        for(int i = 0 ; i < x ; i++){
            arrayx[i] = in.nextInt();
        }

        for(int i = 0 ; i < y ; i++){
            arrayy[i] = in.nextInt();
        }

        int x2 = findFirstOne(arrayx);
        int y2 = findFirstOne(arrayy);

        int[] arrayx2 = new int[x-x2];
        int[] arrayy2 = new int[y-y2];

        arrayx2 = makeNewArray(arrayx, x2);
        arrayy2 = makeNewArray(arrayy, y2);

        int zeroLength, oneLength;

        if(returnOnePosition(arrayx2) + 1 < returnOnePosition(arrayy2) + 1){
            zeroLength = returnOnePosition(arrayx2) + 1;
        }
        else{
            zeroLength = returnOnePosition(arrayy2) + 1;
        }

        if(arrayx2.length - (returnOnePosition(arrayx2) + 1) < arrayy2.length - (returnOnePosition(arrayy2) + 1)){
            oneLength = arrayx2.length -  (returnOnePosition(arrayx2) + 1);
        }
        else{
            oneLength = arrayy2.length - (returnOnePosition(arrayy2) + 1);
        }

        int length = oneLength + zeroLength;

        System.out.println("Dlugosc ciagu wynosi: " + length);

    }
}