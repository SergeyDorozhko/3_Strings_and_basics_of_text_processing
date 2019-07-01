package by.epam.my_study.pattern_matcher.task1;

import java.util.Scanner;

public class StartProgram {


    public static void choseAction(String text) {
        Scanner inputAction = new Scanner(System.in);


        do {

            System.out.println("Введите действие по сортировке текста:\n1) Отсортировать обзацы по количеству предложений;\n" +
                    "2) В каждом предложении отсортировать слова по длинне;\n" +
                    "3) Отсортировать ликсемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства по алфавиту.\n" +
                    "0) Выход из программы");
            int action = inputAction.nextInt();

            switch (action) {
                case 1:
                    SortParagraph startSorting = new SortParagraph();
                    startSorting.sortParagraph(text);
                    break;
                case 2:
                    ParagraphToSentences paragraphToSentences = new ParagraphToSentences();
                    String [] sentencesArray = paragraphToSentences.paragraphToSentences(text);

                    SortWordsOfSentence sortWordsOfSentence = new SortWordsOfSentence();

                    String [] sortedSentences = new String[sentencesArray.length];
                    for(int i = 0; i < sentencesArray.length; i++){
                        sortedSentences[i] = sortWordsOfSentence.sortWordsOfSentence(sentencesArray[i]);
                        System.out.println("Sentence #" + i + ": " + sortedSentences[i]);
                    }

                    break;
                case 3:
                    boolean charCheck = false;

                    System.out.println("Введите символ по которому будем сортировать:");

                    String sortBy = null;
                    while (charCheck == false) {

                        sortBy = inputAction.next();
                        charCheck = (sortBy.length() == 1) && (sortBy.charAt(0) >= 'a') && (sortBy.charAt(0) <= 'z');
                        if (charCheck == false){
                            System.out.println("не верное значение, попробуйте еще (принимаются символы от a до z):");
                        }
                    }

                    ParagraphToSentences parToSentences = new ParagraphToSentences();
                    String [] sentences = parToSentences.paragraphToSentences(text);

                    SortingByLettersNumberOrAlfabet sort = new SortingByLettersNumberOrAlfabet();
                    for (int i = 0; i < sentences.length; i++){
                        sentences[i] = sort.sortWordsByLettersNumOrAlfabet(sentences[i], sortBy);
                    }

                    for(String element : sentences){
                        System.out.println(element);
                    }

                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Не верное значение действия, попробуйте еще раз");
            }
        }while(true);
    }

}
