package com.bdjobs.fragmenttransection;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    android.app.FragmentManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        manager = getFragmentManager();
    }

    public void addA(View view)
    {
        FragmentA fa = new FragmentA();
        android.app.FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.group,fa,"A");
        transaction.commit();

    }
    public void addB(View view)
    {
        FragmentB fb = new FragmentB();
        android.app.FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.group,fb,"B");
        transaction.commit();

    }
    public void removeA(View view)
    {
        FragmentA fa = (FragmentA) manager.findFragmentByTag("A");
        android.app.FragmentTransaction transaction = manager.beginTransaction();
        if(fa!=null)
        {
            transaction.remove(fa);
            transaction.commit();
        }
        else
        {
            Toast.makeText(MainActivity.this, "Fragment A is not Available yet", Toast.LENGTH_SHORT).show();
        }

    }
    public void removeB(View view)
    {
        FragmentB fb = (FragmentB) manager.findFragmentByTag("B");
        android.app.FragmentTransaction transaction = manager.beginTransaction();
        if(fb!=null)
        {
            transaction.remove(fb);
            transaction.commit();
        }
        else
        {
            Toast.makeText(MainActivity.this, "Fragment B is not Available yet", Toast.LENGTH_SHORT).show();
        }

    }
    public void attachA(View view)
    {
        FragmentA fa = (FragmentA) manager.findFragmentByTag("A");
        android.app.FragmentTransaction transaction = manager.beginTransaction();
        if(fa!=null)
        {
            transaction.attach(fa);
            transaction.commit();
        }
        else
        {
            Toast.makeText(MainActivity.this, "Fragment A is not Available yet", Toast.LENGTH_SHORT).show();
        }

    }
    public void deAttachA(View view)
    {
        FragmentA fa = (FragmentA) manager.findFragmentByTag("A");
        android.app.FragmentTransaction transaction = manager.beginTransaction();
        if(fa!=null)
        {
            transaction.detach(fa);
            transaction.commit();
        }
        else
        {
            Toast.makeText(MainActivity.this, "Fragment A is not Available yet", Toast.LENGTH_SHORT).show();
        }

    }
    public void replaceAbyB(View view)
    {
        FragmentB fb = new FragmentB();
        android.app.FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.group,fb,"B");
        transaction.commit();

    }
    public void replaceBbyA(View view)
    {
        FragmentA fa = new FragmentA();
        android.app.FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.group,fa,"A");
        transaction.commit();

    }


}
