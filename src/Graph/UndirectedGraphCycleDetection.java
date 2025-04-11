package Graph;

import java.util.ArrayList;
import java.util.Arrays;

public class UndirectedGraphCycleDetection {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        adj.add(new ArrayList<>(Arrays.asList(1, 3)));
        adj.add(new ArrayList<>(Arrays.asList(0,2)));
        adj.add(new ArrayList<>(Arrays.asList(3,1)));
        adj.add(new ArrayList<>(Arrays.asList(0,2,4)));
        adj.add(new ArrayList<>(Arrays.asList(3,5,6)));
        adj.add(new ArrayList<>(Arrays.asList(4,6)));
        adj.add(new ArrayList<>(Arrays.asList(5,4)));
        System.out.println(isCycle(adj.size(),adj));


    }
    public static boolean isCycle(int V,ArrayList<ArrayList<Integer>> adj){
        boolean vis[]=new boolean[V];
        for(int i=0;i<V;i++){
            if(!vis[i]){
                if(dfs(i,adj,vis,-1)) return true;
            }
        }
        return false;

    }
    public static boolean dfs(int V,ArrayList<ArrayList<Integer>> adj,boolean vis[],int parent){
        vis[V]=true;
        for(int neighbor:adj.get(V)){
            if(!vis[neighbor]){
                if(dfs(neighbor,adj,vis,parent)) return true;
                else if (parent!=neighbor) {
                    return true;
                }

            }
        }
        return false;
    }
}
