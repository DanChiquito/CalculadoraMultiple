package myapp.selectos.temas.chico.calculadoramultiple;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private TextView txtvNum;
    private double a;
    private double b;
    private double resultado;
    private String operador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtvNum = findViewById(R.id.txtvNum);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu_opciones, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.mAcercaDe:
                Intent intActAcercaDe = new Intent(this,Acercade.class);
                startActivity(intActAcercaDe);
                break;

            case R.id.mSalir:
                finish();
                System.exit(0);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public void bCero(View v) {
        txtvNum = findViewById(R.id.txtvNum);
        txtvNum.setText(txtvNum.getText() + "0");
    }

    public void bUno(View v) {
        txtvNum = findViewById(R.id.txtvNum);
        txtvNum.setText(txtvNum.getText() + "1");
    }

    public void bDos(View v) {
        txtvNum = findViewById(R.id.txtvNum);
        txtvNum.setText(txtvNum.getText() + "2");
    }

    public void bTres(View v) {
        txtvNum = findViewById(R.id.txtvNum);
        txtvNum.setText(txtvNum.getText() + "3");
    }

    public void bCuatro(View v) {
        txtvNum = findViewById(R.id.txtvNum);
        txtvNum.setText(txtvNum.getText() + "4");
    }

    public void bCinco(View v) {
        txtvNum =  findViewById(R.id.txtvNum);
        txtvNum.setText(txtvNum.getText() + "5");
    }

    public void bSeis(View v) {
        txtvNum = findViewById(R.id.txtvNum);
        txtvNum.setText(txtvNum.getText() + "6");
    }

    public void bSiete(View v) {
        txtvNum = findViewById(R.id.txtvNum);
        txtvNum.setText(txtvNum.getText() + "7");
    }

    public void bOcho(View v) {
        txtvNum =  findViewById(R.id.txtvNum);
        txtvNum.setText(txtvNum.getText() + "8");
    }

    public void bNueve(View v) {
        txtvNum =  findViewById(R.id.txtvNum);
        txtvNum.setText(txtvNum.getText() + "9");
    }

    public void bPunto(View v) {
        txtvNum = findViewById(R.id.txtvNum);
        txtvNum.setText(txtvNum.getText() + ".");
    }

    public void BorrrUltimo(View v)

    {
        if (!txtvNum.getText().toString().equals(""))
        {
            txtvNum.setText(txtvNum.getText().subSequence(0,txtvNum.getText().length() -1)+"");
        }
    }
    public void BorrarTodo(View v)
    {
        a = 0.0;
        b = 0.0;
        txtvNum = findViewById(R.id.txtvNum);
        txtvNum.setText("");
    }




    public void onClickCaptureNumberOne(View v)
    {
        txtvNum = findViewById(R.id.txtvNum);
        a = Double.parseDouble(txtvNum.getText().toString());
        txtvNum.setText("");
    }

    public void Sumar(View v)
    {
        operador = ("+");
        onClickCaptureNumberOne(v);
    }
    public void Restar(View v)
    {
        operador = ("-");
        onClickCaptureNumberOne(v);
    }
    public void Multiplicar(View v)
    {
        operador = ("x");
        onClickCaptureNumberOne(v);
    }
    public void Dividir(View v)
    {
        operador = ("/");
        onClickCaptureNumberOne(v);
    }

    public void bIgual(View v)
    {
        try
        {
            txtvNum = findViewById(R.id.txtvNum);
            b = Double.parseDouble(txtvNum.getText().toString());
            if (operador.equals("+"))
            {
                resultado = a+b;
            }
            else if (operador.equals("-"))
            {
                resultado = a-b;
            }
            else if (operador.equals("x"))
            {
                resultado = a*b;
            }
            else if (operador.equals("/"))
            {
                resultado = a/b;
            }else if (operador.equals("exp"))
            {
                b = Double.parseDouble(txtvNum.getText().toString());
                txtvNum.setText("");
                resultado = Math.pow(a,b);
            }
            txtvNum.setText(""+resultado);
        }
        catch (Exception er)
        {

        }

    }

    public void expn(View v)
    {
        operador = "exp";
        txtvNum = findViewById(R.id.txtvNum);
        try
        {
            a = Double.parseDouble(txtvNum.getText().toString());
            txtvNum.setText("");
        }
        catch (NumberFormatException nfe)
        {

        }
    }

    public void Rnd (View v)
    {
        for (int i = 0; i <= 100; i++)
        {
            int na = (int)Math.floor(Math.random()+(100-(1+1))+(1));
            txtvNum.setText(String.valueOf(na));
        }
    }

    public void Raiz(View v)
    {
        txtvNum = findViewById(R.id.txtvNum);
        try
        {
            a = Double.parseDouble(txtvNum.getText().toString());
            resultado = Math.sqrt(a);
            txtvNum.setText(String.valueOf(resultado));
        }
        catch (NumberFormatException nfe)
        {

        }
    }

    public void ExpCuadrado(View v)
    {
        txtvNum = findViewById(R.id.txtvNum);
        try
        {
            a = Double.parseDouble(txtvNum.getText().toString());
            resultado = Math.pow(a,2);
            txtvNum.setText(String.valueOf(resultado));
        }
        catch (NumberFormatException nfe)
        {

        }
    }

    public void ExpCubo(View v)
    {
        txtvNum = findViewById(R.id.txtvNum);
        try
        {
            a = Double.parseDouble(txtvNum.getText().toString());
            resultado = Math.pow(a,3);
            txtvNum.setText(String.valueOf(resultado));
        }
        catch (NumberFormatException nfe)
        {

        }
    }

    public void Seno(View v)
    {
        txtvNum = findViewById(R.id.txtvNum);
        try
        {
            a = Double.parseDouble(txtvNum.getText().toString());
            double rd = Math.toRadians(a);
            resultado = Math.sin(rd);
            txtvNum.setText(String.valueOf(resultado));
        }
        catch (NumberFormatException nfe)
        {

        }
    }

    public void Cos(View v)
    {
        txtvNum = findViewById(R.id.txtvNum);
        try
        {
            a = Double.parseDouble(txtvNum.getText().toString());
            double rd = Math.toRadians(a);
            resultado = Math.cos(rd);
            txtvNum.setText(String.valueOf(resultado));
        }
        catch (NumberFormatException nfe)
        {

        }
    }

    public void Tan(View v)
    {
        txtvNum = findViewById(R.id.txtvNum);
        try
        {
            a = Double.parseDouble(txtvNum.getText().toString());
            double rd = Math.toRadians(a);
            resultado = Math.tan(rd);
            txtvNum.setText(String.valueOf(resultado));
        }
        catch (NumberFormatException nfe)
        {

        }
    }

    public void Factorial(View v)
    {
        txtvNum = findViewById(R.id.txtvNum);
        int fact = 1;
        int x;
        try
        {
            for (x = 1; x <= a; x++)
            {
                fact = fact * x;
            }
            txtvNum.setText(String.valueOf(resultado));
        }
        catch (NumberFormatException nfe)
        {

        }

    }
}
