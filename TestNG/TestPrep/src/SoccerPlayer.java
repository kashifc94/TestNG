public class SoccerPlayer {


    private String name;
   private String nationality;
   private String position;
   private int age;
   private static char gender;

    public SoccerPlayer(String name,String nationality, String position, int age, char gender){
        this.name = name;
        this.nationality = nationality;
        this.position = position;
        this.age = age;
        this.gender = gender;
    }


   public void setName(String name){
      this.name = name;
   }

   public void setNationality(String nationality){
       this.nationality = nationality;
   }

   public void setPosition(String position){
       this.position = position;
   }

   public void setAge(int age){
       this.age = age;
   }
   public void setGender(char gender){
       this.gender = gender;
   }

    public String getName() {
        return name;
    }
    public int getAge(){
        return age;
   }
   public String getNationality(){
       return nationality;
   }
   public String getPosition(){
       return position;
   }
   public char getGender(){
       return gender;
   }
}
