import java.security.PublicKey;

enum Lights{
    RED,YELLOW,GREEN
}
class Simulation_56286{
    //variable that stores the current light
    Lights Ls = Lights.RED;
    void ChangeColor_56286(){
        switch (Ls){
            case RED :
                Ls=Lights.YELLOW;
                break;
            case YELLOW :
                Ls=Lights.GREEN;
                break;
            case GREEN :
                Ls=Lights.RED;
                break;
        }
    }
    public String toString(){
        return " "+Ls;
    }

}
public class Traficlights {
    public static void main(String[] args) {
        Simulation_56286 s = new Simulation_56286();
        for (int i = 0; i < 6; i++) {
            System.out.println(s);
            s.ChangeColor_56286();

        }


    }
}