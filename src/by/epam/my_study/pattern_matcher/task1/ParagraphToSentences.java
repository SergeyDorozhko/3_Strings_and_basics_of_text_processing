package by.epam.my_study.pattern_matcher.task1;

import java.util.regex.Pattern;

public class ParagraphToSentences {
    public String[] paragraphToSentences(String paragraph){
                /*
        каждый обзац разбиваем на предложения
         */
        Pattern paragraphToSentense = Pattern.compile("\\.|!|\\?");

        String[] sentencesOfParagraph = paragraphToSentense.split(paragraph);

        return sentencesOfParagraph;
    }

}
