class UserProfile {
    String username;
    int level;
    boolean isPremium;

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
