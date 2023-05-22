public class Main {
    public static void main(String[] args) throws Exception {
        BinaryTree tree = new BinaryTree();

        tree.newNode(20);
        tree.newNode(2);
        tree.newNode(25);
        tree.newNode(37);
        tree.newNode(16);

        System.out.print("\ninOrder   : ");
        tree.inOrder(tree.root);

        System.out.print("\n\npreOrder  : ");
        tree.preOrder(tree.root);

        System.out.print("\n\npostOrder : ");
        tree.postOrder(tree.root);
    }
}
