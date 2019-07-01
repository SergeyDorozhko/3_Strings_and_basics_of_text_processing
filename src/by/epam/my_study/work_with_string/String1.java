package by.epam.my_study.work_with_string;


/*
Дан текст(строка). Найдите наибольшее количество подряд идущих пробелов в нем.
 */
public class String1 {

    public static void main(String[] args){
        String line = " fsdk    sfjkds    dsfkl    sdf  sdf        wr           q";

        String [] spaceArray = line.split("\\w");

        int maxSpaceLength = 0;
        for(int i = 0; i < spaceArray.length; i++){
            if(spaceArray[i].length() > maxSpaceLength){
                maxSpaceLength = spaceArray[i].length();
            }
        }

        System.out.println(maxSpaceLength);
    }


}
