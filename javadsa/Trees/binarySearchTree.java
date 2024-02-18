package Trees;

class binarySearchTree {
    public class Node{
        private int value;
        private int height;
        private Node left;
        private Node right;

        public Node(int value){
            this.value = value;
        }

        public int getvalue(){
            return value;
        }
    }

    private Node root;

    public binarySearchTree(){

    }

    public int height(Node node){
        if(node == null) return -1;
        return node.height;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void insert(int value){
        root = insert(value, root);
    }
    private Node insert(int value, Node node){
        if(node == null){
            node = new Node(value);
            return node;
        }

        if(value < node.value){
            node.left = insert(value, node.left);
        }

        if(value > node.value){
            node.right = insert(value, node.right);
        }

        node.height = Math.max(height(node.left), height(node.right)) + 1;

        return node;
    }

    public void pupulate(int [] nums){
        for (int i = 0; i < nums.length; i++) {
            this.insert(nums[i]);
        }
    }

    public boolean balanced(){
        return balanced(root);
    }

    private boolean balanced(Node node){
        if(node == null) return true;

        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

    public void dispaly(){
        display(this.root, "Root: ");
    }

    private void display(Node node, String details){
        if(node == null) return;

        System.out.println(details + node.value);

        display(node.left, "Left child of "+ node.value +" is: ");
        display(node.right, "Right child of "+ node.value +" is: ");
    }

    public static void main(String[] args) {
        binarySearchTree tree = new binarySearchTree();

        int [] nums = {5, 9, 6, 7, 1, 3, 4, 10};

        tree.pupulate(nums);
        tree.dispaly();
    }


}
