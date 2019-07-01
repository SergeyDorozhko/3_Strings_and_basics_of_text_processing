package by.epam.my_study.work_with_string;


/*
С помощью функци копирования и операции конкатенации составить из частей слова информатика, слово торт
 */
public class String4 {
    public static void main(String[] args){
        String word = "Информатика";
        tortMaker(word);
    }

    public static void tortMaker(String word){

        if(word.contains("т") && word.contains("ор")) {
            String result = String.copyValueOf(word.toCharArray(), word.indexOf('т'), 1);

            result += String.copyValueOf(word.toCharArray(), word.indexOf('о'), 2); // copy "op"

            result += String.copyValueOf(word.toCharArray(), word.indexOf('т'), 1);

            System.out.println(result);
        }else {
            System.out.println("Incorrect word");
        }
    }
}
