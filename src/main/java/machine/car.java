package machine;

public class car {

        //Data
        boolean is_on;
        boolean is_off;//false
        boolean is_open;
        boolean is_close;//false
        String brand;

        car(){
        }
       public car(String brand){
            this.brand= brand;
        }

        //Function
        public void on(){
            boolean is_on = true;
        }
        void off(){
            boolean is_off = true;
        }
        void open(){
            boolean is_open = true;
        }
        void is_close(){
            boolean close = true;
        }
        public boolean isMoving(){
            if(is_on && is_open){
                return true;
            }else{
                System.out.println("Car is parked");
                return false;
            }
        }

}
