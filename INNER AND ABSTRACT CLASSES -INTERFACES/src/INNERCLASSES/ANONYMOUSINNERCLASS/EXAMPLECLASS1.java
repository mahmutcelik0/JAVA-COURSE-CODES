package INNERCLASSES.ANONYMOUSINNERCLASS;


interface IMouse{
    boolean leftClick();
    boolean rightClick();
    int midWheelTour(int number);
    int returnLeftClickCount();
    int returnRightClickCount();
}

public class EXAMPLECLASS1 {

    static IMouse oldMouse = new IMouse() {
        private int leftClickCount = 3;
        private int rightClickCount = 4;

        @Override
        public boolean leftClick(){
            return true;
        }

        @Override
        public boolean rightClick(){
            return false;
        }

        @Override
        public int midWheelTour(int number){
            return number*360;
        }

        @Override
        public int returnLeftClickCount(){
            return this.leftClickCount;
        }

        @Override
        public int returnRightClickCount(){
            return this.rightClickCount;
        }

    };

    public static void main(String[] args) {
        System.out.println(oldMouse.returnLeftClickCount());
    }




}
