package algorithms.searching;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Queue;

public class Tree<T> {
    T value;
    List<Tree<T>> children;

    private Tree(T value) {
        this.value = value;
        this.children = new ArrayList<>();
    }

    public static <T> Tree<T> of(T value) {
        return new Tree<>(value);
    }

    public Tree<T> addChild(T value) {
        Tree<T> newChild = new Tree<>(value);
        children.add(newChild);
        return newChild;
    }

    private static <T> Optional<Tree<T>> BFS(T value, Tree<T> root) {
        // create a queue
        Queue<Tree<T>> queue = new ArrayDeque<>();
        // add the root
        queue.add(root);
        // until the end of the queue
        while(!queue.isEmpty()) {
            // pop the node from the queue
            Tree<T> currentNode = queue.remove();
            System.out.println("is " + currentNode.value + " == " + value + "?");
            if (currentNode.value.equals(value)) {
                System.out.println("yes");
                return Optional.of(currentNode);
            } else {
                System.out.println("no");
                // add its children to the queue
                queue.addAll(currentNode.children);
            }
        }
        // if we got this far we didn't find anything
        return Optional.empty();
    }

    public static void main(String[] args) {
        Tree<Integer> root = Tree.of(10);
        Tree<Integer> rootFirstChild = root.addChild(2);
        Tree<Integer> depthMostChild = rootFirstChild.addChild(3);
        Tree<Integer> rootSecondChild = root.addChild(4);

        BFS(4, root);
    }
}