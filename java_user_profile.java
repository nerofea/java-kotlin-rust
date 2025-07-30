class UserProfile {
    /* the class is defining new reference type. This will take all the data that is stored inside of it and create a UserProfile with whatver the Username, Level and if they pay the premiumfee.
    This is making a reference for a Userprofile*/
    String username;
    /* this is taking a string value of whatever the username is and adding it to the user profile*/
    int level;
    /* this is taking a numerical value of whatever the level is and adding it to the user profile*/
    boolean isPremium;
    /* this is checking to see if the User has premium or not and adding it to the user profile. Im assuming for some type of subscription based application*/

    public UserProfile(String username, int level, boolean isPremium) {
        this.username = username;
        this.level = level;
        this.isPremium = isPremium;
    }

    public void printProfile() {
        System.out.println("User: " + username + ", Level: " + level + ", Premium: " + isPremium);
    }

    public static void main(String[] args) {
        UserProfile user = new UserProfile("player_01", 5, true);
        user.printProfile();
    }
}
