package Armia;
import java.util.Vector;

/**
* @class Czolg
* @brief klasa reprezentujaca czolg znajdujaca sie w pakiecie Armia
 */

public class Czolg implements CzolgInterface{
    private Vector<Rozkaz> m_rozkazy;

    /**
    * @fn konstruktor domyslny  klasy Czolg
    * @brief - konstruktor tworzy wektor skladnikow klasy Rozkaz
     */
    public Czolg(){
        m_rozkazy = new Vector<Rozkaz>();
    }

    /**
    *@fn ostatniRozkaz()
    *@brief  - metoda zwracajaca ostatni rozkaz znajdujacy sie w otablicy rozkazow
     */
    public String ostatniRozkaz(){
        return "Ostatni rozkaz do mnie: " + m_rozkazy.get(m_rozkazy.size()-1).getRozkaz();
    }

    /**
    *@fn setRozkaz() 
    *@brief - metoda dodajaca nowy element typu Rozkaz do wektora m_rozkazy
     */
    public void setRozkaz(Rozkaz rozkaz){
        m_rozkazy.add(rozkaz);
    }

    /**
    *@fn setRozkaz() 
    *@brief - metoda zwracajaca wszystkie rozkazy znajdujace sie w otablicy rozkazow
     */
    public String getRozkazy(){
        String str = "";
        for(int i = 0; i <= m_rozkazy.size()-1; ++i)
            str = str + m_rozkazy.get(i).getRozkaz() + "\n";
        return str;
    }
}