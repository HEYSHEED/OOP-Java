package machine;

public class Motor {
    boolean is_on;
    boolean is_off;

    public boolean isMotorMoving() {
        return is_on;
    }
    public void on(){
        boolean is_on = true;
    }
}
