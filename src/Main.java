import entity.Notebook;
import entity.Pad;
import entity.Sketchbook;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String padType;
        String pageColor = "white";
        String pagePattern = "none";
        String cover;
        String binding;
        int width;
        int height;
        int density;
        int sheetsQuantity;
        Sketchbook sketchbook = new Sketchbook();
        Notebook notebook = new Notebook();

        //ask padType
        String[] PadTypes = {"", "Sketch book", "Copybook", "Planner"};
        System.out.println("Please select a type of pad to create: \n" +
                "1 - sketch book\n2 - copybook\n3 - planner\nInput 0 to EXIT\n");
        int userInput = scanner.nextInt();

        while (!(userInput < PadTypes.length && userInput > 0)) {
            System.out.println("Please choose other pad type: ");
            userInput = scanner.nextInt();
        }
        padType = PadTypes[userInput];

        //ask Cover
        String[] Covers = {"", "flexible", "hard"};
        System.out.println("Please select a cover: \n1 - flexible\n2 - hard\nInput 0 to EXIT\n");
        userInput = scanner.nextInt();

        while (!(userInput < Covers.length && userInput > 0)) {
            System.out.println("Please select a cover: ");
            userInput = scanner.nextInt();
        }
        cover = Covers[userInput];

        //ask binding
        String[] Bindings = {"", "spring", "glued", "staples"};
        System.out.println("Please select a binding: \n1 - spring\n2 - glued\n3 - staples\n0 - input 0 to EXIT\n");
        userInput = scanner.nextInt();

        while (!(userInput < Bindings.length && userInput > 0)) {
            System.out.println("Please input a binding: ");
            userInput = scanner.nextInt();
        }
        binding = Bindings[userInput];

        //ask size
        String[] Sizes = {"", "A0", "A1", "A2", "A3", "A4", "A5", "A6"};
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
        density = scanner.nextInt();

        //ask sheetsQuantity
        System.out.println("Please input a quantity of sheets: ");
        sheetsQuantity = scanner.nextInt();

        //ask pageColor
        System.out.println("Please input a page color: ");
        pageColor = scanner.next();
        sketchbook.setPageColor(pageColor);

        //ask pagePattern
        String[] Patterns = {"", "none", "lined", "grid", "dotted"};
        System.out.println("Please select a pattern:\n1 - none\n2 - lined\n3 - grid\n4 - dotted\nInput 0 to EXIT\n");
        userInput = scanner.nextInt();

        while (!(userInput < Patterns.length && userInput > 0)) {
            System.out.println("Please select other pattern: ");
            userInput = scanner.nextInt();
        }
        pagePattern = Patterns[userInput];

        //objects
        sketchbook.setPadType(padType);
        sketchbook.setCover(cover);
        sketchbook.setBinding(binding);
        sketchbook.setWidth(width);
        sketchbook.setHeight(height);
        sketchbook.setDensity(density);
        sketchbook.setSheetsQuantity(sheetsQuantity);
        sketchbook.setPageColor(pageColor);
        System.out.println(sketchbook.getPadWeight());
        System.out.println(sketchbook.getInfo());

        System.out.println();

        notebook.setPadType(padType);
        notebook.setCover(cover);
        notebook.setBinding(binding);
        notebook.setWidth(width);
        notebook.setHeight(height);
        notebook.setDensity(density);
        notebook.setSheetsQuantity(sheetsQuantity);
        notebook.setPagePattern(pagePattern);
        System.out.println(notebook.getPadWeight());
        System.out.println(notebook.getInfo());

    }
}
