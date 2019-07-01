package by.epam.my_study.pattern_matcher.task1;

import java.util.Arrays;
import java.util.regex.Pattern;

public class SortingByLettersNumberOrAlfabet {
    public String sortWordsByLettersNumOrAlfabet(String sentence, String sortByLetter){

        Pattern sentenceToWords = Pattern.compile("[\\W&&[^']]+");
        String [] wordsArray = sentenceToWords.split(sentence.trim());

        for(int i = 1; i < wordsArray.length; i++){
            int countFirst = 0;
            int countSecond = 0;

            for (int j = 0; j < wordsArray[i - 1].length(); j++){
                if(wordsArray[i - 1].charAt(j) == sortByLetter.charAt(0)){
                    countFirst++;
                }
            }

            for(int k = 0; k < wordsArray[i].length(); k++){
                if(wordsArray[i].charAt(k) == sortByLetter.charAt(0)){
                    countSecond++;
                }
            }

            String forSort;
            if(countFirst < countSecond){
                forSort = wordsArray[i];
                wordsArray[i] = wordsArray[i - 1];
                wordsArray[i - 1] = forSort;
                if(i > 1) {
                    i -= 2;
                }else{
                    i--;
                }


            }else if(countFirst == countSecond){
                for(int j = 0; j < wordsArray[i].length() && j < wordsArray[i - 1].length(); j++){

                    String firstWord = wordsArray[i - 1].toLowerCase();
                    String secondWord = wordsArray[i].toLowerCase();



                    if(secondWord.charAt(j) < firstWord.charAt(j)){

                        forSort = wordsArray[i];
                        wordsArray[i] = wordsArray[i - 1];
                        wordsArray[i - 1] = forSort;

                        if(i > 1) {
                            i -= 2;
                        }else{
                            i--;
                        }
                        break;
                    }else if(secondWord.charAt(j) > firstWord.charAt(j)){
                        break;
                    }else if (j == wordsArray[i].length() - 1 || j == wordsArray[i - 1].length() - 1){
                        if(wordsArray[i].length() < wordsArray[i - 1].length()){
                            forSort = wordsArray[i];
                            wordsArray[i] = wordsArray[i - 1];
                            wordsArray[i - 1] = forSort;
                            if(i > 1) {
                                i -= 2;
                            }else{
                                i = 1;
                            }
                            break;
                        }

                    }else {
                        continue;
                    }
                }
            }
        }
        return Arrays.toString(wordsArray);
    }
}
