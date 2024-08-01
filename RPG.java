//Date: Dec 9 2020 -
//Purpose: RPG Creation for Comicon

/**************MASTER TO-DO LIST:
 DO loop?
?Operator
*/
//***JAVA IMPORTS
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.text.*;
import javax.swing.*;
import java.applet.*;
import java.awt.*;

public class RPG
{
    //****Global variables
    int points = 0;
    String PlayerName = "";
    int duck = 0;
    int tries = 0;
    char winner = 'n';
    //Unicode variables
    char copyright = 0x00A9;
    char regi = 0x00AE;
    char o = 0x00D6;
    char b = 0x2022;

    public static void main (String args[])
    {
	new RPG ();
    }


    public RPG ()
    { //This is the constructor

	Playerlogin ();
    }


    //Image path
    protected static ImageIcon createImageIcon (String path)
    { //image method
	java.net.URL imgURL = RPG.class.getResource (path);
	if (imgURL != null)
	{
	    return new ImageIcon (imgURL);
	}
	else
	{
	    System.err.println ("Couldn't find file: " + path);
	    return null;
	}
    }


    public void pause ()
    { //pause method, key is pressed, stories continues
	System.out.println ("");
	char pause = IO.inputChar ("[--PRESS ENTER TO CONTINUE--]\n");
	System.out.println ("");
    }


    public void Playerlogin ()
    { //Systems loading and Player login method. Show user game selectives
	//Pop-up messages
	JOptionPane.showMessageDialog (null, createImageIcon ("RPG_LOGO(GIF).gif"), "Production of BRIO TECH", JOptionPane.INFORMATION_MESSAGE);
	JOptionPane.showMessageDialog (null, "Systems loading...", "...", JOptionPane.INFORMATION_MESSAGE);
	String username = JOptionPane.showInputDialog ("Please enter your username.");
	//System loading prints
	IO.printSlow ("Please wait...");
	IO.printSlow ("Reconfoobling energymotron...");
	IO.printSlow ("Creating time-loop inversion field...");
	IO.printSlow ("Downloading Satellite Terrain Data...");
	System.out.println ("Gamer Cube is processing data....");
	//current date
	DateFormat df = new SimpleDateFormat ("EEEE, MMMM dd, yyyy");
	Date dateobj = new Date ();
	IO.printSlow ("The date is " + df.format (dateobj) + " ...\n");
	//ASCII image of logo
	Cubelogo ();
	//prints game choices
	System.out.println ("Welcome back " + username + "!\n");
	System.out.println ("\nGames downloaded: ");
	System.out.println ("\tA)[SWEET TOOTH" + copyright + regi + "]");
	System.out.println ("\tB)[--REDACTED--" + regi + "] ");
	System.out.println ("\tC)[--ALPHA EXCLUSIVE--" + copyright + "]");
	System.out.println ("\tD)[--BETA EXCLUSIVE--" + copyright + "]");
	//prompts user for game option
	String Chgame = IO.inputString ("Please choose a game to play: ");
	while (Chgame != "a")
	{
	    if (Chgame.equalsIgnoreCase ("a"))
	    {
		IO.printSlow ("\n\nLoading...\n\n");

		GameIntro ();
	    }
	    else if (Chgame.equalsIgnoreCase ("d"))
		System.out.println ("Sorry, your account does not have access to the BETA title.");
	    else if (Chgame.equalsIgnoreCase ("c") || Chgame.equalsIgnoreCase ("d"))
		System.out.println ("Sorry, your account does not have access to the ALHPA title.");
	    else if (Chgame.equalsIgnoreCase ("b"))
		System.out.println ("Sorry, that game is not available at this time. Try again later.");
	    Chgame = IO.inputString ("Please choose another game: ");
	}
    }


    public void GameIntro ()
    { //method: Introduction to game, setting, problem, goal, ascii images of area -- points awarded - 1
	TITLE1 ();
	System.out.println ("...\n");
	System.out.println ("You do not see or feel anyhing. It is pitch black.");
	System.out.println ("\"You..!\"\n");
	System.out.println ("\"You over there - yes, yes you.\" A voice says, it seems annoyed.");
	System.out.println ("\"What is your name?\" the voice asks.\n");
	PlayerName = IO.inputString ("\t---ENTER NAME---:    ");
	JOptionPane.showMessageDialog (null, "YOU CANNOT CHANGE YOUR NAME SO FORTH", "...", JOptionPane.WARNING_MESSAGE);
	System.out.println ("\n\"Alright - perfect. Now go inside hurry!\" He pushes you through the gates.\n\n ");
	IO.printSlow ("Calibrating location...\n");
	pause ();
	//prints location, ASCII of castle, player, location
	System.out.println ("\t[---YOU HAVE ARRIVED AT THE TOFFE FORTRESS---]\n");
	FortressASCII ();
	pause ();
	Castle ();
	PLAYER ();
	System.out.println ("[---THIS IS YOU---]\n\n");
	System.out.println ("You fall to your knees, only look up to see a king in glorious candy-cane steel armor smiling down at you.\n");
	King ();
	System.out.print ("\"WELCOME, Knight " + PlayerName + "!\" King Ko" + o + "kies exaclaims.");
	System.out.println ("\n\"Thank you for taking your time to help us, we are in dire need of you!\" He wails in distress.");
	System.out.println ("\"The frosting dragon from Mount Ice-cream has threatend the kingdom with it's frosted breath!\"\n");
	pause ();
	SurprisedKing ();
	System.out.println ("\"- Please -\" The king yells and falls out of his throne, begging. \" The dragon demands he must be baked the BEST cake in our kingdom.\"");
	System.out.print ("He cries horribly and all you do is stare in concern. You nod your head hesitantly.");
	KingKnight ();
	System.out.println ("\"PERFECT!\" He says, suddenly happy.");
	System.out.println ("He gives you an old paper.\n");
	System.out.println ("\"This is the map of the kingdom. You must find THE BEST ingredients and THE BEST utensils all over the kingdom!\"");
	kingServants ();
	System.out.println ("King Ko" + o + "kie quickly shoos you away and his servants kick you out.");
	System.out.println ("You look at your map, to see Gumdrop Huts is first. You take a deep breath, and start your journey.");
	IO.printSlow (". . .", 300);
	pause ();
	//pop-up of Instructions
	JOptionPane.showMessageDialog (null, "YOU HAVE COMEPLETED THE [INTRODUCTION]", "...", JOptionPane.INFORMATION_MESSAGE);
	JOptionPane.showMessageDialog (null, "* * * I N S T R U C T I O N S * * * \n \n"
		+ "The Frosted dragon is terrorrizing the \n"
		+ "the Candie Kingdom and King Ko" + o + "kie \n"
		+ "has tasked you to find the needed ingrdients that are scattered \n"
		+ "around the kingdom. But you'll need a recipe... \n\n"
		+ "Points can be gained or lost when completing a challenge.\n"
		+ "Have fun!", "Instructions", JOptionPane.QUESTION_MESSAGE);
	points++;
	System.out.println ("[--YOU HAVE COMPLETED INTRODUCTION--]");
	//points awarded
	pointsASCII ();
	IO.printSlow ("\n[--POINTS HAVE BEEN AWARDED--]");
	System.out.println ("[--TOTAL POINTS - " + points + " --]\n");
	//leads to next location
	LOCATION1 ();
    }


    public void LOCATION1 ()
    { //method: first task, retrieve recipe, points available - 3
	System.out.println ("\t[--YOU HAVE ARRIVED AT GUMDROP HUTS--]\n");
	GumdropHutsASCII ();
	System.out.println ("\nYou notice that the king gives you nothing but a map.");
	System.out.println ("To bake a cake, you need a recipe and the flour fairies store all the recipes in their hideout.");
	GumdropHouseASCII ();
	pause ();
	System.out.println ("You knock on the tiny door, for a flour pixie to open. She is small and she is mean-looking.\n");
	FlourFairy ();
	System.out.println ("\"Whaddya want?! I'm kinda busy here!\" She yells bothered.");
	pause ();
	System.out.println ("You tell her calmly about your assignment, but her mood does not change.");
	System.out.println ("\n\"Well," + " if you want the cake recipe, you MUST answer this riddle,\" She looks at her nails.");
	System.out.println ("\"It is the BEST cake recipe afterall~\" She smirks slyly.");
	System.out.println ("...You agree begrugindly.\n\n");
	MeanFairy ();
	pause ();
	//intructions of task 1
	JOptionPane.showMessageDialog (null, "* * * I N S T R U C T I O N S * * * \n \n"
		+ "You must answer three riddles correctly\n"
		+ "to achieve the [RECIPE] \n"
		+ "If it is answered correctly in three tries or less\n"
		+ "A point will be rewarded, if not, points will be redacted.\n \n"
		+ "Have fun!", "RIDDLE RIDDLE", JOptionPane.INFORMATION_MESSAGE);
	//*******GAME OF TASK 1
	RiddleASCII ();
	System.out.println ("\n\t***RIDDLE RIDDLE!***\n");
	//Riddle 1
	String ans1 = " ";
	for (int tries = 1 ; tries <= 3 && !ans1.equalsIgnoreCase ("watermelon") ; tries++)
	{
	    ans1 = IO.inputString ("---\"It looks green, it opens red. What you eat is red," +
		    " but what you spit out is black."
		    + " What am I?\"---   ");
	    if (!ans1.equalsIgnoreCase ("watermelon"))
		System.out.println ("\n\"Hehe~ Sorry, that isn't right.\"\n\n");
	    else
	    {
		System.out.println ("\nThe flour pixie stares shocked...\"You did good.\"");
		BigFairy ();
		points++;
	    }
	    //user fails all three tries, cannot try again
	    if (tries == 3 && !ans1.equalsIgnoreCase ("watermelon") && !ans1.equalsIgnoreCase ("a watermelon"))
	    {
		System.out.println ("\"Haha, you cannot try again.\" The grouchy pixie giggles.");
		MeanFairy ();
	    }

	}

	System.out.println ("\n\"Alright, two more to go!\"");
	//Riddle 2
	pause ();
	RiddleASCII ();
	System.out.println ("\n\t***RIDDLE RIDDLE!***\n");
	String ans2 = " ";
	for (int tries = 1 ; tries <= 3 && !ans2.equalsIgnoreCase ("oven") ; tries++)
	{
	    ans2 = IO.inputString ("---\"When you need to cook some food, this appliance might be chosen.\n "
		    + "As it can bake some cookies, or a pizza - which is frozen. What am I?\"---  ");
	    if (!ans2.equalsIgnoreCase ("oven"))
	    { //user gets it wrong, try again
		System.out.println ("The pixie shakes her head.\n\n");
	    }
	    else
	    { //user gets it right, point given
		System.out.println ("\n\"Hm...I see, you are correct.\"");
		BigFairy ();
		points++;
	    }
	    //user fails all three tries, cannot try again
	    if (tries == 3 && !ans2.equalsIgnoreCase ("oven") && !ans2.equalsIgnoreCase ("an oven"))
	    {
		System.out.println ("\n\"Heh, out of tries.\" The grouchy pixie smiles.");
		MeanFairy ();
	    }

	}


	System.out.println ("\n\"Alright, last one, I hope you can get this right!\"  ");
	//Riddle 3
	pause ();
	RiddleASCII ();
	System.out.println ("\n\t***RIDDLE RIDDLE!***\n");
	String ans3 = " ";
	for (int tries = 1 ; tries <= 3 && !ans3.equalsIgnoreCase ("egg") ; tries++)
	{
	    ans3 = IO.inputString ("---\"A container without hinges, lock or a key, yet a golden treasure lies inside me. What am I?\"---   ");
	    if (!ans3.equalsIgnoreCase ("egg"))
	    {
		System.out.println ("\"Nope, that ain't quite right.\".\n\n");
	    }
	    else
	    {
		System.out.println ("\n\"Hmph! Well, you got it - whatever.\" The fairy says, crossing her tiny arms.");
		BigFairy ();
		points++;
	    }
	    //user fails all three tries, cannot try again
	    if (tries == 3 && !ans3.equalsIgnoreCase ("egg") && !ans3.equalsIgnoreCase ("an egg"))
	    {
		System.out.println ("The pixie smiles, \"Sorry Knight " + PlayerName + ", you're wrong.\"");
		MeanFairy ();
	    }
	}


	System.out.print ("\"That's all the riddles I have for you today. ");
	//point system of riddle, prompts different AI response
	if (points == 0)
	    System.out.println ("..You are really bad at this. Good luck saving the kingdom...\"");
	else if (points == 1)
	    System.out.println ("Well, you got one right, here you go.\"");
	else if (points == 2)
	    System.out.println ("Two of three, nice job.\"");
	else
	{
	    System.out.println ("Well, well, - I guess you are worthy of saving the kingdom!\"");
	}
	Recipe ();
	System.out.println ("The flour pixie hands you the [RECIPE], it has been added to your inventory. You thank her and be on your way.");
	//****TASK 1 COMPLETED -- game over
	IO.printSlow ("\n\n[--COMEPLETED RIDDLE RIDDLE--]");
	pause ();
	if (points > 0)
	{
	    IO.printSlow ("\n[--POINTS HAVE BEEN AWARDED--]");
	    pointsASCII ();

	}

	System.out.println ("[--TOTAL POINTS - " + points + " --]");
	//points-progress update
	JOptionPane.showMessageDialog (null, "* * * P O I N T  S Y S T E M * * * \n \n"
		+ "Every time you complete a challenge\n"
		+ "points may be rewarded if completed right.\n \n"
		+ "The more points gathered at the FINAL challenge,  \n"
		+ "A better ENDING will be unlocked.\n \n", "Points", JOptionPane.QUESTION_MESSAGE);
	pause ();
	//prompt user where they would like to do?
	CROSSROADS ();
    }


    public void CROSSROADS ()
    { //method: user chooses difficulty of next game.
	System.out.println ("You continue on your journey, following the map but you have been met with a crossroad.\n");
	CrossroadIMAGE ();
	System.out.println ("\t[--CHOICE ENCOUNTERED--]");
	//pop-up message instructions
	JOptionPane.showMessageDialog (null, "* * * C H O I C E * * * \n \n"
		+ "You have been met with a choice. Once you pick a choice,\n"
		+ " you CANNOT undo it. \n\n"
		+ "Lollipop Garden is a fairly easy path but not many points can be rewarded. \n"
		+ "Vanilla Creek is more difficult, but if done correctly, many points can be rewarded.\n \n"
		+ "Have fun!", "Choice", JOptionPane.WARNING_MESSAGE);
	String pathway = IO.inputString ("\"Which way would you like to go?\" The voice returns, asking.\n\n" +
		"A)[LOLLIPOP GARDEN]\n" +
		"B)[VANILLA CREEK]"
		+ "\n Choice:    ");
	//User picks location choice
	if (pathway.equalsIgnoreCase ("a"))
	{
	    IO.printSlow ("\n[---PLAYER HAS CHOSEN LOLLIPOP GARDEN--]\n");
	    LOCATION2 ();
	}

	else
	{
	    IO.printSlow ("\n[---PLAYER HAS CHOSEN VANILLA CREEK---]\n");
	    LOCATION3 ();
	}
    }


    public void LOCATION2 ()
    { //method: User picked LOCATION2, 2nd task of user. points available -- 4?
	IO.printSlow ("Re-formatting location....\n");
	LolliGardenASCII ();
	System.out.println ("\n\t[--YOU HAVE ARRIVED AT LOLLIPOP GARDEN--]\n");
	System.out.println ("You look around to see fields of lollipops with sugar cookie rocks. A chocolate duck sits on a sugar cookie, you approach.");
	DuckCry ();
	System.out.println ("\"Y-yes, what d-do you want?\", the duck asks you, caramel tears drip down from her dark macaroon eyes.");
	System.out.println ("You explain that her help is needed to save the kingdom, but she starts to cry.");
	System.out.println ("\"I a-am busy right n-now! I have lost my choco ducklings in the fields and they won't come out!\" She bawls.");
	System.out.println ("You offer your help and she nods meekly, \"If you can find my b-babies, I will give you the e-eggs you need.\"");
	pause ();
	//intructions of task 2
	JOptionPane.showMessageDialog (null, "* * * I N S T R U C T I O N S * * * \n \n"
		+ "You must find Mama Choco her \n"
		+ "ducklings within the Lollipop Fields.\n"
		+ "For each duck found, a point will be rewarded.\n"
		+ "Have fun!", "Maze", JOptionPane.INFORMATION_MESSAGE);
	System.out.println ("You hear something inside the maze.");
	A ();
    }


    //****GAME OF MAZE --- TASK 2
    public void A ()
    { //maze of A
	//return to point A (ending of maze game)
	if (duck >= 1)
	{
	    System.out.println ("You have found " + duck + " ducklings in the lollipop fields.");
	    System.out.println ("Mama Choco Duck is happy and gives you the eggs needed in the recipe.");
	    System.out.println ("You thank her and be on your way.");
	    pause ();
	    System.out.println ("\n\n[---YOU HAVE COMPLETED MAZE---]");
	    points = duck + points;
	    pointsASCII ();
	    IO.printSlow ("\n[--POINTS HAVE BEEN AWARDED--]");
	    System.out.println ("[--TOTAL POINTS - " + points + " --]");
	    pause ();
	    LOCATION4 ();
	}

	else
	{
	    MazeASCII ();
	    //First encounter
	    Maze ();
	    System.out.println ("You stand at the entrance of the lollipop entrance.");
	    System.out.println ("There is not much here, only Choco Duck crying.");
	    IO.printSlow ("[--WHERE WOULD YOU LIKE TO GO NEXT--]");
	    System.out.println ("(A) ENTRANCE");
	    System.out.println ("(B) INTO THE MAZE");
	    String choice = IO.inputString ("\nYour choice? (A/B) ");
	    System.out.println ();
	    if (choice.equalsIgnoreCase ("A"))
		A ();
	    else
		B ();
	}
    }


