import entity.Notebook;
import entity.Pad;
import entity.Sketchbook;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //ask padType
        String[] PadTypes = {"", "sketch book", "copybook", "planner", "music book"};
        String padType;
        System.out.println("Please select a type of pad to create: \n" +
                "1 - sketch book\n2 - copybook\n3 - planner\n4 - music book\nInput 0 to EXIT\n");
        int userInput = scanner.nextInt();

        while (!(userInput < PadTypes.length && userInput > 0)) {
            System.out.println("Please choose other pad type: ");
            userInput = scanner.nextInt();
        }
        padType = PadTypes[userInput];


        //ask Cover
        String[] Covers = {"", "flexible", "hard"};
        String cover;
        System.out.println("Please select a cover: \n1 - flexible\n2 - hard\nInput 0 to EXIT\n");
        userInput = scanner.nextInt();

        while (!(userInput < Covers.length && userInput > 0)) {
            System.out.println("Please select a cover: ");
            userInput = scanner.nextInt();
        }
        cover = Covers[userInput];


        //ask binding
        String[] Bindings = {"", "spring", "glued", "staples"};
        String binding;
        System.out.println("Please select a binding: \n1 - spring\n2 - glued\n4 - staples\n0 - input 0 to EXIT\n");
        userInput = scanner.nextInt();

        while (!(userInput < Bindings.length && userInput > 0)) {
            System.out.println("Please input a binding: ");
            userInput = scanner.nextInt();
        }
        binding = Bindings[userInput];


        //ask size
        String[] Sizes = {"", "A0", "A1", "A2", "A3", "A4", "A5", "A6"};
        int width;
        int height;
        System.out.println("Please select size:\n1 - A0\n2 - A1\n3 - A2\n4 - A3\n5 - A4\n6 - A5\n7 - A6\n" +
                "0 - input to EXIT\n");
        userInput = scanner.nextInt();

        while (!(userInput < Sizes.length && userInput > 0)) {
            System.out.println("Please select a size: ");
            userInput = scanner.nextInt();
        }
        String size = Sizes[userInput];

        switch (userInput) {
            case 1: //a0
                width = 841;
                height = 1189;
                break;
            case 2: //a1
                width = 594;
                height = 841;
                break;
            case 3: //a2
                width = 420;
                height = 594;
                break;
            case 4: //a3
                width = 297;
                height = 420;
                break;
            case 5: //a4
                width = 210;
                height = 297;
                break;
            case 6: //a5
                width = 148;
                height = 210;
                break;
            case 7: //a6
                width = 105;
                height = 148;
                break;
            default:
                width = 148;
                height = 210;
                break;
        }


        //ask density
        System.out.println("Please input a density: ");
        userInput = scanner.nextInt();
        int density = userInput;


        //ask sheetsQuantity
        System.out.println("Please input a sheetsQuantity: ");
        userInput = scanner.nextInt();
        int sheetsQuantity = userInput;


        //ask page color
        System.out.println("Please input a page color: ");
        String pageColor = scanner.next();


        //ask pagePattern and isDatedPages
        String[] Patterns = {"", "none", "lined", "grid", "dotted"};
        System.out.println("Please select a pattern: \n1 - none\n2 - lined\n3 - grid\n4 - dotted\nInput 0 to EXIT\n");
        userInput = scanner.nextInt();
        String pagePattern;

        while (!(userInput < Patterns.length && userInput > 0)) {
            System.out.println("Please select other pattern: ");
            userInput = scanner.nextInt();
        }
        pagePattern = Patterns[userInput];

//        boolean isDatedPages;
//        if (padType.contentEquals("planner")){
//            isDatedPages = true;
//        }

        //objects
//        Sketchbook sketchbook = new Sketchbook(padType, cover, binding, width, height, density, sheetsQuantity, pageColor);
//        System.out.println(sketchbook.getInfo());


        Notebook notebook = new Notebook();

        System.out.println(notebook.getPadWeight());
    }
}