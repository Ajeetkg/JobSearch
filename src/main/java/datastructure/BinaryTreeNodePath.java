package datastructure;

/**
 * Root to leaf path sum equal to a given number
 Given a binary tree and a number, return true if the tree has a root-to-leaf path such that adding up all the values along the path equals the given number. Return false if no such path can be found.



 For example, in the above tree root to leaf paths exist with following sums.

 21 –> 10 – 8 – 3
 23 –> 10 – 8 – 5
 14 –> 10 – 2 – 2

 So the returned value should be true only for numbers 21, 23 and 14. For any other number, returned value should be false.
 */

public class BinaryTreeNodePath {

    private static class Node<T>{
        T element;
        Node<T> left, right;

        Node(T value){
            this.element = value;
            left = null;
            right = null;

        }

    }

    public static void main(String[] args){

    }

    public boolean isNodeToLeafSumMatch(Node<Integer> node, Integer sum ){

        return false;

    }
}
