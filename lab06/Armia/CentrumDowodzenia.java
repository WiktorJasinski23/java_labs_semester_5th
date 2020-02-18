package Armia;
import java.util.Vector;

/**
* @class CentrumDowodzenia
* @brief klasa reprezentujaca centrum dowodzenia znajdujaca sie w pakiecie Armia
 */
public class CentrumDowodzenia implements CentrumDowodzeniaInteface{

    private Vector<Czolg> m_czolgi;

    /**
    * @fn konstruktor domyslny  klasy CentrumDowodzenia
    * @brief - konstruktor tworzy wektor skladnikow klasy Czolg
     */
    public CentrumDowodzenia(){
        m_czolgi = new Vector<Czolg>();
    }

    /**
    *@fn zarejestrujCzolg() 
    *@brief - metoda dodajaca nowy element typu Czolg do wektora m_czolgi
     */
    public void zarejestrujCzolg(Czolg czolg){
        m_czolgi.add(czolg);
    }

    /**
    *@fn wydajRozkaz() 
    *@brief - metoda dodajaca rozkaz do czolgu znajdujacego sie w wektorze m_czolgi
    *@param String numer czolgu wyslany w postaci stringa
    *@param Rozkaz - rozkaz ktory ma byc przekazany do czolgu
     */
    public void wydajRozkaz(String numerCzolgu, Rozkaz rozkaz){
       m_czolgi.get(Integer.parseInt(numerCzolgu) - 1).setRozkaz(rozkaz);
    }

    /**
    *@fn toSting() 
    *@brief - metoda pozwalajaca wypisac obiekt klasy CentrumDowodzenia przy pomocy Standardowego wyjscia
     */
    public String toString(){
        String str = "Do tej pory centrum dowodzenia wyslalo nastepujace rozkazy:\n";
        for(int i = 0; i <= m_czolgi.size()-1; ++i){
            str = str + "Czolg nr " + (i+1) + " otrzymal rozkazy: \n" + m_czolgi.get(i).getRozkazy() + "\n";
        }
        return str;
    }
}
