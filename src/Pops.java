
public class Pops {
    public static void main(String[] args) {
        Pops pops = new Pops();
        pops.determineGroup(9 );
        pops.determineGroup(15 );
        pops.determineGroup(63 );
    }
    public void determineGroup(int age) {
        if(age >= 7 || age <= 13) {
            System.out.println("1");
        } else if (age >= 14 || 17 <= age) {
            System.out.println("2");
        }
        else if (age >= 18 || 65 <= age){
            System.out.println("3");
        }
        else {
            System.out.println("4");
        }
    }
    }

