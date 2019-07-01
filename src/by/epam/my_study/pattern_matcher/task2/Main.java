package by.epam.my_study.pattern_matcher.task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
Дана строка содержащая текст (xml).
Напишите Анализатор, позволяющий последовательно возвращать содержимое узлов xml документа  его тип. Пользоваться
готовыми парсерами XML нельзя.
 */
public class Main {
    public static void main(String[] args){
        String docXML = "<notes>\n\t<note id = \"1\">\n\t\t<to>Вася</to>\n\t\t<from>Света</from>\n\t\t" +
                "<heading>Напоминание</heading>\n\t\t<body>Позвони мне завтра!</body>\n\t</note>\n\t" +
                "<note id = \"2\">\n\t\t<to>Петя</to>\n\t\t<from>Маша</from>\n\t\t<heading>Важное напоминание</heading>\n\t\t" +
                "<body />\n\t</note>\n</notes>" ;
        System.out.println(docXML);


        Pattern template = Pattern.compile("((?<open><[^/>]+?>)(?<body>.+?)(?<close></.+?>))|(?<openOnly><[^/>]+?>)|(?<closeOnly></.+?>)|(?<noBody><.+? />)|");
        Matcher findTeg = template.matcher(docXML);



        while (findTeg.find()) {
            if (findTeg.group("open") != null && findTeg.group("close") != null) {
                System.out.println(" Открывающий тег: " + findTeg.group("open") + " закрывающий тег: " + findTeg.group("close") + " тело тега: " + findTeg.group("body"));

            }else if(findTeg.group("close") == null && findTeg.group("openOnly") != null){
                System.out.println("Открывающий тег (корневой): " + findTeg.group("openOnly"));
            }else if(findTeg.group("open") == null && findTeg.group("closeOnly") != null) {
                System.out.println("Закрывающий тег (корневой): " + findTeg.group("closeOnly"));
            }else if(findTeg.group("noBody") != null ){
                System.out.println("Tег без тела: " + findTeg.group("noBody"));
            }
        }

    }
}
