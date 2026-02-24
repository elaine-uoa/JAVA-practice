package Day2;

public class UsefullStringMethods {
    public static void main(String[] args) {

        String name = "Password";

//        int length = name.length();
//        char letter = name.charAt(length - 1);
//        int index = name.indexOf(" ");
//        int lastIndex = name.lastIndexOf("e");

//        name = name.toUpperCase();
//        name = name.trim();
//        name = name.replace("e", "u");

        /*if (name.contains(" ")) {
            System.out.println("Your name contains a space!");
        }
        else {
            System.out.println("Your name does NOT contain a space!");
        }*/

        if (name.equalsIgnoreCase("password")) {
            System.out.println("Your name cannot be password!");
        }
        else {
            System.out.println("Hello " + name);
        }

    }
}
