package org.hl7.v3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="POCD_MT000040.ParticipantRole", propOrder={"realmCode", "typeId", "templateId", "id", "code", "addr", "telecom", "playingDevice", "playingEntity", "scopingEntity"})
public class POCDMT000040ParticipantRole
{
  protected List<CS> realmCode;
  protected POCDMT000040InfrastructureRootTypeId typeId;
  protected List<II> templateId;
  protected List<II> id;
  protected CE code;
  protected List<AD> addr;
  protected List<TEL> telecom;
  protected POCDMT000040Device playingDevice;
  protected POCDMT000040PlayingEntity playingEntity;
  protected POCDMT000040Entity scopingEntity;

  @XmlAttribute(name="nullFlavor")
  protected List<String> nullFlavor;

  @XmlAttribute(name="classCode")
  protected List<String> classCode;

  public List<CS> getRealmCode()
  {
    if (this.realmCode == null) {
      this.realmCode = new ArrayList();
    }
    return this.realmCode;
  }

  public POCDMT000040InfrastructureRootTypeId getTypeId()
  {
    return this.typeId;
  }

  public void setTypeId(POCDMT000040InfrastructureRootTypeId value)
  {
    this.typeId = value;
  }

  public List<II> getTemplateId()
  {
    if (this.templateId == null) {
      this.templateId = new ArrayList();
    }
    return this.templateId;
  }

  public List<II> getId()
  {
    if (this.id == null) {
      this.id = new ArrayList();
    }
    return this.id;
  }

  public CE getCode()
  {
    return this.code;
  }

  public void setCode(CE value)
  {
    this.code = value;
  }

  public List<AD> getAddr()
  {
    if (this.addr == null) {
      this.addr = new ArrayList();
    }
    return this.addr;
  }

  public List<TEL> getTelecom()
  {
    if (this.telecom == null) {
      this.telecom = new ArrayList();
    }
    return this.telecom;
  }

  public POCDMT000040Device getPlayingDevice()
  {
    return this.playingDevice;
  }

  public void setPlayingDevice(POCDMT000040Device value)
  {
    this.playingDevice = value;
  }

  public POCDMT000040PlayingEntity getPlayingEntity()
  {
    return this.playingEntity;
  }

  public void setPlayingEntity(POCDMT000040PlayingEntity value)
  {
    this.playingEntity = value;
  }

  public POCDMT000040Entity getScopingEntity()
  {
    return this.scopingEntity;
  }

  public void setScopingEntity(POCDMT000040Entity value)
  {
    this.scopingEntity = value;
  }

  public List<String> getNullFlavor()
  {
    if (this.nullFlavor == null) {
      this.nullFlavor = new ArrayList();
    }
    return this.nullFlavor;
  }

  public List<String> getClassCode()
  {
    if (this.classCode == null) {
      this.classCode = new ArrayList();
    }
    return this.classCode;
  }
}

