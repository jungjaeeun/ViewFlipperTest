package kr.hs.emirim.wodms5772.viewflippertest;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    ViewFlipper viewFlip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button butPrev=(Button)findViewById(R.id.but_prev);
        Button butNext=(Button)findViewById(R.id.but_next);
        butPrev.setOnClickListener(this);
        butNext.setOnClickListener(this);
        viewFlip=(ViewFlipper)findViewById(R.id.view_flip);
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) { //v가 id랑 같나 봄
        switch (v.getId()){
            case R.id.but_prev: viewFlip.showPrevious(); break; //이전화면 보여주는 것
            case R.id.but_next: viewFlip.showNext(); break; //다음화면 보여주는 것
        }
    }
}