    public void B ()
    { //maze - b
	System.out.println ("You move forward into the lolli maze.");
	System.out.println ("Yet you are met with your first crossroads.");
	Pathway ();
	pause ();
	System.out.println ("You hear a soft rustling to the right.");
	System.out.println ("But something moves at the corner of your eyes to the left.\n");
	IO.printSlow ("[--WHERE WOULD YOU LIKE TO GO NEXT--]");
	System.out.println ("(B) STAY HERE");
	System.out.println ("(C) FOLLOW SOUND");
	System.out.println ("(D) FOLLOW MOVEMENT");
	String choice = IO.inputString ("\nYour choice? (B/C/D) ");
	System.out.println ();
	if (choice.equalsIgnoreCase ("B"))
	    B ();
	else if (choice.equalsIgnoreCase ("C"))
	    C ();
	else
	    D ();
    }


    public void C ()
    { //maze - c
	Maze ();
	System.out.println ("You decide to follow the sound.");
	System.out.println ("It takes a while to track down the sound but you get there.");
	System.out.println ("You slowly turn the corner to see....");
	System.out.println ("A frog!? A shiny frog at that too. It hops away into the cotton bushes.");
	System.out.println ("You did not find a duckling here.\n");
	IO.printSlow ("[--WHERE WOULD YOU LIKE TO GO NEXT--]");
	System.out.println ("(C) STAY HERE");
	System.out.println ("(B) CROSSROADS");
	//Input
	String choice = IO.inputString ("\nYour choice? (B/C) ");
	System.out.println ();
	if (choice.equalsIgnoreCase ("B"))
	    B ();
	else
	    C ();
    }


    public void D ()
    { ////maze - d
	System.out.println ("You decide to follow the shadow.");
	System.out.println ("You look around, looking to see anything out of the ordinary.");
	System.out.println ("Then!");
	ShadowMaze ();
	System.out.println ("The shadow re-appears running! You decide to follow it, but you don't know the direction.\n");
	Pathway ();
	IO.printSlow ("[--WHERE WOULD YOU LIKE TO GO NEXT--]");
	System.out.println ("(E) RIGHT");
	System.out.println ("(F) LEFT");
	//Input
	String choice = IO.inputString ("\nYour choice? (E/F) ");
	System.out.println ();
	if (choice.equalsIgnoreCase ("E"))
	    E ();
	else
	    F ();
    }


    public void E ()
    { //choco duck found
	//maze - e
	System.out.println ("You chase right, and the shadow is back in your sights!");
	System.out.println ("The shadow gets trapped into a corner and you can finally see it clearly.");
	BabyDuck ();
	System.out.println ("\"Why are you chasing me!?\" The choco duckling yells. You explain how you were task to find them and thier siblings.");
	System.out.println ("\"Oh well, sure! Let's go find them\"");
	duck++;
	System.out.println ("[--YOU HAVE FOUND " + duck + " DUCKLING--]\n");
	IO.printSlow ("[--WHERE WOULD YOU LIKE TO GO NEXT--]");
	System.out.println ("(F) GO LEFT");
	//Input
	String choice = IO.inputString ("\nYour choice? (F) ");
	System.out.println ();
	if (choice.equalsIgnoreCase ("F"))
	    F ();
    }


    public void F ()
    { //maze - f
	if (duck < 1)
	{
	    System.out.println ("You decide to turn left but you have lost the shadow.");
	    System.out.println ("Defeated, you search around the area under the sugar cookie rocks.");
	}

	else
	{
	    System.out.println ("You decide to now go left, and check under all the sugar cookie rocks");
	}
	//user found duck
	System.out.println ("\"I m-miss mommy...\" You hear a voice behind a rock.");
	duck++;
	BabyDuck ();
	System.out.println ("[--YOU HAVE FOUND " + duck + " DUCKLING--]\n");
	System.out.println ("You assure the small duck that we would find thier mother.\n");
	IO.printSlow ("[--WHERE WOULD YOU LIKE TO GO NEXT--]");
	System.out.println ("(G) MOVE FORWARD");
	System.out.println ("(H) MOVE DOWN");
	//Input
	String choice = IO.inputString ("\nYour choice? (G/H) ");
	System.out.println ();
	if (choice.equalsIgnoreCase ("G"))
	    G ();
	else
	    H ();
    }


    public void G ()
    { //maze - g
	System.out.println ("You move forward with " + duck + " following you.");
	System.out.println ("You check all the corners to see another duck eating a sugar cookie.");
	duck++;
	BabyDuck ();
	System.out.println ("[--YOU HAVE FOUND " + duck + " DUCKLINGS--]\n");
	IO.printSlow ("[--WHERE WOULD YOU LIKE TO GO NEXT--]");
	System.out.println ("(H) CONTINUE YOUR SEARCH");
	//Input
	String choice = IO.inputString ("\nYour choice? (H) ");
	System.out.println ();
	if (choice.equalsIgnoreCase ("H"))
	    H ();

    }


    public void H ()
    { //maze - h
	System.out.println ("You continue your search to find another choco duckling!");
	System.out.println ("The baby duck is eating a lollipop. It seems they had a lot.");
	duck++;
	BabyDuck ();
	System.out.println ("[--YOU HAVE FOUND " + duck + " DUCKLING--]\n");
	IO.printSlow ("[--WHERE WOULD YOU LIKE TO GO NEXT--]");
	System.out.println ("(I) SEARCH LAST CORNER");
	System.out.println ("(A) STOP SEARCHING; EXIT");
	//Input
	String choice = IO.inputString ("\nYour choice? (A/I) ");
	System.out.println ();
	if (choice.equalsIgnoreCase ("A"))
	    A ();
	else
	    I ();
    }


    public void I ()
    { //maze - i
	System.out.println ("You check one last corner.");
	System.out.println ("There isn't much here, but you instead hear something moving in the bushes.");
	System.out.println ("You try to call out, but there is just more movement.");
	IO.printSlow ("[--WHAT WOULD YOU LIKE TO DO NEXT--]");
	System.out.println ("(a) INSPECT");
	System.out.println ("(b) STOP; EXIT MAZE");
	String choice = IO.inputString ("\nYour choice? (a/b)");
	if (choice.equalsIgnoreCase ("A"))
	{
	    System.out.println ("You decide to inspect further, a vociferous growl lets out from the brushes. The ducks whimper beside you.");
	    System.out.println ("\"LEAVE OR ILL EAT YOU.\" The voice snarls out, terrifying the ducks, some of the ducklings run away, hiding further into the maze.");
	    if (duck >= 3)
	    {
		duck -= 3;
		System.out.println ("[--YOU HAVE LOST 3 DUCKS--]");
	    }
	    else
	    {
		duck--;
		System.out.println ("[--YOU HAVE LOST 1 DUCK--]");
	    }
	    System.out.println ("Scared as well, you run outside of the maze with the remaning ducks.");
	    A ();
	}
	else
	    A ();
    }


    //***End of maze methods***
    public void LOCATION3 ()
    { //method: 2nd task of user -- If user had chosed LOCATION3 at CROSSROADS, points ava. - 8
	System.out.println ("Configurating area....");
	VanillaCreekASCII ();
	System.out.println ("\t[--YOU HAVE ARRIVED AT VANILLA CREEK--]\n");
	RiverASCII ();
	System.out.println ("You approach the white creamy river, to see colourful mermaids swimming within, a strawberry one approaches you.");
	SwimMermaidASCII ();
	System.out.println ("\"Hello Knight! What are you doing here?\" She asks, staring sneakily at you.");
	System.out.println ("You explain your situation with the mermaids and all they do is laugh.");
	System.out.println ("\"Hehe, that's funny! Why don't we play a game?\"");
	pause ();
	Recipe ();
	System.out.println ("It looks like they do not believe you. You show them the recipe to the best cake.");
	System.out.println ("As you talk to the strawberry mermaid another one steals the recipe from your hand!\n");
	SmallMermaidASCII ();
	System.out.println ("\"Now, if you play with us-- we will return your recipe and give you the vanilla extract!\"\n" +
		"She giggles, water splashing everywhere. The other mermaids join in.");
	System.out.println ("Not seeing any other choice, you agree.");
	System.out.println ("\"Yay! The game is simple, we are going to play a different version of FizzBuzz!\n" +
		"It is called BerryBerry!\"");
	pause ();
	//Pop-up instructions
	JOptionPane.showMessageDialog (null, "* * *I N S T R U C T I O N S* * * \n \n"
		+ "The fruit mermaids have challenged you to FizzBuzz variant!\n"
		+ "Every number that is divisible by three, say Straw\n"
		+ "Every number divisible by five, say Blue\n"
		+ "If a number can be divisble by both three and five, say BerryBerry!\n"
		+ "Have fun!", "BerryBerry", JOptionPane.INFORMATION_MESSAGE);
	//calls FizzBuzz Game
	FizzBuzzGame ();

    }


    public void FizzBuzzGame ()
    {
	//FizzBuzz variant GAME COMMENCE
	FizzBuzzASCII ();
	BigMermaidASCII ();
	System.out.println ();
	int turn = 1;
	boolean done = false;
	int n = 1;
	while (!done)
	{
	    if (turn == 1)
	    {
		done = humanTurn (n);
		turn = 2;
	    }
	    else
	    {
		done = aiTurn (n);
		turn = 1;
	    }
	    n++;
	}

	if (winner == 'h')
	{ //iF user wins, wins 8 points
	    points += 10;
	    System.out.print ("The blueberry mermaid huffs, and brings you your recipe and the vanilla extract.");
	    SmallMermaidASCII ();
	    System.out.print ("\"Here you go - and be on your way, Knight " + PlayerName + "!\"");
	    System.out.println ("You nod at the mermaids, leaving the creek.\n\n");
	    pointsASCII ();
	    System.out.println ("[---POINTS HAVE BEEN REWARDED---]");
	    System.out.println ("[--TOTAL POINTS - " + points + " --]");
	    pause ();
	    LOCATION4 ();
	}


	else if (winner == 'a' && tries < 2)
	{ // if user loses, gains one more try.
	    System.out.println ("\"You're really bad at this, but since we- the fruit mermaids are nice\n"
		    + "we will allow you have another chance!\"");
	    FizzBuzzGame ();
	}


	else
	{ //if user loses & no more tries, lost. prompted with choice to sacrifie points or game over
	    System.out.println ("\"For a knight, you're pretty bad at games...\" The strawberry mermaids teases. The recipe and vanilla extract still in the mermaids' posession." +
		    "\n \"No recipe for you!\" The mermaid laughs, splasing the vanilla into your eyes and swimming away. You wipe your helmet to see all the mermaids gone.");
	    MermaidsASCII ();
	    System.out.println (". . .");
	    System.out.println ("\t[---YOU HAVE LOST FIZZBUZZ VARIANT---]\n\n");
	    System.out.println (". . .");
	    pause ();
	    //POP-UP warning --- explanation after loss
	    JOptionPane.showMessageDialog (null, "* * *W A R N I N G* * * \n \n"
		    + "The fruit mermaids have defeated you in BerryBerry, thus\n"
		    + "they will not return the recipe and the recipe is needed to \n"
		    + "bake THE BEST ice-cream caking in the Candie Kingdom. \n"
		    + "You have one more chance though...\n\n"
		    + "Either sacrifice three points in return for the needed items.\n"
		    + "Or forfeit the game - resetting all your progress.\n"
		    + "Good Luck!", "WARNING-WARNING", JOptionPane.WARNING_MESSAGE);
	    //prompts user with choice
	    System.out.println ("A) [TRADE POINTS]\n" +
		    "B) [GAME OVER]");
	    String option = IO.inputString ("\t[---WHAT DO YOU CHOOSE TO DO?---]    ");

	    if (option.equalsIgnoreCase ("A"))
	    { // user must lose 3 points to progress game
		points -= 3;
		System.out.println ("You have decided to forfeit a few points, in return, the recipe and the vanilla extract will be returned.");
		pointsASCII ();
		System.out.println ("[---POINTS HAVE BEEN DEDUCTED---]");
		System.out.println ("[--TOTAL POINTS - " + points + " --]");
		System.out.println ("With a heavy heart, knowing that action may cost you - you move on.");
		//if points below 0, restart.
		Restart ();
		pause ();
		//if not, mpve on
		LOCATION4 ();
	    }
	    else
	    { //player loses game
		IO.printSlow ("You have decided to NOT forfeit points - leading you with no recipe. No recipe - no cake, no cake - the frosted dragon is angry and will freeze the Candie Kingdom over.");
		System.out.println ("[--TOTAL POINTS - " + points + " --]");
		System.out.println ("[---GAME OVER---]");
		Restart ();
	    }

	}
    }


    public String fBNum (int n)
    {
	//returns the nth Fizz-Buzz number.
	if (n % 15 == 0)
	    return ("BerryBerry");
	else if (n % 3 == 0)
	    return ("Straw");
	else if (n % 5 == 0)
	    return ("Blue");
	else
	    return (n + "");

    }


    public boolean humanTurn (int n)
    { //gets the right Fizz-Buzz number (done)
	String right = fBNum (n);
	//gets the user's Fizz-Buzz number (done)
	String ans = IO.inputString ("Knight " + PlayerName + ":   ");
	//if the user's answer is right, return false (the game is NOT over)
	//otherwise,
	if (right.equals (ans))
	    return false;
	else
	{

	    //Prints user gets it wrong
	    System.out.println ("\n\"Haha, you got it wrong silly Knight!\"");
	    //Prints correct ans
	    System.out.println ("\"The correct answer would be " + right + ".\"");
	    //prints winner to mermaid
	    System.out.println ("\"We, the fruit mermaids win!\" They giggle wickedly.");
	    // (4) return true (the game IS over).
	    tries++;
	    winner = 'a';
	    return true;
	}
    }


    public boolean aiTurn (int n)
    {
	//Random chance for AI to guess incorrect
	int prob = (int) (Math.random () * 11) + 1;
	if (prob == 2)
	{
	    // (1) make the ai guess the Fizz-Buzz number +1 (wrong one)
	    System.out.println ("Mermaids:   " + fBNum (n + 1));
	    // (2) tell the ai it is wrong
	    System.out.println ("\n\"O-oh, we got it wrong...\" The mermaids say defeated.");
	    // (3) tell the ai the right Fizz-Buzz number
	    System.out.println ("\"The correct answer is " + fBNum (n) + ".\"");

	    // (4) tell the human they won
	    System.out.println ("\"Well, you won candy Knight.");
	    // (5) return true (the game IS over)
	    winner = 'h';
	    tries++;
	    return true;
	}

	//otherwise, the ai gets it right
	else
	{
	    // (1) make the ai guess the Fizz-Buzz number (correct)
	    System.out.println ("Mermaid:   " + fBNum (n));
	    // (2) return false (the game is NOT over)
	    return false;
	}
    }


    public void LOCATION4 ()
    { //method: user either picked L2 or L3, task 3 for user. LOCATION4 INTRO
	IO.printSlow ("\nRecalibrating map layout...\n\n");
	TaffyRoadASCII ();
	IO.printSlow ("\t[--YOU HAVE ARRIVED AT TAFFY LANE--]\n");
	Recipe ();
	System.out.println ("You look at your recipe, looking at the still needed items on your list.");
	if (duck >= 1)
	    //If user chose LOCATION2, then vanilla extract is not a task any longer
	    System.out.println ("The vanilla extract could be found at the Sweet river, something to pass by when heading to the bakery.");
	else
	{
	    //If user chose LOCATION3, eggs are no longer a task
	    System.out.println ("The golden eggs are already at the bakery, so there is no hassle to retrieve them.");
	}

	System.out.println ("You travel along the LaffyTaffy" + regi + " path and see a cotton candy bunny blocking your path.");
	BunnyASCII ();
	System.out.println ("\"Who are you??\" the bunny asks, fixing thier glasses, a note in thier paws.");
	System.out.println ("You introduce yourself and explain your journeey through the kingdom.");
	System.out.println ("\"Well Knight " + PlayerName + ", I will give you a hint on how to bake the best cake... something the recipe doesn't say.\"" +
		"The bunny talks easily.");
	System.out.println ("\"If - if you help with my daily... reading for today.\"");
	FBunnyNoteASCII ();
	System.out.println ("You consider thier proposal, the cottoned-tailed bunny does look wise, with a shake of your sturdy helmet - you agree.");
	pause ();
	//Pop-up instructions
	JOptionPane.showMessageDialog (null, "* * *I N S T R U C T I O N S* * * \n \n"
		+ "The wise cotton candy bunny asks you to help\n"
		+ "them with thier daily reading...\n"
		+ "But with a peek, it greatly resembles a MadLib.\n"
		+ "Answer Mr.Wise Bunny's questions and maybe they will "
		+ "give you a hint to baking THE BEST ice-cream in the kingdom. \n"
		+ "Have fun!", "MadLibs", JOptionPane.INFORMATION_MESSAGE);
	MadLibs ();

    }


