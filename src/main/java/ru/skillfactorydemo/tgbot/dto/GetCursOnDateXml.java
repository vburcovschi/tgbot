package ru.skillfactorydemo.tgbot.dto;
import lombok.Data;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlRootElement(name = "GetCursOnDateXML", namespace = "http://web.cbr.ru/")
//@XmlRootElement(name = "GetCursOnDateXML") //корневой элемент
@Data
@XmlAccessorType(XmlAccessType.FIELD)
public //Геттеры и сеттеры
class GetCursOnDateXml {
    @XmlElement(name = "On_date", required = true, namespace = "http://web.cbr.ru/") //Указание на то, в каком теге XML должно быть данное поле
    @XmlSchemaType(name = "dateTime") //Указание типа данных в XML
    protected XMLGregorianCalendar onDate;
}
