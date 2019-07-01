package by.epam.my_study.work_with_string;

/*
Из заданой строки получить новую, продублировав каждый символ.
 */
public class String6 {

    public static void main(String[] args){
        String text = "Manufactured by a team of engineers specializing in robots with human-like features and using algorithms developed by scientists at Oxford University, Ai-Da captures images in front of her with a camera in her eye.";

        StringBuilder textB = new StringBuilder(text);
        doubleSymbol(textB);

        doubleSymbol(text);

    }

    public static void doubleSymbol(StringBuilder line){
        for (int i = 0; i < line.length(); i+=2){
            line.insert(i+1, line.charAt(i));
        }
        System.out.println("StringBuilder: " + line);
    }

    public static void doubleSymbol(String line){
        String newLine = new String();
        for (int i = 0; i < line.length(); i++){
            for(int j = 0; j < 2; j++){
                newLine += line.charAt(i);
            }
        }

        System.out.println("String: " + newLine);
    }
}
