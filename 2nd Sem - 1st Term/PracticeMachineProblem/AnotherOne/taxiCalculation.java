package PracticeMachineProblem.AnotherOne;

public class taxiCalculation implements FareCalculation{
    double b, d, r, wT, wR;

    public taxiCalculation(double b, double d, double r, double wT, double wR) {
        this.b = b;
        this.d = d;
        this.r = r;
        this.wT = wT;
        this.wR = wR;
    }

    public double fareCalculation() {
        return b + (d * r) + (wT * wR); 
    }

    public String getDetails() {
        return "Taxi Fare: " + fareCalculation();
    }
}
