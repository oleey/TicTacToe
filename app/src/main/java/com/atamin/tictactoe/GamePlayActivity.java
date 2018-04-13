package com.atamin.tictactoe;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Aminat on 4/10/2018.
 */

public class GamePlayActivity extends AppCompatActivity {
    private int[][] table;
    private boolean xMove;
    int x = 0;
    int y = 0;
    Button button1;
    Button button2, button3, button4, button5, button6, button7, button8, button9;
    TextView label;
    int playerX = 0;
    Context context;
    int playerO = 0;
    RelativeLayout gameBoard;
    LinearLayout choosePlayer;
    RadioButton xPlayerRadiobutton, oPlayerRadiobutton;
    Boolean xPlayerChosen, oPlayerChosen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gameplay);
        context = this;
        gameBoard = (RelativeLayout) findViewById(R.id.game_board);
//        choosePlayer = (LinearLayout) findViewById(R.id.choose_player_layout);
        label = (TextView) findViewById(R.id.moveTextView);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);

//        xPlayerRadiobutton = (RadioButton) findViewById(R.id.x_player_chosen);
//        xPlayerChosen = xPlayerRadiobutton.isChecked();
//
//        oPlayerRadiobutton = (RadioButton) findViewById(R.id.o_player_chosen);
//        oPlayerChosen = oPlayerRadiobutton.isChecked();

//        pickPlayer();

        setUpBoard();

    }

