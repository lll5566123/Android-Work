package tw.edu.ncut.a3a417074.s3a417074_76_82_finaltest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Space;

public class GameActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageButton[] ImageButton;
    private int count = 0;
    private String Picture[] = new String[42];

    public GameActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);

        int gWidth = metrics.widthPixels;
        int gHeight = metrics.heightPixels - 160;

        GridLayout gridLayout = findViewById(R.id.GridLayout);

        gridLayout.getLayoutParams().width = (int) (gWidth);
        gridLayout.getLayoutParams().height = (int) (gHeight);

        gridLayout.setColumnCount(6);
        gridLayout.setRowCount(7);

        int btnWidth = gWidth / 6;
        int btnHeight = gHeight / 7;
        ImageButton = new ImageButton[42];

        GridLayout.LayoutParams layoutParams_TV;
        layoutParams_TV = new GridLayout.LayoutParams();
        layoutParams_TV.width = gWidth;
        layoutParams_TV.height = (int) (btnHeight * 0.5);
        layoutParams_TV.columnSpec = GridLayout.spec(0, 5);
        layoutParams_TV.rowSpec = GridLayout.spec(0, 2);


        for (int i = 0; i < 42; i++) {
            ImageButton[i] = new ImageButton(this);
            ImageButton[i].setId(i);
            ImageButton[i].setTag(String.valueOf(i));
            ImageButton[i].setOnClickListener(this);
            ImageButton[i].setScaleType(ImageView.ScaleType.CENTER_CROP);
            gridLayout.addView(ImageButton[i], btnWidth, btnHeight);
        }
        Space s = new Space(this);
        gridLayout.addView(s, btnWidth, btnHeight);

    }
    //ImageButton[0].setImageDrawable(getResources().getDrawable(R.drawable.test));//設定切換圖片
    @Override
    public void onClick(View v) {
        int tag = Integer.valueOf(String.valueOf(v.getTag()));
        switch (tag){
            case 0 :
                switchPicture(tag);
                break;
            case 1 :
                switchPicture(tag);
                break;
            case 2 :
                switchPicture(tag);
                break;
            case 3 :
                switchPicture(tag);
                break;
            case 4 :
                switchPicture(tag);
                break;
            case 5 :
                switchPicture(tag);
                break;
            case 6 :
                switchPicture(tag);
                break;
            case 7 :
                switchPicture(tag);
                break;
            case 8 :
                switchPicture(tag);
                break;
            case 9 :
                switchPicture(tag);
                break;
            case 10 :
                switchPicture(tag);
                break;
            case 11 :
                switchPicture(tag);
                break;
            case 12 :
                switchPicture(tag);
                break;
            case 13 :
                switchPicture(tag);
                break;
            case 14 :
                switchPicture(tag);
                break;
            case 15 :
                switchPicture(tag);
                break;
            case 16 :
                switchPicture(tag);
                break;
            case 17 :
                switchPicture(tag);
                break;
            case 18 :
                switchPicture(tag);
                break;
            case 19 :
                switchPicture(tag);
                break;
            case 20 :
                switchPicture(tag);
                break;
            case 21 :
                switchPicture(tag);
                break;
            case 22 :
                switchPicture(tag);
                break;
            case 23 :
                switchPicture(tag);
                break;
            case 24 :
                switchPicture(tag);
                break;
            case 25 :
                switchPicture(tag);
                break;
            case 26 :
                switchPicture(tag);
                break;
            case 27 :
                switchPicture(tag);
                break;
            case 28 :
                switchPicture(tag);
                break;
            case 29 :
                switchPicture(tag);
                break;
            case 30 :
                switchPicture(tag);
                break;
            case 31 :
                switchPicture(tag);
                break;
            case 32 :
                switchPicture(tag);
                break;
            case 33 :
                switchPicture(tag);
                break;
            case 34 :
                switchPicture(tag);
                break;
            case 35 :
                switchPicture(tag);
                break;
            case 36 :
                switchPicture(tag);
                break;
            case 37 :
                switchPicture(tag);
                break;
            case 38 :
                switchPicture(tag);
                break;
            case 39 :
                switchPicture(tag);
                break;
            case 40 :
                switchPicture(tag);
                break;
            case 41 :
                switchPicture(tag);
                break;
            case 42 :
                switchPicture(tag);
                break;
        }
    }

    private void switchPicture(int number) {
        if(Picture[number] == null){
            count++;
            if(count%2 == 0){
                ImageButton[number].setImageDrawable(getResources().getDrawable(R.drawable.test));//設定切換圖片
            }
            else{
                ImageButton[number].setImageDrawable(getResources().getDrawable(R.drawable.test1));//設定切換圖片
            }
        }
       Picture[number] = "F1";
    }
}
