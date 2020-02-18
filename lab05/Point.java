/**
* @class Point
* @brief klasa  reprezentujaca punkt, dziedziczy po klasie Shape
*/
public class Point extends Shape{
   
    protected double m_x;
    protected double m_y;

    /**
    * @fn Point - konstruktor klasy Point
    * @param x - wspolrzeda x punktu
    * @param y - wspolrzedna y punktu 
     */
    Point(double x, double y){
        m_x = x;
        m_y = y;
    }
    /**
    * @fn getName - metoda zwracajaca nazwe klasy
    */
    public String getName(){
        return "Point";
    }

     /**
    * @fn toString - metoda wypisujaca klase w posob przez nas zdefiniowany
    */
    public String toString(){
        return "[" + m_x +", " + m_y + "]";
    }

}