//    //Even for when the user changes between going first and going second
//    public void onRadioButtonClicked(View view) {
////Is the button now checked?
//        boolean checked = ((RadioButton) view).isChecked();
//
//
////Check which radio button was clicked
//        switch(view.getId()) {
//
//
////If the user wants to be X just clear the board and wait for his move
//            case R.id.x_player_chosen:
//
//
//                if (checked)
////                    mark = "X"; aiMark = "O"; clear();
////                    xMove = true;
//                    break;
//
//
////If the user wants to be O's then clear the board and get the AI's opening move
//            case R.id.o_player_chosen:
//
//
//                if (checked)
////                    mark = "O"; aiMark = "X"; clear();
////                getAIMove(board);
//                    break;
//
//
//        }
//
//
//    }


    public void reset(View view) {
        setUpBoard();
        playerO = 0;
        playerX = 0;
        displayForPlayer0(playerO);
        displayForPlayerX(playerX);
    }

    public void pickPlayer(){
        if(xPlayerChosen) {
            choosePlayer.setVisibility(View.GONE);
            gameBoard.setVisibility(View.VISIBLE);

            xMove = true;
            label.setText("X Player Move");

        }else if (oPlayerChosen){
            choosePlayer.setVisibility(View.GONE);
            gameBoard.setVisibility(View.VISIBLE);
//            setUpBoard();
            xMove = false;
            label.setText("O Player Move");
        }else{
            Toast.makeText(context, "Pick a player", Toast.LENGTH_LONG).show();
        }
    }

    public void setUpBoard(){
        table = new int[3][3];
        xMove = true;
        label.setText("X Player Move");
        button1.setText("");
        button2.setText("");
        button3.setText("");
        button4.setText("");
        button5.setText("");
        button6.setText("");
        button7.setText("");
        button8.setText("");
        button9.setText("");

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                makeMove(view);
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                makeMove(view);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                makeMove(view);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                makeMove(view);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                makeMove(view);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                makeMove(view);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                makeMove(view);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                makeMove(view);
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                makeMove(view);
            }
        });
    }

    public void displayForPlayerX(int score){
        TextView scoreview = (TextView) findViewById(R.id.player_x_score);
        scoreview.setText(String.valueOf(score));
    }

    public void displayForPlayer0(int score){
        TextView scoreview = (TextView) findViewById(R.id.player_o_score);
        scoreview.setText(String.valueOf(score));
    }

    public void makeMove(View v) {

        int id = v.getId();

        switch (id) {
            case R.id.button1:
//            button1.setText("X");
                x=0;
                y=0;
                break;
            case R.id.button2:
                x = 0;
                y = 1;
                break;
            case R.id.button3:
                x = 0;
                y = 2;
                break;
            case R.id.button4:
                x = 1;
                y = 0;
                break;
            case R.id.button5:
                x = 1;
                y = 1;
                break;
            case R.id.button6:
                x = 1;
                y = 2;
                break;
            case R.id.button7:
                x = 2;
                y = 0;
                break;
            case R.id.button8:
                x = 2;
                y = 1;
                break;
            case R.id.button9:
                x = 2;
                y = 2;
                break;
        }
        if (table[x][y] != 0) {
            AlertDialog.Builder dlgAlert = new AlertDialog.Builder(this);

            dlgAlert.setMessage("This cell is not empty!");
            dlgAlert.setTitle("Error");
            dlgAlert.setCancelable(true);
            dlgAlert.create().show();
            return;
        }
        Button btn = (Button) findViewById(id);

        if (xMove) {
            btn.setText("X");
            table[x][y] = 2;
            label.setText("O move");
            xMove = false;
        } else {
            btn.setText("O");
            table[x][y] = 1;
            xMove = true;

            label.setText("X move");
        }
        checkResult();
//        setUpBoard();
    }

    private void checkResult() {
        boolean empty = false;
        AlertDialog.Builder dlgAlert = new AlertDialog.Builder(this);
        for (int i = 0; i != 3; ++i) {
            for (int j = 0; j != 3; ++j) {
                if (table[i][j] == 0) {
                    empty = true;
                    break;
                }
            }
        }
        if (!empty) {
            dlgAlert.setMessage("Draw!");
            dlgAlert.setTitle("Draw");
            dlgAlert.setCancelable(true);
            dlgAlert.setPositiveButton("Ok",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
//                            finish();
                            setUpBoard();

                        }
                    });
            dlgAlert.create().show();
            setUpBoard();

        }
        //check horizontal lines
        for (int i = 0; i != 3; ++i) {
            if (table[i][0] == 1 && table[i][1] == 1 && table[i][2] == 1) {
                dlgAlert.setMessage("O Player wins!");
                dlgAlert.setTitle("Congratulations");
                playerO = playerO + 1;
                displayForPlayer0(playerO);
                dlgAlert.setCancelable(true);
                dlgAlert.setPositiveButton("Ok",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                setUpBoard();
                            }
                        });
                dlgAlert.create().show();
                setUpBoard();

            }
            if (table[i][0] == 2 && table[i][1] == 2 && table[i][2] == 2) {
                dlgAlert.setMessage("X Player wins!");
                dlgAlert.setTitle("Congratulations");
                playerX = playerX + 1;
                displayForPlayerX(playerX);
                dlgAlert.setCancelable(true);
                dlgAlert.setPositiveButton("Ok",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
//                                finish();
                                setUpBoard();
                            }
                        });
                dlgAlert.create().show();
                setUpBoard();

            }
        }
        //check vertical lines
        for (int i = 0; i != 3; ++i) {
            if (table[0][i] == 1 && table[1][i] == 1 && table[2][i] == 1) {
                dlgAlert.setMessage("O Player wins!");
                dlgAlert.setTitle("Congratulations");
                playerO = playerO + 1;
                displayForPlayer0(playerO);
                dlgAlert.setCancelable(true);
                dlgAlert.setPositiveButton("Ok",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
//                                finish();
                                setUpBoard();
                            }
                        });
                dlgAlert.create().show();
                setUpBoard();

            }
            if (table[0][i] == 2 && table[1][i] == 2 && table[2][i] == 2) {
                dlgAlert.setMessage("X Player wins!");
                dlgAlert.setTitle("Congratulations");
                playerX = playerX + 1;
                displayForPlayerX(playerX);
                dlgAlert.setCancelable(true);
                dlgAlert.setPositiveButton("Ok",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
//                                finish();
                                setUpBoard();
                            }
                        });
                dlgAlert.create().show();
                setUpBoard();

            }

        }
        //check diagonals
        if (table[0][0] == 1 && table[1][1] == 1 && table[2][2] == 1) {
            dlgAlert.setMessage("O Player wins!");
            dlgAlert.setTitle("Congratulations");
            playerO = playerO + 1;
            displayForPlayer0(playerO);
            dlgAlert.setCancelable(true);
            dlgAlert.setPositiveButton("Ok",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
//                            finish();
                            setUpBoard();
                        }
                    });
            dlgAlert.create().show();
            setUpBoard();

        }
        if (table[0][0] == 2 && table[1][1] == 2 && table[2][2] == 2) {
            dlgAlert.setMessage("X Player wins!");
            dlgAlert.setTitle("Congratulations");
            playerX = playerX + 1;
            displayForPlayerX(playerX);
            dlgAlert.setCancelable(true);
            dlgAlert.setPositiveButton("Ok",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
//                            finish();
                            setUpBoard();
                        }
                    });
            dlgAlert.create().show();
            setUpBoard();

        }
        if (table[0][2] == 1 && table[1][1] == 1 && table[2][0] == 1) {
            dlgAlert.setMessage("O Player wins!");
            dlgAlert.setTitle("Congratulations");
            playerO = playerO + 1;
            displayForPlayer0(playerO);
            dlgAlert.setCancelable(true);
            dlgAlert.setPositiveButton("Ok",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
//                            finish();
                            setUpBoard();
                        }
                    });
            dlgAlert.create().show();
            setUpBoard();

        }
        if (table[0][2] == 2 && table[1][1] == 2 && table[2][0] == 2) {
            dlgAlert.setMessage("X Player wins!");
            dlgAlert.setTitle("Congratulations");
            playerX = playerX + 1;
            displayForPlayerX(playerX);
            dlgAlert.setCancelable(true);
            dlgAlert.setPositiveButton("Ok",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
//                            finish();
                            setUpBoard();
                        }
                    });
            setUpBoard();
            dlgAlert.create().show();

        }

//        setUpBoard();
    }

}

