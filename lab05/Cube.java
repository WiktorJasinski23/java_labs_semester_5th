/**
* @class Cube
* @brief klasa  reprezentujaca szescian, dziedziczy po klasie Square
*/

public class Cube extends Square{

    protected double m_depth;

     /**
    * @fn Cube - konstruktor klasy Cube
    * @param x - wspolrzeda x rogu
    * @param y - wspolrzedna y rogu
    * @param side - dlugosc boku 
     */
    Cube(double z, double x, double y){
        super(z,x,y);
        m_depth = z;
    }

    /**
    * @fn getName - metoda zwracajaca nazwe klasy
    */
    public String getName(){
        return "Cube";
    }

    /**
    * @fn toString - metoda wypisujaca klase w posob przez nas zdefiniowany
    */
    public String toString(){
        return super.toString()+"; depth = " + m_depth;
    }

    /**
    * @fn area - metoda liczaca pole szescianu
    8 @return - pole kwadratu z klasy po ktorej dziedziczy, pomnozone 6 razy
    */
    public double area(){
        return 6 * super.area();
    }

    /**
    * @fn area - metoda liczaca objetosc szescianu
    8 @return - pole kwadratu z klasy po ktorej dziedziczy, pomnozone razy wysokosc szescianu
    */
    public double volume(){
        return super.area() * m_depth;
    }

}