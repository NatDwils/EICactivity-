public class Square extends Shape{
    public double calculateArea(){
        double area = Math.pow(getValue(), 2);
        return area;
    }
}