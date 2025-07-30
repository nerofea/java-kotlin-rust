struct UserProfile {
    username: String,
    level: u32,
    is_premium: bool,
}

fn main() {
    let profile = UserProfile {
        username: String::from("player_01"),
        level: 5,
        is_premium: true,
    };

    println!(
        "User: {}, Level: {}, Premium: {}",
        profile.username, profile.level, profile.is_premium
    );
}
