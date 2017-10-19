import java.util.Scanner;
import java.util.Stack;

/**
 * running pass
 * <p>
 * test pass
 * <p>
 * create at 2017/10/18
 *
 * @shawz
 */
public class TreeTraversalsAgain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Stack<Node> stack = new Stack<>();
        Stack<Integer> integerStack = new Stack<>();
        //第一个点
        sc.next();//过滤push
        int focus = sc.nextInt();
        Node pre = new Node(focus);
        stack.push(pre);
        Node head = pre;
        //

        for (int i = 0; i < N * 2 - 1; i++) {
            if (sc.next().equals("Push")) {
                Node n = new Node(sc.nextInt());
                stack.push(n);
                if (pre.nextLeft == null) {
                    pre.setNextLeft(n);
                } else {
                    pre.setNextRight(n);
                }
                pre = n;
            } else {
                pre = stack.pop();
            }

        }

        postPrintTree(head, head.hashCode());


    }
    //题目说最后不能有空格，所以要传一个rootid

    static void postPrintTree(Node head, int rootid) {

        if (head == null)
            return;
        if (head.nextLeft == null && head.nextRight == null) {
            System.out.print(head.val + " ");
            return;
        }        // 递归打印左子树
        if (head.nextLeft != null) {
            postPrintTree(head.nextLeft, rootid);
        }        // 递归打印右子树
        if (head.nextRight != null) {
            postPrintTree(head.nextRight, rootid);
        }                 // 打印父节点
        if (head.hashCode() == rootid) {
            System.out.print(head.val);
            System.exit(0);
        }
        System.out.print(head.val+" ");

    }


    static class Node {
        int val;
        Node nextLeft;
        Node nextRight;

        public Node(int val) {
            this.val = val;
        }

        public void setNextLeft(Node nextLeft) {
            this.nextLeft = nextLeft;
        }

        public void setNextRight(Node nextRight) {
            this.nextRight = nextRight;
        }
    }
}
