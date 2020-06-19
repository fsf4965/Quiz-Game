/*
COMP603 ASSIGNMENT PART 2

Group ID: 20
Members: Duc Dao (18020007), Deni Sarito (17988272)
Project Title: General Quiz Game
*/
package quiz.game;
import java.util.*;

/*This class contains 5 separate ArrayList for each question categories*/
public class Question_DB 
{
    /*Each ArrayList has an element based off the Question class, and contains
      10 questions(and multiple answers).
    
      The data is collected from embedded database in the class DB_Connection,
      by calling the class to connect to the database, calling insertInto functions
      to supply the data, then use a for loop to retrieve it into a Question ArrayList
    */
    public ArrayList<Question> movies()
    {
        DB_Connection db = new DB_Connection();
        
        db.insertIntoMovies("This is a fictional company in which movie? Carver Media Group Network", "Resident Evil", "Die-Hard", "Superman", "Tomorrow Never Dies", "Tomorrow Never Dies");
        db.insertIntoMovies("Who performed this James Bond song? Nobody Does It Better", "Linda Rondstadt", "Crystal Gayle", "Tina Turner", "Carly Simon", "Carly Simon");
        db.insertIntoMovies("In Star Wars: A New Hope (1977), which droid contains the hidden plans of the Death Star?", "BB-8", "IG-88", "R2-D2", "C-3PO", "R2-D2");
        db.insertIntoMovies("These movies were released in which year? Schindlers List, Sleepless in Seattle, Mrs. Doubtfire, In the Name of the Father", "1989", "1995", "1993", "1991", "1993");
        db.insertIntoMovies("Which character from a Pixar film is described here? An ochre starfish and member of the Tank Gang (Finding Nemo)", "Sully", "Peach", "Luigi", "Chip", "Peach");
        db.insertIntoMovies("This Disney or Pixar movie was released in which year? Tarzan", "1990", "1999", "1996", "1993", "1999");
        db.insertIntoMovies("At the end of Back to the Future Part III (1990), what are the names of Docs children?", "Albert and Einstein", "Jules and Verne", "Nikola and Tesla", "Benjamin and Franklin", "Jules and Verne");
        db.insertIntoMovies("Harry Potter becomes a member of which house at Hogwarts?", "Hufflepuff", "Ravenclaw", "Gryffindor", "Slytherin", "Gryffindor");
        db.insertIntoMovies("Which character from a Disney film is described here? A princess of Arendelle and the youngest of the two sisters (Frozen)", "Anna", "Jane", "Elsa", "Areil", "Anna");
        db.insertIntoMovies("Which character from a Pixar film is described here? A glossy and egg-shaped robot probe whose directive is to locate vegetation on Earth and verify habitability (WALL-E)", "AMY", "INA", "ULA", "EVE","EVE");
        
        ArrayList<String> moviesQuestions = db.moviesQuestions();
        ArrayList<String[]> moviesOptions = db.moviesOptions();
        ArrayList<String> moviesAnswer = db.moviesAnswer();
        
        ArrayList<Question> movies = new ArrayList<Question>();
        
        for (int cd = 1; cd <= 10; ++cd)
        {
            movies.add(new Movies(moviesQuestions.get(cd), moviesOptions.get(cd), moviesAnswer.get(cd)));
        }
        
        return movies;
    }
    
