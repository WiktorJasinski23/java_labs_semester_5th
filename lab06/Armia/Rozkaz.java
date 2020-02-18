package Armia;
/**
* @class Rozkaz
* @brief klasa reprezentujaca rozkaz znajdujaca sie w pakiecie Armia
 */

public class Rozkaz implements RozkazInterface{
    private String m_rozkaz;

    /**
    * @fn konstruktor klasy Rozkaz
    * @param String - przyjmuje parametr typu string
    * @brief - zapisuje przyjety parametr do rozkazu w klasie
     */
    public Rozkaz(String rozkaz){
        m_rozkaz = rozkaz;
    }

    /**
    *@fn getRozkaz() - metoda zwracajaca rozkaz znajdujacy sie w obiekcie Rozkaz
     */
    public String getRozkaz(){
        return m_rozkaz;
    }
}