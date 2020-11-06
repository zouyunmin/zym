package com.advanced.T5;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

public class ParseXmlDemo {
    public static void main(String[] args) {
        SAXReader reader=new SAXReader();
        try {
            Document document=reader.read("heroes.xml");
            Element element=document.getRootElement();
            parseXml(element);
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }

    public static void parseXml(Element element){
        List<Element> elementList=element.elements();
        for (int i = 0; i < elementList.size(); i++) {
            Element childElement=elementList.get(i);
            System.out.print(childElement.getName()+"\t");
            List<Attribute> attributeList=childElement.attributes();
//            List<Attribute> attributeList=elementList.get(i).attributes();
            for (int j=0;j<attributeList.size();j++){
                System.out.print(attributeList.get(j).getName()+"："+attributeList.get(j).getValue()+"\t");
            }
            System.out.println(childElement.getText());
            parseXml(childElement);
        }
    }
}
