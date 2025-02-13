import machine.car;
import machine.driver;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCar {

    @Test
    void CarMovesWhenIsOn() {

        //Given
        car hondaCivic = new car("Honda Civic");
        car toyota = new car("Toyota");
        //When
        boolean movement = hondaCivic.isMoving();
        toyota.on();
        boolean moving = toyota.isMoving();
        //Then
        Assertions.assertFalse(movement);
        Assertions.assertFalse(moving);

        driver Hassan = new driver();
    }

}
