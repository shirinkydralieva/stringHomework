public class Task2 {
    public static void main(String[] args) {
        /*
           Перевернутая строка :
           Напишите программу, которая переворачивает строку;
            Hello, World!
            !dlroW ,olleH
        */
        String string = "Hello, World!";
        System.out.println("String: " + string);
        String invertedString = "";
        char [] chars = string.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            invertedString = invertedString.concat(String.valueOf(chars[i]));
        }
        System.out.println("Inverted string: " + invertedString);
    }

}