    public ArrayList<Question> popmusic()
    {
        DB_Connection db = new DB_Connection();
        
        db.insertIntoPopMusic("These words are from which song? Woke up, fell out of bed, dragged a comb across my head", "In My Life", "A Day In The Life", "Lucy In The Sky With Diamonds", "The Ballad Of John And Yoko", "A Day In The Life");
        db.insertIntoPopMusic("These words are from which song? Thats why they call me Mr. Fahrenheit", "Play The Game", "Princes Of The Universe", "Dont Stop Me Now", "Flash" , "Dont Stop Me Now");
        db.insertIntoPopMusic ("These words are from which song? Too late, my time has come. Sent shivers down my spine, bodys achin all the time.", "Its A Hard Life", "Killer Queen", "Bohemian Rhapsody", "Save Me", "Bohemian Rhapsody");
        db.insertIntoPopMusic ("These words are from which song? Im giving you on count of three to show your stuff or let it be...", "Bad", "I Just Cant Stop Loving You", "Dangerous", "Smooth Criminal", "Bad");
        db.insertIntoPopMusic ("These words are from which song? Hey pretty baby with the high heels on, you give me fever", "Baby Be Mine", "Liberian Girl", "The Way You Make Me Feel", "P.Y.T", "The Way You Make Me Feel");
        db.insertIntoPopMusic ("Which bands name was inspired by this? Named after a South African Football Club", "Joy Division", "Franz Ferdinand", "Kaiser Chiefs", "U2", "Kaiser Chiefs");
        db.insertIntoPopMusic ("These words are from which song? Its a god-awful small affair. To the girl with the mousy hair.", "Life On Mars?", "Beauty And The Beast", "Hello Spaceboy", "Loving The Alien", "Life On Mars?");
        db.insertIntoPopMusic ("Which bands name was inspired by this? Saw this on an electric sewing machine", "10cc", "Genesis", "REM", "AC/DC", "AC/DC");
        db.insertIntoPopMusic ("Who had a hit with this song? Funky Town", "Fleetwood Mac", "Rod Stewart", "Lipps Inc.", "Dolly Parton", "Lipps Inc.");
        db.insertIntoPopMusic ("Who had a hit with this song? Ride Like The Wind", "Frank Sinatra", "Christopher Cross", "Kenny Rogers", "Bruce Springsteen", "Christopher Cross");
        
        ArrayList<String> popmusicQuestions = db.popmusicQuestions();
        ArrayList<String[]> popmusicOptions = db.popmusicOptions();
        ArrayList<String> popmusicAnswer = db.popmusicAnswer();
        
        ArrayList<Question> popmusic = new ArrayList<Question>();
        
        for (int cd = 1; cd <= 10; ++cd)
        {
            popmusic.add(new PopMusic(popmusicQuestions.get(cd), popmusicOptions.get(cd), popmusicAnswer.get(cd)));
        }
        
        return popmusic;
    }
    
    public ArrayList<Question> mythology()
    {
        DB_Connection db = new DB_Connection();
        
        db.insertIntoMythology("What is the Greek equivalent of this Roman god or goddess? Vediovis", "Geras", "Eurus", "Asclepius", "Satyr", "Asclepius");
        db.insertIntoMythology ("What is a matching description for this Olympian god or goddess? Psyche", "Goddess of compassion", "Muse goddess of love poetry and lyrics", "Muse goddess of hymns", "Goddess of luck, destiny and fortune", "Goddess of compassion");
        db.insertIntoMythology ("What is a matching description for this Roman god or goddess? Apollo", "God of the sun, poetry, music and oracles", "God of Fire, the forge and blacksmiths", "God of wine", "God of love", "God of the sun, poetry, music and oracles");
        db.insertIntoMythology ("Which symbols are most closely associated with this Greek god or goddess? Asclepius", "A serpent-entwined staff", "Club, Nemean lion, bow and arrows", "Sickle, scythe, grain, snake and harpe", "Shield, spear, helmet, dog, boar, vulture, torch", "A serpent-entwined staff");
        db.insertIntoMythology ("What is a matching description for this Egyptian god or goddess? Atum ", "The oldest creator deity", "God of embalming and the dead", "God of wind and air", "God of desert, storms, foreigners, darkness, chaos", "The oldest creator deity");
        db.insertIntoMythology ("What is a matching description for this Roman god or goddess? Trivia", "Goddess of death", "Goddess of dusk", "Goddess of hope", "Goddess of magic", "Goddess of magic");
        db.insertIntoMythology ("In Norse Mythology, what is the name of the sea serpent, a son of Loki, that lives in the great ocean and can surround the earth and grasp its own tail?", "Jörmungandr", "Mjölnir", "Ragnarok", "Heimdal", "Jörmungandr");
        db.insertIntoMythology ("What is a matching description for this Greek mythological creature? Ophiotaurus", "Three-headed monster, partly lion, goat and snake", "White-winged horse", "100-handed, dreadful monsters", "Part bull and part serpent", "Part bull and part serpent");
        db.insertIntoMythology ("In Norse mythology, what is the common name for the battle at the end of the world?", "Yggdrasil", "Ragnarok", "Fimbulvetr", "Vadgelmir", "Ragnarok");
        db.insertIntoMythology ("In Norse mythology, who is the daughter of Loki and a giantess, that reigns over the realm of the dead, that bears her name?", "Hel", "Skaði", "Etheria", "Nysa", "Hel");
        
        ArrayList<String> mythologyQuestions = db.mythologyQuestions();
        ArrayList<String[]> mythologyOptions = db.mythologyOptions();
        ArrayList<String> mythologyAnswer = db.mythologyAnswer();
        
        ArrayList<Question> mythology = new ArrayList<Question>();
        
        for (int cd = 1; cd <= 10; ++cd)
        {
            mythology.add(new Mythology(mythologyQuestions.get(cd), mythologyOptions.get(cd), mythologyAnswer.get(cd)));
        }
        
        return mythology;
    }
    
