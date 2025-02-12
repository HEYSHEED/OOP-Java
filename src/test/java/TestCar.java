import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCar {

    @Test
    void CarMovesWhenIsOn() {

        //Given
        Car hondaCivic = new Car("Honda Civic");
        Car toyota = new Car("Toyota");
        //When
        boolean movement = hondaCivic.isCarMoving();
        toyota.car_on();
        boolean moving = toyota.isCarMoving();
        //Then
        Assertions.assertFalse(movement);
        Assertions.assertFalse(moving);
    }
       // Car car = new Car();
//        car.setCar_off();
//        System.out.println("Car is ON?"+  car.car_is_off);
//        car.carMoves();
//
//        Car hondaCivic = new Car("Honda Civic");
//        hondaCivic.car_on();
//        hondaCivic.carMoves();
//
//    }

    class Car{
        //Data
        boolean car_is_on;
        boolean car_is_off;//false
        boolean door_open;
        boolean door_close;//false
        String brand;

        Car(){
            System.out.println("Constructor");
        }
        Car(String brand){
            this.brand= brand;
            System.out.println("This is" + brand);

        }

        //Function
        void car_on(){
            boolean car_is_on = true;
            System.out.println("Car is ON");
        }
        void setCar_off(){
            boolean car_is_off = true;
            System.out.println("Car is OFF");
        }
        void door_is_open(){
            boolean door_open = true;
            System.out.println("Car's door is OPEN");
        }
        void door_is_close(){
            boolean door_close = true;
            System.out.println("Car's door is close");
        }
        boolean isCarMoving(){
            if(car_is_on && door_open){
                System.out.println("Car is moving");
                return true;
            }else{
                System.out.println("Car is parked");
                return false;
            }
        }

    }

}
