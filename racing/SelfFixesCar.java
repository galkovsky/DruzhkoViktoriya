
public class SelfFixesCar extends Car {

    public SelfFixesCar(String name) {
        super(name);
    }

    public void move() {
        if (!broken) {
            if ((Math.random() * 100) > 60) {
                position += speed + n2o;
            } else {
                position += speed;
            }
            if ((Math.random() * 100) > 95) {
                broken=true;
                System.out.println(name+ " is broken!");
            }
        }
        else {
            broken=false;
            System.out.println(name+ " is not broken!");
        }

    }


}
