package com.java.model;

import freemarker.template.Configuration;
import freemarker.template.Template;

import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

public class TestMain {
    public static void main(String[] args) throws Exception{
        Configuration configuration=new Configuration();
        File f = new File("template.ftl");
        f.createNewFile();
      //  configuration.setClassForTemplateLoading(StudentTemplate.class,"com.java.model");
        Template template = null;
        try {
             template=configuration.getTemplate("template.ftl");
        } catch (IOException e) {
            e.printStackTrace();
        }
        Writer writer=new OutputStreamWriter(System.out);
       // HashMap data= (HashMap) StudentTemplate.getData();
        template.process(StudentTemplate.getData(),writer);
        writer.flush();

    }
}
