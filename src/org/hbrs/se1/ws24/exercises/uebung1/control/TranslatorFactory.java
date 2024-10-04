package src.org.hbrs.se1.ws24.exercises.uebung1.control;

public class TranslatorFactory {
    //private static GermanTranslator translator1;

    public static Translator creatTranslator(){
        /*if(translator1==null){
            GermanTranslator translator1 = new GermanTranslator();
        }*/

        return new GermanTranslator();
    }
}
