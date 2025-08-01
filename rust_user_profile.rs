//A struct, or structure, is a custom data type that lets you package together and name multiple related values that make up a meaningful group//
struct UserProfile {
   // 	Stores the user's name as a string//
    username: String,
    //stores the user's level **unsigned 32 bit integer**//
    level: u32,
    //stores if the user is a premium member true or false//
    is_premium: bool,
}
//this is the first function that gets ran when the program is started//
fn main() {
    //This creates a variable named 'profile' and assigns it a new instance of the UserProfile struct//
    let profile = UserProfile {
        //this is assinging the user name as a string of player_01//
        username: String::from("player_01"),
        //This assigns the level as level 5//
        level: 5,
        //this is assinging true to the  is_premium//
        is_premium: true,
    };
        //This is taking the Newly Created Instance of UserProfile and outputting to the console that Player_01 is level 5 and is premium//
    println!(
        "User: {}, Level: {}, Premium: {}",
        profile.username, profile.level, profile.is_premium
    );
}
