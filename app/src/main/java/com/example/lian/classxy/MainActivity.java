package com.example.lian.classxy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.*;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    // squares[] represents the board configuration:
    // 0 1 2
    // 3 4 5
    // 6 7 8
    public Square[] squares = new Square[9];
    public int currentTurn = 2;


    public void onClick(View v) {
        for (int i = 0; i < 9; i++) {
            if (squares[i].getButton() == v) {
                if (squares[i].getShape() == 0) {
                    squares[i].setShape(currentTurn);
                    if (currentTurn == 1) {
                        currentTurn = 2;
                    }
                    else currentTurn = 1;
                }

            }
            if ((squares[0].getShape()==squares[1].getShape() & squares[1].getShape()==squares[2].getShape() & squares[2].getShape() !=0) ||
                    (squares[3].getShape()==squares[4].getShape() & squares[4].getShape()==squares[5].getShape()& squares[5].getShape() !=0) ||
                    (squares[6].getShape()==squares[7].getShape() & squares[7].getShape()==squares[8].getShape()& squares[8].getShape() !=0) ||
                    (squares[0].getShape()==squares[3].getShape() & squares[3].getShape()==squares[6].getShape()& squares[6].getShape() !=0) ||
                    (squares[1].getShape()==squares[4].getShape() & squares[4].getShape()==squares[7].getShape()& squares[7].getShape() !=0) ||
                    (squares[2].getShape()==squares[5].getShape() & squares[5].getShape()==squares[8].getShape()& squares[8].getShape() !=0) ||
                    (squares[0].getShape()==squares[4].getShape() & squares[4].getShape()==squares[8].getShape()& squares[4].getShape() !=0) ||
                    (squares[6].getShape()==squares[4].getShape() & squares[4].getShape()==squares[2].getShape()& squares[2].getShape() !=0))
                declareWinner();
            else if (squares[0].getShape() !=0 & squares[1].getShape()!=0 & squares[2].getShape() !=0 & squares[3].getShape()!=0 & squares[4].getShape() !=0
                    & squares[5].getShape() !=0 & squares[6].getShape()!=0 & squares[7].getShape() !=0 & squares[8].getShape()!=0)
                declareTie();

        }


    }

    public void declareTie() {
        Log.i("Game ended no winner", "");
    }
    public void declareWinner() {
        Log.i("Winner is:", Integer.toString(currentTurn));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        squares[0] = new Square(findViewById(R.id.button1));
        squares[1] = new Square(findViewById(R.id.button2));
        squares[2] = new Square(findViewById(R.id.button3));
        squares[3] = new Square(findViewById(R.id.button4));
        squares[4] = new Square(findViewById(R.id.button5));
        squares[5] = new Square(findViewById(R.id.button6));
        squares[6] = new Square(findViewById(R.id.button7));
        squares[7] = new Square(findViewById(R.id.button8));
        squares[8] = new Square(findViewById(R.id.button9));
    }

        // clear board
    public void whenClearClicked(View V) {
        for (int i = 0; i < 9; i++)
            squares[i].setShape(0);


//        for ( int i=0; i< 9; i++) {
//            int resID = getResources().getIdentifier("button" + (i + 1), "id", "com.example.lian.classxy");
//            Button b = (Button) findViewById(resID);
//            squares[i] = new Square(b);
//        }


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
