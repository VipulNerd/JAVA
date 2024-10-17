
public abstract class ListItem {

    protected ListItem rightLink = null;
    protected ListItem lefttLink = null;
    protected Object value;

    public ListItem(Object value) {
        this.value = value;

    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    abstract void next();

    abstract void setNext();

    abstract void previous();

    abstract void setPrevious();

}

class Node extends ListItem {

    public Node(Object value) {
        super(value);;

    }

    @Override
    void next() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    void setNext() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    void previous() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    void setPrevious() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
