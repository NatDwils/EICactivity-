public class Circle extends Shape{
    public double calculateArea(){
    double area = Math.PI * Math.pow(getValue(), 2);
    return area;
}
}