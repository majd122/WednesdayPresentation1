package Super;

public class Transmission extends Engine{
    int speedPower = 150;
    void speedOnTheDash(){
        //   this the first example System.out.println("My actual speed : "+speedPower);
        // second example
        System.out.println("My actual speed : "+super.speedPower);

    }

}
