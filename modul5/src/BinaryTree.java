public class BinaryTree {
    public Node root;

    public Node newNode(Node root, Node newData){
        if(root == null){
            root = newData;
            return root;
        }

        if(newData.data < root.data){
            root.left = newNode(root.left, newData);
        }else{
            root.right = newNode(root.right, newData);
        }
        return root;
    }

    public void newNode(int data){
        root = newNode(root, new Node(data));
    }

    public void inOrder(Node node){
        if(node != null){
            inOrder(node.left);
            System.out.print(node.data + "   ");
            inOrder(node.right);
        }
    }

    public void preOrder(Node node){
        if (node != null){
            System.out.print(node.data + "   ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    public void postOrder(Node node){
        if (node != null){
            preOrder(node.left);
            preOrder(node.right);
            System.out.print(node.data + "   ");
        }
    }
}
