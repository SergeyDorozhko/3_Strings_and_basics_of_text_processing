package by.epam.my_study.work_with_string;

/*
Строка Х состоит из нескольких предложеений, каждое из которых кончается точкой, восклицаелным знаком или копросительным
знаком. Определить количество предложений в строке.
 */
public class String10 {

    public static void main(String[] args){
        String text = "Iran's president Hassan Rouhani has branded the White House 'mentally retarded' after Donald Trump issued fresh sanctions against the leadership in Tehran." +
                "Rouhani said the move proves that America is lying about wanting to negotiate and only proves that Washington is desperate and running out of options." +
                "Speaking to a session of ministers that was broadcast on TV, Rouhani added that the new sanctions are 'outrageous and idiotic' and will fail because Ayatollah Khamenei - one of the main targets - has no foreign assets." +
                "Trump imposed the sanctions Monday after Iran shot down a US spy drone which it claimed violated its airspace last week. America says the drone was in international airspace and the attack was 'unprovoked'.";

        System.out.format("In this text there are(is) %d sentences.", sentenceCounter(text));
    }



    public static int sentenceCounter(String text){
        int sentenceCounter = 0;



        for(int i = 1; i < text.length(); i++){
            boolean checkSymbol = (text.charAt(i) == '.' || text.charAt(i) == '!' || text.charAt(i) == '?');
            boolean checkPreviousSymbol = (text.charAt(i - 1) != '.' && text.charAt(i - 1) != '!' && text.charAt(i - 1) != '?');
            if(checkSymbol && checkPreviousSymbol){
                sentenceCounter++;
            }
        }

        return sentenceCounter;
    }
}
