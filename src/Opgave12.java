public class Opgave12 {
    public static void main(String[] args) {

        //1 mile is 1.6 km

        //24 miles in 1 hour 40 min and 35 sec.

        //24.0/((1*60*60)+(40*60)+35)

        //24.0/(6035/3600) miles/hour

        int result = (int) (24.0 / 6035 * 3600.0 * 1.6);
        double result1 = 24.0 / 6035 * 3600.0 * 1.6;
        System.out.println("The runners avarage speed is " + result + " km/time");
        System.out.println("The more precise avarage speed is " + result1 + " km/time");
    }}
