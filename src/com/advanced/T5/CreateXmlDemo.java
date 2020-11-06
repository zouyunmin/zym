package com.advanced.T5;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CreateXmlDemo {
    public static void main(String[] args) {
        Document document= DocumentHelper.createDocument();
        //创建根节点
        Element element=DocumentHelper.createElement("heroes");
        document.setRootElement(element);

        List<Hero> list=new ArrayList<>();
        list.add(new Hero("1","邓招良","坦克","15000"));
        list.add(new Hero("2","邓扬","战士","8000"));
        list.add(new Hero("3","妲己","法师","6000"));
        list.add(new Hero("4","王昭君","法师","6000"));

        //子节点
        for (int i = 0; i < list.size(); i++) {
            Element heroElement=DocumentHelper.createElement("hero");
            heroElement.addAttribute("id",list.get(i).getId());
            heroElement.addAttribute("name",list.get(i).getName());
            heroElement.addAttribute("type",list.get(i).getType());
            heroElement.addAttribute("blood",list.get(i).getBlood());
            heroElement.setText("小邓邓");

            Element skill=DocumentHelper.createElement("Skill");
            skill.setText("打爆你");
            heroElement.add(skill);

            element.add(heroElement);
        }

        //创建outputFormat，用于格式化输出
        OutputFormat outputFormat=OutputFormat.createPrettyPrint();
        outputFormat.setEncoding("UTF-8");

        try {
            FileWriter writer=new FileWriter(new File("heroes.xml"));
            XMLWriter xmlWriter=new XMLWriter(writer,outputFormat);
            xmlWriter.write(document);
            xmlWriter.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
