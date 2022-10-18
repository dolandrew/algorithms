package algorithms;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Queue;

public class BreadthFirstSearch<T> {
    T value;
    List<BreadthFirstSearch<T>> children;

    private BreadthFirstSearch(T value) {
        this.value = value;
        this.children = new ArrayList<>();
    }

    public static <T> BreadthFirstSearch<T> of(T value) {
        return new BreadthFirstSearch<>(value);
    }

    public BreadthFirstSearch<T> addChild(T value) {
        BreadthFirstSearch<T> newChild = new BreadthFirstSearch<>(value);
        children.add(newChild);
        return newChild;
    }

    private static <T> Optional<BreadthFirstSearch<T>> search(T value, BreadthFirstSearch<T> root) {
        // create a queue
        Queue<BreadthFirstSearch<T>> queue = new ArrayDeque<>();
        // add the root
        queue.add(root);
        // until the end of the queue
        while(!queue.isEmpty()) {
            // pop the node from the queue
            BreadthFirstSearch<T> currentNode = queue.remove();
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
        BreadthFirstSearch<Integer> root = BreadthFirstSearch.of(10);
        BreadthFirstSearch<Integer> rootFirstChild = root.addChild(2);
        BreadthFirstSearch<Integer> depthMostChild = rootFirstChild.addChild(3);
        BreadthFirstSearch<Integer> rootSecondChild = root.addChild(4);

        search(4, root);
    }
}