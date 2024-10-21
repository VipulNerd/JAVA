
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
    public boolean removeItem(ListItem item) {
        if (item != null) {
            ListItem currentItem = this.root;
            while (currentItem != null) {
                int comparison = currentItem.compareTo(item);
                if (comparison == 0) {
                    if (currentItem == this.root) {
                        this.root = currentItem.next();
                    } else {
                        currentItem.previous().setNext(currentItem.next());
                        if (currentItem.next() != null) {
                            currentItem.next().setPrevious(currentItem.previous());
                        }
                    }
                    return true;

                } else if (comparison < 0) {
                    currentItem = currentItem.next();
                } else {
                    return false;
                }
            }

        }
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if (this.root == null) {
            System.out.println("This List is empty");
        } else {
            ListItem currentItem = this.root;
            if (currentItem != null) {
                System.out.println(currentItem.getValue());
                currentItem = currentItem.next();

            }
        }
    }

}

interface NodeList {

    ListItem getRoot();

    boolean addItem(ListItem newitem);

    boolean removeItem(ListItem item);

    void traverse(ListItem root);

}

class SearchTree implements NodeList {

    private ListItem root = null;

    // Constructor
    public SearchTree(ListItem root) {
        this.root = root;
    }

    // Getter for root
    public ListItem getRoot() {
        return this.root;
    }

    // Add an item to the binary search tree
    public boolean addItem(ListItem newItem) {
        if (this.root == null) {
            // The tree is empty, so the root becomes the newItem
            this.root = newItem;
            return true;
        }

        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(newItem);
            if (comparison < 0) {
                // newItem is greater, move right
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    currentItem.setNext(newItem);
                    return true;
                }
            } else if (comparison > 0) {
                // newItem is smaller, move left
                if (currentItem.previous() != null) {
                    currentItem = currentItem.previous();
                } else {
                    currentItem.setPrevious(newItem);
                    return true;
                }
            } else {
                // Equal, don't add
                return false;
            }
        }
        return false;
    }

    // Remove an item from the tree
    public boolean removeItem(ListItem item) {
        if (item != null) {
            ListItem currentItem = this.root;
            ListItem parentItem = currentItem;

            while (currentItem != null) {
                int comparison = currentItem.compareTo(item);
                if (comparison == 0) {
                    // Found the item to remove
                    performRemoval(currentItem, parentItem);
                    return true;
                } else if (comparison < 0) {
                    parentItem = currentItem;
                    currentItem = currentItem.next();
                } else {
                    parentItem = currentItem;
                    currentItem = currentItem.previous();
                }
            }
        }
        return false;
    }

    // Private helper method to perform removal
    private void performRemoval(ListItem item, ListItem parent) {
        // If item has no children
        if (item.next() == null && item.previous() == null) {
            if (parent.next() == item) {
                parent.setNext(null);
            } else {
                parent.setPrevious(null);
            }
        } else if (item.previous() == null) {
            if (parent.next() == item) {
                parent.setNext(item.next());
            } else {
                parent.setPrevious(item.next());
            }
        } else if (item.next() == null) {
            if (parent.next() == item) {
                parent.setNext(item.previous());
            } else {
                parent.setPrevious(item.previous());
            }
        }
    }

    // Traverse the binary tree (Inorder)
    public void traverse(ListItem root) {
        if (root != null) {
            traverse(root.previous());
            System.out.println(root.getValue());
            traverse(root.next());
        }
    }

}
