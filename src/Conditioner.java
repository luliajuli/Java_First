public class Conditioner {
    public static void main(String[] args) {
        int temperature = 35;
        int time = 9;
        boolean ifCold = temperature <= 0;
        boolean ifHot = temperature >= 25;
        boolean ifDayTime = time >= 9 && time <= 20;

        if (ifHot && ifDayTime) {
            System.out.println("Conditioner is cooling");
        } else if (ifCold) {
            System.out.println("Conditioner is off!");
        } else {
            System.out.println("Conditioner is warming");
        }
    }
}
