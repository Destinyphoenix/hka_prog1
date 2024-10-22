class Friendbook{
	String owner;
	FriendbookEntry entry_1;
	FriendbookEntry entry_2;
	FriendbookEntry entry_3;
	FriendbookEntry entry_4;
	FriendbookEntry entry_5;
}

class FriendbookEntry{
	Author author;
	String text;
	
}

class Author{
	String name;
	Birthdate birthdate;
	String gender;
	AuthorPreferences preferences;
}

class AuthorPreferences{
	String color;
	String animal;
	String book;
	String movie;
	String music;
}

class Birthdate{
	int day;
	int month;
	int year;
}