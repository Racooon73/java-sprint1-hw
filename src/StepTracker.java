public class StepTracker {

    private int stepGoal = 10000;

    MonthData[] monthToData;

    public StepTracker() {
        monthToData = new MonthData[12];
        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }

void saveSteps(int month, int day, int steps){
monthToData[month].daySteps[day] = steps;
}

void statisticsPrint(int month){
    Converter converter = new Converter();
    int sumSteps = 0;
    int maxSteps = 0;
    int series = 0;
    int bestSeries = 0;
    for(int i = 0; i < 30; i++){

        System.out.print((i+1) + " день: "+ monthToData[month].daySteps[i] + ", ");
        sumSteps += monthToData[month].daySteps[i];

        if (monthToData[month].daySteps[i] > maxSteps)
            maxSteps = monthToData[month].daySteps[i];

        if(monthToData[month].daySteps[i] >= stepGoal)
            series++;
        else if(bestSeries < series){
            bestSeries = series;
            series = 0;
        }else
            series = 0;
    }

    System.out.println();
    System.out.println("Всего шагов за месяц: "+ sumSteps);
    System.out.println("Максимальное количество шагов за месяц: "+ maxSteps);
    System.out.println("Среднее количество шагов за месяц: "+ sumSteps/30);
    System.out.println("Пройденная дистанция: " + converter.distance(sumSteps) + " км");
    System.out.println("Количество сожжённых килокалорий: " + converter.ccalories(sumSteps) + " ккал");
    System.out.println("Лучшая серия дней выполнения цели подряд: " + bestSeries );

}
void changeGoal(int newGoal){
stepGoal = newGoal;
}

}
class MonthData {
    int daySteps[];
    public MonthData(){
     daySteps = new int[30];
    }
}