    public void MadLibs ()
    { //***TASK 4 COMMENCES HERE--MADLIBS
	MadLibsASCII ();
	NoteMadLibsASCII ();
	System.out.println ("\n\"Hoho~ Alright then, let me ask you a few questions....\"\n");
	String noun = IO.inputString ("\"Give me a noun to start with,\" ---    ");
	String verb = IO.inputString ("\"Now a verb in past tense,\" ---    ");
	String adverb = IO.inputString ("\"An adverb to that verb.\" ---    ");
	String adj = IO.inputString ("\"This time, an adjective,\" ---    ");
	String name = IO.inputString ("\"A random name please,\" ---   ");
	String noun3 = IO.inputString ("Another noun, different though,\" ---    ");
	String noun2 = IO.inputString ("I need a plural noun this time,\" ---    ");
	String colour = IO.inputString ("Finally, a random colour.\" ---    ");
	pause ();
	MadLibsASCII ();
	NoteMadLibsASCII ();
	System.out.println ("The bunny nods their head at your choices, scribbling something on the notepad. They clear thier throat and they begin to read.\n\n");
	System.out.println ("\"There once was a " + noun + ", named " + name + ", who lived with " + adj + " " + noun2 + " that hid in the walls.\n"
		+ name + " did not like all the " + noun2 + ", they " + verb + " " + adverb + ", so " + name + " could never catch them.");
	System.out.println (name + " devised a plan to finally get rid of them! " + name + " did some research and found out that if " + name + " got a " + colour + " " + adj + "\n"
		+ noun3 + " all the " + noun2 + " will hate the smell and run away! So " + name + " placed the " + noun3 + " around the house... Soon all the " + noun2 + " ran away!\"");
	System.out.println ("\n\"The end\"");
	System.out.println ("");
	L4HINT ();
    }


    public void L4HINT ()
    {
	// SWITCH STRUCTURE -- PROMPT USER FOR A NUMBER FROM 1-5, SELECTS HINT
	BunnyASCII ();
	System.out.println ("\"Ah thank you for helping me, quite refreshing to hear a different spin on this story,\" The bunny notes.\n"
		+ "\"Now, about that secret hint...\" They close their eyes, putting away thier notebook.");
	pause ();
	JOptionPane.showMessageDialog (null, "If you guess correctly, 3 points will be rewarded,\n" +
		"if not 1 point will be redacted.", "HINT", JOptionPane.WARNING_MESSAGE);

	int hint = IO.inputInt ("\"Well, to get the hint, pick a number from a one to five\" --- ");
	System.out.print ("\"That number? Okay, the hint is: ");
	switch (hint)
	{
	    case 1:
		System.out.println ("If you bake the cake at exactly 353 degrees, the cake will be better than ever!\" The bunny exclaims in glee.");
		points++;
		break;
	    case 2:
		System.out.println ("When mixing the ingredients, add one SMALL extra drop of vanilla extract.\" The bunny announces, fixing thier glasses.");
		points++;
		break;
	    case 3:
		System.out.println ("I heard that the frosted dragon of MT.Ice-cream loves extra chocolate chipps on his cake.\" The bunny notes.");
		points++;
		break;
	    case 4:
		System.out.println ("Freeze the cake for an extra hour--the frosted dragon loves cold food!\" The bunny says, writing in their notebook.");
		points++;
		break;
	    case 5:
		System.out.println ("Add more frosting than you should - the dragon loves exrta frosting!\" The bunny talks, smiling.");
		points++;
		break;
	}

	//points awarded--coded randomly picked number
	System.out.println (RandomChance (hint));
	BunnyASCII ();
	System.out.println ("\nWith that, Mr.Wise-Looking Bunny hops off the lane, allowing you to continue your journey.\n");
	points++;
	System.out.println ("\n\n[---YOU HAVE COMPLETED MAZE---]");
	points = duck + points;
	pointsASCII ();
	IO.printSlow ("\n[--POINTS HAVE BEEN AWARDED--]");
	System.out.println ("[--TOTAL POINTS - " + points + " --]");
	L4CHOICE ();
    }


    //Random chance that user gains 3 points if number correctly chosen(1/5)
    public String RandomChance (int h)
    {
	int prob = (int) (Math.random () * 5) + 1;
	if (prob == h)
	{ //correctly guessed number
	    points += 3;
	    return "\"Ah, that's the number I wanted to hear, too!\"";
	}
	else
	{ //incorrectly, loses point --
	    points--;
	    return "";
	}
    }


    public void L4CHOICE ()
    { //prompt user for action after L4 TASK
	System.out.println ("\t[---WHAT WOULD YOU LIKE TO DO?---]\n");
	System.out.println ("A) [SEARCH AREA]\n" +
		"B) [CONTINUE JOURNEY]");
	String choiceL4 = IO.inputString ("---    ");
	if (choiceL4.equalsIgnoreCase ("A"))
	{
	    System.out.println ("You decide to off the LaffyTaffy" + regi + " lane and search the area.");
	    System.out.println ("There is nothing here, thus you decide to continue your quest.");
	    LOCATION5 ();
	}
	else
	    LOCATION5 ();
    }


    public void LOCATION5 ()
    { ///BAKERY LOCATION 5--tests user knowledge about game. FINAL task before conclusion
	IO.printSlow ("\n\nApplying map layout...\n");
	KitchenASCII ();
	System.out.println ("\t[---YOU HAVE ARRIVED AT THE BAKERY---]\n");
	System.out.println ("You - Knight " + PlayerName + ", arrive at the BAKERY, the best kitchen in the kingdom. You settle, bringing out all the ingredients onto the table.");
	pause ();
	//Pop-up dialouge instructions, for each question, right, gain a point, wrong-- lose a point
	JOptionPane.showMessageDialog (null, "* * *I N S T R U C T I O N S* * * \n \n"
		+ "You have made it to the BAKERY -- where all the best\n"
		+ "of the best, are made. You will be prompted\n"
		+ "with questions about your journey...\n"
		+ "If you answer correctly, points are awarded."
		+ " If wrong, points will be detucted. \n\n"
		+ "This is your final chance to earn points! \n"
		+ "Have fun!", "Baking the Cake...", JOptionPane.INFORMATION_MESSAGE);
	System.out.println ("\t[---ANSWER THE FOLLOWING QUESTIONS TO CONTINUE---]\n");
	//Q1 -- flour fairies residence
	QuestionASCII ();
	String[] possibleValues = {"VANILLA CREEK", "GUMDROP HUTS", "TOFFE FORTRESS"};
	String selectedValue = (String) JOptionPane.showInputDialog (null,
		"Where do the flour faires live?", "Input", JOptionPane.QUESTION_MESSAGE, null,
		possibleValues, possibleValues [0]);
	if (selectedValue == "GUMDROP HUTS")
	{ //player gets it correct
	    pointsASCII ();
	    System.out.println ("\t[---YOU ARE CORRECT---]");
	    points++;
	    System.out.println ("\t[---TOTAL POINTS - " + points + "---]\n\n");
	}
	else
	{ //player is incorrect
	    System.out.println ("\t[---YOU ARE INCORRECT---]");
	    points--;
	    System.out.println ("\t[---TOTAL POINTS - " + points + "---]\n\n");
	}
	System.out.println ("You first start by combining the brownie mix, the chocolate eggs, sugar water, and the oil.");
	System.out.println ("You stir with a wooden spatula until it was thick and smooth.");
	System.out.println ("After - you quickly pour the batter into a huge cake pan - a ginormous  cake for a ginormous dragon.");
	pause ();
	//If no more points by the end, game over
	Restart ();
	//Q2 -- MR.Buunny hands
	QuestionASCII ();
	String[] possibleValues2 = {"A WALKING CANE", "A PEN", "A NOTEBOOK"};
	String selectedValue2 = (String) JOptionPane.showInputDialog (null,
		"What did Mr.Wise-Bunny have?", "Input", JOptionPane.QUESTION_MESSAGE, null,
		possibleValues2, possibleValues2 [0]);
	if (selectedValue2 == "A NOTEBOOK")
	{ //Q2- player is correct
	    pointsASCII ();
	    System.out.println ("\t[---YOU ARE CORRECT---]");
	    points++;
	    System.out.println ("\t[---TOTAL POINTS - " + points + "---]\n\n");
	}
	else
	{ //Q2- player is incorrect
	    System.out.println ("\t[---YOU ARE INCORRECT---]");
	    points--;
	    System.out.println ("\t[---TOTAL POINTS - " + points + "---]\n\n");

	}
	//If no more points by the end, game over
	Restart ();
	System.out.println ("Setting the pan into the preheated oven, until it was a golden fluffy brown.");
	System.out.println ("And it started to bake...");
	//DO LOOP, counts to 5
	int x = 1;
	//initialization
	do
	{
	    IO.printSlow (x + "...");
	    x++;
	}
	while (x < 6);
	System.out.println ("And it was done!\n");
	System.out.println ("Once it cools, you remove the the BEST ice-cream from the freezer. ");
	System.out.println ("You pour sweet condensed milk with the very sweet chocolate chips into the sauce pan.");
	System.out.println ("You make sure to use Mr.Wise Bunny's hint in full effect.");
	pause ();
	//Q3 -- Point+
	QuestionASCII ();
	String[] possibleValues3 = {"TOFFE FORTRESS", "LOLLI GARDEN", "VANILLA CREEK"};
	String selectedValue3 = (String) JOptionPane.showInputDialog (null,
		"Which lane rewarded a person with the most points?", "Input", JOptionPane.QUESTION_MESSAGE, null,
		possibleValues3, possibleValues3 [0]);
	if (selectedValue3 == "VANILLA CREEK")
	{ //Q3 player is correct
	    pointsASCII ();
	    System.out.println ("\t[---YOU ARE CORRECT---]");
	    points++;
	    System.out.println ("\t[---TOTAL POINTS - " + points + "---]\n\n");
	}
	else
	{ //Q3 player is incorrect
	    System.out.println ("\t[---YOU ARE INCORRECT---]");
	    points--;
	    System.out.println ("\t[---TOTAL POINTS - " + points + "---]\n\n");
	}
	//If no more points by the end, game over
	Restart ();
	System.out.println ("The choco chips melt nicely, forming into a smooth sauce - you set it aside to cool.");
	System.out.println ("Each layer of brownie cake had ice-cream in between, with the chocolate sauce over the BEST ice-cream.");
	System.out.println ("Ice-cream wrapped around the cake like a suit, as chocolate liquid dripped down the sides - masterpiece indeed. You place it in the freezer for a while.");
	System.out.println ("Finally - the finishing touches, the extra chocolate chips and the dash of whip cream on the top.\n\n");
	System.out.println ("The BEST ice-cream cake is finally ready...\n\n");
	pause ();
	Conclusion ();

    }


    public void Conclusion ()
    { //method: CONCLUSION STORY, depending on points, multiple endings.
	System.out.println ("Final sequence in progress...\n");
	MtIcecreamASCII ();
	System.out.println ("\t[---YOU HAVE ARRIVED AT MT.ICE-CREAM---]\n");
	System.out.println ("\t[---***YOU CAN NO LONGER ACHIEVE POINTS PASS THIS POINT***---]\t");
	System.out.println ("\t[---TOTAL POINTS ACHIEVED: " + points + " ---]\n\n");
	System.out.println ("You are a bit nervous as you carry the BEST ice-cream cake up the mountain, but you try not show it.");
	DragonAppASCII ();
	System.out.println ("\"SMALL KNIGHT! WHO ARE YOU TO DARE ENTER MY TERRITORY!\" A voice booms from above, the frosty wind picks up as you look up to see The Frosted Dragon!");
	System.out.println ("Your resolve steels, knowing these are the final moments of your task. You introduce yourself as the knight tasked to bake the best cake for the dragon.");
	System.out.println ("The dragon doesn't look amused, it lands near you with a loud thud. It eyes the large cake in your hand, you place it down infront of the dragon.\n\n");
	MadDragonASCII ();
	System.out.println (". . .\n");
	//if statemtns
	if (points >= 13)
	{ //points above 10 at the end of the game, better ending
	    System.out.println ("\"Hmmm... your presentation looks fabulous! But I wonder if it looks just as good as it tastes!\" The dragon exclaims loudly and with one grand swipe...");
	    System.out.println ("The dragon grabs the BEST ice-cream cake in its frozen claws and drops it right in it's freezing mouth. It chews slowly...");
	    pause ();
	    System.out.println ("Its eyes light up in glee, wings raised, \"WOW, Your cake is TRULY magnificent,\" It exclaims proudly, licking its lips.");
	    System.out.println ("\"The ice-cream is frozen to just a perfect degree of -29.3 degrees Celsius, the chocolate chips extraordinarly sweet while the creamy chocolate sauce soothes my taste buds.");
	    System.out.println ("\"And the cake - the best part! The sponginess just delightful, the fluffiness, how exquisite and the layer-work as if from a master baker's creation!\"");
	    //CAKE
	    pause ();
	    System.out.println ("The dragon roars, icing sugar snow releasing from its freezing gorge.\" Small Knight, you have indeed impressed me.");
	    System.out.println (" Here I was thinking I had to freeze over the kingdom - but you have truly saved them. Excellent work.\" The dragon laughs, the mountain shaking.");
	    System.out.println ("\"Alright, I will go back into my slumber for another 500 years - I hope to be impressed greatly next time.\" The frosted dragon smiles slyly, showing it's wicked fangs - you nod quickly.");
	    DragonAppASCII ();
	    System.out.println ("With that - the dragon launches off the ground, flying higher up the mountain and into the grand cave.");
	    pause ();
	    //best ending conclusion
	    BestEnding ();
	}
	else if (points > 4 && points <= 12)
	{ //below 10 points, mediocre ending given
	    System.out.println ("\"Hmph. Your presentation is mediocre, pretty basic - nothing to special\" The dragon utters, unsatisifed. With a big swoop of it's claws - it swallows the cake whole.");
	    pause ();
	    System.out.println ("\"... The cake is satisfactory. The ice-cream a little warm, too much chocolate sauce and too little chocolate chips, though the cake itself is alright.\" the frosted dragon announces, uninterested.");
	    System.out.println ("\"Small Knight, you have done a satisfactory job, though not the best - at least I enjoyed. I have decided not to destroy the kingdom this time.\" ");
	    System.out.println ("\"But... if you DARE serve me this boring cake EVER again...\" The dragon starts, nose flaring, showing it's fangs. You nod quickly understanding the threat - the dragon nods at your reaction.");
	    MadDragonASCII ();
	    System.out.println ("It flies up, higher into the mountain, into a large cave.");
	    Ending ();
	}
	else
	{ //other, game lost
	    GameLost ();
	}
    }


    public void BestEnding ()
    { //method: best ending, game done
	pause ();
	System.out.println ("\"Hazzzah Knight " + PlayerName + "! That ice beast will sleep once again for another 500 years! Which won't be my problem by then.\" The king announces from his throne, his disciples cheer.");
	System.out.println ("\"You have done a great service to the Candie Kingdom and myself,I must repay you.\" The king ponders...stroking his beard.");
	SurprisedKing ();
	points += 10;
	System.out.println ("[---POINTS HAVE BEEN AWARDED--]");
	System.out.println ("You smile, shocked, honored to be of great service of the kingdom. Thus you decide to return home.");
	System.out.println ("\n\t[---YOU HAVE WON THE GAME---]");
	System.out.println ("\t[---TOTAL POINTS ACHIEVED: " + points + "---]\n");
	System.out.println ("[---***THANK YOU FOR PLAYING...***---]");
	TITLE3 ();
	TheEndASCII ();
	pause ();
	//pop-up message
	JOptionPane.showMessageDialog (null, "Systems loading...", "COMPLETE", JOptionPane.INFORMATION_MESSAGE);
	JOptionPane.showMessageDialog (null, "Closing game...", "...", JOptionPane.WARNING_MESSAGE);
	Playerlogin ();
    }


    public void Ending ()
    { //method: ending, game done
	pause ();
	System.out.println ("\"You have tamed the beast from freezing the kingdom over, though it was not entirely happy - it will not attack for the 500 years. I am glad\" The king announces, stroking his beard.");
	System.out.println ("\"But alas, I must repay you - thank for all that you done.\"\n\n");
	King ();
	points += 5;
	System.out.println ("[---POINTS HAVE BEEN AWARDED--]\n");
	System.out.println (". . .");
	System.out.println ("\n\t[---YOU HAVE WON THE GAME---]");
	System.out.println ("\t[---TOTAL POINTS ACHIEVED: " + points + "---]\n");
	System.out.println ("[---***THANK YOU FOR PLAYING...***---]");
	TITLE3 ();
	TheEndASCII ();
	pause ();
	//pop-up message
	JOptionPane.showMessageDialog (null, "Systems loading...", "COMPLETE", JOptionPane.INFORMATION_MESSAGE);
	JOptionPane.showMessageDialog (null, "Closing game...", "...", JOptionPane.WARNING_MESSAGE);
	Playerlogin ();

    }


    public void GameLost ()
    { //game lost, game done, restarts
	pause ();
	System.out.println ("\"Your presentation is serverly lacking,\" The dragon snorts out.\"Well, I hope it taste better than it looks... For your sake.\" And in it quick swoop. It eats the cake.");
	System.out.println ("A face of pure disgust appears on the dragon's face. \"This - this!\" The dragon roars excuiratingly deafening. \"This is UTTER NONSENSE!\"");
	System.out.println ("\"How DARE YOU feed me such rubbish!? The ice-cream is WARM, the cake still WET within, the chocolate sauce still HARD and there's literally no chocolate chips! NO CHOCOLATE CHIPS!?\"");
	AngryDragon ();
	System.out.println ("The frosted dragon yells, eyes flashing red. \"This kingdom does no deserve another 500 years of existence, sending an IMPUDENT knight to serve me such garbage!\"");
	System.out.println ("\nThe furious dragon screeches aloud, and flies above the Candie Kingdom, releasing it's frosted breath - freezing the kingdom over...\n\n");
	Restart ();

    }


    public void Restart ()
    { //method: restarts game, if user is under 0 points
	if (points <= 0)
	{
	    System.out.println (". . .");
	    System.out.println ("\t\t[---YOU HAVE LOST THE GAME---]\n");
	    TheEndASCII ();
	    GAMEOVERASCII ();
	    pause ();
	    System.out.println ("[---***THANK YOU FOR PLAYING...***---]");
	    TITLE3 ();
	    System.out.println ("\t\t[---RETURNING TO GAMER CUBE--]\n\n");
	    Playerlogin ();
	}
    }


