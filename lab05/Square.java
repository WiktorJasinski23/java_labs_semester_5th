/**
* @class Square
* @brief klasa  reprezentujaca Kwadrat, dziedziczy po klasie Point
*/

public class Square extends Point{

    protected double m_side;
     /**
    * @fn Square - konstruktor klasy Square
    * @param x - wspolrzeda x rogu
    * @param y - wspolrzedna y rogu
    * @param side - dlugosc boku 
     */
    Square(double side, double x, double y){
        super(x,y);
        m_side = side;
    }

     /**
    * @fn getName - metoda zwracajaca nazwe klasy
    */
    public String getName(){
        return "Square";
    }
    /**
    * @fn toString - metoda wypisujaca klase w posob przez nas zdefiniowany
    */
    public String toString(){
        return "Corner = " + super.toString()+"; side = " + m_side;
    }

    /**
    * @fn area - metoda liczaca pole kwadratu
    8 @return - zwraca pomnozone prze siebie boki
    */
    public double area(){
        return m_side * m_side;
    }

}