//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.11.06 at 11:40:49 AM CET 
//


package com.ancit.genxtools.dbc.model;


public class Signal
    extends BasicSignalType
{

    protected String notes;
    protected Consumer consumer;
    protected Value value;
    protected LabelSet labelSet;

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * Gets the value of the consumer property.
     * 
     * @return
     *     possible object is
     *     {@link Consumer }
     *     
     */
    public Consumer getConsumer() {
        return consumer;
    }

    /**
     * Sets the value of the consumer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Consumer }
     *     
     */
    public void setConsumer(Consumer value) {
        this.consumer = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link Value }
     *     
     */
    public Value getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Value }
     *     
     */
    public void setValue(Value value) {
        this.value = value;
    }

    /**
     * Gets the value of the labelSet property.
     * 
     * @return
     *     possible object is
     *     {@link LabelSet }
     *     
     */
    public LabelSet getLabelSet() {
        return labelSet;
    }

    /**
     * Sets the value of the labelSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link LabelSet }
     *     
     */
    public void setLabelSet(LabelSet value) {
        this.labelSet = value;
    }

}