    ///********ASCII ART METHODS BELOW ********
    public void Cubelogo ()
    {
	System.out.println ("  ________                              _________      ___.           ");
	IO.printSlow (" /  _____/_____    _____   ___________  \\_   ___ \\ __ _\\_ |__   ____  ");
	IO.printSlow ("/   \\  ___\\__  \\  /     \\_/ __ \\_  __ \\ /    \\  \\/|  |  \\ __ \\_/ __ \\ ");
	IO.printSlow ("\\    \\_\\  \\/ __ \\|  Y Y  \\  ___/|  | \\/ \\     \\___|  |  / \\_\\ \\  ___/ ");
	IO.printSlow (" \\______  (____  /__|_|  /\\___  >__|     \\______  /____/|___  /\\___  >");
	System.out.println ("        \\/     \\/      \\/     \\/                \\/          \\/     \\/ ");
    }


    public void KingKnight ()
    {
	System.out.println ("                                                                 o .,<>., o");
	System.out.println ("                                                                |\\/\\/\\/\\/|");
	System.out.println ("                                                                '========'");
	System.out.println ("                                                                (_ SSSSSSs");
	System.out.println ("                                                                )a'`SSSSSs");
	System.out.println ("                                                               /_   SSSSSS");
	System.out.println ("                                                               .=## SSSSS");
	System.out.println ("                                                               .####  SSSSs");
	System.out.println ("                                                               ###::::SSSSS");
	System.out.println ("                                                              .;:::\"\"\"\"SSS");
	System.out.println ("                                                             .:;:'  . .  \\\\");
	System.out.println ("                                                            .::/  '     .'|");
	System.out.println ("                                                           .::( .         |");
	System.out.println ("                                                           :::)           \\");
	System.out.println ("                                                           /\\(            /");
	System.out.println ("                                                          /)            ( |");
	System.out.println ("                                                        .'  \\  .       ./ /");
	System.out.println ("                                                     _-'    |\\  .        |");
	System.out.println ("                                   _..--..   .  /\"---\\      | ` |      . |");
	System.out.println ("           -=====================,' _     \\=(*#(8.#####()   |  `/_..   , (");
	System.out.println ("                       _.-''``';'-''-) ,.  \\ '  '+/// |   .'/   \\  ``-.) \\");
	System.out.println ("                     ,'  _.-  ((    `-'  `._\\    `` \\_/_.'  )    /`-._  ) |");
	System.out.println ("                   ,'\\ ,'  _.'.`:-.    \\.-'                 /   <_L   )\"  |");
	System.out.println ("                 _/   `._,' ,')`;  `-'`'                    |     L  /    /");
	System.out.println ("                / `.   ,' ,|_/ / \\                          (    <_-'     \\");
	System.out.println ("                \\ / `./  '  / /,' \\                        /|`         `. |");
	System.out.println ("                )\\   /`._   ,'`._.-\\                       |)            \\'");
	System.out.println ("               /  `.'    )-'.-,' )__)                      |\\            `|");
	System.out.println ("              : /`. `.._(--.`':`':/ \\                      ) \\             \\");
	System.out.println ("              |::::\\     ,'/::;-))  /                      ( )`.            |");
	System.out.println ("              ||:::::  . .::':  :`-(                       |/    .          |");
	System.out.println ("              ||::::|  . :|  |==[]=:                       .        -       \\");
	System.out.println ("              |||:::|  : ||  :  |  |                      /\\           `     |");
	System.out.println ("  ___ ___     '|;:::|  | |'   \\=[]=|                     /  \\                \\");
	System.out.println (" |   /_  ||``|||:::::  | ;    | |  |                     \\_.'\\_               `-.");
	System.out.println (" :   \\_``[]--[]|::::'\\_;'     )-'..`._                 .-'\\``:: ` .              \\");
	System.out.println ("  \\___.>`''-.||:.__,'     SSt |_______`>              <_____:::.         . . \\  _/");
	System.out.println ("                                                            `+a:f:......jrei'''");
    }


    public void Castle ()
    {
	System.out.println ("                  [\\");
	System.out.println ("                  |\\)                                ____");
	System.out.println ("                  |                               __(_   )__");
	System.out.println ("                  Y\\          ___               _(          )");
	System.out.println ("                 T  \\       __)  )--.          (     )-----`");
	System.out.println ("                J    \\   ,-(         )_         `---'");
	System.out.println ("               Y/T`-._\\ (     (       _)                 __");
	System.out.println ("               /[|   ]|  `-(__  ___)-`  |\\          ,-(  __)");
	System.out.println ("               | |    |      (__)       J'         (     )");
	System.out.println ("   _           | |  ] |    _           /;\\          `-  '");
	System.out.println ("  (,,)        [| |    |    L'         /;  \\");
	System.out.println ("             /||.| /\\ |   /\\         /.,-._\\        ___ _");
	System.out.println ("            /_|||| || |  /  \\        | |{  |       (._.'_)");
	System.out.println ("  L/\\       | \\| | '` |_ _ {|        | | U |   /\\ ");
	System.out.println (" /v^v\\/\\   `|  Y | [  '-' '--''-''-\"-'`'   | ,`^v\\ /\\,`\\");
	System.out.println ("/ ,'./  \\.` |[   |       [     __   L    ] |      /^v\\  \\");
	System.out.println (",'     `    |    |           ,`##Y.   ]    |___Y Y____,_,,_,,_");
	System.out.println ("--   -----.-(] [ |   ]     o/####U|o      ]|| /`-, Y   _   Y  Y");
	System.out.println ("   Y Y  --;`~T   |      }   \\####U|[\\ _,.-(^) ,-'  _  (^)__  _");
	System.out.println ("  Y  YY   ;'~~l  |   L     [|\\###U'E'\\  \\ \\Y-` _  (^) _Y  _");
	System.out.println (" Y  Y Y   ;\\~~/\\{| [      _,'-\\`= = '.\\_ ,`   (^)(^) (^) (^)");
	System.out.println ("     --   ;\\~~~/\\|  _,.-'`_  `.\\_..-'\"  _ . ,_ Y_ Y_ _Y  _Y__");
	System.out.println ("    _    _; \\~~( Y``   Y (^) / `,      (^)      _   (^) (^)");
	System.out.println ("   (^)  (^)`._~ /  L \\  _.Y'`  _  ` --  Y - - -(^) - Y - Y -");
	System.out.println ("    Y    Y    `'--..,-'`      (^)   _  -    _   Y ____");
	System.out.println ("      --           _    _ --   Y   (^)   _ (^)  ===   ----");
	System.out.println ("          __   -  (^)  (^)      --- Y   (^) Y");
	System.out.println ("      _            Y    Y                Y            ");
	System.out.println ("");
    }


    public void Recipe ()
    {
	System.out.println ("");
	System.out.println ("           .-.---------------------------------.-.");
	System.out.println ("          ((o))                                   )");
	System.out.println ("           \\U/_______          _____         ____/");
	System.out.println ("             |                                  |");
	System.out.println ("             |    ***BEST ICE-CREAM CAKE***     |");
	System.out.println ("             |       *** R E C I P E ***        |");
	System.out.println ("             |                                  |");
	System.out.println ("             |   *1/4 cup of sugar water        |");
	System.out.println ("             |   *3 golden chocolate eggs       |");
	System.out.println ("             |   *8 ounce of blue whipped cream |");
	System.out.println ("             |   *5 cups of sweet choco chips   |");
	System.out.println ("             |   *1/2 spoon of vanilla extract  |");
	System.out.println ("             |          **DIRECTIONS**          |");
	System.out.println ("             |   xxxx xxxx xxxx xxxx xxxx x     |");
	System.out.println ("             |   xx xxxxx xx x x xxxxxx xx xx   |");
	System.out.println ("             | xxx xxx xxx xxxxx xxxx xx xxx    |");
	System.out.println ("             |____    _______    __  ____    ___|KCK");
	System.out.println ("            /A\\                                  \\");
	System.out.println ("           ((o))                                  )");
	System.out.println ("            '-'----------------------------------'");
    }


    public void FlourFairy ()
    {
	System.out.println ("");
	System.out.println ("         ___");
	System.out.println ("   __     / ::.:\\");
	System.out.println (" /::::'-.|::::&&&&&");
	System.out.println (" |::::::.\\\\ .&&&&/ \\");
	System.out.println ("  \\ ::..::\\\\:&&? <,(");
	System.out.println ("   \\ ::::. \\\\ &&  _/");
	System.out.println ("  /::'.:::. \\\\&&.|._");
	System.out.println ("  | ..:'-.- / )___\\ \\");
	System.out.println ("   \\ :::   /./|))))) '");
	System.out.println ("     '-..-'./ \\ --| \\\\");
	System.out.println ("          ||   ) .|  \\\\.");
	System.out.println ("          |\\  /___|   \\_)");
	System.out.println ("          |_)///|\\\\\\");
	System.out.println ("             ||||\\\\\\'");
	System.out.println ("              \\  | |");
	System.out.println ("             _.\\ / /.__");
	System.out.println ("          .-' \\/ | |/  '-.");
	System.out.println ("        / .  .(  | | .  .  \\");
	System.out.println ("      _|_   .  \\ | |   .   _|_");
	System.out.println ("     /    '-.  #)|)|#  . -'   \\");
	System.out.println ("    |   .    ##/ | |###    .   |");
	System.out.println ("    |  . .  ####\\|\\|####  . .  |");
	System.out.println ("     \\___ .-'########## '-.___/");
	System.out.println ("      |     .  *####*  .     |");
	System.out.println ("       \\  . . / . . .\\  . .  /");
	System.out.println ("        \\    / .  .  .\\  .  /");
	System.out.println ("          '-( .    .  .)-.'");
	System.out.println ("              ' ----- '");
	System.out.println ("                / /");
	System.out.println ("               / /");
	System.out.println ("               ( (");
	System.out.println ("                \\ \\");
	System.out.println ("                 \\ \\");
	System.out.println ("                  ) )");
	System.out.println ("                  / /");
	System.out.println ("");
    }


    public void BigFairy ()
    {
	System.out.println ("");
	System.out.println ("");
	System.out.println ("                                               .'  .");
	System.out.println ("                                             .'  ;'.");
	System.out.println ("                                 ,|        .'  .'  .");
	System.out.println ("                             . ,' .       '  .'    :");
	System.out.println ("                          ,-' `    ' ,   '  '      :");
	System.out.println ("                        ,'          ',  '  '       :");
	System.out.println ("                      ,'_   ___   .  , .  '        :");
	System.out.println ("                      .' .,'   ` /:  /   .         :");
	System.out.println ("                      `--   -.  ' : / .            ;");
	System.out.println ("                       |6)  6)   C),    .         ;");
	System.out.println ("                       ; .,     .,'   :.         .");
	System.out.println ("                       `. o     :     :.        ;");
	System.out.println ("                         `-..'  :._   :|       '");
	System.out.println ("                           ,'  /_  `. :|     .'");
	System.out.println ("                          '.__/  `.  .:|  _.'");
	System.out.println ("                          : .'    |   .:-'");
	System.out.println ("                        .'|/     /     `.");
	System.out.println ("                       ,  /    ,'         `.");
	System.out.println ("                      / ,'   ,'\"--.._        `.");
	System.out.println ("                     / /   ,'        `-.       `.");
	System.out.println ("                   .' /  ,'\"\"\"\"\"\"'---.._j    .");
	System.out.println ("                  ,'.' ,'                '-.       .");
	System.out.println ("                .' '  /  ,--.._             `.     :");
	System.out.println ("               / ,' .'  /      `-.._         |     ;");
	System.out.println ("            _.' .  /   /            `\"--...._L__.-'");
	System.out.println ("          .' .-' ,'  ,'");
	System.out.println ("          ||'   /  ,'");
	System.out.println ("          ||| ,'  .");
	System.out.println ("          |||/  ,'");
	System.out.println ("        ,'.'  ,'");
	System.out.println ("       / '  ,'");
	System.out.println ("     .' '  .");
	System.out.println ("    ,  '   |");
	System.out.println ("   /  /    |");
	System.out.println ("  '  /  _..'");
	System.out.println (",'--; ,'");
	System.out.println ("   `-' ");
    }


    public void MeanFairy ()
    {
	System.out.println ("");
	System.out.println ("  //.---.    .-'.");
	System.out.println ("( (-/==^==.  /    ) ))");
	System.out.println ("  /|))è é()./   .'");
	System.out.println (" ('-((\\_/( ))..' /");
	System.out.println ("  \\ '-;_.-. ) ))");
	System.out.println ("   '-(_ _)_\\ ) )).'");
	System.out.println ("    / ) (/_ ) \\");
	System.out.println ("(( ( /\\_/\\,/|  ) ))");
	System.out.println ("    /  .  '.'.' ");
	System.out.println ("   (  .\\  . '.___.");
	System.out.println ("    \\_| \\  '.___/");
	System.out.println ("     \\'._;.___) ");
	System.out.println ("      \\_|-.\\ |mrf");
	System.out.println ("       '--,-\\'.");
	System.out.println ("          |/ \\ )");
	System.out.println ("        ._/   \\|_");
	System.out.println ("               \\ )");
	System.out.println ("                \\|");
	System.out.println ("               ._)");
	System.out.println ("");

    }


    public void King ()
    {
	System.out.println ("");
	System.out.println ("                      ____");
	System.out.println ("                     / ___`\\");
	System.out.println ("         /|         ( (   \\ \\");
	System.out.println ("    |^v^v  V|        \\ \\/) ) )");
	System.out.println ("    \\  ____ /         \\_/ / /");
	System.out.println ("    ,Y`    `,            / /");
	System.out.println ("    ||  -  -)           { }");
	System.out.println ("    \\\\   _\\ |           | |");
	System.out.println ("     \\\\ / _`\\_         / /");
	System.out.println ("     / |  ~ | ``\\     _|_|");
	System.out.println ("  ,-`  \\    |  \\ \\  ,//(_}");
	System.out.println (" /      |   |   | \\/  \\| |");
	System.out.println ("|       |   |   | '   ,\\ \\");
	System.out.println ("|     | \\   /  /\\  _/`  | |");
	System.out.println ("\\     |  | |   | ``     | |");
	System.out.println (" |    \\  \\ |   |        | |");
	System.out.println (" |    |   |/   |        / /");
	System.out.println (" |    |        |        | |");
	System.out.println ("");
    }


    public void SurprisedKing ()
    {
	System.out.println ("");
	System.out.println ("                      ____");
	System.out.println ("                     / ___`\\");
	System.out.println ("         /|         ( (   \\ \\");
	System.out.println ("    |^v^v  V|        \\ \\/) ) )");
	System.out.println ("    \\  ____ /         \\_/ / /");
	System.out.println ("    ,Y`    `,            / /");
	System.out.println ("    ||  -  -)           { }");
	System.out.println ("    \\\\   _\\ |           | |");
	System.out.println ("     \\\\ / _`\\_         / /");
	System.out.println ("     / |  ~ | ``\\     _|_|");
	System.out.println ("  ,-`  \\    |  \\ \\  ,//(_}");
	System.out.println (" /      |   |   | \\/  \\| |");
	System.out.println ("|       |   |   | '   ,\\ \\");
	System.out.println ("|     | \\   /  /\\  _/`  | |");
	System.out.println ("\\     |  | |   | ``     | |");
	System.out.println (" |    \\  \\ |   |        | |");
	System.out.println (" |    |   |/   |        / /");
	System.out.println (" |    |        |        | |");
	System.out.println ("");
	System.out.println ("");
	System.out.println ("                      ____");
	System.out.println ("                     / ___`\\");
	System.out.println ("         /|         ( (   \\ \\");
	System.out.println ("    |^v^v  V|        \\ \\/) ) )");
	System.out.println ("    \\  ____ /         \\_/ / /");
	System.out.println ("    ,Y`    `,            / /");
	System.out.println ("    ||  0  0)           { }");
	System.out.println ("    \\\\   _\\ |           | |");
	System.out.println ("     \\\\ / c`\\_         / /");
	System.out.println ("     / |  ~ | ``\\     _|_|");
	System.out.println ("  ,-`  \\    |  \\ \\  ,//(_}");
	System.out.println (" /      |   |   | \\/  \\| |");
	System.out.println ("|       |   |   | '   ,\\ \\");
	System.out.println ("|     | \\   /  /\\  _/`  | |");
	System.out.println ("\\     |  | |   | ``     | |");
	System.out.println (" |    \\  \\ |   |        | |");
	System.out.println (" |    |   |/   |        / /");
	System.out.println (" |    |        |        | |");
	System.out.println ("");

    }


    public void CrossroadIMAGE ()
    {
	System.out.println ("|.'',         C R O S S R O A D S         ,''.|");
	System.out.println ("|.'.'',                                 ,''.'.|");
	System.out.println ("|.'.'.'',                             ,''.'.'.|");
	System.out.println ("|.'.'.'.'',                         ,''.'.'.'.|");
	System.out.println ("|.'.'.'.'.|                         |.'.'.'.'.|");
	System.out.println ("|.'.'.'.'.|===;                 ;===|.'.'.'.'.|");
	System.out.println ("|.'.'.'.'.|:::|',             ,'|:::|.'.'.'.'.|");
	System.out.println ("|.'.'.'.'.|---|'.|, _______ ,|.'|---|.'.'.'.'.|");
	System.out.println ("|.'.'.'.'.|:::|'.|'|???????|'|.'|:::|.'.'.'.'.|");
	System.out.println ("|,',',',',|---|',|'|???????|'|,'|---|,',',',',|");
	System.out.println ("|.'.'.'.'.|:::|'.|'|???????|'|.'|:::|.'.'.'.'.|");
	System.out.println ("|.'.'.'.'.|---|','   /%%%\\   ','|---|.'.'.'.'.|");
	System.out.println ("|.'.'.'.'.|===:'    /%%%%%\\    ':===|.'.'.'.'.|");
	System.out.println ("|.'.'.'.'.|%%%%%%%%%%%%%%%%%%%%%%%%%|.'.'.'.'.|");
	System.out.println ("|.'.'.'.','       /%%%%%%%%%\\       ','.'.'.'.|");
	System.out.println ("|.'.'.','        /%%%%%%%%%%%\\        ','.'.'.|");
	System.out.println ("|.'.','         /%%%%%%%%%%%%%\\         ','.'.|");
	System.out.println ("|.','          /%%%%%%%%%%%%%%%\\          ','.|");
	System.out.println ("|;____________/%%%%%%Ducks%%%%%%\\____________;|");
	System.out.println ("");
    }


