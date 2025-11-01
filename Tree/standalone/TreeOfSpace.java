package Tree.standalone;

// Locking the tree of space

// You have a world map represented as an M-Ary tree (sample tree below)

// Ref

// You need to define three operations on it

//     lock(X, uid)

//     unlock(x, uid)

//     upgradeLock(x, uid)

// where X the name of a node in the tree (that would be unique) and uid is the user who is performing the operation.

// Here are the definitions for the Operations:

// Lock(x, uid)

// Lock takes an exclusive access on the subtree rooted at X. It is formally defined like this: Once lock(x, uid) succeeds, then:

//     lock(A, anyUserid) should fail (returns false), where A is a descendent of X,
//     lock(B, anyUserld) should fail (returns false), where X is a descendent of B
//     Lock operation cannot be performed on a node which is already locked i.e. lock(x, anyUserld) should fail (returns false).

// Unlock(X, uid)

//     Unlock reverts what was done by the lock operation. It can only be called on same node on which user uid had called a Lock on before. Returns true if it is successful.

// UpgradeLock(x, uid)

//     It helps the user uid upgrade their lock to an ancestor node. It is only possible if the node X already has locked descendants and all of them are only locked by the same user uid. Upgrade should fail if there is any node which is descendant of X that is locked by a different user. Successful Upgrade will 'lock' the node. UpgradeLock call shouldn't violate the consistency model that Lock/Unlock function requires.

// Notes

// 1) The number of nodes in the tree N is very large. So, optimize the time complexity for the above algorithms

// 2) The below section contains the input format.

//     The first line contains the number of Nodes in the tree (N).
//     The second line contains number of children per node (value m in m-ary Tree).
//     The third line contains number of queries (Q).
//     Next N lines contains the NodeName (string) in the m-Ary Tree.
//     Next Q lines contains queries which are in format: Operation Type NodeName Userld

//     Operation Type -

//     1 for Lock 

//     2 for unlock 

//     3 for upgradeLock 

//     NodeName - Name of any node (unique) in m-Ary Tree.
//     Userld - Integer value representing a unique user.

// Example input:

// 7

// 2

// 3

// World

// Asia

// Africa

// China

// India

// South Africa

// Egypt

// 1 China 9

// 2 India 9

// 3 Asia 9

// With the above input you represents a 2-ary tree with 7 nodes as follows:

//                                                         World 
//                                                    /              \
//                                               Asia                 Africa 
//                                            /      \                 /      \
//                                        China    India          South Africa   Egypt 

// Additional Notes:

// 1) Here '1 China 3' indicates the following 'Operation Type NodeName Userld'

// 2) The tree is always fully balanced

// 3) Constraints on the inputs are as follows

// 1 < N < 5 * 10^5

// 1 < m < 30

// 1 < Q <5 * 10^5

// 1 < length of NodeName < 20

// 4) Optimize the time complexity

//     Lock - O(logmN)
//     Unlock - O(logmN)

//     UpgradeLock - O(numberOfLockedNodes * logmN)

//     5) Lock operation on already locked node should fail.

// 6) Once Upgrade Lock(X,uid) succeeds on X. It is equivalent to X being locked by uid. So, Lock(A/B, anyuser) should fail as per the definition of Lock and Unlock(x, uid) should also work.

// 7) Upgrade lock operation on a node having no locked descendants should fail and upgrade lock on already locked node should also fail.





import java .util.*;
import java.util.Map;
import java.util.HashMap;
import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;

public class TreeOfSpace {
    public static class Node{
        String name;
        boolean isLocked;
        Node parent;
        int anc_locked;
        int des_locked;
        int id;
        ArrayList<Node> child = new ArrayList<>();
        Node(String name, Node parent){
            this.name = name;
            this.parent=parent;
        }

        public static void main(String args[]){

            System.out.println("Enter the number of nodes in the tree");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            String nodes[] = new String[n];
            System.out.println("Enter the number of children of each node");
            int m  = sc.nextInt();
            for(int i = 0; i < n; i++){
                System.out.println("Enter the name of the node");
                nodes[i] = sc.next();
            }
            System.out.println("Enter the number of queries");
            int q = sc.nextInt();
            String queries[] = new String[q];
            for(int i = 0; i < q; i++){
                System.out.println("Enter the query");
                queries[i] = sc.next();
            }

            Map<String, Node> map = new HashMap<>();
            Node root = new Node("root", null);
            map.put("root", root);

            Queue<Node> queue = new LinkedList<Node>();
            queue.add(root);
            int i = 0;
            while(!queue.isEmpty() && i < n){
                int size  = queue.size();
                while (size-- > 0){
                    Node node = queue.poll();
                    for(int j = 0; j < m; j++){
                        Node child = new Node(nodes[i], node);
                        node.child.add(child);
                        map.put(nodes[i], child);
                        queue.add(child);
                        i++;
                    }
                    
                }

            }

            boolean ans = false;
            for(String query : queries){
                String arr[] = query.split(" ");
                if(arr[0].equals("1")){
                    ans = lock(map.get(arr[1]),Integer.parseInt(arr[2]));
                }
                if(arr[0].equals("2")){
                    ans = unlock(map.get(arr[1]),Integer.parseInt(arr[2]));
                }
                if(arr[0].equals("3")){
                    ans = upgrade(map.get(arr[1]),Integer.parseInt(arr[2]));   
                }
                System.out.println(ans);
            }

            sc.close();

            

        }

        public static boolean lock(Node node, int id){
            if(node.isLocked) return false;
            if(node.anc_locked > 0 && node.des_locked > 0) return false;
            Node curr = node.parent;
            while(curr != null){
                curr.anc_locked++;
                curr = curr.parent;
            }
            informDescendent(node,1);
            node.isLocked = true;
            node.id = id;
            return true;
        }

        public static boolean unlock(Node node, int id){
            if(!node.isLocked) return false;
            if(node.id != id) return false;
            Node curr = node.parent;
            while(curr != null){
                curr.anc_locked--;
                curr = curr.parent;
            }
            informDescendent(node,-1);
            node.isLocked = false;
            node.id = 0;
            return true;
        }

        public static void informDescendent(Node node, int val){
            if( node == null) return;
            for(Node child : node.child){
                child.des_locked += val;
                informDescendent(child,val);
            }
        }

        public static boolean upgrade(Node node, int id){
            if(node.isLocked || node.anc_locked > 0 || node.des_locked == 0) return false;
            ArrayList<Node> child = new ArrayList<>();
            boolean res = getAllChild(node,child,id);
            if(res!=true) return false;
            informDescendent(node, 1);
            for(Node n : child){
                unlock(n, id);
            }
            node.isLocked = true;
            node.id = id;
            return true;

        }

        public static boolean getAllChild(Node node, ArrayList<Node> child, int id){
            if(node == null) return true;
            if(node.isLocked){
                if(node.id != id) return false;
                else child.add(node);
            }
            if(node.des_locked == 0) return false;
            child.add(node);
            for(Node n : node.child){
                if(!getAllChild(n,child,id)) return false;
            }
            return true;
        }

    }
}
