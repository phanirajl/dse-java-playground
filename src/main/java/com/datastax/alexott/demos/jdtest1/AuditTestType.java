package com.datastax.alexott.demos.jdtest1;

import com.datastax.driver.mapping.annotations.UDT;

@UDT(keyspace="test", name="audit_type")
public class AuditTestType {
    int id;
    String t;

    public AuditTestType() {
    }

    public AuditTestType(int id, String t) {
        this.id = id;
        this.t = t;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getT() {
        return t;
    }

    public void setT(String t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "AuditTestType{" +
                "id=" + id +
                ", t='" + t + '\'' +
                '}';
    }
}
