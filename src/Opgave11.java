public class Opgave11 {
    public static void main(String[] args) {

        //1 birth/7 seconds - birth/year 1*60*60*24*365/7
        //1 death/13 seconds - death/year 1*60*60*24*365/13
        //1 immigrant/45 seconds - immigrant/year 1*60*60*24*365/45

        int population0 = 312032486;

        int population1 = (int) (population0 + (1*60*60*24*365/7.0) - (1*60*60*24*365/13.0) + (1*60*60*24*365/45.0));
        int population2 = (int) (population1 + (1*60*60*24*365/7.0) - (1*60*60*24*365/13.0) + (1*60*60*24*365/45.0));
        int population3 = (int) (population2 + (1*60*60*24*365/7.0) - (1*60*60*24*365/13.0) + (1*60*60*24*365/45.0));
        int population4 = (int) (population3 + (1*60*60*24*365/7.0) - (1*60*60*24*365/13.0) + (1*60*60*24*365/45.0));
        int population5 = (int) (population4 + (1*60*60*24*365/7.0) - (1*60*60*24*365/13.0) + (1*60*60*24*365/45.0));

        System.out.println("After one year the population has expanded to " + population1);
        System.out.println("After two years the population has expanded to " + population2);
        System.out.println("After three years the population has expanded to " + population3);
        System.out.println("After four years the population has expanded to " + population4);
        System.out.println("After five years the population has expanded to " + population5);
    }}
