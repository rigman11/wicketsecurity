package com.mycompany;


import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;


public class Page2 extends MyBasePage
{
    public Page2()
    {
        add(new Label("label2", "This is Page2"));
    }
}
