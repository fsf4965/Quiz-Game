/*
COMP603 ASSIGNMENT PART 1

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
      10 questions(and multiple answers)*/
    public ArrayList<Question> movies()
    {
        ArrayList<Question> movies = new ArrayList<Question>();
        movies.add(new Movies("This is a fictional company in which movie? Carver Media Group Network", new String[]{"Resident Evil", "Die-Hard", "Superman", "Tomorrow Never Dies"}, "Tomorrow Never Dies"));
        movies.add(new Movies("Who performed this James Bond song? Nobody Does It Better", new String[]{"Linda Rondstadt", "Crystal Gayle", "Tina Turner", "Carly Simon"}, "Carly Simon"));
        movies.add(new Movies("In Star Wars: A New Hope (1977), which droid contains the hidden plans of the Death Star?", new String[]{"BB-8", "IG-88", "R2-D2", "C-3PO"}, "R2-D2"));
        movies.add(new Movies("These movies were released in which year? Schindler's List, Sleepless in Seattle, Mrs. Doubtfire, In the Name of the Father", new String[]{"1989", "1995", "1993", "1991"}, "1993"));
        movies.add(new Movies("Which character from a Pixar film is described here? An ochre starfish and member of the Tank Gang (Finding Nemo)", new String[]{"Sully", "Peach", "Luigi", "Chip"}, "Peach"));
        movies.add(new Movies("This Disney or Pixar movie was released in which year? Tarzan", new String[]{"1990", "1999", "1996", "1993"}, "1999"));
        movies.add(new Movies("At the end of Back to the Future Part III (1990), what are the names of Doc's children?", new String[]{"Albert and Einstein", "Jules and Verne", "Nikola and Tesla", "Benjamin and Franklin"}, "Jules and Verne"));
        movies.add(new Movies("Harry Potter becomes a member of which house at Hogwarts?", new String []{"Hufflepuff", "Ravenclaw", "Gryffindor", "Slytherin"}, "Gryffindor"));
        movies.add(new Movies("Which character from a Disney film is described here? A princess of Arendelle and the youngest of the two sisters (Frozen)", new String[]{"Anna", "Jane", "Elsa", "Areil"}, "Anna"));
        movies.add(new Movies("Which character from a Pixar film is described here? A glossy and egg-shaped robot probe whose directive is to locate vegetation on Earth and verify habitability (WALL-E)", new String[]{"AMY", "INA", "ULA", "EVE"},"EVE"));
        
        return movies;
    }
    
    public ArrayList<Question> popmusic()
    {
        ArrayList<Question> popmusic = new ArrayList<Question>();
        popmusic.add(new PopMusic("These words are from which song? Woke up, fell out of bed, dragged a comb across my head", new String[]{"In My Life", "A Day In The Life", "Lucy In The Sky With Diamonds", "The Ballad Of John And Yoko"}, "A Day In The Life"));
        popmusic.add(new PopMusic("These words are from which song? That's why they call me Mr. Fahrenheit.", new String[] {"Play The Game", "Princes Of The Universe", "Don't Stop Me Now", "Flash"} , "Don't Stop Me Now"));
        popmusic.add(new PopMusic("These words are from which song? Too late, my time has come. Sent shivers down my spine, body's achin' all the time.", new String[]{"It's A Hard Life", "Killer Queen", "Bohemian Rhapsody", "Save Me"}, "Bohemian Rhapsody"));
        popmusic.add(new PopMusic("These words are from which song? I'm giving you on count of three to show your stuff or let it be...", new String[]{"Bad", "I Just Can’t Stop Loving You", "Dangerous", "Smooth Criminal"}, "Bad"));
        popmusic.add(new PopMusic("These words are from which song? Hey pretty baby with the high heels on, you give me fever", new String[]{"Baby Be Mine", "Liberian Girl", "The Way You Make Me Feel", "P.Y.T"}, "The Way You Make Me Feel"));
        popmusic.add(new PopMusic("Which band's name was inspired by this? Named after a South African Football Club", new String[]{"Joy Division", "Franz Ferdinand", "Kaiser Chiefs", "U2"}, "Kaiser Chiefs"));
        popmusic.add(new PopMusic("These words are from which song? It's a god-awful small affair. To the girl with the mousy hair.", new String[]{"Life On Mars?", "Beauty And The Beast", "Hello Spaceboy", "Loving The Alien"}, "Life On Mars?"));
        popmusic.add(new PopMusic("Which band's name was inspired by this? Saw this on an electric sewing machine", new String[]{"10cc", "Genesis", "REM", "AC/DC"}, "AC/DC"));
        popmusic.add(new PopMusic("Who had a hit with this song? Funky Town", new String[]{"Fleetwood Mac", "Rod Stewart", "Lipps Inc.", "Dolly Parton"}, "Lipps Inc."));
        popmusic.add(new PopMusic("Who had a hit with this song? Ride Like The Wind", new String[]{"Frank Sinatra", "Christopher Cross", "Kenny Rogers", "Bruce Springsteen"}, "Christopher Cross")); 
        
        return popmusic;
    }
    
    public ArrayList<Question> mythology()
    {
        ArrayList<Question> mythology = new ArrayList<Question>();
        mythology.add(new Mythology("What is the Greek equivalent of this Roman god or goddess? Vediovis", new String[]{"Geras", "Eurus", "Asclepius", "Satyr"}, "Asclepius"));
        mythology.add(new Mythology("What is a matching description for this Olympian god or goddess? Psyche", new String[]{"Goddess of compassion", "Muse goddess of love poetry and lyrics", "Muse goddess of hymns", "Goddess of luck, destiny and fortune"}, "Goddess of compassion"));
        mythology.add(new Mythology("What is a matching description for this Roman god or goddess? Apollo", new String[]{"God of the sun, poetry, music and oracles", "God of Fire, the forge and blacksmiths", "God of wine", "God of love"}, "God of the sun, poetry, music and oracles"));
        mythology.add(new Mythology("Which symbols are most closely associated with this Greek god or goddess? Asclepius", new String[]{"A serpent-entwined staff", "Club, Nemean lion, bow and arrows", "Sickle, scythe, grain, snake and harpe", "Shield, spear, helmet, dog, boar, vulture, torch"}, "A serpent-entwined staff"));
        mythology.add(new Mythology("What is a matching description for this Egyptian god or goddess? Atum ", new String[]{"The oldest creator deity", "God of embalming and the dead", "God of wind and air", "God of desert, storms, foreigners, darkness, chaos"}, "The oldest creator deity"));
        mythology.add(new Mythology("What is a matching description for this Roman god or goddess? Trivia", new String[]{"Goddess of death", "Goddess of dusk", "Goddess of hope", "Goddess of magic"}, "Goddess of magic"));
        mythology.add(new Mythology("In Norse Mythology, what is the name of the sea serpent, a son of Loki, that lives in the great ocean and can surround the earth and grasp its own tail?", new String[]{"Jörmungandr", "Mjölnir", "Ragnarok", "Heimdal"}, "Jörmungandr"));
        mythology.add(new Mythology("What is a matching description for this Greek mythological creature? Ophiotaurus", new String[]{"Three-headed monster, partly lion, goat and snake", "White-winged horse", "100-handed, dreadful monsters", "Part bull and part serpent"}, "Part bull and part serpent"));
        mythology.add(new Mythology("In Norse mythology, what is the common name for the battle at the end of the world?", new String[]{"Yggdrasil", "Ragnarok", "Fimbulvetr", "Vadgelmir"}, "Ragnarok"));
        mythology.add(new Mythology(": In Norse mythology, who is the daughter of Loki and a giantess, that reigns over the realm of the dead, that bears her name?", new String[]{"Hel", "Skaði", "Etheria", "Nysa"}, "Hel"));
        
        return mythology;
    }
    
    public ArrayList<Question> computer()
    {
        ArrayList<Question> computer = new ArrayList<Question>();
        computer.add(new Computer("What is a common name for this computer symbol? +", new String[]{"Equals", "Plus", "Hash/Sharp", "Slash"}, "Plus"));
        computer.add(new Computer("Which computer symbol matches this name? Apostrophe", new String[]{"|", "@", "'", "©"}, "'"));
        computer.add(new Computer("What computer term is described here? Specific computer language used to manage data in database systems ", new String[]{"SQL", "DPI", "BUG", "MP3"}, "SQL"));
        computer.add(new Computer("This computer abbreviation usually means ? GUI", new String[]{"Generated User Interface", "Group-User Interaction", "General User Interaction", "Graphical User Interface"}, "Graphical User Interface"));
        computer.add(new Computer("This is a character from which video game (series)? Mario", new String[]{"Donkey Kong", "Devil May Cry", "Call of Duty 4", "Final Fantasy"}, "Donkey Kong"));
        computer.add(new Computer("This computer abbreviation usually means? AI", new String[]{"Automated Index", "Active Interface", "Artificial Intelligence", "Advanced Interaction"}, "Artificial Intelligence"));
        computer.add(new Computer("What computer term is described here? Well-known program developed by Microsoft for creating, editing and formatting of text and other features", new String[]{"BIOS", "HTML", "MIDI", "WORD"}, "WORD"));
        computer.add(new Computer("What computer term is described here? List-oriented programming language, originally specified in 1958", new String[]{"Java", "SVGA", "HTTP", "LISP"}, "LISP"));
        computer.add(new Computer("Who is considered to be the world's first programmer (1843). A software language was named in this person's honour", new String[]{"Alan Turing", "George Boole", "Ada Byron Lovelace", "Konrad Zuse"}, "Ada Byron Lovelace"));
        computer.add(new Computer("Who created Napster ", new String[]{"David Filo", "Jerry Yang", "Shawn Fanning", "Sabeer Bhatia"}, "Shawn Fanning"));
       
        return computer;
    }
    
    public ArrayList<Question> geography()
    {
        ArrayList<Question> geography = new ArrayList<Question>();
        geography.add(new Geography("This is the capital of which country or territory? Mamoudzou", new String[]{"Aruba", "French Polynesia", "Mayotte", "Saint Helena"}, "Mayotte"));
        geography.add(new Geography("What is the capital of this country? Philippines", new String[]{"Bogota", "Islamabad", "Manila", "Jakarta"}, "Manila"));
        geography.add(new Geography("What is the capital of this country? South Korea", new String[]{"Seoul", "Jakarta", "Bogota", "Islamabad"}, "Seoul"));
        geography.add(new Geography("This landmark can be found in or near which of these locations? The Great Pyramid", new String[]{"Cairo", "Giza", "Luxor", "Jerusalem"}, "Giza"));
        geography.add(new Geography("Where can we find this mountain (range)? Mount Olympus", new String[]{"Greece", "Turkey", "Israel", "Italy"}, "Greece"));
        geography.add(new Geography("This landmark can be found in or near which of these locations? St. Pauls Cathedral", new String[]{"London", "Zurich", "Saint Petersburg", "New York"}, "London"));
        geography.add(new Geography("This landmark can be found in or near which of these locations? Palace Of Versailles", new String[]{"Paris", "Berlin", "London", "Vienna"}, "Paris"));
        geography.add(new Geography("This landmark can be found in or near which of these locations? Machu Pichu", new String[]{"Colombia", "Mexico", "Peru", "Bolivia"}, "Peru"));
        geography.add(new Geography("This landmark can be found in or near which of these locations? Saint Peter's Bascilica", new String[]{"The Vatican", "Florence", "Madrid", "Saint Petersburg"}, "The Vatican"));
        geography.add(new Geography("Which international river flows through these countries? Brazil, Colombia and Venezuela", new String[]{"Xingu", "Rio Negro", "Putumayo", "Pilcomayo"}, "Rio Negro"));
        
        return geography;
    }
}
