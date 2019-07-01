package by.epam.my_study.work_with_string;

/*
Подсчитать скоько раз среди сиволов заданной строки встречается буква а
 */
public class String5 {

    public static void main(String[] args){
        String text = "Manufactured by a team of engineers specializing in robots with human-like features and using algorithms developed by scientists at Oxford University, Ai-Da captures images in front of her with a camera in her eye.";
        char findSymbol = 'a';
        System.out.format("Буква '%s' встреается %d раз", findSymbol, charCounter(text, findSymbol));
    }




    public static int charCounter(String text, char symbol){
        int countSymbol = 0;
        for(int i = 0; i < text.length(); i++){
            if(text.charAt(i) == symbol){
                countSymbol++;
            }
        }
        return countSymbol;
    }
}
