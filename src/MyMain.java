public class MyMain
{
    public static void main(String[] args)
    {
        CodeCoolStudents balazs = new CodeCoolStudents("Balazs", "Subert", 27);
		/*peldanyositas: tipus+valtozo, new-val meghivjuk annak a konstruktorat*/
        System.out.println(balazs.firstName);
        System.out.println(balazs.lastName);
        System.out.println(balazs.age);
        System.out.println(CodeCoolStudents.count);
        System.out.println(CodeCoolStudents.oldest);
        System.out.println(balazs.id);
        CodeCoolStudents imi = new CodeCoolStudents("Imi", "Lindi", 28);
        System.out.println(imi.firstName);
        System.out.println(imi.lastName);
        System.out.println(imi.age);
        System.out.println(CodeCoolStudents.count);
        System.out.println(CodeCoolStudents.oldest);
        System.out.println(imi.id);


    }
}