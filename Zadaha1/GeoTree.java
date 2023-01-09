package JavaHomeWork.Zadaha1;

import java.util.ArrayList;

public class GeoTree {

    private ArrayList<Node> tree = new ArrayList<>();
    public ArrayList<Node> getTree() {
        return tree;
    }

    public void appendPerentChild(Person parent, Person children) {
        tree.add(new Node(parent, Relationship.parent, children));
        tree.add(new Node(children, Relationship.children, parent));
    }

    public void appendVifeHusbent(Person wife, Person husband) {
        tree.add(new Node(wife, Relationship.wife, husband));
        tree.add(new Node(husband, Relationship.husband, wife));
    }
}