    public void Pathway ()
    {
	System.out.println ("     .----------.         .----------.     ");
	System.out.println ("\\   (  ||    ||  )  / \\   (   ||    || )     /");
	System.out.println (" \\   ~-||====||-~  /   \\   ~--||====||-~    /");
	System.out.println ("  \\    ||    ||   /     \\     ||    ||    /");
	System.out.println ("  |    ||====||  /      |     ||====||   / ");
	System.out.println ("  |__  ||    ||  |      |___  ||    ||  | ");
	System.out.println ("  | |\\ ||====||__|      |  |\\ ||====||__|     ");
	System.out.println ("  | | \\      /|  |      |  | \\       /| |     ");
	System.out.println ("  | |  \\    / |  |      |  |   \\    / | |    ");
	System.out.println ("  | |   \\__|  |  |      |  |     \\__| | |");
	System.out.println ("  | |   |__|  |  |      |  |     |__| | |");
	System.out.println ("  | |   /  |  |  |      |  |     /  | | |");
	System.out.println ("  | |  /    \\ |  |      |  |   /    \\ | |");
	System.out.println ("  | | /      \\|  |      |  | /       \\| |  ");
	System.out.println ("  |_|/        |__|      |__|/         \\_|");
	System.out.println ("  |              |      |               |");
	System.out.println ("  |              |      |               |");
	System.out.println ("  /              \\      /                \\   ");
	System.out.println (" /                \\    /                   \\  ");
	System.out.println ("/                  \\ /                       \\");
	System.out.println ("");
    }


    public void kingServants ()
    {
	System.out.println ("");
	System.out.println ("");
	System.out.println ("   __      _");
	System.out.println ("     /__\\__  //");
	System.out.println ("    //_____\\///");
	System.out.println ("   _| /-_-\\)|/_");
	System.out.println ("  (___\\ _ //___\\");
	System.out.println ("  (  |\\\\_/// * \\\\");
	System.out.println ("   \\_| \\_((*   *))");
	System.out.println ("   ( |__|_\\\\  *//");
	System.out.println ("   (o/  _  \\_*_/");
	System.out.println ("   //\\__|__/\\");
	System.out.println ("  // |  | |  |");
	System.out.println (" //  _\\ | |___)");
	System.out.println ("//  (___");
	System.out.println ("");
    }


    public void PLAYER ()
    {
	System.out.println ("     _,.");
	System.out.println ("    ,` -.)");
	System.out.println ("   ( _/-\\\\-._");
	System.out.println ("  /,|`--._,-^|            ,");
	System.out.println ("  \\_| |`-._/||          ,'|");
	System.out.println ("    |  `-, / |         /  /");
	System.out.println ("    |     || |        /  /");
	System.out.println ("     `r-._||/   __   /  /");
	System.out.println (" __,-<_     )`-/  `./  /");
	System.out.println ("'  \\   `---'   \\   /  /");
	System.out.println ("    |           |./  /");
	System.out.println ("    /           //  /");
	System.out.println ("\\_/' \\         |/  /");
	System.out.println (" |    |   _,^-'/  /");
	System.out.println (" |    , ``  (\\/  /_");
	System.out.println ("  \\,.->._    \\X-=/^");
	System.out.println ("  (  /   `-._//^`");
	System.out.println ("   `Y-.____(__}");
	System.out.println ("    |     {__)");
	System.out.println ("          ()");
	System.out.println ("");
    }


    public void Maze ()
    {
	System.out.println ("");
	System.out.println ("");
	System.out.println (",-----------------------------.----------------------------------.    ");
	System.out.println ("|                             |                                  |    ");
	System.out.println ("|    .    .    ,---------     |  D  ------------------------.    |    ");
	System.out.println ("|    |    |    | E            |                             |    |    ");
	System.out.println ("|    |    `----\"--------------'    ,-------------------.    |    |    ");
	System.out.println ("|    |                             |                   |    |    |    ");
	System.out.println ("|    :--------------.--------------\"----     ,---------:    |    |    ");
	System.out.println ("|    |              |  F                     |         |    |    |    ");
	System.out.println ("|    :---------     |    .    ,---------.    |    .    |    `----:    ");
	System.out.println ("|    |              |    |    |      G  |    |    |    |         |    ");
	System.out.println ("|    |     ---------'    |    :----     |    |    |    |    .    |    ");
	System.out.println ("|    |                   |    |         |    |    |    |    |    |    ");
	System.out.println ("|    `-------------------'    |     ----'    |    |    |    |    |    ");
	System.out.println ("|                             |              |    |    |    |    |    ");
	System.out.println (":--------------.---------.    :--------------'    |    :----'    |    ");
	System.out.println ("|           H  |         |    |                   |    |         |    ");
	System.out.println ("|    .    .    |    .    |    |    ,--------------:    `----     |    ");
	System.out.println ("|    |    |    |    |    |    |    |              |           B  |    ");
	System.out.println ("|    |    |    \"    |    |    |    |     ---------\"---------.    |    ");
	System.out.println ("|    |    |         |    |    |    |                        |    |    ");
	System.out.println ("|    |    `---------\"----'    |    |    ,---------.    .    |    |    ");
	System.out.println ("|    |                        |    |    |         |    |    |    |    ");
	System.out.println ("|    :---------.--------------:    |    |    .    |    |    |    |    ");
	System.out.println ("|    |         | I            |    |    |    |    |    | C  |    |    ");
	System.out.println ("|    \"    .    `---------     |    |    `----'    |    `----'    |    ");
	System.out.println ("|         |                   | A  |              |              |    ");
	System.out.println ("`---------\"-------------------'    `--------------\"--------------'");
	System.out.println ("");
	System.out.println ("");
    }


    public void ShadowMaze ()
    {
	System.out.println ("");
	System.out.println ("\\                           /");
	System.out.println (" \\                         /");
	System.out.println ("  \\                       /");
	System.out.println ("   ]                     [    ,'|");
	System.out.println ("   ]                     [   /  |");
	System.out.println ("   ]___               ___[ ,'   |");
	System.out.println ("   ]  ]\\             /[  [ |:   |");
	System.out.println ("   ]  ] \\           / [  [ |:   |");
	System.out.println ("   ]  ]  ]         [  [  [ |:   |");
	System.out.println ("   ]  ]  ]__     __[  [  [ |:   |");
	System.out.println ("   ]  ]  ] ]\\ _ /[ [  [  [ |:   |");
	System.out.println ("   ]  ]  ] ] (#) [ [  [  [ :===='");
	System.out.println ("   ]  ]  ]_].nHn.[_[  [  [");
	System.out.println ("   ]  ]  ]  HHHHH. [  [  [");
	System.out.println ("   ]  ] /   `HH(\"N  \\ [  [");
	System.out.println ("   ]__]/     HHH  \"  \\[__[");
	System.out.println ("   ]         NNN         [");
	System.out.println ("   ]         N/\"         [");
	System.out.println ("   ]         N H         [");
	System.out.println ("  /          N            \\");
	System.out.println (" /           q,            \\");
	System.out.println ("/                           \\");
	System.out.println ("");
    }


    public void DuckCry ()
    {
	System.out.println ("");
	System.out.println ("");
	System.out.println ("                                    _");
	System.out.println ("                                ,-\"\" \"\".");
	System.out.println ("                              ,'  ____  `.");
	System.out.println ("                            ,'  ,'    `.  `._");
	System.out.println ("   (`.         _..--.._   ,'  ,'        \\    \\");
	System.out.println ("  (`-.\\    .-\"\"        \"\"'   /          (  e _e");
	System.out.println (" (`._  `-\"\" ,._             (            `-(   \\");
	System.out.println (" <_  `     (  <`<            \\              `-._\\");
	System.out.println ("  <`-       (__< <           :");
	System.out.println ("   (__        (_<_<          ;");
	System.out.println ("    `------------------------------------------");
	System.out.println ("");
    }


    public void BabyDuck ()
    {
	System.out.println ("");
	System.out.println ("      ,~~.");
	System.out.println ("     (  9 )-_,");
	System.out.println ("(\\___ )=='-'");
	System.out.println (" \\ .   ) )");
	System.out.println ("  \\ `-' /");
	System.out.println ("   `~j-'   hjw");
	System.out.println ("     \"=:");
	System.out.println ("");
    }


    public void DuckHappy ()
    {
	System.out.println ("                               ,-\"\"   `.");
	System.out.println ("                             ,'  _   e )`-._");
	System.out.println ("                            /  ,' `-._<.===-'");
	System.out.println ("                           /  /");
	System.out.println ("                          /  ;");
	System.out.println ("              _.--.__    /   ;");
	System.out.println (" (`._    _.-\"\"       \"--'    |");
	System.out.println (" <_  `-\"\"                     \\");
	System.out.println ("  <`-                          :");
	System.out.println ("   (__   <__.                  ;");
	System.out.println ("     `-.   '-.__.      _.'    /");
	System.out.println ("        \\      `-.__,-'    _,'");
	System.out.println ("         `._    ,    /__,-'");
	System.out.println ("            \"\"._\\__,'< <____");
	System.out.println ("                 | |  `----.`.");
	System.out.println ("                 | |        \\ `.");
	System.out.println ("                 ; |___      \\-``");
	System.out.println ("                 \\   --<");
	System.out.println ("                  `.`.<");
	System.out.println ("                   `-'");
	System.out.println ("");
    }


    //titles
    public void RiddleASCII ()
    {
	System.out.println (" ____ ____ ____ ____ ____ ____ _________ ____ ____ ____ ____ ____ ____ ");
	System.out.println ("||R |||i |||d |||d |||l |||e |||       |||r |||i |||d |||d |||l |||e ||");
	System.out.println ("||__|||__|||__|||__|||__|||__|||_______|||__|||__|||__|||__|||__|||__||");
	System.out.println ("|/__\\|/__\\|/__\\|/__\\|/__\\|/__\\|/_______\\|/__\\|/__\\|/__\\|/__\\|/__\\|/__\\|");
	System.out.println ("");

    }


    public void MadLibsASCII ()
    {
	System.out.println (" ____ ____ ____ _________ ____ ____ ____ ____ ");
	System.out.println ("||M |||a |||d |||       |||L |||i |||b |||s ||");
	System.out.println ("||__|||__|||__|||_______|||__|||__|||__|||__||");
	System.out.println ("|/__\\|/__\\|/__\\|/_______\\|/__\\|/__\\|/__\\|/__\\|");
    }


    public void FizzBuzzASCII ()
    {
	System.out.println ("");
	System.out.println (" ____ ____ ____ ____ ____ ____ ____ ____ ____ ____ ____ ");
	System.out.println ("||B |||e |||r |||r |||y |||B |||e |||r |||r |||y |||! ||");
	System.out.println ("||__|||__|||__|||__|||__|||__|||__|||__|||__|||__|||__||");
	System.out.println ("|/__\\|/__\\|/__\\|/__\\|/__\\|/__\\|/__\\|/__\\|/__\\|/__\\|/__\\|");
	System.out.println ("");
    }


    public void MazeASCII ()
    {
	System.out.println ("");
	System.out.println (" ____ ____ ____ ____ ____ ____ ____ ____ _________ ____ ____ ____ ____ ");
	System.out.println ("||L |||o |||l |||l |||i |||p |||o |||p |||       |||M |||a |||z |||e ||");
	System.out.println ("||__|||__|||__|||__|||__|||__|||__|||__|||_______|||__|||__|||__|||__||");
	System.out.println ("|/__\\|/__\\|/__\\|/__\\|/__\\|/__\\|/__\\|/__\\|/_______\\|/__\\|/__\\|/__\\|/__\\|");
	System.out.println ("");
    }


    public void FortressASCII ()
    {
	System.out.println ("");
	System.out.println ("");
	System.out.println ("      ___           ___           ___           ___           ___                    ___           ___           ___           ___           ___           ___           ___           ___     ");
	System.out.println ("     /\\  \\         /\\  \\         /\\  \\         /\\  \\         /\\  \\                  /\\  \\         /\\  \\         /\\  \\         /\\  \\         /\\  \\         /\\  \\         /\\  \\         /\\  \\    ");
	System.out.println ("     \\:\\  \\       /::\\  \\       /::\\  \\       /::\\  \\       /::\\  \\                /::\\  \\       /::\\  \\       /::\\  \\        \\:\\  \\       /::\\  \\       /::\\  \\       /::\\  \\       /::\\  \\   ");
	System.out.println ("      \\:\\  \\     /:/\\:\\  \\     /:/\\:\\  \\     /:/\\:\\  \\     /:/\\:\\  \\              /:/\\:\\  \\     /:/\\:\\  \\     /:/\\:\\  \\        \\:\\  \\     /:/\\:\\  \\     /:/\\:\\  \\     /:/\\ \\  \\     /:/\\ \\  \\  ");
	System.out.println ("      /::\\  \\   /:/  \\:\\  \\   /::\\~\\:\\  \\   /::\\~\\:\\  \\   /::\\~\\:\\  \\            /::\\~\\:\\  \\   /:/  \\:\\  \\   /::\\~\\:\\  \\       /::\\  \\   /::\\~\\:\\  \\   /::\\~\\:\\  \\   _\\:\\~\\ \\  \\   _\\:\\~\\ \\  \\ ");
	System.out.println ("     /:/\\:\\__\\ /:/__/ \\:\\__\\ /:/\\:\\ \\:\\__\\ /:/\\:\\ \\:\\__\\ /:/\\:\\ \\:\\__\\          /:/\\:\\ \\:\\__\\ /:/__/ \\:\\__\\ /:/\\:\\ \\:\\__\\     /:/\\:\\__\\ /:/\\:\\ \\:\\__\\ /:/\\:\\ \\:\\__\\ /\\ \\:\\ \\ \\__\\ /\\ \\:\\ \\ \\__\\");
	System.out.println ("    /:/  \\/__/ \\:\\  \\ /:/  / \\/__\\:\\ \\/__/ \\:\\~\\:\\ \\/__/ \\:\\~\\:\\ \\/__/          \\/__\\:\\ \\/__/ \\:\\  \\ /:/  / \\/_|::\\/:/  /    /:/  \\/__/ \\/_|::\\/:/  / \\:\\~\\:\\ \\/__/ \\:\\ \\:\\ \\/__/ \\:\\ \\:\\ \\/__/");
	System.out.println ("   /:/  /       \\:\\  /:/  /       \\:\\__\\    \\:\\ \\:\\__\\    \\:\\ \\:\\__\\                 \\:\\__\\    \\:\\  /:/  /     |:|::/  /    /:/  /         |:|::/  /   \\:\\ \\:\\__\\    \\:\\ \\:\\__\\    \\:\\ \\:\\__\\  ");
	System.out.println ("   \\/__/         \\:\\/:/  /         \\/__/     \\:\\ \\/__/     \\:\\ \\/__/                  \\/__/     \\:\\/:/  /      |:|\\/__/     \\/__/          |:|\\/__/     \\:\\ \\/__/     \\:\\/:/  /     \\:\\/:/  /  ");
	System.out.println ("                  \\::/  /                     \\:\\__\\        \\:\\__\\                               \\::/  /       |:|  |                      |:|  |        \\:\\__\\        \\::/  /       \\::/  /   ");
	System.out.println ("                   \\/__/                       \\/__/         \\/__/                                \\/__/         \\|__|                       \\|__|         \\/__/         \\/__/         \\/__/ ");
	System.out.println ("");

    }


    public void LolliGardenASCII ()
    {
	System.out.println ("");
	System.out.println ("");
	System.out.println ("");
	System.out.println ("      ___       ___           ___       ___                            ___           ___           ___           ___           ___           ___     ");
	System.out.println ("     /\\__\\     /\\  \\         /\\__\\     /\\__\\      ___                 /\\  \\         /\\  \\         /\\  \\         /\\  \\         /\\  \\         /\\__\\    ");
	System.out.println ("    /:/  /    /::\\  \\       /:/  /    /:/  /     /\\  \\               /::\\  \\       /::\\  \\       /::\\  \\       /::\\  \\       /::\\  \\       /::|  |   ");
	System.out.println ("   /:/  /    /:/\\:\\  \\     /:/  /    /:/  /      \\:\\  \\             /:/\\:\\  \\     /:/\\:\\  \\     /:/\\:\\  \\     /:/\\:\\  \\     /:/\\:\\  \\     /:|:|  |   ");
	System.out.println ("  /:/  /    /:/  \\:\\  \\   /:/  /    /:/  /       /::\\__\\           /:/  \\:\\  \\   /::\\~\\:\\  \\   /::\\~\\:\\  \\   /:/  \\:\\__\\   /::\\~\\:\\  \\   /:/|:|  |__ ");
	System.out.println (" /:/__/    /:/__/ \\:\\__\\ /:/__/    /:/__/     __/:/\\/__/          /:/__/_\\:\\__\\ /:/\\:\\ \\:\\__\\ /:/\\:\\ \\:\\__\\ /:/__/ \\:|__| /:/\\:\\ \\:\\__\\ /:/ |:| /\\__\\");
	System.out.println (" \\:\\  \\    \\:\\  \\ /:/  / \\:\\  \\    \\:\\  \\    /\\/:/  /             \\:\\  /\\ \\/__/ \\/__\\:\\/:/  / \\/_|::\\/:/  / \\:\\  \\ /:/  / \\:\\~\\:\\ \\/__/ \\/__|:|/:/  /");
	System.out.println ("  \\:\\  \\    \\:\\  /:/  /   \\:\\  \\    \\:\\  \\   \\::/__/               \\:\\ \\:\\__\\        \\::/  /     |:|::/  /   \\:\\  /:/  /   \\:\\ \\:\\__\\       |:/:/  / ");
	System.out.println ("   \\:\\  \\    \\:\\/:/  /     \\:\\  \\    \\:\\  \\   \\:\\__\\                \\:\\/:/  /        /:/  /      |:|\\/__/     \\:\\/:/  /     \\:\\ \\/__/       |::/  /  ");
	System.out.println ("    \\:\\__\\    \\::/  /       \\:\\__\\    \\:\\__\\   \\/__/                 \\::/  /        /:/  /       |:|  |        \\::/__/       \\:\\__\\         /:/  /   ");
	System.out.println ("     \\/__/     \\/__/         \\/__/     \\/__/                          \\/__/         \\/__/         \\|__|         ~~            \\/__/         \\/__/ ");
	System.out.println ("");
    }


