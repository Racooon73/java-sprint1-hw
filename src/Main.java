import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker();
        printMenu();
        int userInput = scanner.nextInt();

        while (userInput != 0) {
            if(userInput == 1){

                System.out.println("Введите месяц(с 1 до 12): ");
                int month = enterCheck(scanner)-1;
                while (month < 0 || month >= 12){
                    System.out.println("Введите месяц(с 1 до 12): ");
                    month = enterCheck(scanner)-1;
                }

                System.out.println("Введите день(с 1 до 30): ");
                int day = enterCheck(scanner)-1;
                while (day < 0 || day >= 30){
                    System.out.println("Введите день(с 1 до 30): ");
                    day = enterCheck(scanner)-1;
                }

                System.out.println("Введите количество шагов: ");
                int steps = enterCheck(scanner);
                stepTracker.saveSteps(month,day,steps);

            }
            if(userInput == 2){
                System.out.println("Введите месяц(с 1 до 12): ");
                int month = enterCheck(scanner)-1;
                while (month < 0 || month >= 12){
                    System.out.println("Введите месяц(с 1 до 12): ");
                    month = enterCheck(scanner)-1;
                }

                stepTracker.statisticsPrint(month);
            }
            if(userInput == 3){
                System.out.print("Введите новую цель по количеству шагов: ");
               stepTracker.changeGoal(enterCheck(scanner));
            }
            if(userInput < 0 || userInput > 3){
                System.out.println("Такой команды нет, введите команду из списка ");
            }
            printMenu(); // печатем меню ещё раз перед завершением предыдущего действия
            userInput = scanner.nextInt(); // повторное считывание данных от пользователя
        }
        System.out.println("Программа завершена");
    }
    private static void printMenu() {
        System.out.println("Выберите действие:");
        System.out.println("1 - Ввести количество шагов, пройденных за день");
        System.out.println("2 - Вывести статистику за определённый месяц");
        System.out.println("3 - Ввести дневную цель по количеству шагов");
        System.out.println("0 - Выход");
    }
    public static int enterCheck(Scanner scanner){

        int enter = scanner.nextInt();
        while(enter < 0){
            System.out.println("Отрицательное значение недопустимо, введите другое значение");
            enter = scanner.nextInt();
        }

        return enter;
    }
}
