public class Converter {

    double oneStepLen = 0.75;
    double oneStepCal = 50.0;
    public double distance(int sumSteps){
        return (sumSteps * oneStepLen)/1000;
    }
    public double ccalories(int sumSteps){
        return (sumSteps * oneStepCal)/1000;
    }
}