    public void KingdomASCII ()
    {
	System.out.println ("      ___           ___           ___           ___                       ___     ");
	System.out.println ("     /\\  \\         /\\  \\         /\\__\\         /\\  \\          ___        /\\  \\    ");
	System.out.println ("    /::\\  \\       /::\\  \\       /::|  |       /::\\  \\        /\\  \\      /::\\  \\   ");
	System.out.println ("   /:/\\:\\  \\     /:/\\:\\  \\     /:|:|  |      /:/\\:\\  \\       \\:\\  \\    /:/\\:\\  \\  ");
	System.out.println ("  /:/  \\:\\  \\   /::\\~\\:\\  \\   /:/|:|  |__   /:/  \\:\\__\\      /::\\__\\  /::\\~\\:\\  \\ ");
	System.out.println (" /:/__/ \\:\\__\\ /:/\\:\\ \\:\\__\\ /:/ |:| /\\__\\ /:/__/ \\:|__|  __/:/\\/__/ /:/\\:\\ \\:\\__\\");
	System.out.println (" \\:\\  \\  \\/__/ \\/__\\:\\/:/  / \\/__|:|/:/  / \\:\\  \\ /:/  / /\\/:/  /    \\:\\~\\:\\ \\/__/");
	System.out.println ("  \\:\\  \\            \\::/  /      |:/:/  /   \\:\\  /:/  /  \\::/__/      \\:\\ \\:\\__\\  ");
	System.out.println ("   \\:\\  \\           /:/  /       |::/  /     \\:\\/:/  /    \\:\\__\\       \\:\\ \\/__/  ");
	System.out.println ("    \\:\\__\\         /:/  /        /:/  /       \\::/__/      \\/__/        \\:\\__\\    ");
	System.out.println ("     \\/__/         \\/__/         \\/__/         ~~                        \\/__/    ");
	System.out.println ("      ___                       ___           ___           ___           ___           ___     ");
	System.out.println ("     /\\__\\          ___        /\\__\\         /\\  \\         /\\  \\         /\\  \\         /\\__\\    ");
	System.out.println ("    /:/  /         /\\  \\      /::|  |       /::\\  \\       /::\\  \\       /::\\  \\       /::|  |   ");
	System.out.println ("   /:/__/          \\:\\  \\    /:|:|  |      /:/\\:\\  \\     /:/\\:\\  \\     /:/\\:\\  \\     /:|:|  |   ");
	System.out.println ("  /::\\__\\____      /::\\__\\  /:/|:|  |__   /:/  \\:\\  \\   /:/  \\:\\__\\   /:/  \\:\\  \\   /:/|:|__|__ ");
	System.out.println (" /:/\\:::::\\__\\  __/:/\\/__/ /:/ |:| /\\__\\ /:/__/_\\:\\__\\ /:/__/ \\:|__| /:/__/ \\:\\__\\ /:/ |::::\\__\\");
	System.out.println (" \\/_|:|~~|~    /\\/:/  /    \\/__|:|/:/  / \\:\\  /\\ \\/__/ \\:\\  \\ /:/  / \\:\\  \\ /:/  / \\/__/~~/:/  /");
	System.out.println ("    |:|  |     \\::/__/         |:/:/  /   \\:\\ \\:\\__\\    \\:\\  /:/  /   \\:\\  /:/  /        /:/  / ");
	System.out.println ("    |:|  |      \\:\\__\\         |::/  /     \\:\\/:/  /     \\:\\/:/  /     \\:\\/:/  /        /:/  /  ");
	System.out.println ("    |:|  |       \\/__/         /:/  /       \\::/  /       \\::/__/       \\::/  /        /:/  /   ");
	System.out.println ("     \\|__|                     \\/__/         \\/__/         ~~            \\/__/         \\/__/");
	System.out.println ("");
	System.out.println ("");

    }


    public void GumdropHutsASCII ()
    {
	System.out.println ("");
	System.out.println ("      ___           ___           ___           ___           ___           ___           ___                    ___           ___           ___           ___     ");
	System.out.println ("     /\\  \\         /\\__\\         /\\__\\         /\\  \\         /\\  \\         /\\  \\         /\\  \\                  /\\__\\         /\\__\\         /\\  \\         /\\  \\    ");
	System.out.println ("    /::\\  \\       /:/  /        /::|  |       /::\\  \\       /::\\  \\       /::\\  \\       /::\\  \\                /:/  /        /:/  /         \\:\\  \\       /::\\  \\   ");
	System.out.println ("   /:/\\:\\  \\     /:/  /        /:|:|  |      /:/\\:\\  \\     /:/\\:\\  \\     /:/\\:\\  \\     /:/\\:\\  \\              /:/__/        /:/  /           \\:\\  \\     /:/\\ \\  \\  ");
	System.out.println ("  /:/  \\:\\  \\   /:/  /  ___   /:/|:|__|__   /:/  \\:\\__\\   /::\\~\\:\\  \\   /:/  \\:\\  \\   /::\\~\\:\\  \\            /::\\  \\ ___   /:/  /  ___       /::\\  \\   _\\:\\~\\ \\  \\ ");
	System.out.println (" /:/__/_\\:\\__\\ /:/__/  /\\__\\ /:/ |::::\\__\\ /:/__/ \\:|__| /:/\\:\\ \\:\\__\\ /:/__/ \\:\\__\\ /:/\\:\\ \\:\\__\\          /:/\\:\\  /\\__\\ /:/__/  /\\__\\     /:/\\:\\__\\ /\\ \\:\\ \\ \\__\\");
	System.out.println (" \\:\\  /\\ \\/__/ \\:\\  \\ /:/  / \\/__/~~/:/  / \\:\\  \\ /:/  / \\/_|::\\/:/  / \\:\\  \\ /:/  / \\/__\\:\\/:/  /          \\/__\\:\\/:/  / \\:\\  \\ /:/  /    /:/  \\/__/ \\:\\ \\:\\ \\/__/");
	System.out.println ("  \\:\\ \\:\\__\\    \\:\\  /:/  /        /:/  /   \\:\\  /:/  /     |:|::/  /   \\:\\  /:/  /       \\::/  /                \\::/  /   \\:\\  /:/  /    /:/  /       \\:\\ \\:\\__\\  ");
	System.out.println ("   \\:\\/:/  /     \\:\\/:/  /        /:/  /     \\:\\/:/  /      |:|\\/__/     \\:\\/:/  /         \\/__/                 /:/  /     \\:\\/:/  /     \\/__/         \\:\\/:/  /  ");
	System.out.println ("    \\::/  /       \\::/  /        /:/  /       \\::/__/       |:|  |        \\::/  /                               /:/  /       \\::/  /                     \\::/  /   ");
	System.out.println ("     \\/__/         \\/__/         \\/__/         ~~            \\|__|         \\/__/                                \\/__/         \\/__/                       \\/__/  ");
	System.out.println ("");
	System.out.println ("");
	System.out.println ("");
	System.out.println ("");
    }


    public void VanillaCreekASCII ()
    {

	System.out.println ("      ___           ___           ___                       ___       ___       ___                    ___           ___           ___           ___           ___     ");
	System.out.println ("     /\\__\\         /\\  \\         /\\__\\          ___        /\\__\\     /\\__\\     /\\  \\                  /\\  \\         /\\  \\         /\\  \\         /\\  \\         /\\__\\    ");
	System.out.println ("    /:/  /        /::\\  \\       /::|  |        /\\  \\      /:/  /    /:/  /    /::\\  \\                /::\\  \\       /::\\  \\       /::\\  \\       /::\\  \\       /:/  /    ");
	System.out.println ("   /:/  /        /:/\\:\\  \\     /:|:|  |        \\:\\  \\    /:/  /    /:/  /    /:/\\:\\  \\              /:/\\:\\  \\     /:/\\:\\  \\     /:/\\:\\  \\     /:/\\:\\  \\     /:/__/     ");
	System.out.println ("  /:/__/  ___   /::\\~\\:\\  \\   /:/|:|  |__      /::\\__\\  /:/  /    /:/  /    /::\\~\\:\\  \\            /:/  \\:\\  \\   /::\\~\\:\\  \\   /::\\~\\:\\  \\   /::\\~\\:\\  \\   /::\\__\\____ ");
	System.out.println ("  |:|  | /\\__\\ /:/\\:\\ \\:\\__\\ /:/ |:| /\\__\\  __/:/\\/__/ /:/__/    /:/__/    /:/\\:\\ \\:\\__\\          /:/__/ \\:\\__\\ /:/\\:\\ \\:\\__\\ /:/\\:\\ \\:\\__\\ /:/\\:\\ \\:\\__\\ /:/\\:::::\\__\\");
	System.out.println ("  |:|  |/:/  / \\/__\\:\\/:/  / \\/__|:|/:/  / /\\/:/  /    \\:\\  \\    \\:\\  \\    \\/__\\:\\/:/  /          \\:\\  \\  \\/__/ \\/_|::\\/:/  / \\:\\~\\:\\ \\/__/ \\:\\~\\:\\ \\/__/ \\/_|:|~~|~   ");
	System.out.println ("  |:|__/:/  /       \\::/  /      |:/:/  /  \\::/__/      \\:\\  \\    \\:\\  \\        \\::/  /            \\:\\  \\          |:|::/  /   \\:\\ \\:\\__\\    \\:\\ \\:\\__\\      |:|  |    ");
	System.out.println ("   \\::::/__/        /:/  /       |::/  /    \\:\\__\\       \\:\\  \\    \\:\\  \\       /:/  /              \\:\\  \\         |:|\\/__/     \\:\\ \\/__/     \\:\\ \\/__/      |:|  |    ");
	System.out.println ("    ~~~~           /:/  /        /:/  /      \\/__/        \\:\\__\\    \\:\\__\\     /:/  /                \\:\\__\\        |:|  |        \\:\\__\\        \\:\\__\\        |:|  |    ");
	System.out.println ("                   \\/__/         \\/__/                     \\/__/     \\/__/     \\/__/                  \\/__/         \\|__|         \\/__/         \\/__/         \\|__| ");
	System.out.println ("");
	System.out.println ("");
    }


    public void TaffyRoadASCII ()
    {
	System.out.println ("");
	System.out.println ("      ___           ___           ___           ___           ___                    ___       ___           ___           ___     ");
	System.out.println ("     /\\  \\         /\\  \\         /\\  \\         /\\  \\         |\\__\\                  /\\__\\     /\\  \\         /\\__\\         /\\  \\    ");
	System.out.println ("     \\:\\  \\       /::\\  \\       /::\\  \\       /::\\  \\        |:|  |                /:/  /    /::\\  \\       /::|  |       /::\\  \\   ");
	System.out.println ("      \\:\\  \\     /:/\\:\\  \\     /:/\\:\\  \\     /:/\\:\\  \\       |:|  |               /:/  /    /:/\\:\\  \\     /:|:|  |      /:/\\:\\  \\  ");
	System.out.println ("      /::\\  \\   /::\\~\\:\\  \\   /::\\~\\:\\  \\   /::\\~\\:\\  \\      |:|__|__            /:/  /    /::\\~\\:\\  \\   /:/|:|  |__   /::\\~\\:\\  \\ ");
	System.out.println ("     /:/\\:\\__\\ /:/\\:\\ \\:\\__\\ /:/\\:\\ \\:\\__\\ /:/\\:\\ \\:\\__\\     /::::\\__\\          /:/__/    /:/\\:\\ \\:\\__\\ /:/ |:| /\\__\\ /:/\\:\\ \\:\\__\\");
	System.out.println ("    /:/  \\/__/ \\/__\\:\\/:/  / \\/__\\:\\ \\/__/ \\/__\\:\\ \\/__/    /:/~~/~             \\:\\  \\    \\/__\\:\\/:/  / \\/__|:|/:/  / \\:\\~\\:\\ \\/__/");
	System.out.println ("   /:/  /           \\::/  /       \\:\\__\\        \\:\\__\\     /:/  /                \\:\\  \\        \\::/  /      |:/:/  /   \\:\\ \\:\\__\\  ");
	System.out.println ("   \\/__/            /:/  /         \\/__/         \\/__/     \\/__/                  \\:\\  \\       /:/  /       |::/  /     \\:\\ \\/__/  ");
	System.out.println ("                   /:/  /                                                          \\:\\__\\     /:/  /        /:/  /       \\:\\__\\    ");
	System.out.println ("                   \\/__/                                                            \\/__/     \\/__/         \\/__/         \\/__/  ");
	System.out.println ("");

    }


    public void SmallMermaidASCII ()
    {
	System.out.println ("          ,sSSs");
	System.out.println ("        ,SSSS_/ ,_");
	System.out.println ("        sS/`))\\//");
	System.out.println ("       sS//|_(_/      _,");
	System.out.println ("       SS\\\\\\  `\"\"-.-'` /");
	System.out.println ("     sSS` ` `-==-'`'-._\\");
	System.out.println ("");
    }


    public void BigMermaidASCII ()
    {
	System.out.println ("                           .-\"\"-.");
	System.out.println ("                          (___/\\ \\");
	System.out.println ("        ,                 (|^ ^ ) )");
	System.out.println ("       /(                _)_\\=_/  (");
	System.out.println (" ,..__/ `\\          ____(_/_ ` \\   )");
	System.out.println ("  `\\    _/        _/---._/(_)_  `\\ (");
	System.out.println ("    '--\\ `-.__..-'    /.    (_), |  )");
	System.out.println ("        `._        ___\\_____.'_| |__/");
	System.out.println ("           `~----\"`   `-.........'");
	System.out.println ("");

    }


    public void MermaidsASCII ()
    {
	System.out.println ("");
	System.out.println ("                         /:.:,");
	System.out.println ("              O          \\::/");
	System.out.println ("            o            /|`");
	System.out.println ("            _ '  sSSs   /:|");
	System.out.println ("             \\\\__\\_SSSs/::|");
	System.out.println ("  ,sSSs       `--((S\\SSSs/");
	System.out.println (",SSSS_/ ,_        SS\\\\SSSs");
	System.out.println ("sS/`))\\//        sSS//SSs");
	System.out.println ("S//|_(\\/            `Ss'         sSSs,");
	System.out.println ("S\\\\|::\\                       _, \\_SSSS,");
	System.out.println ("SS` \\:|                        \\\\/((`\\Ss");
	System.out.println ("     \\|__                ._     \\/)_|\\\\Ss");
	System.out.println ("     /:::\\               \\ `-.-\"\"'  ///SS");
	System.out.println ("jgs  \\:`'`               /_.-'`-==-' ' 'SSs");
	System.out.println ("");
    }


    public void SwimMermaidASCII ()
    {
	System.out.println ("      . o  O");
	System.out.println ("    O  () o ().o");
	System.out.println ("      o O.    _");
	System.out.println (" ___  .   ,~`'~`~._");
	System.out.println ("`-,_\\  o(((\\\\ ~ _~`~._,,,_");
	System.out.println ("    \\\\O . >>`-, ~ _~ ,~'~ ");
	System.out.println ("     \\`.o \\__  /,-~,,~'`");
	System.out.println ("      \\ `.__\\  )--.");
	System.out.println ("       `.___ \\/    `.");
	System.out.println ("            )&,   ._ `.");
	System.out.println ("            \\_\\_  ( `. \\");
	System.out.println ("              `.   `._`.\\--,");
	System.out.println ("                \\_.-;;;.\\,-'");
	System.out.println ("                 \\;;;;;;;.");
	System.out.println ("                  \\;;;;;;;\\");
	System.out.println ("                   `;;;;;;;\\");
	System.out.println ("                     `;;;;;;;. _______");
	System.out.println ("                       `~;;;;;;.    _,'");
	System.out.println ("                          `~.;;  ,-'");
	System.out.println ("                              \\  ;");
	System.out.println ("                               \\ ;      hjw");
	System.out.println ("                                \\j");
	System.out.println ("");

    }


    public void BunnyASCII ()
    {
	System.out.println ("         ,");
	System.out.println ("        /|      __");
	System.out.println ("       / |   ,-~ /");
	System.out.println ("      Y :|  //  /");
	System.out.println ("      | jj /( .^");
	System.out.println ("      >-\"~\"-v\"");
	System.out.println ("     /       Y");
	System.out.println ("    jo  o    |");
	System.out.println ("   ( ~T~     j");
	System.out.println ("    >._-' _./");
	System.out.println ("   /   \"~\"  |");
	System.out.println ("  Y     _,  |");
	System.out.println (" /| ;-\"~ _  l");
	System.out.println ("/ l/ ,-\"~    \\");
	System.out.println ("\\//\\/      .- \\");
	System.out.println (" Y        /    Y    -Row");
	System.out.println (" l       I     !");
	System.out.println (" ]\\      _\\    /\"\\");
	System.out.println ("(\" ~----( ~   Y.  )");
	System.out.println ("");

    }


