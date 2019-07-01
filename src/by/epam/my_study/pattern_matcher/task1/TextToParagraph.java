package by.epam.my_study.pattern_matcher.task1;

import java.util.regex.Pattern;

public class TextToParagraph {
    public String[]textToParagraph(String text){
                /*
        разобьем текст на обзацы
         */
        Pattern textToParagraph = Pattern.compile("\\\n");
        String [] paragraphArray = textToParagraph.split(text);
        return paragraphArray;
    }
}
