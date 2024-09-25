//This class houses the main logic of the game. It is the game's "Brain"

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class Options implements ActionListener {
        
    public void actionPerformed(ActionEvent e) {
        String playerSelection = e.getActionCommand();

        switch (GameGUI.getProgress()) {
            case "Continue":
                switch (playerSelection) {
                    case "o1":
                        GameGUI.getMainText().append("You are the Lord of a small town in the kingdom of Celestria called Viesolay. " 
                        + "Viesolay is in a valley beneath the mountain Kralstag. The people here live an idyllic life most of the " 
                        + "time, except when it is time to pay the Dragon. Every five years the Red Dragon who lives on Mount Kralstag " 
                        + "comes to demand tribute from the town of Viesolay. The townspeople must provide a share of their treasure " 
                        + "and crop harvest or else the Dragon will destroy the village. Last night, the Dragon came into town to " 
                        + "announce it has been five years since the last tribute, and that the town must pay again. It gave the " 
                        + "town three days to come up with the payment. Unfortunately, an unusually harsh winter has severely " 
                        + "reduced the annual harvest, and paying the tribute would cause the town to plunge into poverty and " 
                        + "famine which may very well destroy the town.  \n");
                        
                        GameGUI.getMainText().append("You are in the village’s town hall to discuss options with the townsfolk. " 
                        + "It is a chaotic atmosphere. There is a din as people argue with each other over what to do next.\n\n");
                        GameGUI.getMainText().append("The sergeant at arms slams the butt end of his spear into the ground, " 
                        + "“Order, order, there will be order in the hall! It is time we heard from Lord " + GameGUI.getPlayerName() + "!”\n\n");
                        GameGUI.getMainText().append("You turn to your most trusted advisor and say:\n");
                        GameGUI.getButtonPanel().add(GameGUI.getOption2());
                        GameGUI.getOption1().setText("1. What are our options?");
                        GameGUI.getOption2().setText("2. Tell the captain of the guard to get the rabble out of here! I cannot think with all this noise!");
                        GameGUI.setProgress("Choice1");
                    }       break;
            case "Choice1": //What to do about the Dragon
                switch(playerSelection) {
                    case "o1":
                        GameGUI.getMainText().append("You selected: " + GameGUI.getOption1().getText() + "\n\n");
                        GameGUI.getMainText().append("Advisor: My lord, we can pay the tribute, or we can fight the Dragon. " 
                        + "If we are to have any hope of defeating this monster we will need to retrieve the Draco Eversor, " 
                        + "the magical spear our forefathers crafted long ago. As you know, the forest troll who lives in the " 
                        + "Dark Woods stole the Draco Eversor shortly after its creation. Many of our strongest warriors " 
                        + "have gone to get the spear back, but none have returned.”\n\n");
                        
                        GameGUI.getMainText().append("The Captain of the Guard: “Ha! The Draco Eversor! T’is no more than " 
                        + "a bloody legend my lord! Those men who sought it were fools, and they did as fools do: they died. " 
                        + "We have everything you need to fight the Dragon in our armory.” \n\n");
                        
                        GameGUI.getMainText().append("Before you can respond, the town’s blacksmith stands up and says, " 
                        + "“Your honor, this Dragon’s threats are idle! He is old and feeble and can no more destroy this " 
                        + "town than you or I. If we refuse to pay he will move on to some other town to terrorize! " 
                        + "We must simply ignore this threat and show the Dragon we do not fear him!”\n\n");
                        
                        GameGUI.getMainText().append("Heavy is the head that wears the crown. You are the leader of this town, and its fate lies in your hands. "
                        + "What are you going to do?\n\n");
                        
                        GameGUI.getOption1().setText("1. We will pay the tribute, it is the safest route. We are a strong village. We can survive a period of famine and poverty");
                        GameGUI.getOption2().setText("2. The blacksmith is right; I believe this dragon is bluffing. We will ignore this threat");
                        GameGUI.getButtonPanel().add(GameGUI.getOption3());
                        GameGUI.getButtonPanel().add(GameGUI.getOption4());
                        GameGUI.getOption3().setText("3. I will go retrieve the Draco Eversor and slay the Red Dragon once and for all. " 
                        + "The rest of you prepare to defend Viesolay");
                        GameGUI.getOption4().setText("4. The captain is right. The Draco Eversor is a mere myth. " 
                        + "I will arm myself with whatever weapons we have and go off to slay the Red Dragon.");
                        
                        GameGUI.setProgress("Choice2");
                        break;
                    case "o2":
                        GameGUI.getMainText().append("You selected: " + GameGUI.getOption2().getText() + "\n\n");
                        GameGUI.getMainText().append("The townsfolk become unruly once the guards attempt to " 
                        + "remove them. In short order, some pushing and shoving turns into a full-blown riot." 
                        + "The riot lasts for days and you are forced to abdicate in the face of the popular uprising. " 
                        + "You spend the rest of your life living as an exile.  \n\n");
                        GameGUI.loseGame();
                        break;
                } break;
            case "Choice2": //Going to the armory
                switch(playerSelection) {
                    case  "o1":
                        GameGUI.getMainText().append("You selected: " + GameGUI.getOption1().getText() + "\n\n");
                        GameGUI.getMainText().append("The crowd goes into a frenzy once they hear your decision. " 
                        + "When the Dragon comes to collect the tribute, you present him with the town’s precious " 
                        + "crops and treasure. The town soon spirals into a famine and there are murmurs of " 
                        + "dissent about your rule. Protests soon follow. Eventually, the economic depression " 
                        + "and lack of food cause the townspeople to rebel against your rule. The guards are " 
                        + "quickly overwhelmed by the rebels and you are ousted from office. The new government " 
                        + "exiles you from Viesolay \n\n");
                        GameGUI.loseGame();
                        GameGUI.setProgress("Choice3");
                        break;
                    case "o2":
                        GameGUI.getMainText().append("You selected: " + GameGUI.getOption2().getText() + "\n\n");
                        GameGUI.getMainText().append("The Dragon’s threat was not nearly as idle as you hoped. " 
                        + "When the Dragon comes to collect, you refuse to pay. The Dragon repays your arrogance " 
                        + "by destroying Viesolay. Throughout the kingdom of Celestria the phrase “Don’t be " 
                        + "a " + GameGUI.getPlayerName() + " of Viesolay” has come to be a warning against pride and " 
                        + "doubting one’s adversaries. \n\n");
                        GameGUI.loseGame();
                        GameGUI.setProgress("Choice3");
                        break;
                    case "o3":
                        GameGUI.getMainText().append("You selected: " + GameGUI.getOption3().getText() + "\n\n");
                        GameGUI.getMainText().append("There is a gasp of astonishment in the town hall. " 
                        + "The captain of the guard says to you, “Sir, I believe you are embarking on a " 
                        + "fool's errand, but we shall obey your command. But you must arm yourself for this " 
                        + "fight against the forest troll.” \n\n");
                        GameGUI.getMainText().append("What would you like to do?\n\n");
                        GameGUI.getOption1().setText("1. Go to the armory");
                        GameGUI.setGoForSpear(true);
                        GameGUI.getOption2().setVisible(false);
                        GameGUI.getOption3().setVisible(false);
                        GameGUI.getOption4().setVisible(false);
                        GameGUI.setProgress("Choice3");
                        break;
                    case "o4":
                        GameGUI.getMainText().append("You selected: " + GameGUI.getOption4().getText() + "\n\n");
                        GameGUI.getMainText().append("The captain of the guard, “It’s always a welcome " 
                        + "surprise when a politician listens to reason! We shall arm you with our " 
                        + "finest weapons, and await your return.”  \n\n");
                        GameGUI.getOption1().setText("1. Go to the armory");
                        GameGUI.getOption2().setVisible(false);
                        GameGUI.getOption3().setVisible(false);
                        GameGUI.getOption4().setVisible(false);
                        GameGUI.setGoForSpear(false);
                        GameGUI.setProgress("Choice3");
                        break;
                    } break;
            case "Choice3": //Selecting a weapon 
                    switch(playerSelection) {
                        case "o1":
                            GameGUI.getMainText().append("You selected: " + GameGUI.getOption1().getText() + "\n\n");
                            GameGUI.getOption1().setText("1. Sword (low damage)");
                            GameGUI.getOption2().setText("2. Mace (medium damage)");
                            GameGUI.getOption3().setText("3. Halberd (high damage)");
                            GameGUI.getOption4().setText("4. Decline to take a weapon and fight unarmed.");
                            GameGUI.getMainText().append("You go to the armory. It is a large room with weapon and armor racks covering the walls. " 
                            + "You feel the heat of the nearby forge and smell the pine of the weapon racks and the oil that keeps the weapons from rusting. " 
                            + "You walk to a weapon rack that has a sword, a mace, and a halberd. A small plaque beside the weapon rack reads: \n\n"); 
                            GameGUI.getMainText().append("In the clash of steel, a paradox reigns,\n"
                            + "Where precision falters, power gains.\n"
                            + "The surest strike, its force light,\n"
                            + "While the frenzied blow lands with might.\n\n");

                            GameGUI.getMainText().append("Select your weapon.\n\n");

                            GameGUI.getOption2().setVisible(true);
                            GameGUI.getOption3().setVisible(true);
                            GameGUI.getOption4().setVisible(true);
                            if (GameGUI.isGoForSpear() == false) {
                                GameGUI.setProgress("Choice21");
                            } else {
                                GameGUI.setProgress("Choice4");
                            }
                            
                            break;
                    } break;
            case "Choice4":
                    switch(playerSelection) {
                        case "o1":
                            GameGUI.getCurrentWeapon().setName("Sword");
                            GameGUI.getMainText().append("You are now armed with a " + GameGUI.getCurrentWeapon().getName() + "\n\n");
                            GameGUI.getWeaponInfo().setText("Current Weapon: " + GameGUI.getCurrentWeapon().getName());
                            GameGUI.getOption3().setVisible(false);
                            GameGUI.getOption4().setVisible(false);
                            GameGUI.getMainText().append("What would you like to do next?\n\n");
                            GameGUI.getOption1().setText("Go to fight the forest troll");
                            GameGUI.getOption2().setText("Search the armory for anything else that might be helpful.");
                            GameGUI.setProgress("Choice5");
                            break;

                        case "o2":
                            GameGUI.getCurrentWeapon().setName("Mace");
                            GameGUI.getMainText().append("You are now armed with a " + GameGUI.getCurrentWeapon().getName() + "\n\n");
                            GameGUI.getWeaponInfo().setText("Current Weapon: " + GameGUI.getCurrentWeapon().getName());
                            GameGUI.getOption3().setVisible(false);
                            GameGUI.getOption4().setVisible(false);
                            GameGUI.getMainText().append("What would you like to do next?\n\n");
                            GameGUI.getOption1().setText("Go to fight the forest troll");
                            GameGUI.getOption2().setText("Search the armory for anything else that might be helpful.");
                            GameGUI.setProgress("Choice5");
                            break;

                        case "o3":
                            GameGUI.getCurrentWeapon().setName("Halberd");
                            GameGUI.getMainText().append("You are now armed with a " + GameGUI.getCurrentWeapon().getName() + "\n\n");
                            GameGUI.getWeaponInfo().setText("Current Weapon: " + GameGUI.getCurrentWeapon().getName());
                            GameGUI.getOption3().setVisible(false);
                            GameGUI.getOption4().setVisible(false);
                            GameGUI.getMainText().append("What would you like to do next?\n\n");
                            GameGUI.getOption1().setText("Go search for the forest troll");
                            GameGUI.getOption2().setText("Search the armory for anything else that might be helpful.");
                            GameGUI.setProgress("Choice5");
                            break;

                        case "o4":
                            GameGUI.getCurrentWeapon().setName("Unarmed");
                            GameGUI.getMainText().append("Interesting choice, let's see how this works out for you.\n\n");
                            GameGUI.getWeaponInfo().setText("Current Weapon: " + GameGUI.getCurrentWeapon().getName() + "\n\n");
                            GameGUI.getOption3().setVisible(false);
                            GameGUI.getOption4().setVisible(false);
                            GameGUI.getMainText().append("What would you like to do next?\n\n");
                            GameGUI.getOption1().setText("Go to fight the forest troll");
                            GameGUI.getOption2().setText("Search the armory for anything else that might be helpful.");
                            GameGUI.setProgress("Choice5");
                            break;
                    } break;
            case "Choice5": //Go to fight the troll or find the health potion
                    switch(playerSelection) {
                        case "o1":
                            GameGUI.getMainText().append("You selected: " + GameGUI.getOption1().getText() + "\n\n");
                            GameGUI.getMainText().append("You travel to the dark wood to defeat the troll and " 
                            + "retrieve the Draco Eversor. The Dark Wood is far from a welcoming place. " 
                            + "The trees are so old and tangled that light hardly reaches the forest floor, " 
                            + "forming a labyrinth that can easily confuse even the most experienced adventurers. \n\n");
                            GameGUI.getMainText().append("You are nervous to enter the Dark Wood and feel a chill " 
                            + "run through your body as you approach the forest entrance. After searching for a " 
                            + "while and fearing you may be lost, you finally come across a small clearing and " 
                            + "spot the cave where the forest troll is rumored to live. \n\n");
                            GameGUI.getMainText().append("You can hear the sound of a large creature " 
                            + "stirring inside the cave. The troll emerges from his cave, raises his club " 
                            + "above his head, and lets out a roar!\n\n");
                            GameGUI.getOption1().setText("Attack");
                            GameGUI.getOption2().setText("Run away"); 
                            GameGUI.getOption2().setVisible(true);
                            GameGUI.setProgress("Choice6");
                            break;

                        case "o2":
                            GameGUI.getMainText().append("You selected: " + GameGUI.getOption2().getText() + "\n\n");
                            GameGUI.getMainText().append("You search a small crate hidden behind the weapon rack. You find a healing potion inside and pick it up." + "\n\n");
                            GameGUI.setHasHealthPotion(true);
                            GameGUI.getMainText().append("What would you like to do next?\n\n");
                            GameGUI.getOption1().setText("Go to fight the forest troll");
                            GameGUI.getOption2().setVisible(false);
                            GameGUI.setProgress("Choice5");
                            break;

                        case "o3":
                            //Choice4 only provided two options, so nothing need here
                            GameGUI.setProgress("Choice6");
                            break;

                        case "o4":
                            //Choice4 only provided two options, so nothing need here
                            GameGUI.setProgress("Choice6");
                            break;
                    } break;
                    case "Choice6": //Fighting the troll
                    switch(playerSelection) {
                        case "o1":
                            GameGUI.getMainText().append("You selected: " + GameGUI.getOption1().getText() + "\n\n");
                            GameGUI.getOption1().setText("Attack");
                            GameGUI.getOption2().setText("Run away"); 
                            GameGUI.getOption2().setVisible(true);
                            fightTroll(GameGUI.getTroll(), GameGUI.getPlayer());
                            break;

                        case "o2":
                            GameGUI.getMainText().append("You selected: " + GameGUI.getOption2().getText() + "\n\n");
                            GameGUI.getMainText().append("You run away from the troll and dart behind a tree out of sight.\n\n");
                            GameGUI.getMainText().append("What would you like to do next?\n\n");
                            GameGUI.getOption1().setText("Go back to fight the forest troll");
                            if (GameGUI.isHasHealthPotion() == true) {
                                GameGUI.getOption2().setText("Drink your health potion");
                                GameGUI.getOption2().setVisible(true);
                            } else {
                                GameGUI.getOption2().setVisible(false);
                            }
                            GameGUI.setProgress("Choice6.5");
                            break;       
                    }break; 

                    case "Choice6.5":
                        switch(playerSelection) {
                            case "o1":
                                GameGUI.getMainText().append("You run back to the troll" + "\n\n");
                                GameGUI.getOption1().setText("Attack");
                                GameGUI.getOption2().setVisible(false);
                                GameGUI.setProgress("Choice6");
                                break;
                            case "o2":

                                if (GameGUI.isHasHealthPotion() == true) {
                                    GameGUI.getMainText().append("You drink the health potion you picked up earlier and feel feel a wave of relief as your wounds heal themselves.\n\n");
                                    GameGUI.setHealthPoints(20);
                                    GameGUI.getHealthInfo().setForeground(Color.GREEN);
                                    GameGUI.getHealthInfo().setText("Health Points: " + GameGUI.getHealthPoints());
                                    GameGUI.setHasHealthPotion(false);
                                    GameGUI.getMainText().append("What would you like to do next?\n\n");
                                    GameGUI.getOption2().setVisible(false);
                                    GameGUI.setProgress("Choice6");
                                } else{
                                    GameGUI.getOption2().setVisible(false);
                                    GameGUI.setProgress("Choice6");
                                }
                                break;
                        } break;

                    case "Choice7": //Choosing to enter the troll's cave
                        switch(playerSelection) {   
                            case "o1": 
                                GameGUI.getMainText().append("You selected: " + GameGUI.getOption1().getText() + "\n\n");
                                GameGUI.getMainText().append("You venture into the troll's cave. There are bones littering the floor and can smell the rotting flesh. There is a faint glow coming from under a pil of leaves in the corner, You walk over and find the Draco Eversor. It is a spear with a dark black shaft and a golden point. The whole thing gives off a faint silver glow and exudes a faint magical hum. " + "\n\n");
                                GameGUI.getMainText().append("You also find a health potion under the pile of leaves\n\n");
                                GameGUI.setHasHealthPotion(true);
                                GameGUI.getMainText().append("You can hardly believe that the Draco Eversor turned out to be real. What would you like to do? \n\n");
                                GameGUI.getOption1().setText("Pick up the Draco Eversor");
                                GameGUI.getOption2().setText("Put the Draco Eversor back under the pile of leaves.");
                                GameGUI.getOption3().setText("Destory the Draco Eversor. You cannot risk it falling into the wrong hands.");
                                GameGUI.getOption3().setVisible(true);
                                GameGUI.setProgress("Choice8");
                                break;
                            case "o2":
                                GameGUI.getMainText().append("You selected: " + GameGUI.getOption1().getText() + "\n\n");
                                GameGUI.getMainText().append("You make the journey to Mount Kralstag. The mountain is a foreboding place " 
                                + "with sheer cliffs just off the narrow path. One false step and you would fall to your doom. " 
                                + "You finally make it to the summit. The Dragon emerges from its lair and says, “You are foolish " 
                                + "enough to come and challenge me? Braver men than you have met their end here. It is a pity you " 
                                + "have mistaken foolishness for bravery. You will pay for your arrogance. Prepare to meet your fate!” \n\n");
                                GameGUI.getMainText().append("What are you going to do?\n\n");
                                GameGUI.getOption1().setText("Attack");
                                GameGUI.getOption2().setText("Run away"); 
                                GameGUI.getOption2().setVisible(true);
                                GameGUI.setProgress("Choice10");
                                break;
                        } break;
                    case "Choice8":
                        switch(playerSelection) {
                            case "o1":
                                GameGUI.getMainText().append("You selected: " + GameGUI.getOption1().getText() + "\n\n");
                                GameGUI.getCurrentWeapon().setName("Draco Eversor");
                                GameGUI.getMainText().append("You feel a wave of power course through you and a renewed sense of vigor. The spear seems to have the power to heal your wounds. \n\n");
                                GameGUI.setHealthPoints(20);
                                GameGUI.getHealthInfo().setForeground(Color.GREEN);
                                GameGUI.getHealthInfo().setText("Health Points: " + GameGUI.getHealthPoints());
                                GameGUI.getMainText().append("You are now armed with the " + GameGUI.getCurrentWeapon().getName() + "\n\n");
                                GameGUI.getWeaponInfo().setText("Current Weapon: " + GameGUI.getCurrentWeapon().getName());
                                GameGUI.getMainText().append("You have retrieved the legendary Draco Eversor. There is only one thing left to do. Are you ready?\n\n");
                                GameGUI.getOption1().setText("Go to Mount Kralstag to slay the dragon");
                                GameGUI.getOption2().setVisible(false);
                                GameGUI.getOption3().setVisible(false);
                                GameGUI.setProgress("Choice9");
                                break;
                            case "o2":
                                GameGUI.getMainText().append("You selected: " + GameGUI.getOption2().getText() + "\n\n");
                                GameGUI.getMainText().append("The spear's magic aurora strikes a sense of fear in you, and you decide to bury the Draco Eversor under a pile of leaves. \n\n");
                                GameGUI.getMainText().append("Are you sure you want to face the dragon armed with your ordinary " + GameGUI.getCurrentWeapon().getName() + "?\n\n");
                                GameGUI.getOption1().setText("Go to Mount Kralstag to slay the dragon");
                                GameGUI.getOption2().setText("You change your mind and pick up the Draco Eversor.");
                                GameGUI.getOption3().setVisible(false);
                                GameGUI.setProgress("Choice9");
                                break;
                            case "o3":
                                GameGUI.getMainText().append("You selected: " + GameGUI.getOption3().getText() + "\n\n");
                                GameGUI.getMainText().append("You pick up the Draco Eversor, and break it over your knee. A wave of magical energy rushes out of the spear. You are never heard from again.\n\n");
                                GameGUI.setHealthPoints(0);
                                GameGUI.getHealthInfo().setForeground(Color.RED); 
                                GameGUI.loseGame();
                                GameGUI.setProgress("Choice9");
                                break;
                        } break;
                    case "Choice9":
                        switch(playerSelection) {
                            case "o1":
                                GameGUI.getMainText().append("You selected: " + GameGUI.getOption1().getText() + "\n\n");
                                GameGUI.getMainText().append("You make the journey to Mount Kralstag. The mountain is a foreboding place " 
                                + "with sheer cliffs just off the narrow path. One false step and you would fall to your doom. " 
                                + "You finally make it to the summit. The Dragon emerges from its lair and says, “You are foolish " 
                                + "enough to come and challenge me? Braver men than you have met their end here. It is a pity you " 
                                + "have mistaken foolishness for bravery. You will pay for your arrogance. Prepare to meet your fate!” \n\n");
                                GameGUI.getMainText().append("What are you going to do?\n\n");
                                GameGUI.getOption1().setText("Attack");
                                GameGUI.getOption2().setText("Run away"); 
                                GameGUI.getOption2().setVisible(true);
                                GameGUI.setProgress("Choice10");
                                break;

                            case "o2":
                                GameGUI.getMainText().append("You selected: " + GameGUI.getOption2().getText() + "\n\n");
                                GameGUI.getCurrentWeapon().setName("Draco Eversor");
                                GameGUI.getMainText().append("You feel a wave of power course through you and a renewed sense of vigor. The spear seems to have the power to heal your wounds. \n\n");
                                GameGUI.setHealthPoints(20);
                                GameGUI.getHealthInfo().setForeground(Color.GREEN);   
                                GameGUI.getHealthInfo().setText("Health Points: " + GameGUI.getHealthPoints());
                                GameGUI.getMainText().append("You are now armed with the " + GameGUI.getCurrentWeapon().getName() + "\n\n");
                                GameGUI.getWeaponInfo().setText("Current Weapon: " + GameGUI.getCurrentWeapon().getName());
                                GameGUI.getOption1().setText("Go to Mount Kralstag to slay the dragon");
                                GameGUI.getOption2().setVisible(false);
                                GameGUI.setProgress("Choice9");
                                break;
                        } break;

                    case "Choice21":
                        switch (playerSelection) {
                            case "o1":
                                GameGUI.getCurrentWeapon().setName("Sword");
                                GameGUI.getWeaponInfo().setText("Current Weapon: " + GameGUI.getCurrentWeapon().getName());
                                GameGUI.getMainText().append("You selected: " + GameGUI.getOption1().getText() + "\n\n");
                                GameGUI.getMainText().append("You are now armed with the " + GameGUI.getCurrentWeapon().getName() + "\n\n");
                                GameGUI.getWeaponInfo().setText("Current Weapon: " + GameGUI.getCurrentWeapon().getName());
                                GameGUI.getOption1().setText("Go to Mount Kralstag to slay the dragon");
                                GameGUI.getOption2().setVisible(false);
                                GameGUI.getOption3().setVisible(false);
                                GameGUI.getOption4().setVisible(false);
                                GameGUI.setProgress("Choice9");
                                break;
                            case "o2":
                                GameGUI.getCurrentWeapon().setName("Mace");
                                GameGUI.getWeaponInfo().setText("Current Weapon: " + GameGUI.getCurrentWeapon().getName());
                                GameGUI.getMainText().append("You selected: " + GameGUI.getOption2().getText() + "\n\n");
                                GameGUI.getMainText().append("You are now armed with the " + GameGUI.getCurrentWeapon().getName() + "\n\n");
                                GameGUI.getWeaponInfo().setText("Current Weapon: " + GameGUI.getCurrentWeapon().getName());
                                GameGUI.getOption1().setText("Go to Mount Kralstag to slay the dragon");
                                GameGUI.getOption2().setVisible(false);
                                GameGUI.getOption3().setVisible(false);
                                GameGUI.getOption4().setVisible(false);
                                GameGUI.setProgress("Choice9");
                                break;

                            case "o3":
                                GameGUI.getCurrentWeapon().setName("Halberd");
                                GameGUI.getWeaponInfo().setText("Current Weapon: " + GameGUI.getCurrentWeapon().getName());
                                GameGUI.getMainText().append("You selected: " + GameGUI.getOption3().getText() + "\n\n");
                                GameGUI.getMainText().append("You are now armed with the " + GameGUI.getCurrentWeapon().getName() + "\n\n");
                                GameGUI.getWeaponInfo().setText("Current Weapon: " + GameGUI.getCurrentWeapon().getName());
                                GameGUI.getOption1().setText("Go to Mount Kralstag to slay the dragon");
                                GameGUI.getOption2().setVisible(false);
                                GameGUI.getOption3().setVisible(false);
                                GameGUI.getOption4().setVisible(false);
                                GameGUI.setProgress("Choice9");
                                break;

                            case "o4":
                                GameGUI.getCurrentWeapon().setName("Unarmed");
                                GameGUI.getWeaponInfo().setText("Current Weapon: " + GameGUI.getCurrentWeapon().getName());
                                GameGUI.getMainText().append("You selected: " + GameGUI.getOption4().getText() + "\n\n");
                                GameGUI.getMainText().append("Interesting choice, let's see how this works out for you.\n\n");
                                GameGUI.getOption1().setText("Go to Mount Kralstag to slay the dragon");
                                GameGUI.getOption2().setVisible(false);
                                GameGUI.getOption3().setVisible(false);
                                GameGUI.getOption4().setVisible(false);
                                GameGUI.setProgress("Choice9");
                                break;
                        } break;
                    case "Choice10":
                        switch(playerSelection) {
                            case "o1": 
                                GameGUI.getMainText().append("You selected: " + GameGUI.getOption1().getText() + "\n\n");
                                GameGUI.getOption1().setText("Attack");
                                GameGUI.getOption2().setText("Run away"); 
                                GameGUI.getOption2().setVisible(true);
                                fightDragon(GameGUI.getDragon(), GameGUI.getPlayer());
                                break;
                            
                            case "o2":
                                GameGUI.getMainText().append("You selected: " + GameGUI.getOption2().getText() + "\n\n");
                                GameGUI.getMainText().append("You run away from the dragon and dart behind a rock out of sight.\n\n");
                                GameGUI.getMainText().append("What would you like to do next?\n\n");
                                GameGUI.getOption1().setText("Go back to fight the dragon");
                                if (GameGUI.isHasHealthPotion() == true) {
                                    GameGUI.getOption2().setText("Drink your health potion");
                                    GameGUI.getOption2().setVisible(true);
                                } else {
                                    GameGUI.getOption2().setVisible(false);
                                }
                                GameGUI.setProgress("Choice10.5");
                                break;
                        } break;
                    case "Choice10.5":
                        switch (playerSelection) {
                            case "o1":
                                GameGUI.getMainText().append("You run back to the dragon" + "\n\n");
                                GameGUI.getOption1().setText("Attack");
                                GameGUI.getOption2().setVisible(false);
                                GameGUI.setProgress("Choice10");
                                break;
                            case "o2":

                                if (GameGUI.isHasHealthPotion() == true) {
                                    GameGUI.getMainText().append("You drink the health potion you picked up earlier and feel feel a wave of relief as your wounds heal themselves.\n\n");
                                    GameGUI.setHealthPoints(20);
                                    GameGUI.getHealthInfo().setForeground(Color.GREEN);
                                    GameGUI.getHealthInfo().setText("Health Points: " + GameGUI.getHealthPoints());
                                    GameGUI.setHasHealthPotion(false);
                                    GameGUI.getMainText().append("What would you like to do next?\n\n");
                                    GameGUI.getOption2().setVisible(false);
                                    GameGUI.setProgress("Choice10");
                                } else{
                                    GameGUI.getOption2().setVisible(false);
                                    GameGUI.setProgress("Choice10");
                                }
                                break;
                        } break;
                    case "Choice11":
                        switch(playerSelection) {
                            case "o1":
                                GameGUI.getMainText().append("You selected: " + GameGUI.getOption1().getText() + "\n\n");
                                GameGUI.goodEnding();
                                break;
                            case "o2":
                                GameGUI.getMainText().append("You selected: " + GameGUI.getOption2().getText() + "\n\n");
                                GameGUI.badEnding();
                                break;
                        } break;
        }   
    }
    //Method for resolving the fight with the troll
    public void fightTroll(Monster monster, Player player) {
        Random roller = new Random();

        if (GameGUI.getCurrentWeapon().getName().equals("Sword")) {
            if ((roller.nextInt(10) + 7) >= monster.getAC()) {
                int damage = (roller.nextInt(6) + 1);
                monster.setHP(monster.getHP() - damage);
                GameGUI.getMainText().append("You attack the monster with your sword, and deal " + damage + " damage!\n\n");
            } else {
                GameGUI.getMainText().append("You miss your attack!\n\n");
            }
                
        } else if (GameGUI.getCurrentWeapon().getName().equals("Mace")) {
            if ((roller.nextInt(8) + 7) >= monster.getAC()) {
                int damage = (roller.nextInt(8) + 1);
                monster.setHP(monster.getHP() - damage);
                GameGUI.getMainText().append("You attack the monster with your mace, and deal " + damage + " damage!\n\n");
            } else {
                GameGUI.getMainText().append("You miss your attack!\n\n");
            }
        } else if (GameGUI.getCurrentWeapon().getName().equals("Halberd")) {
            if ((roller.nextInt(6) + 7) >= monster.getAC()) {
                int damage = (roller.nextInt(10) + 1);
                monster.setHP(monster.getHP() - damage);
                GameGUI.getMainText().append("You attack the monster with your halberd, and deal " + damage + " damage!\n\n");
            } else {
                GameGUI.getMainText().append("You miss your attack!\n\n");
            }
        } else if (GameGUI.getCurrentWeapon().getName().equals("Unarmed")) {
            GameGUI.getMainText().append("You punch the troll, but the troll only laughs at you. You are starting to regret not taking a weapon.\n\n");
        } GameGUI.setProgress("Choice6");
         
        if (monster.getHP() > 0 && player.getHP() > 0) {
            if ((roller.nextInt(8) + 6) >= player.getAC()) {
                int damage = (roller.nextInt(8) + 1);
                GameGUI.setHealthPoints(GameGUI.getHealthPoints() - damage);
                GameGUI.getMainText().append("The " + monster.getName() + " attacks and does " + damage + " damage\n\n");
                GameGUI.getHealthInfo().setText("Health Points: " + GameGUI.getHealthPoints());
            } else {
                GameGUI.getMainText().append("The troll swings his massive club at you, but you manage to dodge out of the way!\n\n");
            }
        }

        if(GameGUI.getHealthPoints() <=10) {
            GameGUI.getHealthInfo().setForeground(Color.RED);
        }

        if (GameGUI.getHealthPoints() <= 0) {
            GameGUI.setHealthPoints(0);
            GameGUI.getHealthInfo().setText("Health Points: " + GameGUI.getHealthPoints());
            GameGUI.getMainText().append("The troll has killed you!\n\n");
            GameGUI.loseGame();
        }
        if (monster.getHP() <= 0) {
            GameGUI.getMainText().append("You strike the troll with a mighty swing of your " 
            + GameGUI.getCurrentWeapon().getName() 
            + " and the troll slumps to the ground, unmoving. \n\n");
            GameGUI.getMainText().append("You have defeated the troll!\n\n");
            GameGUI.getMainText().append("What are you going to do next\n\n");
            GameGUI.getOption1().setText("Search the troll's cave for the Draco Eversor");
            GameGUI.getOption2().setText("Continue on to Mount Kralstag to fight the dragon");
            GameGUI.getOption1().setVisible(true);
            GameGUI.getOption2().setVisible(true);
            GameGUI.setProgress("Choice7");
        
        } 
    }

    //Method for resolving the fight with the dragon
    public void fightDragon(Monster monster, Player player) {
        Random roller = new Random();

        if (GameGUI.getCurrentWeapon().getName().equals("Draco Eversor")) {
            if ((roller.nextInt(10) + 10) >= monster.getAC()) {
                int damage = (roller.nextInt(10) + 10);
                monster.setHP(monster.getHP() - damage);
                GameGUI.getMainText().append("You attack the monster with the Draco Eversor, and deal " + damage + " damage!\n\n");
            } else {
                GameGUI.getMainText().append("You miss your attack!\n\n");
            }
                
        } else if (!GameGUI.getCurrentWeapon().getName().equals("Draco Eversor")) {
            GameGUI.getMainText().append("You attack the dragon with your " + GameGUI.getCurrentWeapon().getName() + ", but the dragon's scales are too tough and the attack has no effect!\n\n");
        } GameGUI.setProgress("Choice10");
         
        if (monster.getHP() > 0 && player.getHP() > 0) {
            if ((roller.nextInt(10) + 5) >= player.getAC()) {
                int damage = (roller.nextInt(8) + 1);
                GameGUI.setHealthPoints(GameGUI.getHealthPoints() - damage);
                GameGUI.getMainText().append("The " + monster.getName() + " attacks and does " + damage + " damage\n\n");
                GameGUI.getHealthInfo().setText("Health Points: " + GameGUI.getHealthPoints());
            } else {
                GameGUI.getMainText().append("The dragon swipes at you with his razor sharp claws, but you manage to dodge out of the way!\n\n");
            }
        }

        if(GameGUI.getHealthPoints() <=10) {
            GameGUI.getHealthInfo().setForeground(Color.RED);
        }

        if (GameGUI.getHealthPoints() <= 0) {
            GameGUI.setHealthPoints(0);
            GameGUI.getHealthInfo().setText("Health Points: " + GameGUI.getHealthPoints());
            GameGUI.getMainText().append("The dragon has killed you!\n\n");
            GameGUI.loseGame();

        }
        if (monster.getHP() <= 0) {
            GameGUI.getMainText().append("You plunge the Draco Eversor deep into the Dragon’s chest and " 
            + "it lets out one last roar before falling to the ground dead. You catch your breath " 
            + "and can hardly believe you are still alive. \n\n");
            GameGUI.getMainText().append("You look around and see the huge piles of gold and " 
            + "treasure that the dragon has accumalted over the years. There is enough gold " 
            + "here to give a man a lifetime of luxury. \n\n");
            GameGUI.getMainText().append("What are you going to do next\n\n");
            GameGUI.getOption1().setText("Return to Viesolay and tell the townspeople the good news");
            GameGUI.getOption2().setText("Take the gold for your self and run off with all of Viesolay's treasure");
            GameGUI.getOption1().setVisible(true);
            GameGUI.getOption2().setVisible(true);
            GameGUI.setProgress("Choice11");
        
        } 
    }
}
