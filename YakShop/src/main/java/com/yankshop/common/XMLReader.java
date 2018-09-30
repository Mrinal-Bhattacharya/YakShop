package com.yankshop.common;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.yankshop.domain.Herd;
import com.yankshop.domain.LabYak;

public class XMLReader {
	public Herd getHerd(String file) throws YankShopException {
		try {
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(ClassLoader.getSystemResourceAsStream(file));
			doc.getDocumentElement().normalize();
			NodeList nList = doc.getElementsByTagName("labyak");
			Herd herd=new Herd();
			for (int temp = 0; temp < nList.getLength(); temp++) {
				 Node nNode = nList.item(temp);
	                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
	                    Element eElement = (Element) nNode;
	                    String name =  eElement.getAttribute("name");
	                    double age =  Double.parseDouble(eElement.getAttribute("age"));
						herd.add(new LabYak(name,age));
	                }
			}
			return herd;
		} catch (Exception e) {
			throw new YankShopException(e.getMessage());
		}
	}
}
