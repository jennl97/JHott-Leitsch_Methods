import java.util.Scanner;

public class methods {
    public static void main (String[] args){
        System.out.println("1. Triangle");
        System.out.println("2. Square");
        System.out.println("3. Parallelogram");
        System.out.println("4. Rectangle");
        System.out.println("5. Exit");

        int pickShape = userInput2("Pick your shape: ");
        String base;
        String height;
        String width;
        String length;

        switch (pickShape){
            case 1:
                base = userInput("Enter base value: ");
                height = userInput("Enter height value: ");
                System.out.println(triange(base, height));
                break;

            case 2:
                length = userInput("Enter length value: ");
                System.out.println(square(length));
                break;

            case 3:
                base = userInput("Enter base value: ");
                height = userInput("Enter height value: ");
                System.out.println(parallelogram(base, height));
                break;

            case 4:
                height = userInput("Enter height value: ");
                width = userInput("Enter width value: ");
                System.out.println(rectangle(width, height));
                break;

            case 5:
                System.out.println("Thank you, have a nice day!");
                System.exit(0);
                break;

            default:
                System.out.println("That is not an option");
                System.exit(42);
                break;
        }

        /*Test if methods working correctly
        System.out.println(triange(base, height));
        System.out.println(square(length));
        System.out.println(parallelogram(base, height));
        System.out.println(rectangle(width, height));*/
    }
    //Declare methods
    static String userInput(String prompt){
        System.out.println(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    static int userInput2(String prompt){
        System.out.println(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    static double triange(String base, String height){
        double t1 = Double.parseDouble(base);
        double t2 = Double.parseDouble(height);
        return .5 * t1 * t2;
    }

   static double square (String length){
        double s1 = Double.parseDouble(length);
        return s1 * s1;

    }

    static double parallelogram(String base, String height){
       double p1 = Double.parseDouble(base);
       double p2 = Double.parseDouble(height);
       return p1 * p2;

    }

    static double rectangle(String width, String height){
        double r1 = Double.parseDouble(width);
        double r2 = Double.parseDouble(height);
        return r1 * r2;
    }


}
