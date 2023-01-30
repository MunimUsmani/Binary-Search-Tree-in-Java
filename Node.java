class Node {
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        this.left=null;
        this.right=null;

        class BinarySearchTree {
            Node root;

            BinarySearchTree() {
                root = null;
            }

            Node insert(Node root, int value) {
                if (root == null) {
                    root = new Node(value);
                    return root;
                } else {
                    if (root.data > value) {
                        root.left = insert(root.left, value);
                        return root;
                    } else {
                        root.right = insert(root.right, value);
                    }
                }
                return root;
            }

            Node search(Node root, int search_value) {
                if (root == null) {
                    System.out.println(" not found");
                    return root;
                } else if (search_value == root.data) {
                    System.out.println("elements found ");
                    return root;
                } else {
                    if (search_value < root.data) {

                        return search(root.left, search_value);
                    }
                    return search(root.right, search_value);
                }

            }

            void inorder(Node root) {
                if (root == null) {
                    return;
                }
                inorder(root.left);
                System.out.println(root.data);
                inorder(root.right);
            }

            void preorder(Node root) {
                if (root == null) {
                    return;
                }
                System.out.println(root.data);
                preorder(root.left);
                preorder(root.right);
            }

            void postorder(Node root) {
                if (root == null) {
                    return;
                }
                System.out.println(root.data);
                postorder(root.left);
                postorder(root.right);
            }

            public static void main(String[] args) {
                BinarySearchTree tree = new BinarySearchTree();
                tree.root = new Node(5);
                tree.insert(tree.root, 4);
                tree.insert(tree.root, 6);
                tree.insert(tree.root, 3);
                tree.insert(tree.root, 2);
                tree.insert(tree.root, 1);
                tree.search(tree.root, 5);
//        System.out.println( tree.search(tree.root,3));
                tree.inorder(tree.root);


            }

        }}}