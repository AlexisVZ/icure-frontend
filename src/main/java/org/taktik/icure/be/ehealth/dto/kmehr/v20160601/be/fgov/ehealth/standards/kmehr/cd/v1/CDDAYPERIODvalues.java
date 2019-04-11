/*
 * Copyright (C) 2018 Taktik SA
 *
 * This file is part of iCureBackend.
 *
 * iCureBackend is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License version 2 as published by
 * the Free Software Foundation.
 *
 * iCureBackend is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with iCureBackend.  If not, see <http://www.gnu.org/licenses/>.
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.09 at 09:24:47 AM CET 
//


package org.taktik.icure.be.ehealth.dto.kmehr.v20160601.be.fgov.ehealth.standards.kmehr.cd.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CD-DAYPERIODvalues.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CD-DAYPERIODvalues">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="afterbreakfast"/>
 *     &lt;enumeration value="afterdinner"/>
 *     &lt;enumeration value="afterlunch"/>
 *     &lt;enumeration value="aftermeal"/>
 *     &lt;enumeration value="afternoon"/>
 *     &lt;enumeration value="beforebreakfast"/>
 *     &lt;enumeration value="beforedinner"/>
 *     &lt;enumeration value="beforelunch"/>
 *     &lt;enumeration value="betweenbreakfastandlunch"/>
 *     &lt;enumeration value="betweendinnerandsleep"/>
 *     &lt;enumeration value="betweenlunchanddinner"/>
 *     &lt;enumeration value="betweenmeals"/>
 *     &lt;enumeration value="evening"/>
 *     &lt;enumeration value="morning"/>
 *     &lt;enumeration value="night"/>
 *     &lt;enumeration value="thehourofsleep"/>
 *     &lt;enumeration value="duringbreakfast"/>
 *     &lt;enumeration value="duringlunch"/>
 *     &lt;enumeration value="duringdinner"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CD-DAYPERIODvalues")
@XmlEnum
public enum CDDAYPERIODvalues {

    @XmlEnumValue("afterbreakfast")
    AFTERBREAKFAST("afterbreakfast"),
    @XmlEnumValue("afterdinner")
    AFTERDINNER("afterdinner"),
    @XmlEnumValue("afterlunch")
    AFTERLUNCH("afterlunch"),
    @XmlEnumValue("aftermeal")
    AFTERMEAL("aftermeal"),
    @XmlEnumValue("afternoon")
    AFTERNOON("afternoon"),
    @XmlEnumValue("beforebreakfast")
    BEFOREBREAKFAST("beforebreakfast"),
    @XmlEnumValue("beforedinner")
    BEFOREDINNER("beforedinner"),
    @XmlEnumValue("beforelunch")
    BEFORELUNCH("beforelunch"),
    @XmlEnumValue("betweenbreakfastandlunch")
    BETWEENBREAKFASTANDLUNCH("betweenbreakfastandlunch"),
    @XmlEnumValue("betweendinnerandsleep")
    BETWEENDINNERANDSLEEP("betweendinnerandsleep"),
    @XmlEnumValue("betweenlunchanddinner")
    BETWEENLUNCHANDDINNER("betweenlunchanddinner"),
    @XmlEnumValue("betweenmeals")
    BETWEENMEALS("betweenmeals"),
    @XmlEnumValue("evening")
    EVENING("evening"),
    @XmlEnumValue("morning")
    MORNING("morning"),
    @XmlEnumValue("night")
    NIGHT("night"),
    @XmlEnumValue("thehourofsleep")
    THEHOUROFSLEEP("thehourofsleep"),
    @XmlEnumValue("duringbreakfast")
    DURINGBREAKFAST("duringbreakfast"),
    @XmlEnumValue("duringlunch")
    DURINGLUNCH("duringlunch"),
    @XmlEnumValue("duringdinner")
    DURINGDINNER("duringdinner");
    private final String value;

    CDDAYPERIODvalues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CDDAYPERIODvalues fromValue(String v) {
        for (CDDAYPERIODvalues c: CDDAYPERIODvalues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}