package com.iba.project.entity.field;

public class Field<K>
{
    K calls;
    K internet;

    public Field(K calls,K internet)
    {
        this.calls=calls;
        this.internet=internet;
    }

    public Field(Field<K> field)
    {
        this.calls=field.calls;
        this.internet=field.internet;
    }

    public K getCalls() {
        return calls;
    }

    public K getInternet() {
        return internet;
    }

    @Override
    public String toString() {
        return "calls: "+calls.toString()+" internet: "+internet.toString();
    }

    public void setCalls(K calls) {
        this.calls = calls;
    }

    public void setInternet(K internet) {
        this.internet = internet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Field)) return false;

        Field<?> field = (Field<?>) o;

        if (!getCalls().equals(field.getCalls())) return false;
        return getInternet().equals(field.getInternet());
    }

    @Override
    public int hashCode() {
        int result = getCalls().hashCode();
        result = 31 * result + getInternet().hashCode();
        return result;
    }
}