    public ArrayList<Question> computer()
    {
        DB_Connection db = new DB_Connection();
        
        db.insertIntoComputer("What is a common name for this computer symbol? +", "Equals", "Plus", "Hash/Sharp", "Slash", "Plus");
        db.insertIntoComputer ("What is the BIOS most important role", "Loading the operating system", "Initiating the microprocessor", "Running applications", "All of the above", "Loading the operating system");
        db.insertIntoComputer ("What computer term is described here? Specific computer language used to manage data in database systems ", "SQL", "DPI", "BUG", "MP3", "SQL");
        db.insertIntoComputer ("This computer abbreviation usually means ? GUI", "Generated User Interface", "Group-User Interaction", "General User Interaction", "Graphical User Interface", "Graphical User Interface");
        db.insertIntoComputer ("This is a character from which video game (series)? Mario", "Donkey Kong", "Devil May Cry", "Call of Duty 4", "Final Fantasy", "Donkey Kong");
        db.insertIntoComputer ("This computer abbreviation usually means? AI", "Automated Index", "Active Interface", "Artificial Intelligence", "Advanced Interaction", "Artificial Intelligence");
        db.insertIntoComputer ("What computer term is described here? Well-known program developed by Microsoft for creating, editing and formatting of text and other features", "BIOS", "HTML", "MIDI", "WORD", "WORD");
        db.insertIntoComputer ("What computer term is described here? List-oriented programming language, originally specified in 1958", "Java", "SVGA", "HTTP", "LISP", "LISP");
        db.insertIntoComputer ("Who is considered to be the worlds first programmer (1843). A software language was named in this persons honour", "Alan Turing", "George Boole", "Ada Byron Lovelace", "Konrad Zuse", "Ada Byron Lovelace");
        db.insertIntoComputer ("Who created Napster ", "David Filo", "Jerry Yang", "Shawn Fanning", "Sabeer Bhatia", "Shawn Fanning");

        ArrayList<String> computerQuestions = db.computerQuestions();
        ArrayList<String[]> computerOptions = db.computerOptions();
        ArrayList<String> computerAnswer = db.computerAnswer();
        
        ArrayList<Question> computer = new ArrayList<Question>();
        
        for (int cd = 1; cd <= 10; ++cd)
        {
            computer.add(new Computer(computerQuestions.get(cd), computerOptions.get(cd), computerAnswer.get(cd)));
        }
        
        return computer;
    }
    
    public ArrayList<Question> geography()
    {
        DB_Connection db = new DB_Connection();
        
        db.insertIntoGeography("This is the capital of which country or territory? Mamoudzou", "Aruba", "French Polynesia", "Mayotte", "Saint Helena", "Mayotte");
        db.insertIntoGeography ("What is the capital of this country? Philippines", "Bogota", "Islamabad", "Manila", "Jakarta", "Manila");
        db.insertIntoGeography ("What is the capital of this country? South Korea", "Seoul", "Jakarta", "Bogota", "Islamabad", "Seoul");
        db.insertIntoGeography ("This landmark can be found in or near which of these locations? The Great Pyramid", "Cairo", "Giza", "Luxor", "Jerusalem", "Giza");
        db.insertIntoGeography ("Where can we find this mountain (range)? Mount Olympus", "Greece", "Turkey", "Israel", "Italy", "Greece");
        db.insertIntoGeography ("This landmark can be found in or near which of these locations? St. Pauls Cathedral", "London", "Zurich", "Saint Petersburg", "New York", "London");
        db.insertIntoGeography ("This landmark can be found in or near which of these locations? Palace Of Versailles", "Paris", "Berlin", "London", "Vienna", "Paris");
        db.insertIntoGeography ("This landmark can be found in or near which of these locations? Machu Pichu", "Colombia", "Mexico", "Peru", "Bolivia", "Peru");
        db.insertIntoGeography ("This landmark can be found in or near which of these locations? Saint Peters Bascilica", "The Vatican", "Florence", "Madrid", "Saint Petersburg", "The Vatican");
        db.insertIntoGeography ("Which international river flows through these countries? Brazil, Colombia and Venezuela", "Xingu", "Rio Negro", "Putumayo", "Pilcomayo", "Rio Negro");

        ArrayList<String> geographyQuestions = db.geographyQuestions();
        ArrayList<String[]> geographyOptions = db.geographyOptions();
        ArrayList<String> geographyAnswer = db.geographyAnswer();
        
        ArrayList<Question> geography = new ArrayList<Question>();
        
        for (int cd = 1; cd <= 10; ++cd)
        {
            geography.add(new Geography(geographyQuestions.get(cd), geographyOptions.get(cd), geographyAnswer.get(cd)));
        }
        
        return geography;
    }
}
