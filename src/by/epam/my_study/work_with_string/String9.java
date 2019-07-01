package by.epam.my_study.work_with_string;

/*
Посчитать кол-во строчных и прописных букв в строке.
 */
public class String9 {

    public static void main(String[] args){
        String line = "When asked to suggest a diet, Kate Moss reportedly advised the “three Cs and one V” regimen: cigarettes, champagne, coffee and vodka.";


        lettersCounter(line);

    }



    public static void lettersCounter(String text){

        int bigLettersCounter = 0;
        int smallLettersCounter = 0;
        for(int i = 0; i < text.length(); i++){
            if(text.charAt(i) >= 'a' && text.charAt(i)<= 'z'){
                smallLettersCounter++;
            }else if(text.charAt(i) >= 'A' && text.charAt(i) <= 'Z'){
                bigLettersCounter++;
            }else{
                continue;
            }
        }

        System.out.format("In this text we have %d small letters and %d big letters. The hole length of the text is %d", smallLettersCounter, bigLettersCounter, text.length());
    }
}
