
public class BinarySearchTree {

    Node root;

    BinarySearchTree() {

        root = null;
    }

    public void insert(int data) {
        root = insertRecord(root, data);
    }

    public Node insertRecord(Node root, int data) {
        if(root==null){
            root = new Node(data);
        }
        else {
            if(root.value > data) {
                root.left = insertRecord(root.left, data);
            }
            else if (root.value < data) {
                root.right = insertRecord(root.right, data);
            }
        }
        return root;
    }


    public void delete(int data) {

        root = deleteRecord(root, data);
    }

    public Node deleteRecord(Node root, int data) {
        if(root == null) {
            return root;
        }
        if(root.value < data) {
            root.right = deleteRecord(root.right, data);
        }
        else if(root.value > data) {
            root.left = deleteRecord(root.left, data);
        }
        else {

            if (root.left == null) {
                return root.right;
            }
            else if (root.right == null) {
                return root.left;
            }
            root.value = minValue(root.right);
            root.right = deleteRecord(root.right, root.value);
        }
        return root;
    }

    public int minValue(Node node) {
        int minValue = node.value;

        while (node.left != null) {
            minValue = node.left.value;
            node = node.left;
        }
        return minValue;
    }

    public void inOrder(Node start) {
        if(start!= null) {
            inOrder(start.left);
            System.out.println(start.value);
            inOrder(start.right);
        }
    }

    public void preOrder(Node start) {
        if(start!=null) {
            System.out.println(start.value);
            preOrder(start.left);
            preOrder(start.right);
        }
    }

    public void postOrder(Node start) {
        if (start!=null) {
            postOrder(start.left);
            postOrder(start.right);
            System.out.println(start.value);
        }
    }


    public boolean search(Node start, int input) {
        if(start == null)
            return false;
        if(start.value == input)
            return true;
        else {
            if(start.value > input) {
                return search(start.left, input);
            }
            else {
                return search(start.right, input);
            }
        }
    }
//    public void sendMessage(Node node) {
//        if(node.left == null) {
//            return
//        }
//
//    }

    public static void main(String args[]) {
        //int data[] = {1,2,3,4,5,6,7,8,9,10};
        int data[] = {1,2,3,4,5};
        BinarySearchTree bst = new BinarySearchTree();
        for (int i : data)
        {
            bst.insert(i);
        }
        bst.inOrder(bst.root);

//        bst.delete(3);
//        bst.inOrder(bst.root);
//        bst.preOrder(bst.root);
//        bst.postOrder(bst.root);

    }

}