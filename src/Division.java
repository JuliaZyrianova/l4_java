import java.util.Random;
/**
 * Class-Division
 */
public class Division {
    /**
     * field division id. Set random
     * */
    private int ID_d;
    /** field division name*/
    private String name_d;

    /**
     * Constructor-creating objects of the division type
     */
    public Division(String name_d) {
        this.name_d = name_d;
        Random tmp=new Random();
        ID_d=tmp.nextInt(20000);
    }

    /**
     * Function of printing Division
     */
    void print(){
        System.out.println("    ID_division "+ID_d);
        System.out.println("    name_division "+name_d);
    }

}
