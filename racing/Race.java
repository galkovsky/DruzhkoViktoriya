
public class Race {
    Car[] cars;
    int length;

    public Race(int length, Car[] cars) {
        this.length = length;
        this.cars = cars;
    }

    public void start(int pos) {
        int kol=0;
        for (int i = pos; i < cars.length; i++){
            if ((! (cars[i]instanceof SelfFixesCar)) && (cars[i].broken)) {
             kol++;
            }
        }

        if (pos >= cars.length ) {
            for (int i = 0; i < cars.length; i++) {
                System.out.println((i + 1) + ": " + cars[i]);
            }
            return;
        } else {

            for (int i = pos; i < cars.length; i++) {    //двигаем все машины
                cars[i].move();
                System.out.println(cars[i]);
            }
            System.out.println("///////////////////////////////////");
            for (int i = pos; i < cars.length; i++) {    //сортируем по дальности
                for (int j = pos; j < cars.length - 1; j++) {
                    if (cars[j].position < cars[j + 1].position) {
                        Car c = cars[j];
                        cars[j] = cars[j + 1];
                        cars[j + 1] = c;
                    }
                }
            }


            //boolean t = false;
            for (int i = pos; i < cars.length; i++) {  // проверяем кто выехал за финиш
                if (cars[i].position >= length) {
                    pos++;
                    //t = true;
                } else {
                    break;
                }
            }

            if (pos+kol==cars.length) {
                pos=cars.length;
            }
            start(pos);



        }
    }

}