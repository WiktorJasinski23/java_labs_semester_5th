public class lab3string{

    public static int dlugosc(String s){
        return s.length();
    }

    public static int ile_razy_literka_wystepuje(String s, char c){
        int ile = 0;
        char[] arr = s.toCharArray();
        for(int i =0; i < s.length(); ++i){
            
            if(arr[i] == c){
                ++ile;
            }
        }
        return ile;
    }

    public static boolean czy_takie_same(String s1, String s2){
        if(s2.equals(s1)){
            return true;
        }
        return false;
    }

    public static String wspak(String s){
       return new StringBuilder(s).reverse().toString();
    }

    public static boolean czy_plaindrom(String s){
        String s_reverse = new StringBuilder(s).reverse().toString();
        if(s.equals(s_reverse)){
            return true;
        }
        else
            return false;
    }

    public static boolean czy_abecadlowe(String s){
        char[] arr = s.toCharArray();
        char prev = arr[0];
        for(int i = 1; i < s.length(); ++i){
            if(arr[i] < prev){
                return false;
            }
            prev = arr[i];
        }
        return true;
    }

    public static String rot13(String s){
    char[] arr = s.toCharArray();
        for(int i = 0; i < s.length(); ++i){
            if(arr[i] >= 'a' && arr[i] <= 'z'){
                if(arr[i]+13 <= 'z'){
                    arr[i] = (char) (arr[i]+13);
                }
                else{
                    arr[i] = (char) (((arr[i] + 13) % 'z') + 'a' - 1);
                }
            }
            if(arr[i] >= 'A' && arr[i] <= 'Z'){
                if(arr[i]+13 <= 'Z'){
                    arr[i] = (char) (arr[i]+13);
                }
                else{
                    arr[i] = (char) (((arr[i] + 13) % 'Z') + 'A' - 1);
                }
            }
        }
        return String.valueOf(arr);
    }
}