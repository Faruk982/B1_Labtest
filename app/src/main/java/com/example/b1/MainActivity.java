package com.example.b1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    public EditText ShapeEditText, ColorEditText ;
    public Button button ;
    public TextView ShapeTextView , ColorTextView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });
        ShapeEditText = (EditText) findViewById(R.id.ShapeInput);
        ColorEditText=(EditText) findViewById(R.id.ColorInput);
        button=(Button)findViewById(R.id.btn);
        ShapeTextView=(TextView)findViewById(R.id.ShowShape);
        ColorTextView=(TextView)findViewById(R.id.ShowColor);
        button.setOnClickListener(v->{
         String shape=ShapeEditText.getText().toString();
         String color=ColorEditText.getText().toString();
         String shapeOUt="Invalid Shape";
         String colorOut="Invalid Color";

         if(shape.equals("Square")){
             Square square=new Square();
             shapeOUt=square.ShowShape();
         }
         else if(shape.equals("Circle")){
             Circle circle=new Circle();
             shapeOUt=circle.ShowShape();
         }
         if(color.equals("Red")){
             Red red=new Red();
             colorOut=red.showColor();
         }
         else if(color.equals("Green")){
             Green green=new Green();
             colorOut=green.showColor();
         }
         ShapeTextView.setText(shapeOUt);
         ColorTextView.setText(colorOut);
         /*hello*/
        });
    }
}