package com.example.trlaidps924assignment1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView display;

    Button zero_btn;
    Button one_btn;
    Button two_btn;
    Button three_btn;
    Button four_btn;
    Button five_btn;
    Button six_btn;
    Button seven_btn;
    Button eight_btn;
    Button nine_btn;

    Button plus_btn;
    Button minus_btn;
    Button multiply_btn;
    Button divide_btn;
    Button equals_btn;

    Button clear_btn;

    Button advanced_btn;

    LinearLayout advanced_menu;

    Button mod_btn;
    Button pow_btn;
    Button max_btn;
    Button min_btn;

    Calculator calculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.display);

        zero_btn = findViewById(R.id.zero_btn);
        zero_btn.setOnClickListener(this);

        one_btn = findViewById(R.id.one_btn);
        one_btn.setOnClickListener(this);

        two_btn = findViewById(R.id.two_btn);
        two_btn.setOnClickListener(this);

        three_btn = findViewById(R.id.three_btn);
        three_btn.setOnClickListener(this);

        four_btn = findViewById(R.id.four_btn);
        four_btn.setOnClickListener(this);

        five_btn = findViewById(R.id.five_btn);
        five_btn.setOnClickListener(this);

        six_btn = findViewById(R.id.six_btn);
        six_btn.setOnClickListener(this);

        seven_btn = findViewById(R.id.seven_btn);
        seven_btn.setOnClickListener(this);

        eight_btn = findViewById(R.id.eight_btn);
        eight_btn.setOnClickListener(this);

        nine_btn = findViewById(R.id.nine_btn);
        nine_btn.setOnClickListener(this);

        plus_btn = findViewById(R.id.plus_btn);
        plus_btn.setOnClickListener(this);

        minus_btn = findViewById(R.id.minus_btn);
        minus_btn.setOnClickListener(this);

        multiply_btn = findViewById(R.id.multiply_btn);
        multiply_btn.setOnClickListener(this);

        divide_btn = findViewById(R.id.divide_btn);
        divide_btn.setOnClickListener(this);

        equals_btn = findViewById(R.id.equals_btn);
        equals_btn.setOnClickListener(this);

        clear_btn = findViewById(R.id.clear_btn);
        clear_btn.setOnClickListener(this);

        advanced_btn = findViewById(R.id.advanced_btn);
        advanced_btn.setOnClickListener(this);

        advanced_menu = findViewById(R.id.advanced_menu);

        mod_btn = findViewById(R.id.mod_btn);
        mod_btn.setOnClickListener(this);

        pow_btn = findViewById(R.id.pow_btn);
        pow_btn.setOnClickListener(this);

        max_btn = findViewById(R.id.max_btn);
        max_btn.setOnClickListener(this);

        min_btn = findViewById(R.id.min_btn);
        min_btn.setOnClickListener(this);

        calculator = new Calculator();
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        String value;
        int result;

        Log.d("button id clicked", "Button with ID " + id + " clicked");

        display.setTextColor(ContextCompat.getColor(this, R.color.white));

        if (display.getText().toString().contains("=") || id == R.id.clear_btn) {
            calculator.characters.clear();
            display.setText("");
        }

        if (id == R.id.zero_btn) {
            value = zero_btn.getText().toString();
            calculator.push(value);
            display.append(value + " ");
        } else if (id == R.id.one_btn) {
            value = one_btn.getText().toString();
            calculator.push(value);
            display.append(value + " ");
        } else if (id == R.id.two_btn) {
            value = two_btn.getText().toString();
            calculator.push(value);
            display.append(value + " ");
        } else if (id == R.id.three_btn) {
            value = three_btn.getText().toString();
            calculator.push(value);
            display.append(value + " ");
        } else if (id == R.id.four_btn) {
            value = four_btn.getText().toString();
            calculator.push(value);
            display.append(value + " ");
        } else if (id == R.id.five_btn) {
            value = five_btn.getText().toString();
            calculator.push(value);
            display.append(value + " ");
        } else if (id == R.id.six_btn) {
            value = six_btn.getText().toString();
            calculator.push(value);
            display.append(value + " ");
        } else if (id == R.id.seven_btn) {
            value = seven_btn.getText().toString();
            calculator.push(value);
            display.append(value + " ");
        } else if (id == R.id.eight_btn) {
            value = eight_btn.getText().toString();
            calculator.push(value);
            display.append(value + " ");
        } else if (id == R.id.nine_btn) {
            value = nine_btn.getText().toString();
            calculator.push(value);
            display.append(value + " ");
        } else if (id == R.id.plus_btn) {
            value = plus_btn.getText().toString();
            calculator.push(value);
            display.append(value + " ");
        } else if (id == R.id.minus_btn) {
            value = minus_btn.getText().toString();
            calculator.push(value);
            display.append(value + " ");
        } else if (id == R.id.multiply_btn) {
            value = multiply_btn.getText().toString();
            calculator.push(value);
            display.append(value + " ");
        } else if (id == R.id.divide_btn) {
            value = divide_btn.getText().toString();
            calculator.push(value);
            display.append(value + " ");
        } else if (id == R.id.equals_btn) {
            value = equals_btn.getText().toString();
            result = calculator.calculate();
            display.append(" " + value);

            if (result == -999) {
                display.append(" Not an Operator");
                display.setTextColor(ContextCompat.getColor(this, R.color.light_pink));
            } else {
                display.append(" " + result);
            }
        } else if (id == R.id.advanced_btn) {
            if (advanced_menu.getVisibility() == View.INVISIBLE) {
                advanced_menu.setVisibility(View.VISIBLE);
                advanced_btn.setText(getResources().getString(R.string.standard_btn));
            } else {
                advanced_menu.setVisibility(View.INVISIBLE);
                advanced_btn.setText(getResources().getString(R.string.advanced_btn));
            }
        } else if (id == R.id.mod_btn) {
            value = mod_btn.getText().toString();
            calculator.push(value);
            display.append(value + " ");
        } else if (id == R.id.pow_btn) {
            value = pow_btn.getText().toString();
            calculator.push(value.toLowerCase(Locale.ROOT));
            display.append(value + " ");
        } else if (id == R.id.max_btn) {
            value = max_btn.getText().toString();
            calculator.push(value.toLowerCase(Locale.ROOT));
            display.append(value + " ");
        } else if (id == R.id.min_btn) {
            value = min_btn.getText().toString();
            calculator.push(value.toLowerCase(Locale.ROOT));
            display.append(value + " ");
        }
    }
}