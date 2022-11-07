package hm2;

public class Circle {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle() {

    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double Length(){
        return 2 * Math.PI * radius;
    }

    public double Surface(){
        return Math.PI * radius * radius;
    }

    public void Compare(double c1, double c2){
        if (c1 < c2) {
            System.out.println("Вторая окружность больше первой");
        }
        else if (c1 == c2) {
            System.out.println("Окружности равны");
        }
        else {
            System.out.println("Первая окружность больше второй");
        }
    }
}