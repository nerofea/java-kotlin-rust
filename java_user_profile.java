  /* the class is a template that defines a new data type called UserProfile*/
class UserProfile {
    /* this is declaring the variable username that can hold a string value*/
    String username;
   /* this is declaring the variable that can hold a numerical value*/
    int level;
      /* this this is declaring the variable that can hold true/false*/
    boolean isPremium;
/* This is the builder of the UserProfile using the variables assigned username,level, and checking if it isPremium or not. Public means it can be accessed by other classes*/
    public UserProfile(String username, int level, boolean isPremium) {
      /*this is assigning the value of username to the variable username, level and isPremium*/
        this.username = username;
        this.level = level;
        this.isPremium = isPremium;
    }
/*public means this can be accessed by other classes, void indicates that the method does not return a value. Here it is outputting the String of username i.e SweepTheory, level-1 and isPremium*/
    public void printProfile() {
      /*this is outputting the data that was collectued during the userprofile creation to the screen*/
        System.out.println("User: " + username + ", Level: " + level + ", Premium: " + isPremium);
    }
/*This is the main method. Strting point of where the program begins to run. Its creating a new UserProfile object and then calls a method to display it*/
    public static void main(String[] args) {
        UserProfile user = new UserProfile("player_01", 5, true);
        user.printProfile();
    }
}
