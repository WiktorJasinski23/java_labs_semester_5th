import java.io.*;


public class lab8{
    public static void main(String args[]) throws Exception{
        try{
            if(args.length != 2)
                throw new Exception();
            BufferedReader in = new BufferedReader(new FileReader(args[0]));

            double suma = 0; 
            double avg = 0;
            double i = 0;
            String s;
            while( (s = in.readLine()) != null ){
                suma += Double.parseDouble(s);
                ++i;
            }
            if(i==0){
                throw new ArithmeticException();
            }
            avg = suma/i;

            if (Double.isInfinite(avg)){
                throw new RuntimeException();
            }


            FileWriter fw = new FileWriter(args[1]);
            fw.write(String.valueOf(avg));
            fw.close();

            
        }
        catch(ArithmeticException e){
            System.out.println("Dzielenie przez zero!");
        }
		catch (IOException e) {
			System.err.println("Blad z wczytaniem z pliku lub zapisem do pliku! Plik nie istnieje badz zostal usuniety");
		}
        catch(NumberFormatException e){
            System.out.println("Wprowadzono niepoprawna liczbe!");
        }
        catch(RuntimeException e){
            System.out.println("Wynik to nieskonczonosc - za duze liczby wprowadzone do programu");
        }
        catch(Throwable e){
            System.out.println("Zla ilosc argumentow wejsciowych! Musza byc 2!");
        }
    }
}
