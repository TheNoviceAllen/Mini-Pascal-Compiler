/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package syntaxtree;

import scanner.Keywords;

/**
 * Represents a value or number in an expression.
 * @author Allen Burgett, based on code by Erik Steinmetz
 */
public class ValueNode extends ExpressionNode {
    
    /** The attribute associated with this node. */
    private String attribute;
    
    /**
     * Creates a ValueNode with the given attribute.
     * @param attr The attribute for this value node.
     * @param type, Integer or Real.
     */
    public ValueNode( String attr, Keywords type) {
        this.attribute = attr;
        super.type = type;
    }
    
    /** 
     * Returns the attribute of this node.
     * @return The attribute of this ValueNode.
     */
    public String getAttribute() { return( this.attribute);}
    
    /**
     * Returns the attribute as the description of this node.
     * @return The attribute String of this node.
     */
    @Override
    public String toString() {
        return( attribute);
    }
    
    @Override
    public String indentedToString( int level) {
        String answer = this.indentation(level);
        answer += "Value: " + this.attribute + " of type " + super.type + "\n";
        return answer;
    }

    @Override
    public boolean equals( Object o) {
        boolean answer = false;
        if( o instanceof ValueNode) {
            ValueNode other = (ValueNode)o;
            if( this.attribute.equals( other.attribute)) answer = true;
        }
        return answer;
    }    
}
