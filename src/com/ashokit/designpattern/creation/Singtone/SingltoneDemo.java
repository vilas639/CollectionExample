package com.ashokit.designpattern.creation.Singtone;

import java.io.Serializable;

public class SingltoneDemo implements Cloneable, Serializable {
    private  static SingltoneDemo singltoneinstance;

    private SingltoneDemo()
    {
        if(singltoneinstance!=null)
        {
            throw new RuntimeException("singltone not brake");
        }
    }


    public static SingltoneDemo getInstance()
    {
        if(singltoneinstance==null)
        {
            synchronized (SingltoneDemo.class)
            {
                if(singltoneinstance==null)
                {
                    singltoneinstance=new SingltoneDemo();
                }
            }
        }

        return singltoneinstance;
    }

    public Object onResolve()
    {
        return singltoneinstance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return singltoneinstance;
    }
}
