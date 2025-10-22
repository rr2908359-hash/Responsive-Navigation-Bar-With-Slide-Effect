import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;

public class CarRacingGame extends JPanel implements KeyListener, ActionListener {

    private Timer timer;
    private int delay = 15; // game loop delay
    private int playerX = 250; // player car x-position
    private int playerY = 500; // player car y-position
    private int playerWidth = 50;
    privat
