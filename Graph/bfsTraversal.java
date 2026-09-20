// BFS Traversal in Undirected Graph
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class bfsTraversal{
    public static List<Integer> BFS(List<List<Integer>> adj){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        boolean[] visited = new boolean[adj.size()];
        visited[0] = true;
        List<Integer> ans = new ArrayList<>();
        while(!queue.isEmpty()){
            int node = queue.poll();
            ans.add(node);
            for(int nei : adj.get(node)){
                if(!visited[nei]){
                    queue.add(nei);
                    visited[nei] = true;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args){
        List<List<Integer>> adj = new ArrayList<>();
        adj.add(List.of(2,1,3));
        adj.add(List.of(0));
        adj.add(List.of(0,4));
        adj.add(List.of(0));
        adj.add(List.of(2));
        List<Integer> result = BFS(adj);
        System.out.println(result);
    }
}
