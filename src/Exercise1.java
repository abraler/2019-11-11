import java.util.*;

class Node{
    int val;
    Node Lchild;
    Node Rchild;

    public Node(int val) {
        this.val = val;
        this.Lchild=null;
        this.Rchild=null;
    }
}
public class Exercise1 {

    public static void main(String[] args) {
        Node root=new Node(0);
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        root.Lchild=a;
        root.Rchild=b;
        a.Rchild=d;
        a.Lchild=c;

        //proList(root);
        houList(root);
        houList1(root);
    }
    //二叉树的先序遍历（递归）
    private static void proList(Node head){
        if(head==null){
            return ;
        }
        System.out.println(head.val);
        proList(head.Lchild);
        proList(head.Rchild);
    }
    //二叉树的中序遍历（递归）
    private static void ordList(Node head){
        if(head==null){
            return ;
        }
        ordList(head.Lchild);
        System.out.println(head.val);
        ordList(head.Rchild);
    }
    //二叉树后序遍历(递归)
    private static void houList(Node head){
        if(head==null){
            return;
        }
        houList(head.Lchild);
        houList(head.Rchild);
        System.out.println(head.val);
    }
    private static void proList1(Node head){
        Stack <Node>a=new Stack<>();
        if(head==null){
            return;
        }
        a.push(head);
        while(!a.isEmpty()){
            Node p=a.pop();
            System.out.println(p.val);
            if(p.Rchild!=null){
                a.push(p.Rchild);
            }
            if(p.Lchild!=null){
                a.push(p.Lchild);
            }
        }

    }
    private static void ordList1(Node head){
        Stack<Node>stack=new Stack<>();
        if(head==null){
            return;
        }
        Node t=head;
        while(t!=null||!stack.isEmpty()){
            if(t!=null){
                stack.push(t);
                t=t.Lchild;
            }else{
                t= stack.pop();
                System.out.println(t.val);
                t=t.Rchild;
            }
        }

    }
    /*private static void houList1(Node head){
        Stack<Node>a=new Stack<>();
        if(head==null){
            return;
        }
        Node p=head;
        while(p!=null||!a.isEmpty()){
            if(p!=null){
                a.push(p);
                p=p.Lchild;
            }else{
                Node q=a.peek();
                if()
            }

        }
    }*/
    private static void houList1(Node head){
        List<Node>list=new ArrayList<>();

        Stack <Node>a=new Stack<>();
        if(head==null){
            return;
        }
        a.push(head);
        while(!a.isEmpty()){
            Node p=a.pop();
            list.add(p);
            if(p.Lchild!=null){
                a.push(p.Lchild);
            }
            if(p.Rchild!=null){
                a.push(p.Rchild);
            }

        }
        Collections.reverse(list);
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i).val);
        }

    }
}

