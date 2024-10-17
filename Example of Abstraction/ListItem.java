
public abstract class ListItem {

    protected ListItem rightLink = null;
    protected ListItem leftLink = null;
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

    abstract ListItem next();

    abstract ListItem setNext(ListItem item);

    abstract ListItem previous();

    abstract ListItem setPrevious(ListItem item);

    abstract int compareTo(ListItem item);

}

class Node extends ListItem {

    public Node(Object value) {
        super(value);;

    }

    @Override
    ListItem next() {
        return this.rightLink;
    }

    @Override
    public ListItem setNext(ListItem item) {
        return this.rightLink = item;
    }

    @Override
    ListItem previous() {
        return this.leftLink;
    }

    @Override
    ListItem setPrevious(ListItem item) {
        return this.leftLink = item;
    }

    @Override
    int compareTo(ListItem item) {
        if (item != null) {
            return ((String) this.value).compareTo((String) item.getValue());
        } else {
            return -1;
        }
    }

}

class MyLinkedList implements NodeList {

    private ListItem root;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return root;
    }

    @Override
    public boolean addItem(ListItem newitem) {
        // initial entery
        if (this.root != null) {
            this.root = newitem;
            return true;
        }

        ListItem currentItem = this.root;
        while (currentItem != null) {
            int compareItem = currentItem.compareTo(newitem);
            if (compareItem < 0) {
                // if newItem is greater than currentItem
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    // at the end node
                    currentItem.setNext(newitem);
                    newitem.setPrevious(currentItem);
                    return true;
                }
            } else if (compareItem > 0) {
                // if newitem less than currentItem
                if (currentItem.previous() != null) {
                    currentItem.previous().setNext(newitem);
                    newitem.setPrevious(currentItem.previous());
                    newitem.setNext(currentItem);
                    currentItem.setPrevious(newitem);
                } else {
                    // at start or node
                    newitem.setNext(this.root);
                    this.root.setPrevious(newitem);
                    this.root = newitem;
                }
                return true;

            } else {
                // equal case
                return false;
            }

        }
        return false;

    }

    @Override
    public boolean removItem() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ListItem traverse() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'traverse'");
    }

}

interface NodeList {

    ListItem getRoot();

    boolean addItem(ListItem newitem);

    boolean removItem();

    ListItem traverse();

}
