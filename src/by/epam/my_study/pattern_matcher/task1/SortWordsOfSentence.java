package by.epam.my_study.pattern_matcher.task1;

import java.util.Arrays;
import java.util.regex.Pattern;

public class SortWordsOfSentence {
    public String sortWordsOfSentence(String sentence){
        Pattern splitSentence = Pattern.compile("[\\W&&[^']]+");  //разделяем по одому и более не символу слова кроме '
        String [] wordsArray = splitSentence.split(sentence.trim());

        for(int i = 1; i < wordsArray.length; i++){
            String forSort;
            if(wordsArray[i].length() < wordsArray[i - 1].length() ){
                forSort = wordsArray[i];
                wordsArray[i] = wordsArray[i - 1];
                wordsArray[i - 1] = forSort;
                if(i > 1) {
                    i -= 2;
                }
            }
        }

        return Arrays.toString(wordsArray);
    }
}
