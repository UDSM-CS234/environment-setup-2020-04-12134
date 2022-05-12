public class position {
    double acceleration; double time; double velocity; double position;
    // constructor
    public  position(double a, double t, double vi, double xi){
        acceleration = a;   time = t; velocity = vi; position = xi;
    }
    double pos(){
        return  0.5*acceleration*time*time + velocity*time + position;
    }
}
class testposition{
    public  static void main(String[] args){
        position p = new position(-9.81, 10, 0, 0);
        double g;
       g =  p.pos();
       System.out.printf("x(t) = %.2fm/s2",g);

    }
}