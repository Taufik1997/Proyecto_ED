package arlf;

import java.util.ArrayList;

public class Node {
    ArrayList<Node> children;
    Node father;
    ArrayList<Integer> keys;
    int order;
    int tree_level;

    public ArrayList<Node> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<Node> children) {
        this.children = children;
    }

    public Node getFather() {
        return father;
    }

    public void setFather(Node father) {
        this.father = father;
    }

    public ArrayList<Integer> getIntegers() {
        return keys;
    }

    public void setIntegers(ArrayList<Integer> keys) {
        this.keys = keys;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public int getTree_level() {
        return tree_level;
    }

    public void setTree_level(int tree_level) {
        this.tree_level = tree_level;
    }

    @Override
    public String toString() {
        return "Node{" + "children=" + children + ", father=" + father + ", keys=" + keys + ", order=" + order + ", tree_level=" + tree_level + '}';
    }
    
    public int getChildCount(){
        return children.size();
    }
    
    public boolean isRoot(){
        if(tree_level == 1){
            return true;
        }
        return false;
    }
    
    public boolean isLeaf(){
        if(tree_level > 1){
            return true;
        }
        return false;
    }
}
