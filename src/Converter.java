public class Converter {

    double oneStepLen = 0.75;
    int oneStepCal = 50;
    public double distance(int sumSteps){
        return (sumSteps * oneStepLen)/1000;
    }
    public int ccalories(int sumSteps){
        return (sumSteps * oneStepCal)/1000;
    }
}
