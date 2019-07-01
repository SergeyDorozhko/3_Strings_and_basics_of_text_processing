package by.epam.my_study.pattern_matcher.task1;

import java.util.Arrays;

public class SortParagraph {
    public static void sortParagraph(String text){
        /*
        спомощю нашего метода разбиваем текст на обзацы
         */

        TextToParagraph splitText = new TextToParagraph();
        String[] paragraphArray = splitText.textToParagraph(text);


        /*
        с помощю нашего метода разобьем параграф на предложения, для дальнейшего анализа по кол-ву предложений
         */
        ParagraphToSentences splitParagraph = new ParagraphToSentences();
        String[][] sentencesOfEachParagraph= new String[paragraphArray.length][];
        for(int i = 0; i < sentencesOfEachParagraph.length; i++){
            sentencesOfEachParagraph[i] = splitParagraph.paragraphToSentences(paragraphArray[i]);
        }

        /*
        найдем количество предложений в обзаце, это соответствует длинне строки двумерной матрицы
         */
        int [] paragraphLength = new int[sentencesOfEachParagraph.length];
        for(int i = 0; i < paragraphLength.length; i++){
            paragraphLength[i] = sentencesOfEachParagraph[i].length;
        }

        /*
        зададим порядок вывода обзацев, по возростанию
         */
        int [] paragraphSort = new int[paragraphLength.length];

        for(int i = 0; i < paragraphSort.length; i++){
            int minLenght = 2147483647;
            for(int j = 0; j < paragraphLength.length; j++){
                if(minLenght > paragraphLength[j] && paragraphLength[j] >= 0){
                    minLenght = paragraphLength[j];
                    paragraphSort[i] = j;
                }
                if(j == (paragraphLength.length - 1)){
                    paragraphLength[paragraphSort[i]] = -1;
                }
            }
        }

        /*
        выводим на экран обзаци согласно нашей последовательности.
         */
        System.out.println(Arrays.toString(paragraphSort) + " (очередность вывода обзацев, числа - это номера обзацев)");
        for(int i = 0; i < paragraphArray.length; i++){
            System.out.println(paragraphArray[paragraphSort[i]]);
        }
    }
}
