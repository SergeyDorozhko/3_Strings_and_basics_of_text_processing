package by.epam.my_study.work_with_string;

/*
Вводится строка слов разделенных пробелами.  Найти самое длинное слово и вывести на экран.
 */
public class String8 {
    public static void main(String[] args){
        String line = "Sir Nick Clegg has called for greater regulation of the internet while claiming that there was absolutely no evidence that Russia used Facebook to push for a Brexit vote and influence the result in the EU referendum";

        findTheLongestWord(line);
    }

    public static void findTheLongestWord(String text){
        String [] wordArray = text.split(" ");
        String theLongest = wordArray[0];
        for (int i = 0; i < wordArray.length; i++){
            if(theLongest.length() < wordArray[i].length()){
                    theLongest = wordArray[i];
            }
        }

        System.out.format("The longest word of the text is '%s'.",  theLongest);
    }
}
