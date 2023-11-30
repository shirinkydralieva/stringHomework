public class Task1 {
    public static void main(String[] args) {
        /*Удаление дубликатов:
        Напишите программу, которая удаляет все повторяющиеся символы из строки, оставляя только уникальные символы.
        */
        String word = "Bookkeeper";
        char [] chars = word.toCharArray();
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i - 1]){
                word = word.replace(String.valueOf(chars[i]), "");
            }
        }
        System.out.println("Оставшиеся уникальные символы: " + word);
    }
}
