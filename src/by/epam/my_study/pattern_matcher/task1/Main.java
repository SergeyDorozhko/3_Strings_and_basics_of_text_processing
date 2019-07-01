package by.epam.my_study.pattern_matcher.task1;


/*
Создать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом три различных операции:
отсортировать обзацы по количеству предложений;
в каждом предложении отсортировать слова по длинне;
отсортировать ликсемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства по алфавиту.
 */
public class Main {

    public static void main(String[] args){
        String text = "The London Natural History Society suggest that London is \"one of the World's Greenest Cities\" with more than 40 per cent green space or open water. They indicate that 2000 species of flowering plant have been found growing there and that the tidal Thames supports 120 species of fish. They also state that over 60 species of bird nest in central London and that their members have recorded 47 species of butterfly, 1173 moths and more than 270 kinds of spider around London. London's wetland areas support nationally important populations of many water birds. London has 38 Sites of Special Scientific Interest, two National Nature Reserves and 76 Local Nature Reserves.\n" +
                    "Amphibians are common in the capital, including smooth newts living by the Tate Modern, and common frogs, common toads, palmate newts and great crested newts. On the other hand, native reptiles such as slowworms, common lizards, grass snakes and adders, are mostly only seen in Outer London.\n" +
                    "Fox on Ayres Street, Southwark, South London.\n" +
                    "Among other inhabitants of London are 10,000 red foxes, so that there are now 16 foxes for every square mile (2,6 square kilometres) of London. These urban foxes are noticeably bolder than their country cousins, sharing the pavement with pedestrians and raising cubs in people's backyards. Foxes have even sneaked into the Houses of Parliament, where one was found asleep on a filing cabinet. Another broke into the grounds of Buckingham Palace, reportedly killing some of Queen Elizabeth II's prized pink flamingos. Generally, however, foxes and city folk appear to get along. A survey in 2001 by the London-based Mammal Society found that 80 per cent of 3,779 respondents who volunteered to keep a diary of garden mammal visits liked having them around. This sample cannot be taken to represent Londoners as a whole.\n" +
                    "Other mammals found in Greater London are hedgehogs, rats, mice, rabbit, shrew, vole, and squirrels, In wilder areas of Outer London, such as Epping Forest, a wide variety of mammals are found including hare, badger, field, bank and water vole, wood mouse, yellow-necked mouse, mole, shrew, and weasel, in addition to fox, squirrel and hedgehog. A dead otter was found at The Highway, in Wapping, about a mile from the Tower Bridge, which would suggest that they have begun to move back after being absent a hundred years from the city. Ten of England's eighteen species of bats have been recorded in Epping Forest: soprano, nathusius and common pipistrelles, noctule, serotine, barbastelle, daubenton's, brown Long-eared, natterer's and leisler's.\n" +
                    "Among the strange sights seen in London have been a whale in the Thames, while the BBC Two programme \"Natural World: Unnatural History of London\" shows pigeons using the London Underground to get around the city, a seal that takes fish from fishmongers outside Billingsgate Fish Market, and foxes that will \"sit\" if given sausages.\n" +
                    "Herds of red and fallow deer also roam freely within much of Richmond and Bushy Park. A cull takes place each November and February to ensure numbers can be sustained. Epping Forest is also known for its fallow deer, which can frequently be seen in herds to the north of the Forest. A rare population of melanistic, black fallow deer is also maintained at the Deer Sanctuary near Theydon Bois. Muntjac deer, which escaped from deer parks at the turn of the twentieth century, are also found in the forest. While Londoners are accustomed to wildlife such as birds and foxes sharing the city, more recently urban deer have started becoming a regular feature, and whole herds of fallow deer come into residential areas at night to take advantage of London's green spaces.";

        StartProgram start = new StartProgram();
        start.choseAction(text);

    }
}