    public void NoteMadLibsASCII ()
    {
	System.out.println ("    __________________   __________________");
	System.out.println (".-/|                  \\ /                  |\\-.");
	System.out.println ("||||    XXX  XXXXX     |                   ||||");
	System.out.println ("||||      XX XX        |       ~~*~~       ||||");
	System.out.println ("||||    --==*==--      |       x   x       ||||");
	System.out.println ("||||   xxx xxx xxxx x  |    XX   XXX  XXX  ||||");
	System.out.println ("||||  x xx xxxxxx  xx  |       XX   X      ||||");
	System.out.println ("||||                   |     --==*==--     ||||");
	System.out.println ("||||  x x xxx  x xxxxx |   xxxx xx   x x   ||||");
	System.out.println ("|||| xxx  x  xxxx xxx  |   xx   xx xxxx  x ||||");
	System.out.println ("||||                   | xxxx  xxx   xxxx  ||||");
	System.out.println ("|||| xxx  xxxx  xx  xx | x    xx    xxxx   ||||");
	System.out.println ("||||__________________ | __________________||||");
	System.out.println ("||/===================\\|/===================\\||");
	System.out.println ("`--------------------~___~-------------------''");
	System.out.println ("");
    }


    public void FBunnyNoteASCII ()
    {
	System.out.println ("");
	System.out.println ("(\\ ");
	System.out.println ("\\'\\ ");
	System.out.println (" \\'\\     __________  ");
	System.out.println (" / '|   ()_________)");
	System.out.println (" \\ '/    \\ ~~~~~~~~ \\");
	System.out.println ("   \\       \\ ~~~~~~   \\");
	System.out.println ("   ==).      \\__________\\");
	System.out.println ("  (__)       ()__________)");
	System.out.println ("");
	System.out.println ("");

    }


    public void GAMEOVERASCII ()
    {
	System.out.println ("      ___           ___           ___           ___     ");
	System.out.println ("     /\\  \\         /\\  \\         /\\__\\         /\\  \\    ");
	System.out.println ("    /::\\  \\       /::\\  \\       /::|  |       /::\\  \\   ");
	System.out.println ("   /:/\\:\\  \\     /:/\\:\\  \\     /:|:|  |      /:/\\:\\  \\  ");
	System.out.println ("  /:/  \\:\\  \\   /::\\~\\:\\  \\   /:/|:|__|__   /::\\~\\:\\  \\ ");
	System.out.println (" /:/__/_\\:\\__\\ /:/\\:\\ \\:\\__\\ /:/ |::::\\__\\ /:/\\:\\ \\:\\__\\");
	System.out.println (" \\:\\  /\\ \\/__/ \\/__\\:\\/:/  / \\/__/~~/:/  / \\:\\~\\:\\ \\/__/");
	System.out.println ("  \\:\\ \\:\\__\\        \\::/  /        /:/  /   \\:\\ \\:\\__\\  ");
	System.out.println ("   \\:\\/:/  /        /:/  /        /:/  /     \\:\\ \\/__/  ");
	System.out.println ("    \\::/  /        /:/  /        /:/  /       \\:\\__\\    ");
	System.out.println ("     \\/__/         \\/__/         \\/__/         \\/__/    ");
	System.out.println ("      ___           ___           ___           ___     ");
	System.out.println ("     /\\  \\         /\\__\\         /\\  \\         /\\  \\    ");
	System.out.println ("    /::\\  \\       /:/  /        /::\\  \\       /::\\  \\   ");
	System.out.println ("   /:/\\:\\  \\     /:/  /        /:/\\:\\  \\     /:/\\:\\  \\  ");
	System.out.println ("  /:/  \\:\\  \\   /:/__/  ___   /::\\~\\:\\  \\   /::\\~\\:\\  \\ ");
	System.out.println (" /:/__/ \\:\\__\\  |:|  | /\\__\\ /:/\\:\\ \\:\\__\\ /:/\\:\\ \\:\\__\\");
	System.out.println (" \\:\\  \\ /:/  /  |:|  |/:/  / \\:\\~\\:\\ \\/__/ \\/_|::\\/:/  /");
	System.out.println ("  \\:\\  /:/  /   |:|__/:/  /   \\:\\ \\:\\__\\      |:|::/  / ");
	System.out.println ("   \\:\\/:/  /     \\::::/__/     \\:\\ \\/__/      |:|\\/__/  ");
	System.out.println ("    \\::/  /       ~~~~          \\:\\__\\        |:|  |    ");
	System.out.println ("     \\/__/                       \\/__/         \\|__| ");
	System.out.println ("");
    }


    public void pointsASCII ()
    {
	System.out.println ("");
	System.out.println (" ____  _____  ____  _  _  ____  ___ ");
	System.out.println ("(  _ \\(  _  )(_  _)( \\( )(_  _)/ __)");
	System.out.println (" )___/ )(_)(  _)(_  )  (   )(  \\__ \\");
	System.out.println ("(__)  (_____)(____)(_)\\_) (__) (___/");
	System.out.println ("");
    }


    public void TITLE1 ()
    {
	System.out.println ("");
	System.out.println ("");
	System.out.println ("      :::::::: :::       :::::::::::::::::::::::::::::::::: ");
	System.out.println ("    :+:    :+::+:       :+::+:       :+:           :+:      ");
	System.out.println ("   +:+       +:+       +:++:+       +:+           +:+       ");
	System.out.println ("  +#++:++#+++#+  +:+  +#++#++:++#  +#++:++#      +#+        ");
	System.out.println ("        +#++#+ +#+#+ +#++#+       +#+           +#+         ");
	System.out.println ("#+#    #+# #+#+# #+#+# #+#       #+#           #+#          ");
	System.out.println ("########   ###   ###  ####################    ###           ");
	System.out.println ("  :::::::::::::::::::  ::::::::::::::::::::::    ::: ");
	System.out.println ("     :+:   :+:    :+::+:    :+:   :+:    :+:    :+:  ");
	System.out.println ("    +:+   +:+    +:++:+    +:+   +:+    +:+    +:+   ");
	System.out.println ("   +#+   +#+    +:++#+    +:+   +#+    +#++:++#++    ");
	System.out.println ("  +#+   +#+    +#++#+    +#+   +#+    +#+    +#+     ");
	System.out.println (" #+#   #+#    #+##+#    #+#   #+#    #+#    #+#      ");
	System.out.println ("###    ########  ########    ###    ###    ###   ");
	System.out.println ("");


    }


    public void TITLE2 ()
    {
	System.out.println ("  _|_|_|                                            _|      ");
	System.out.println ("_|        _|      _|      _|    _|_|      _|_|    _|_|_|_|  ");
	System.out.println ("  _|_|    _|      _|      _|  _|_|_|_|  _|_|_|_|    _|      ");
	System.out.println ("      _|    _|  _|  _|  _|    _|        _|          _|      ");
	System.out.println ("_|_|_|        _|      _|        _|_|_|    _|_|_|      _|_|  ");
	System.out.println ("                                                            ");
	System.out.println ("                                                            ");
	System.out.println ("                                                  ");
	System.out.println ("_|_|_|_|_|                      _|      _|        ");
	System.out.println ("    _|      _|_|      _|_|    _|_|_|_|  _|_|_|    ");
	System.out.println ("    _|    _|    _|  _|    _|    _|      _|    _|  ");
	System.out.println ("    _|    _|    _|  _|    _|    _|      _|    _|  ");
	System.out.println ("    _|      _|_|      _|_|        _|_|  _|    _|  ");
	System.out.println ("                                                  ");
	System.out.println ("");

    }


    public void TITLE3 ()
    {
	System.out.println ("");
	System.out.println ("       #######                                                        /###           /                               /       ");
	System.out.println ("    /       ###                                                     /  ############/                              #/        ");
	System.out.println ("   /         ##                                           #        /     #########                          #     ##        ");
	System.out.println ("   ##        # ##                                        ##        #     /  #                              ##     ##        ");
	System.out.println ("    ###        ##                                        ##         ##  /  ##                              ##     ##        ");
	System.out.println ("   ## ###       ##    ###    ####      /##       /##   ########        /  ###          /###     /###     ######## ##  /##   ");
	System.out.println ("    ### ###      ##    ###     ###  / / ###     / ### ########        ##   ##         / ###  / / ###  / ########  ## / ###  ");
	System.out.println ("      ### ###    ##     ###     ###/ /   ###   /   ###   ##           ##   ##        /   ###/ /   ###/     ##     ##/   ### ");
	System.out.println ("        ### /##  ##      ##      ## ##    ### ##    ###  ##           ##   ##       ##    ## ##    ##      ##     ##     ## ");
	System.out.println ("          #/ /## ##      ##      ## ########  ########   ##           ##   ##       ##    ## ##    ##      ##     ##     ## ");
	System.out.println ("           #/ ## ##      ##      ## #######   #######    ##            ##  ##       ##    ## ##    ##      ##     ##     ## ");
	System.out.println ("            # /  ##      ##      ## ##        ##         ##             ## #      / ##    ## ##    ##      ##     ##     ## ");
	System.out.println ("  /##        /   ##      /#      /  ####    / ####    /  ##              ###     /  ##    ## ##    ##      ##     ##     ## ");
	System.out.println (" /  ########/     ######/ ######/    ######/   ######/   ##               ######/    ######   ######       ##     ##     ## ");
	System.out.println ("/     #####        #####   #####      #####     #####     ##                ###       ####     ####         ##     ##    ## ");
	System.out.println ("|                                                                                                                        /  ");
	System.out.println (" \\)                                                                                                                    /   ");
	System.out.println ("                                                                                                                       /    ");
	System.out.println ("                                                                                                                      /  ");
	System.out.println ("");

    }


    public void MadDragonASCII ()
    {

	System.out.println (" |\\                                       ___.");
	System.out.println ("                        ||\\_____          /====================>/`,--`");
	System.out.println ("                        ||    ,(__,      //  ,_____,----------//_:");
	System.out.println ("                        ||   /    |  ,=='  ./                / \\  \\");
	System.out.println ("                ,      ,|:  / ,___\\_/     /     ,____,------(   \\_ \\");
	System.out.println ("               />\\    /<\\  \\       /       ____'     \\.      \\   |  \\");
	System.out.println ("              // /,,,,\\ \\\\__J_____/      ,     \\       \\.  ___\\  |_  \\");
	System.out.println ("             /'  ~\"\"\"\"~  '\\      /        \\     \\        \\/     /     >");
	System.out.println ("         __|\\___~,|  |,~___/|__ /          \\     \\       /___--'`    /");
	System.out.println ("         \\_  /\\  _/       /\\    |     \\ _____|          /");
	System.out.println ("         /_  \\_>|=\\/=|<__/  _\\      |  \\   |      (               /");
	System.out.println ("           |/  |~>====<~|  \\|            \\  | _____|              /");
	System.out.println ("            \\  \\/  /              \\ |/                 |,/");
	System.out.println ("           / \\  >VvvvvV<  /                \\/     \\            \\__,");
	System.out.println ("          /,^,\\_\\ |  | /_/     \\        |          \\             /");
	System.out.println ("     _.--'`: :,-//\\^^/\\\\ `,     |      /    ,______=\\_____,     /");
	System.out.println ("      `--.__.__-\\======/   `====|     |===='    `---,    /     /");
	System.out.println ("                 ~~~~~~         |     |            /    /     /");
	System.out.println ("                              __/     \\__       __|    |     |");
	System.out.println ("                             /---^.=,^---\\     /---^.=_/     \\__");
	System.out.println ("                             '     V     '     '    /---^.=.^---\\");
	System.out.println ("                                                    '     V     '");
	System.out.println ("");
    }


    public void DragonAppASCII ()
    {
	System.out.println ("");
	System.out.println ("              __");
	System.out.println ("          _.-'.-'-.__");
	System.out.println ("       .-'.       '-.'-._ __.--._");
	System.out.println ("-..'\\,-,/..-  _         .'   \\   '----._");
	System.out.println (" ). /_ _\\' ( ' '.         '-  '/'-----._'-.__");
	System.out.println (" '..'     '-r   _      .-.       '-._ \\");
	System.out.println (" '.\\. Y .).'       ( .'  .      .\\          '\\'.");
	System.out.println (" .-')'|'/'-.        \\)    )      '',_      _.c_.\\");
	System.out.println ("   .<, ,>.          |   _/\\        . ',   :   : \\\\");
	System.out.println ("  .' \\_/ '.        /  .'   |          '.     .'  \\)");
	System.out.println ("                  / .-'    '-.        : \\   _;   ||");
	System.out.println ("                 / /    _     \\_      '.'\\ ' /   ||");
	System.out.println ("                /.'   .'        \\_      .|   \\   \\|");
	System.out.println ("               / /   /      __.---'      '._  ;  ||");
	System.out.println ("              /.'  _:-.____< ,_           '.\\ \\  ||");
	System.out.println ("             // .-'     '-.__  '-'-\\_      '.\\/_ \\|");
	System.out.println ("            ( };====.===-==='        '.    .  \\\\: \\");
	System.out.println ("             \\\\ '._        /          :   ,'   )\\_ \\");
	System.out.println ("              \\\\   '------/            \\ .    /   )/");
	System.out.println ("               \\|        _|             )Y    |   /");
	System.out.println ("                \\\\      \\             .','   /  ,/");
	System.out.println ("                 \\\\    _/            /     _/");
	System.out.println ("                  \\\\   \\           .'    .'");
	System.out.println ("                   '| '1          /    .'");
	System.out.println ("                     '. \\        |:    /");
	System.out.println ("                       \\ |       /', .'");
	System.out.println ("                        \\(      ( ;z'");
	System.out.println ("                         \\:      \\ '(_");
	System.out.println ("                          \\_,     '._ '-.___");
	System.out.println ("                                      '-' -.\\");
	System.out.println ("");

    }


    public void AngryDragon ()
    {
	System.out.println ("");
	System.out.println ("                                        ,   ,");
	System.out.println ("                                        $,  $,     ,");
	System.out.println ("                                        \"ss.$ss. .s'");
	System.out.println ("                                ,     .ss$$$$$$$$$$s,");
	System.out.println ("                                $. s$$$$$$$$$$$$$$`$$Ss");
	System.out.println ("                                \"$$$$$$$$$$$$$$$$$$-$$$       ,");
	System.out.println ("                               s$$$$$$$$$$$$$$$$$$$$$$$$s,  ,s");
	System.out.println ("                              s$$$$$$$$$\"$$$$$$\"\"\"\"$$$$$$\"$$$$$,");
	System.out.println ("                              s$$$$$$$$$$s\"\"$$$$ssssss\"$$$$$$$$\"");
	System.out.println ("                             s$$$$$$$$$$'         `\"\"\"ss\"$\"$s\"\"");
	System.out.println ("                             s$$$$$$$$$$,              `\"\"\"\"\"$  .s$$s");
	System.out.println ("                             s$$$$$$$$$$$$s,...               `s$$'  `");
	System.out.println ("                         `ssss$$$$$$$$$$$$$$$$$$$$####s.     .$$\"$.   , s-");
	System.out.println ("                           `\"\"\"\"$$$$$$$$o$$$$$$$$$$$#####$$$$$$\"     $.$'");
	System.out.println ("                                 \"$$$$$$$$$$$$$$$$$$$$$####s\"\"     .$$$|");
	System.out.println ("                                  \"$$$$$$$$$$$$$$$$$$$$$$$$##s    .$$\" $");
	System.out.println ("                                   $$\"\"$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\"   `");
	System.out.println ("                                  $$\"  \"$\"$$$$$$$$$$$$$$$$$$$$S\"\"\"\"'");
	System.out.println ("                             ,   ,\"     '  $$$$$$$$$$$$$$$$####s");
	System.out.println ("                             $.          .s$$$$$$$b$$$$$$$$$####\"");
	System.out.println ("                 ,           \"$s.   ..ssS$$$$$$$$$$$$$$$$$$$####\"");
	System.out.println ("                 $           .$$$S$$$$$$$$$$$$$$$$$$$$$$$$#####\"");
	System.out.println ("                 Ss     ..sS$$$$$$$$$$$$$$$$$$$$$$$$$$$######\"\"");
	System.out.println ("                  \"$$sS$$$$$$$$$$$$$$$$$$$$$$$$$$$########\"");
	System.out.println ("           ,      s$$$$$$$$$$$$$$$$$$$$$$$$#########\"\"'");
	System.out.println ("           $    s$$$$$$$$$$$$$$$$$$$$$#######\"\"'      s'         ,");
	System.out.println ("           $$..$$$$$$$$$$$$$$$$$$######\"'       ....,$$....    ,$");
	System.out.println ("            \"$$$$$$$$$$$$$$$######\"' ,     .sS$$$$$$$$$$$$$$$$s$$");
	System.out.println ("              $$$$$$$$$$$$#####\"     $, .s$$$$$$$$$$$$$$$$$$$$$$$$s.");
	System.out.println ("   )          $$$$$$$$$$$#####'      `$$$$$$$$$###########$$$$$$$$$$$.");
	System.out.println ("  ((          $$$$$$$$$$$#####       $$$$$$$$###\"       \"####$$$$$$$$$$");
	System.out.println ("  ) \\         $$$$$$$$$$$$####.     $$$$$$###\"             \"###$$$$$$$$$   s'");
	System.out.println (" (   )        $$$$$$$$$$$$$####.   $$$$$###\"                ####$$$$$$$$s$$'");
	System.out.println (" )  ( (       $$\"$$$$$$$$$$$#####.$$$$$###'                    .###$$$$$$$$$$\"");
	System.out.println (" (  )  )   _,$\"   $$$$$$$$$$$$######.$$##'                .###$$$$$$$$$$");
	System.out.println (" ) (  ( \\.         \"$$$$$$$$$$$$$#######,,,.          ..####$$$$$$$$$$$\"");
	System.out.println ("(   )$ )  )        ,$$$$$$$$$$$$$$$$$$####################$$$$$$$$$$$\"");
	System.out.println ("(   ($$  ( \\     _sS\"  `\"$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$S$$,");
	System.out.println (" )  )$$$s ) )  .      .   `$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\"'  `$$");
	System.out.println ("  (   $$$Ss/  .$,    .$,,s$$$$$$##S$$$$$$$$$$$$$$$$$$$$$$$$S\"\"        '");
	System.out.println ("    \\)_$$$$$$$$$$$$$$$$$$$$$$$##\"  $$        `$$.        `$$.");
	System.out.println ("        `\"S$$$$$$$$$$$$$$$$$#\"      $          `$          `$");
	System.out.println ("            `\"\"\"\"\"\"\"\"\"\"\"\"\"'         '           '           '");
	System.out.println ("");



    }


