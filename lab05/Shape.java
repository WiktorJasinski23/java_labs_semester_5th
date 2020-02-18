/**
* @class Shape
* @brief klasa abstrakcyjna reprezentujaca ksztalt, klasa bazowa dla wszystkich figur badz bryl
*/


public abstract class Shape{
    /**
    * @fn getName - abstrakcyjna metoda
    */
    public abstract String getName();
     /**
    * @fn toString - abstrakcyjna metoda
    */
    public abstract String toString();

    /**
    * @fn area - metoda ktora dziedziczyc beda wszystkie klasy
    * @return domyslnie zwraca 0
    */
    public double area(){
        return 0.0;
    }
    /**
    * @fn area - metoda ktora dziedziczyc beda wszystkie klasy
    * @return domyslnie zwraca 0
    */
    public double volume(){
        return 0.0;
    }
}