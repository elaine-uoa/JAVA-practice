package Day2;

public class UsefulSubStringMethods {

    public static void main(String[] args) {

        String email = "Elaine@hello.123.com";
        String username = email.substring(0, email.indexOf("@"));
//        String domain = email.substring(email.indexOf("@") + 1, email.length());
        String domain = email.substring(email.indexOf("@") + 1);


        System.out.println(username);
        System.out.println(domain);


    }
}
