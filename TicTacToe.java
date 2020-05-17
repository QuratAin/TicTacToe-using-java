import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToe extends JFrame {

    private JPanel contentPane;
    private JFrame frame;
    private String startGame = "X";
    private int xCount = 0;
    private int oCount = 0;
    private JLabel btn1x1;
    private JLabel btn1x2;
    private JLabel btn1x3;
    private JLabel btn2x1;
    private JLabel btn2x2;
    private JLabel btn2x3;
    private JLabel btn3x1;
    private JLabel btn3x2;
    private JLabel btn3x3;
    private JTextField txtCounterX;
    private JTextField txtCounterO;


    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    TicTacToe frame = new TicTacToe();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Displays the amount of times each player won.
     */
    public void gameScore() {
        txtCounterX.setText(String.valueOf(xCount++));
        txtCounterO.setText(String.valueOf(oCount++));
    }

    /**
     * Switches which player's turn it is.  X always starts the game.
     */
    private void choosePlayer() {
        if (startGame.equals("X")) {
            startGame = "O";
        } else {
            startGame = "X";
        }
    }

    /**
     * Different ways the game can be won by X or by O.
     */
    public void winningGame() {
        String b1x1 = btn1x1.getText();
        String b1x2 = btn1x2.getText();
        String b1x3 = btn1x3.getText();
        String b2x1 = btn2x1.getText();
        String b2x2 = btn2x2.getText();
        String b2x3 = btn2x3.getText();
        String b3x1 = btn3x1.getText();
        String b3x2 = btn3x2.getText();
        String b3x3 = btn3x3.getText();

        if (b1x1 == ("X") && b1x2 == ("X") && b1x3 == ("X")) {
            JOptionPane.showMessageDialog(frame, "X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();

        } else if (b2x1 == ("X") && b2x2 == ("X") && b2x3 == ("X")) {
            JOptionPane.showMessageDialog(frame, "X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();

        } else if (b3x1 == ("X") && b3x2 == ("X") && b3x3 == ("X")) {
            JOptionPane.showMessageDialog(frame, "X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();

        } else if (b1x1 == ("X") && b2x1 == ("X") && b3x1 == ("X")) {
            JOptionPane.showMessageDialog(frame, "X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();

        } else if (b1x2 == ("X") && b2x2 == ("X") && b3x3 == ("X")) {
            JOptionPane.showMessageDialog(frame, "X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();

        } else if (b1x3 == ("X") && b2x3 == ("X") && b3x3 == ("X")) {
            JOptionPane.showMessageDialog(frame, "X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();

        } else if (b1x1 == ("X") && b2x2 == ("X") && b3x3 == ("X")) {
            JOptionPane.showMessageDialog(frame, "X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();

        } else if (b3x1 == ("X") && b2x2 == ("X") && b1x3 == ("X")) {
            JOptionPane.showMessageDialog(frame, "X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();

        } else if (b1x1 == ("O") && b1x2 == ("O") && b1x3 == ("O")) {
            JOptionPane.showMessageDialog(frame, "O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();

        } else if (b2x1 == ("O") && b2x2 == ("O") && b2x3 == ("O")) {
            JOptionPane.showMessageDialog(frame, "O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();

        } else if (b3x1 == ("O") && b3x2 == ("O") && b3x3 == ("O")) {
            JOptionPane.showMessageDialog(frame, "O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();

        } else if (b1x1 == ("O") && b2x1 == ("O") && b3x1 == ("O")) {
            JOptionPane.showMessageDialog(frame, "O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();

        } else if (b1x2 == ("O") && b2x2 == ("O") && b3x3 == ("O")) {
            JOptionPane.showMessageDialog(frame, "O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();

        } else if (b1x3 == ("O") && b2x3 == ("O") && b3x3 == ("O")) {
            JOptionPane.showMessageDialog(frame, "O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();

        } else if (b1x1 == ("O") && b2x2 == ("O") && b3x3 == ("O")) {
            JOptionPane.showMessageDialog(frame, "O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();

        } else if (b3x1 == ("O") && b2x2 == ("O") && b1x3 == ("O")) {
            JOptionPane.showMessageDialog(frame, "O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
        }

    }

    /**
     * Create the frame.
     */
    public TicTacToe() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1200, 600);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout(0, 0));

        JPanel panel = new JPanel();
        panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        contentPane.add(panel, BorderLayout.CENTER);
        panel.setLayout(new GridLayout(0, 5, 0, 0));

        JPanel panel_2 = new JPanel();
        panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel.add(panel_2);
        panel_2.setLayout(new GridLayout(1, 0, 0, 0));

        JButton btn1x1 = new JButton("");
        btn1x1.setFont(new Font("Tahoma", Font.BOLD, 92));
        btn1x1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                btn1x1.setText(startGame);
                if (startGame.equalsIgnoreCase("X")) {
                    btn1x1.setForeground(Color.RED);
                } else {
                    btn1x1.setForeground(Color.BLUE);
                }
                choosePlayer();
                winningGame();
            }
        });
        panel_2.add(btn1x1);

        JPanel panel_3 = new JPanel();
        panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel.add(panel_3);
        panel_3.setLayout(new GridLayout(1, 0, 0, 0));

        JButton btn1x2 = new JButton("");
        btn1x2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                btn1x2.setText(startGame);
                if (startGame.equalsIgnoreCase("X")) {
                    btn1x2.setForeground(Color.RED);
                } else {
                    btn1x2.setForeground(Color.BLUE);
                }
                choosePlayer();
                winningGame();
            }
        });
        btn1x2.setFont(new Font("Tahoma", Font.BOLD, 92));
        panel_3.add(btn1x2);

        JPanel panel_4 = new JPanel();
        panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel.add(panel_4);
        panel_4.setLayout(new GridLayout(1, 0, 0, 0));

        JButton btn1x3 = new JButton("");
        btn1x3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                btn1x3.setText(startGame);
                if (startGame.equalsIgnoreCase("X")) {
                    btn1x3.setForeground(Color.RED);
                } else {
                    btn1x3.setForeground(Color.BLUE);
                }
                choosePlayer();
                winningGame();
            }
        });
        btn1x3.setFont(new Font("Tahoma", Font.BOLD, 92));
        panel_4.add(btn1x3);

        JPanel panel_5 = new JPanel();
        panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel.add(panel_5);
        panel_5.setLayout(new GridLayout(1, 0, 0, 0));

        JLabel lblPlayerX = new JLabel("Player X: ");
        lblPlayerX.setFont(new Font("Tahoma", Font.BOLD, 45));
        panel_5.add(lblPlayerX);

        JPanel panel_6 = new JPanel();
        panel_6.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel.add(panel_6);
        panel_6.setLayout(new GridLayout(1, 0, 0, 0));

        txtCounterX = new JTextField();
        txtCounterX.setFont(new Font("Tahoma", Font.BOLD, 45));
        txtCounterX.setHorizontalAlignment(SwingConstants.CENTER);
        txtCounterX.setText("0");
        panel_6.add(txtCounterX);
        txtCounterX.setColumns(10);

        JPanel panel_7 = new JPanel();
        panel_7.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel.add(panel_7);
        panel_7.setLayout(new GridLayout(1, 0, 0, 0));

        JButton btn2x1 = new JButton("");
        btn2x1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                btn2x1.setText(startGame);
                if (startGame.equalsIgnoreCase("X")) {
                    btn2x1.setForeground(Color.RED);
                } else {
                    btn2x1.setForeground(Color.BLUE);
                }
                choosePlayer();
                winningGame();
            }
        });
        btn2x1.setFont(new Font("Tahoma", Font.BOLD, 92));
        panel_7.add(btn2x1);

        JPanel panel_8 = new JPanel();
        panel_8.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel.add(panel_8);
        panel_8.setLayout(new GridLayout(1, 0, 0, 0));

        JButton btn2x2 = new JButton("");
        btn2x2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                btn2x2.setText(startGame);
                if (startGame.equalsIgnoreCase("X")) {
                    btn2x2.setForeground(Color.RED);
                } else {
                    btn2x2.setForeground(Color.BLUE);
                }
                choosePlayer();
                winningGame();
            }
        });
        btn2x2.setFont(new Font("Tahoma", Font.BOLD, 92));
        panel_8.add(btn2x2);

        JPanel panel_9 = new JPanel();
        panel_9.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel.add(panel_9);
        panel_9.setLayout(new GridLayout(1, 0, 0, 0));

        JButton btn2x3 = new JButton("");
        btn2x3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                btn2x3.setText(startGame);
                if (startGame.equalsIgnoreCase("X")) {
                    btn2x3.setForeground(Color.RED);
                } else {
                    btn2x3.setForeground(Color.BLUE);
                }
                choosePlayer();
                winningGame();
            }
        });
        btn2x3.setFont(new Font("Tahoma", Font.BOLD, 92));
        panel_9.add(btn2x3);

        JPanel panel_10 = new JPanel();
        panel_10.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel.add(panel_10);
        panel_10.setLayout(new GridLayout(1, 0, 0, 0));

        JLabel lblPlayerO = new JLabel("Player O:");
        lblPlayerO.setFont(new Font("Tahoma", Font.BOLD, 45));
        panel_10.add(lblPlayerO);

        JPanel panel_11 = new JPanel();
        panel_11.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel.add(panel_11);
        panel_11.setLayout(new GridLayout(1, 0, 0, 0));

        txtCounterO = new JTextField();
        txtCounterO.setText("0");
        txtCounterO.setHorizontalAlignment(SwingConstants.CENTER);
        txtCounterO.setFont(new Font("Tahoma", Font.BOLD, 45));
        txtCounterO.setColumns(10);
        panel_11.add(txtCounterO);

        JPanel panel_12 = new JPanel();
        panel_12.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel.add(panel_12);
        panel_12.setLayout(new GridLayout(1, 0, 0, 0));

        JButton btn3x1 = new JButton("");
        btn3x1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                btn3x1.setText(startGame);
                if (startGame.equalsIgnoreCase("X")) {
                    btn3x1.setForeground(Color.RED);
                } else {
                    btn3x1.setForeground(Color.BLUE);
                }
                choosePlayer();
                winningGame();
            }
        });
        btn3x1.setFont(new Font("Tahoma", Font.BOLD, 92));
        panel_12.add(btn3x1);

        JPanel panel_13 = new JPanel();
        panel_13.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel.add(panel_13);
        panel_13.setLayout(new GridLayout(1, 0, 0, 0));

        JButton btn3x2 = new JButton("");
        btn3x2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                btn3x2.setText(startGame);
                if (startGame.equalsIgnoreCase("X")) {
                    btn3x2.setForeground(Color.RED);
                } else {
                    btn3x2.setForeground(Color.BLUE);
                }
                choosePlayer();
                winningGame();
            }
        });
        btn3x2.setFont(new Font("Tahoma", Font.BOLD, 92));
        panel_13.add(btn3x2);

        JPanel panel_14 = new JPanel();
        panel_14.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel.add(panel_14);
        panel_14.setLayout(new GridLayout(1, 0, 0, 0));

        JButton btn3x3 = new JButton("");
        btn3x3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                btn3x3.setText(startGame);
                if (startGame.equalsIgnoreCase("X")) {
                    btn3x3.setForeground(Color.RED);
                } else {
                    btn3x3.setForeground(Color.BLUE);
                }
                choosePlayer();
                winningGame();
            }
        });
        btn3x3.setFont(new Font("Tahoma", Font.BOLD, 92));
        panel_14.add(btn3x3);

        JPanel panel_15 = new JPanel();
        panel_15.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel.add(panel_15);
        panel_15.setLayout(new GridLayout(1, 0, 0, 0));

        JButton btnReset = new JButton("Reset");
        btnReset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                btn1x1.setText(null);
                btn1x2.setText(null);
                btn1x3.setText(null);
                btn2x1.setText(null);
                btn2x2.setText(null);
                btn2x3.setText(null);
                btn3x1.setText(null);
                btn3x2.setText(null);
                btn3x3.setText(null);

                btn1x1.setBackground(Color.LIGHT_GRAY);
                btn1x2.setBackground(Color.LIGHT_GRAY);
                btn1x3.setBackground(Color.LIGHT_GRAY);
                btn2x1.setBackground(Color.LIGHT_GRAY);
                btn2x2.setBackground(Color.LIGHT_GRAY);
                btn2x3.setBackground(Color.LIGHT_GRAY);
                btn3x1.setBackground(Color.LIGHT_GRAY);
                btn3x2.setBackground(Color.LIGHT_GRAY);
                btn3x3.setBackground(Color.LIGHT_GRAY);
            }
        });
        btnReset.setFont(new Font("Tahoma", Font.BOLD, 55));
        panel_15.add(btnReset);

        JPanel panel_1 = new JPanel();
        panel.add(panel_1);
        panel_1.setLayout(new GridLayout(1, 0, 0, 0));

        JButton btnExit = new JButton("Exit");
        btnExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                frame = new JFrame("Exit");
                if (JOptionPane.showConfirmDialog(frame, "Do you want to exit", "Tic Tac Toe?",
                        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
                    System.exit(0);
                }
            }
        });
        btnExit.setFont(new Font("Tahoma", Font.BOLD, 55));
        panel_1.add(btnExit);
    }
}