    public void QuestionASCII ()
    {
	System.out.println ("||Q |||u |||e |||s |||t |||i |||o |||n ||");
	System.out.println ("||__|||__|||__|||__|||__|||__|||__|||__||");
	System.out.println ("|/__\\|/__\\|/__\\|/__\\|/__\\|/__\\|/__\\|/__\\|");

    }


    public void TheEndASCII ()
    {
	System.out.println ("");
	System.out.println ("      _____                    _____                    _____                            _____                    _____                    _____          ");
	System.out.println ("     /\\    \\                  /\\    \\                  /\\    \\                          /\\    \\                  /\\    \\                  /\\    \\         ");
	System.out.println ("    /::\\    \\                /::\\____\\                /::\\    \\                        /::\\    \\                /::\\____\\                /::\\    \\        ");
	System.out.println ("    \\:::\\    \\              /:::/    /               /::::\\    \\                      /::::\\    \\              /::::|   |               /::::\\    \\       ");
	System.out.println ("     \\:::\\    \\            /:::/    /               /::::::\\    \\                    /::::::\\    \\            /:::::|   |              /::::::\\    \\      ");
	System.out.println ("      \\:::\\    \\          /:::/    /               /:::/\\:::\\    \\                  /:::/\\:::\\    \\          /::::::|   |             /:::/\\:::\\    \\     ");
	System.out.println ("       \\:::\\    \\        /:::/____/               /:::/__\\:::\\    \\                /:::/__\\:::\\    \\        /:::/|::|   |            /:::/  \\:::\\    \\    ");
	System.out.println ("       /::::\\    \\      /::::\\    \\              /::::\\   \\:::\\    \\              /::::\\   \\:::\\    \\      /:::/ |::|   |           /:::/    \\:::\\    \\   ");
	System.out.println ("      /::::::\\    \\    /::::::\\    \\   _____    /::::::\\   \\:::\\    \\            /::::::\\   \\:::\\    \\    /:::/  |::|   | _____    /:::/    / \\:::\\    \\  ");
	System.out.println ("     /:::/\\:::\\    \\  /:::/\\:::\\    \\ /\\    \\  /:::/\\:::\\   \\:::\\    \\          /:::/\\:::\\   \\:::\\    \\  /:::/   |::|   |/\\    \\  /:::/    /   \\:::\\ ___\\ ");
	System.out.println ("    /:::/  \\:::\\____\\/:::/  \\:::\\    /::\\____\\/:::/__\\:::\\   \\:::\\____\\        /:::/__\\:::\\   \\:::\\____\\/:: /    |::|   /::\\____\\/:::/____/     \\:::|    |");
	System.out.println ("   /:::/    \\::/    /\\::/    \\:::\\  /:::/    /\\:::\\   \\:::\\   \\::/    /        \\:::\\   \\:::\\   \\::/    /\\::/    /|::|  /:::/    /\\:::\\    \\     /:::|____|");
	System.out.println ("  /:::/    / \\/____/  \\/____/ \\:::\\/:::/    /  \\:::\\   \\:::\\   \\/____/          \\:::\\   \\:::\\   \\/____/  \\/____/ |::| /:::/    /  \\:::\\    \\   /:::/    / ");
	System.out.println (" /:::/    /                    \\::::::/    /    \\:::\\   \\:::\\    \\               \\:::\\   \\:::\\    \\              |::|/:::/    /    \\:::\\    \\ /:::/    /  ");
	System.out.println ("/:::/    /                      \\::::/    /      \\:::\\   \\:::\\____\\               \\:::\\   \\:::\\____\\             |::::::/    /      \\:::\\    /:::/    /   ");
	System.out.println ("\\::/    /                       /:::/    /        \\:::\\   \\::/    /                \\:::\\   \\::/    /             |:::::/    /        \\:::\\  /:::/    /    ");
	System.out.println (" \\/____/                       /:::/    /          \\:::\\   \\/____/                  \\:::\\   \\/____/              |::::/    /          \\:::\\/:::/    /     ");
	System.out.println ("                              /:::/    /            \\:::\\    \\                       \\:::\\    \\                  /:::/    /            \\::::::/    /      ");
	System.out.println ("                             /:::/    /              \\:::\\____\\                       \\:::\\____\\                /:::/    /              \\::::/    /       ");
	System.out.println ("                             \\::/    /                \\::/    /                        \\::/    /                \\::/    /                \\::/____/        ");
	System.out.println ("                              \\/____/                  \\/____/                          \\/____/                  \\/____/                  ~~     ");
	System.out.println ("");
	System.out.println ("");

    }


    public void BakeryASCII ()
    {
	System.out.println ("");
	System.out.println ("");
	System.out.println ("                  ___           ___                                  ___           ___           ___           ___                 ");
	System.out.println ("      ___        /__/\\         /  /\\                  _____         /  /\\         /__/|         /  /\\         /  /\\          ___   ");
	System.out.println ("     /  /\\       \\  \\:\\       /  /:/_                /  /::\\       /  /::\\       |  |:|        /  /:/_       /  /::\\        /__/|  ");
	System.out.println ("    /  /:/        \\__\\:\\     /  /:/ /\\              /  /:/\\:\\     /  /:/\\:\\      |  |:|       /  /:/ /\\     /  /:/\\:\\      |  |:|  ");
	System.out.println ("   /  /:/     ___ /  /::\\   /  /:/ /:/_            /  /:/~/::\\   /  /:/~/::\\   __|  |:|      /  /:/ /:/_   /  /:/~/:/      |  |:|  ");
	System.out.println ("  /  /::\\    /__/\\  /:/\\:\\ /__/:/ /:/ /\\          /__/:/ /:/\\:| /__/:/ /:/\\:\\ /__/\\_|:|____ /__/:/ /:/ /\\ /__/:/ /:/___  __|__|:|  ");
	System.out.println (" /__/:/\\:\\   \\  \\:\\/:/__\\/ \\  \\:\\/:/ /:/          \\  \\:\\/:/~/:/ \\  \\:\\/:/__\\/ \\  \\:\\/:::::/ \\  \\:\\/:/ /:/ \\  \\:\\/:::::/ /__/::::\\  ");
	System.out.println (" \\__\\/  \\:\\   \\  \\::/       \\  \\::/ /:/            \\  \\::/ /:/   \\  \\::/       \\  \\::/~~~~   \\  \\::/ /:/   \\  \\::/~~~~     ~\\~~\\:\\ ");
	System.out.println ("      \\  \\:\\   \\  \\:\\        \\  \\:\\/:/              \\  \\:\\/:/     \\  \\:\\        \\  \\:\\        \\  \\:\\/:/     \\  \\:\\           \\  \\:\\");
	System.out.println ("       \\__\\/    \\  \\:\\        \\  \\::/                \\  \\::/       \\  \\:\\        \\  \\:\\        \\  \\::/       \\  \\:\\           \\__\\/");
	System.out.println ("                 \\__\\/         \\__\\/                  \\__\\/         \\__\\/         \\__\\/         \\__\\/         \\__\\/                ");
	System.out.println ("");
	System.out.println ("");

    }


    public void MtIcecreamASCII ()
    {
	System.out.println ("");
	System.out.println ("      ___                                              ___           ___           ___           ___           ___           ___           ___     ");
	System.out.println ("     /\\  \\                                            /\\__\\         /\\__\\         /\\__\\         /\\  \\         /\\__\\         /\\  \\         /\\  \\    ");
	System.out.println ("    |::\\  \\         ___                  ___         /:/  /        /:/ _/_       /:/  /        /::\\  \\       /:/ _/_       /::\\  \\       |::\\  \\   ");
	System.out.println ("    |:|:\\  \\       /\\__\\                /\\__\\       /:/  /        /:/ /\\__\\     /:/  /        /:/\\:\\__\\     /:/ /\\__\\     /:/\\:\\  \\      |:|:\\  \\  ");
	System.out.println ("  __|:|\\:\\  \\     /:/  /               /:/__/      /:/  /  ___   /:/ /:/ _/_   /:/  /  ___   /:/ /:/  /    /:/ /:/ _/_   /:/ /::\\  \\   __|:|\\:\\  \\ ");
	System.out.println (" /::::|_\\:\\__\\   /:/__/               /::\\  \\     /:/__/  /\\__\\ /:/_/:/ /\\__\\ /:/__/  /\\__\\ /:/_/:/__/___ /:/_/:/ /\\__\\ /:/_/:/\\:\\__\\ /::::|_\\:\\__\\");
	System.out.println (" \\:\\~~\\  \\/__/  /::\\  \\               \\/\\:\\  \\__  \\:\\  \\ /:/  / \\:\\/:/ /:/  / \\:\\  \\ /:/  / \\:\\/:::::/  / \\:\\/:/ /:/  / \\:\\/:/  \\/__/ \\:\\~~\\  \\/__/");
	System.out.println ("  \\:\\  \\       /:/\\:\\  \\               ~~\\:\\/\\__\\  \\:\\  /:/  /   \\::/_/:/  /   \\:\\  /:/  /   \\::/~~/~~~~   \\::/_/:/  /   \\::/__/       \\:\\  \\      ");
	System.out.println ("   \\:\\  \\      \\/__\\:\\  \\                 \\::/  /   \\:\\/:/  /     \\:\\/:/  /     \\:\\/:/  /     \\:\\~~\\        \\:\\/:/  /     \\:\\  \\        \\:\\  \\     ");
	System.out.println ("    \\:\\__\\          \\:\\__\\                /:/  /     \\::/  /       \\::/  /       \\::/  /       \\:\\__\\        \\::/  /       \\:\\__\\        \\:\\__\\    ");
	System.out.println ("     \\/__/           \\/__/                \\/__/       \\/__/         \\/__/         \\/__/         \\/__/         \\/__/         \\/__/         \\/__/    ");
    }


    public void RiverASCII ()
    {
	System.out.println ("");
	System.out.println ("                  _.._");
	System.out.println ("   _________....-~    ~-.______");
	System.out.println ("~~~                            ~~~~-----...___________..--------");
	System.out.println ("                                           |   |     |");
	System.out.println ("                                           | |   |  ||");
	System.out.println ("                                           |  |  |   |");
	System.out.println ("                                           |'. .' .`.|");
	System.out.println ("___________________________________________|0oOO0oO0o|____________");
	System.out.println (" -          -         -       -      -    / '  '. ` ` \\    -    -");
	System.out.println ("      --                  --       --   /    '  . `   ` \\    --");
	System.out.println ("---            ---          ---       /  '                \\ ---");
	System.out.println ("     ----               ----        /       ' ' .    ` `    \\  ----");
	System.out.println ("-----         -----         ----- /   '   '        `      `   \\");
	System.out.println ("     .-~~-.          ------     /          '    . `     `    `  \\");
	System.out.println ("    (_^..^_)-------           /  '    '      '      `");
	System.out.println ("Lester||||AMC       --------/     '     '   '");
	System.out.println ("");
    }


    public void GumdropHouseASCII ()
    {
	System.out.println ("");
	System.out.println (" ('");
	System.out.println ("        '|");
	System.out.println ("        |'");
	System.out.println ("       [::]");
	System.out.println ("       [::]   _......_");
	System.out.println ("       [::].-'      _.-`.");
	System.out.println ("       [:.'    .-. '-._.-`.");
	System.out.println ("       [/ /\\   |  \\        `-..");
	System.out.println ("       / / |   `-.'      .-.   `-.");
	System.out.println ("      /  `-'            (   `.    `.");
	System.out.println ("     |           /\\      `-._/      \\");
	System.out.println ("     '    .'\\   /  `.           _.-'|");
	System.out.println ("    /    /  /   \\_.-'        _.':;:/");
	System.out.println ("  .'     \\_/             _.-':;_.-'");
	System.out.println (" /   .-.             _.-' \\;.-'");
	System.out.println ("/   (   \\       _..-'     |");
	System.out.println ("\\    `._/  _..-'    .--.  |");
	System.out.println (" `-.....-'/  _ _  .'    '.|");
	System.out.println ("          | |_|_| |      | \\  (o)");
	System.out.println ("     (o)  | |_|_| |      | | (\\'/)");
	System.out.println ("    (\\'/)/  ''''' |     o|  \\;:;");
	System.out.println ("     :;  |        |      |  |/)");
	System.out.println (" LGB  ;: `-.._    /__..--'\\.' ;:");
	System.out.println ("          :;  `--' :;   :;");
	System.out.println ("");

    }


    public void MtASCII ()
    {

	System.out.println ("");
	System.out.println ("    .                  .-.    .  _   *     _   .");
	System.out.println ("           *          /   \\     ((       _/ \\       *    .");
	System.out.println ("         _    .   .--'\\/\\_ \\     `      /    \\  *    ___");
	System.out.println ("     *  / \\_    _/ ^      \\/\\'__        /\\/\\  /\\  __/   \\ *");
	System.out.println ("       /    \\  /    .'   _/  /  \\  *' /    \\/  \\/ .`'\\_/\\   .");
	System.out.println ("  .   /\\/\\  /\\/ :' __  ^/  ^/    `--./.'  ^  `-.\\ _    _:\\ _");
	System.out.println ("     /    \\/  \\  _/  \\-' __/.' ^ _   \\_   .'\\   _/ \\ .  __/ \\");
	System.out.println ("   /\\  .-   `. \\/     \\ / -.   _/ \\ -. `_/   \\ /    `._/  ^  \\");
	System.out.println ("  /  `-.__ ^   / .-'.--'    . /    `--./ .-'  `-.  `-. `.  -  `.");
	System.out.println ("@/        `.  / /      `-.   /  .-'   / .   .'   \\    \\  \\  .-  \\%");
	System.out.println ("@&8jgs@@%% @)&@&(88&@.-_=_-=_-=_-=_-=_.8@% &@&&8(8%@%8)(8@%8 8%@)%");
	System.out.println ("@88:::&(&8&&8:::::%&`.~-_~~-~~_~-~_~-~~=.'@(&%::::%@8&8)::&#@8::::");
	System.out.println ("`::::::8%@@%:::::@%&8:`.=~~-.~~-.~~=..~'8::::::::&@8:::::&8:::::'");
	System.out.println (" `::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::.'");
	System.out.println ("");
    }


    public void KitchenASCII ()
    {
	System.out.println ("   ____________________________________________________________________    ");
	System.out.println (" /|    |__I__I__I__I__I__I__I__I__I_|       _-       %       %         |\\");
	System.out.println ("  | _- |_I__I__I__I__I__I__I__I__I__|-_              %       %     _-  | ");
	System.out.println ("  |    |__I__I__I__I__I__I__I__I__I_|                %       %         |");
	System.out.println ("  |  - |_I__I__I__I__I__I__I__I__I__|               ,j,      %w ,      |");
	System.out.println ("  | -  |__I__I__I__I__I__I__I__I__I_|  -_ -        / ) \\    /%mMmMm.   |");
	System.out.println ("  |    |_I__I__I__I__I__I__I__I__I__|             //|  |   ;  `.,,'    |");
	System.out.println ("  |-_- /                            \\             w |  |   `.,;`       |");
	System.out.println ("  |   /                              \\    -_       / ( |    ||         |");
	System.out.println ("  |  /                                \\           //\\_'/    (.\\    -_  |");
	System.out.println ("  | /__________________________________\\          w  \\/   -  ``'       |");
	System.out.println ("  | |__________________________________|                               |");
	System.out.println ("  |    |   _______________________   |     _-            -             |");
	System.out.println ("  |_-  |  |                       |  |                        _-       |");
	System.out.println ("  |    |  |                     _ |  |  T  T  T  T  T                  |");
	System.out.println ("  | _-_|  |    __.'`'`'`''`;__ /  |  |  |  |  |  |  |        _-     -  |");
	System.out.println ("  |    |  | _/U  `'.'.,.,\".'  U   |  |  | (_) |  |  |                  |");
	System.out.println ("  |    |  |   |               |   |  | / \\    @ [_]d b    _@_     |    |   ");
	System.out.println ("  |    |  |   |      `', `,   |   |  | |_|   ____         [ ]     |    |");
	System.out.println ("  |_-  |  |   |   `') ( )'    |   |  | ______\\__/_________[_]__   |    | ");
	System.out.println ("  |    |  |   |____(,`)(,(____|   |  |/________________________\\  |    |");
	System.out.println ("  |    |  |  /|   `@@(@@)@)'  |\\  |  | ||            _____   ||   |    |");
	System.out.println ("  |    |  | //!\\  @@)@@)@@@( /!\\\\ |  | ||   _--      \\   /   ||  /|\\   |");
	System.out.println ("  |__lc|__|/_____________________\\|__|_||____________/###\\___||_|||||__|");
	System.out.println (" / -_  _ -      _ -   _-_    -  _ - _ -|| -_    _  - \\___/_- || |||||-_ \\ ");
	System.out.println ("");

    }
}
