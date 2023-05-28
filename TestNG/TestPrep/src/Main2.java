public class Main2 {

    public static void main(String[] args){
        SoccerPlayer messi = new SoccerPlayer();


        messi.setName("Lionel Messi");
        messi.setAge(34);
        messi.setNationality("Argentina");
        messi.setGender('m');
        messi.setPosition("middle");

        SoccerPlayer ronoldo = new SoccerPlayer("Cristiano Ronoldo","Portugal","srtiker",38 );


   /*     System.out.println("what is messi name ?" + messi.getName());
        System.out.println("what is the age for messi " + messi.getAge());
        System.out.println("what is the gender  " + messi.getGender());
        System.out.println("what is the nationality ? " + messi.getNationality());
        System.out.println("what is the position for messi ? " +messi.getPosition());
*/
        ronoldo.setName("Cristiano Ronoldo");
        ronoldo.setAge(38);
        ronoldo.setPosition("striker");
        ronoldo.setNationality("portugal");
        ronoldo.setGender('f');

 /*       System.out.println("what is ronoldo name ?" + ronoldo.getName());
        System.out.println("what is the age for messi " + ronoldo.getAge());
        System.out.println("what is the gender  " + ronoldo.getGender());
        System.out.println("what is the nationality ? " + ronoldo.getNationality());
        System.out.println("what is the position for messi ? " +ronoldo.getPosition());
   */
        // lets create two more objects and find the value for those object gender without directly assign it

        SoccerPlayer beckam = new SoccerPlayer();
        System.out.println("what is gender for beckam " + beckam.getGender());
        SoccerPlayer carlos = new SoccerPlayer();
        System.out.println("what is gender for carlos" + carlos.getGender());


    }
}
