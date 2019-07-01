package by.epam.my_study.work_with_string_as_with_array_of_char;

/*
замените в строке все вхождения 'word' на 'letter'
 */
public class String2 {
    public static void main(String[] args){
        String someText = " There are many words in many languages that have multiple meanings, but it depends upon your definition of word. If you mean the written word, as separated by spaces on a page, then there are several words in English which have different meanings";

        someText = someText.replace("word", "letter");

        System.out.println(someText);
    }
}
