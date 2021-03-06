package org.hl7.v3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="StrucDoc.List", propOrder={"caption", "item"})
public class StrucDocList
{
  protected StrucDocCaption caption;

  @XmlElement(required=true)
  protected List<StrucDocItem> item;

  @XmlAttribute(name="ID")
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  @XmlID
  @XmlSchemaType(name="ID")
  protected String id;

  @XmlAttribute(name="language")
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  @XmlSchemaType(name="NMTOKEN")
  protected String language;

  @XmlAttribute(name="styleCode")
  @XmlSchemaType(name="NMTOKENS")
  protected List<String> styleCode;

  @XmlAttribute(name="listType")
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  protected String listType;

  public StrucDocCaption getCaption()
  {
    return this.caption;
  }

  public void setCaption(StrucDocCaption value)
  {
    this.caption = value;
  }

  public List<StrucDocItem> getItem()
  {
    if (this.item == null) {
      this.item = new ArrayList();
    }
    return this.item;
  }

  public String getID()
  {
    return this.id;
  }

  public void setID(String value)
  {
    this.id = value;
  }

  public String getLanguage()
  {
    return this.language;
  }

  public void setLanguage(String value)
  {
    this.language = value;
  }

  public List<String> getStyleCode()
  {
    if (this.styleCode == null) {
      this.styleCode = new ArrayList();
    }
    return this.styleCode;
  }

  public String getListType()
  {
    if (this.listType == null) {
      return "unordered";
    }
    return this.listType;
  }

  public void setListType(String value)
  {
    this.listType = value;
  }
}

