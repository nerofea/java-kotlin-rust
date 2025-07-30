  /* the class is defining new reference type. This will take all the data that is stored inside of it and create a UserProfile with whatver the Username, Level and if they pay the premiumfee.
    This is making a reference for a Userprofile*/
class UserProfile {
    /* this is taking a string value of whatever the username is and adding it to the user profile*/
    String username;
   /* this is taking a numerical value of whatever the level is and adding it to the user profile*/
    int level;
      /* this is checking to see if the User has premium or not and adding it to the user profile. Im assuming for some type of subscription based application*/
    boolean isPremium;
/*A public class member or constructor is accessible throughout the package where it is declared and from any other package, provided the package in which it is declared is observable*/
    public UserProfile(String username, int level, boolean isPremium) {
      /*this is assigning the value of username to the variable username, level and isPremium*/
        this.username = username;
        this.level = level;
        this.isPremium = isPremium;
    }
/*public means this can be accessed from anywhere, void indicates that the method does not return a value. He it is outputting the String of username i.e SweepTheory, level-1 and isPremium*/
    public void printProfile() {
      /*this is outputting the data that was collectued during the userprofile creation to the screen*/
        System.out.println("User: " + username + ", Level: " + level + ", Premium: " + isPremium);
    }

    public static void main(String[] args) {
        UserProfile user = new UserProfile("player_01", 5, true);
        user.printProfile();
    }
}
