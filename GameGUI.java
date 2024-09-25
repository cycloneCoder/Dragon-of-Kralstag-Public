import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class GameGUI {
    JPanel playerInfoPanel = new JPanel();

    private JFrame startScreen = new JFrame();
    private JFrame introScreen = new JFrame();
    private JFrame playScreen = new JFrame();

    private static boolean goForSpear;
    private static boolean hasHealthPotion;
    private static int healthPoints;
    private static String playerName;
    private static String progress = new String();
    private static Player player = new Player(30, 10);
    private static Weapon currentWeapon = new Weapon();
    private static Monster dragon = new Monster("dragon",10, 50);
    private static Monster troll = new Monster("troll", 10, 20);
    private static JLabel healthInfo = new JLabel();
    private static JLabel weaponInfo = new JLabel();
    private static JTextArea mainText = new JTextArea(10, 20);
    private static JPanel buttonPanel = new JPanel();
    private static JButton option1 = new JButton("CONTINUE");
    private static JButton option2 = new JButton("Option 2");
    private static JButton option3 = new JButton("Option 3");
    private static JButton option4 = new JButton("Option 4");



    // Getters and Setters for the instance variable

    public static boolean isGoForSpear() {
        return goForSpear;
    }

    public static void setGoForSpear(boolean goForSpear) {
        GameGUI.goForSpear = goForSpear;
    }

    public static boolean isHasHealthPotion() {
        return hasHealthPotion;
    }

    public static void setHasHealthPotion(boolean hasHealthPotion) {
        GameGUI.hasHealthPotion = hasHealthPotion;
    }

    public static int getHealthPoints() {
        return healthPoints;
    }

    public static void setHealthPoints(int healthPoints) {
        GameGUI.healthPoints = healthPoints;
    }

    public static String getPlayerName() {
        return playerName;
    }

    public static void setPlayerName(String playerName) {
        GameGUI.playerName = playerName;
    }

    public static String getProgress() {
        return progress;
    }

    public static void setProgress(String progress) {
        GameGUI.progress = progress;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        GameGUI.player = player;
    }

    public static Weapon getCurrentWeapon() {
        return currentWeapon;
    }

    public static void setCurrentWeapon(Weapon currentWeapon) {
        GameGUI.currentWeapon = currentWeapon;
    }

    public static Monster getDragon() {
        return dragon;
    }

    public static void setDragon(Monster dragon) {
        GameGUI.dragon = dragon;
    }

    public static Monster getTroll() {
        return troll;
    }

    public static void setTroll(Monster troll) {
        GameGUI.troll = troll;
    }

    public static JLabel getHealthInfo() {
        return healthInfo;
    }

    public static void setHealthInfo(JLabel healthInfo) {
        GameGUI.healthInfo = healthInfo;
    }

    public static JLabel getWeaponInfo() {
        return weaponInfo;
    }

    public static void setWeaponInfo(JLabel weaponInfo) {
        GameGUI.weaponInfo = weaponInfo;
    }

    public static JTextArea getMainText() {
        return mainText;
    }

    public static void setMainText(JTextArea mainText) {
        GameGUI.mainText = mainText;
    }

    public static JPanel getButtonPanel() {
        return buttonPanel;
    }

    public static void setButtonPanel(JPanel buttonPanel) {
        GameGUI.buttonPanel = buttonPanel;
    }

    public static JButton getOption1() {
        return option1;
    }

    public static void setOption1(JButton option1) {
        GameGUI.option1 = option1;
    }

    public static JButton getOption2() {
        return option2;
    }

    public static void setOption2(JButton option2) {
        GameGUI.option2 = option2;
    }

    public static JButton getOption3() {
        return option3;
    }

    public static void setOption3(JButton option3) {
        GameGUI.option3 = option3;
    }

    public static JButton getOption4() {
        return option4;
    }

    public static void setOption4(JButton option4) {
        GameGUI.option4 = option4;
    }

    // End of Getters and Setters

    // Main Method
    public static void main(String[] args) {
        GameGUI game = new GameGUI();
        GameGUI.getCurrentWeapon().setName("Unarmed");
        GameGUI.setHealthPoints(20);
        game.startScreen();
    }
    // End of Main Method

    // This Method creates the Start Screen GUI
    public void startScreen() {
        startScreen.setResizable(false);
        startScreen.setSize(1000, 600);
        startScreen.setVisible(true);
        startScreen.setBackground(Color.BLACK);
        startScreen.setForeground(Color.WHITE);
        JButton startButton = new JButton("START");
        startButton.setBackground(Color.BLACK);
        startButton.setForeground(Color.WHITE);

        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(Color.BLACK);
        panel.setForeground(Color.WHITE);
        JLabel title = new JLabel("label", SwingConstants.CENTER);
        startButton.addActionListener(e -> introScreen());

        title.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 26));
        title.setText("THE DRAGON OF KRALSTAG");
       
        title.setForeground(Color.WHITE);
        panel.add(BorderLayout.CENTER, title);
        panel.add(BorderLayout.SOUTH, startButton);
        startScreen.getContentPane().add(BorderLayout.CENTER, panel);
        startScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // This method creates the intro screen GUI
    public void introScreen() {
        startScreen.setVisible(false);
        introScreen.setSize(1000, 600);
        introScreen.setResizable(false);
        introScreen.setBackground(Color.BLACK);
        introScreen.setForeground(Color.WHITE);
        introScreen.setVisible(true);

        JPanel introPanel = new JPanel();
        introPanel.setLayout(new FlowLayout());
        introPanel.setBackground(Color.BLACK);
        introPanel.setForeground(Color.WHITE);

        JButton enterButton = new JButton("ENTER");
        enterButton.setBackground(Color.BLACK);
        enterButton.setForeground(Color.WHITE);
        enterButton.setPreferredSize(new Dimension(100, 30));

        mainText.setFont(new Font("Garamond", Font.PLAIN, 18));
        mainText.setBackground(Color.BLACK);
        mainText.setForeground(Color.WHITE);
        mainText.setLineWrap(true);
        mainText.setWrapStyleWord(true);

        mainText.setText("Welcome to the game!\n\n");
        mainText.append(
                "Before we get started, I want to warn you that there is no save feature. So, if you lose, you will have to restart!\n\n");
        mainText.append("How to play:\n\n");
        mainText.append(
                "This game will present you with a series of choices. To win, you must make the right choices and have luck on your side. \n\n");
        
        mainText.append("Please enter your name: \n\n ");

        JScrollPane scrollPane = new JScrollPane(mainText, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setPreferredSize(new Dimension(900, 300));
        JTextField enterNameField = new JTextField(20);
        enterNameField.add(Box.createRigidArea(new Dimension(5, 20)));
        enterNameField.setBackground(Color.BLACK);
        enterNameField.setForeground(Color.WHITE);

        enterButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mainText.append("Welcome " + enterNameField.getText() + ", do you think you can beat this game?\n");
                mainText.append("\n");
                setPlayerName(enterNameField.getText());
                playScreen(introScreen, mainText, scrollPane);
            }
        });

        introPanel.add(scrollPane);
        introPanel.add(enterNameField);
        introPanel.add(enterButton);
        introScreen.getContentPane().add(BorderLayout.CENTER, introPanel);
        introScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // This method creates the play screen GUI
    public void playScreen(JFrame introScreen, JTextArea mainText, JScrollPane scrollPane) {
        introScreen.setVisible(false);
        playScreen.setSize(1000, 600);
        playScreen.setResizable(false);
        playScreen.setVisible(true);

        scrollPane.setPreferredSize(new Dimension(900, 300));

        JPanel playPanel = new JPanel();
        playPanel.setLayout(new FlowLayout());
        playPanel.setBackground(Color.BLACK);
        playPanel.setForeground(Color.WHITE);

        buttonPanel.setLayout(new GridLayout(4, 1));
        buttonPanel.setBackground(Color.BLACK);
        playerInfoPanel.setLayout(new GridLayout(2, 1));

        option1.setActionCommand("o1");
        option1.setFont(new Font("Garamond", Font.PLAIN, 17));
        option1.setBackground(Color.BLACK);
        option1.setForeground(Color.WHITE);

        option2.setActionCommand("o2");
        option2.setFont(new Font("Garamond", Font.PLAIN, 17));
        option2.setBackground(Color.BLACK);
        option2.setForeground(Color.WHITE);

        option3.setActionCommand("o3");
        option3.setFont(new Font("Garamond", Font.PLAIN, 17));
        option3.setBackground(Color.BLACK);
        option3.setForeground(Color.WHITE);

        option4.setActionCommand("o4");
        option4.setFont(new Font("Garamond", Font.PLAIN, 17));
        option4.setBackground(Color.BLACK);
        option4.setForeground(Color.WHITE);

        mainText.append("Click the continue button to begin the game!\n\n");

        setProgress("Continue");

        option1.addActionListener(new Options());
        option2.addActionListener(new Options());
        option3.addActionListener(new Options());
        option4.addActionListener(new Options());

        GameGUI.getWeaponInfo().setFont(new Font("Copperplate Gothic Light", Font.BOLD, 18));
        GameGUI.getWeaponInfo().setText("Current Weapon: " + GameGUI.getCurrentWeapon().getName());
        weaponInfo.setBackground(Color.BLACK);
        weaponInfo.setForeground(Color.WHITE);
        GameGUI.getWeaponInfo().setHorizontalAlignment(0);

        GameGUI.getHealthInfo().setFont(new Font("Copperplate Gothic Light", Font.BOLD, 18));
        healthInfo.setBackground(Color.BLACK);
        healthInfo.setForeground(Color.GREEN);
        GameGUI.getHealthInfo().setText("Health Points: " + GameGUI.getHealthPoints());
        GameGUI.getHealthInfo().setHorizontalAlignment(0);

        playerInfoPanel.add(GameGUI.getHealthInfo());
        playerInfoPanel.add(GameGUI.getWeaponInfo());
        playerInfoPanel.setBackground(Color.BLACK);

        buttonPanel.add(option1);
        playPanel.add(scrollPane);
        playPanel.add(buttonPanel);

        playScreen.getContentPane().add(BorderLayout.CENTER, playPanel);
        playScreen.getContentPane().add(BorderLayout.NORTH, playerInfoPanel);
        playScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void goodEnding() {
        mainText.append("You journey back to Viesolay. The town is stunned to see their lord limp back into the town square and " 
        + " all eyes are on you as they await the story you have to tell. " 
        + "You share the news of the Dragon’s demise and the town is exuberant. " 
        + "They throw a parade and dedicate a holiday in your honor. " 
        + "Viesolay flourishes with the returned treasure. " 
        + "Eleven years later, the king dies without an heir. The princes and lords " 
        + "of the kingdom hold a conference and decide to make you their next king. You live out the rest of your " 
        + "days in peace and to this day Viesolay’s town square is " 
        + "adorned with a statue commemorating your great victory over the Dragon.\n\n ");
        mainText.append("Contratulations! You have beaten the game!\n\n");
        mainText.append("GAME OVER\n\n");
        buttonPanel.setVisible(false);
    }

    public static void badEnding() {
        mainText.append("You stuff your pockets and fill your pack with the Dragon’s stolen gold. " 
        + "You descend from Mount Kralstag and take a journey across the sea to another kingdom. " 
        + "You buy a modest home there and spend the rest of your days as a miser. The gold has infected you. " 
        + "You become obsessed with it and become increasingly paranoid of losing your ill-gotten gains. " 
        + "You die alone without having spent even a fraction of the gold you stole. \n\n");

        mainText.append("Back in Viesolay, rumors soon spread of your treachery once the town " 
        + "realizes the Dragon has not come to collect the tribute. To this day, the name of " 
        + playerName + " is cursed throughout the kingdom of Celestria.\n\n");
        mainText.append("GAME OVER");
        buttonPanel.setVisible(false);
    }

    public static void loseGame() {
        mainText.append("You were not able to beat the game!\n");
        mainText.append("GAME OVER\n");
        buttonPanel.setVisible(false);
    }
}
