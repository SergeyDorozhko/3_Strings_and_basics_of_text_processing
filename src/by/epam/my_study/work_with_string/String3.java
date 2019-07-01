package by.epam.my_study.work_with_string;

/*
Проверить является ли заданное слово полиндромом.
 */
public class String3 {
    public static void main(String[] args){
        StringBuffer word = new StringBuffer("мадам");
        isPolindrom(word);
    }

    public static void isPolindrom(StringBuffer word){
        StringBuffer firstPart = new StringBuffer(word.substring(0, word.length() / 2));
        StringBuffer secondPart = new StringBuffer();
        if(word.length() % 2 == 0) {
            secondPart.append( word.substring(word.length() / 2, word.length()));
        }else {
            secondPart.append(word.substring(word.length() / 2 + 1, word.length()));
        }
        System.out.println(firstPart + "    " + secondPart);

        if(firstPart.toString().equals(secondPart.reverse().toString())){
            System.out.println("заданое слово полиндром");
        }else {
            System.out.println("Заданое слово не полиндром");
        }
    }
}
