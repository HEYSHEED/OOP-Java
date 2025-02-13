import machine.Motor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMotor {

    @Test
    void motorMovesWhenIsOn() {
        //Given
        Motor suzuki = new Motor();
        //When
        suzuki.on();
        boolean movement = suzuki.isMotorMoving();
        //Then
        Assertions.assertFalse(movement);
    }
}
