public class Opgave10 {
    public static void main(String[] args) {

        double km;
        double miles;

        //1 mile is 1.6 km

        //15 km på 50.30

        //15.0/3030 km/sek

        //15.0/(3030/3600) km/time

        int result = (int) ((15.0 / 3030.0 * 3600.0)/1.6);
        System.out.println("The runners avarage speed is " + result + " miles/hour");

    }}
