/**
 * @author jagdeepjain
 *
 */
package org.jagdeep.example.simple.service;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
 
@DatabaseTable(tableName = "graphs")
public class Graphs {
    
    public Graphs() {
        // ORMLite needs a no-arg constructor 
    }
    
    @DatabaseField(generatedId = true)
    private int id;
    
    @DatabaseField
    private String resource_id;
    
    public int getId() {
        return this.id;
    }
    
    public String getResourceId() {    
        return this.resource_id;
    }
    
    
}