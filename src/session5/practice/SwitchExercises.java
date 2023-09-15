package session5.practice;

public class SwitchExercises {

    public static void main(String[] args) {
        printGradeInformation('A');
        printSeasonInfo("Winter");

    }

    private static void printGradeInformation(char grade) {
        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Average");
                break;
            default:
                System.out.println("Grade not recognized");
        }

    }

        private static void printSeasonInfo(String season){
            switch(season){
                case "Winter"-> System.out.println("It's cold");
                case "Spring"-> System.out.println("Flowers bloom");
                case "Summer"-> System.out.println("It's hot");
                default-> System.out.println("Unknown season");

            }
        }
        }



