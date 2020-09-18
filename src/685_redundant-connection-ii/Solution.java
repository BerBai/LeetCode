import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

class Solution {
    int[][] edges;
    Map<Integer, Set<Integer>> map;

    public int[] findRedundantDirectedConnection(int[][] edges) {
        this.edges = edges;
        map = new HashMap<>();   // key is node, values are its descendants
        for (int[] edge : edges) {
            if (map.containsKey(edge[0]))
                map.get(edge[0]).add(edge[1]);
            else {
                Set<Integer> set = new HashSet<>();
                set.add(edge[1]);
                map.put(edge[0], set);
            }
        }

        Map<Integer, Set<Integer>> map2 = new HashMap<>();   // key is node, values are its ancestors
        for (int[] edge : edges) {
            if (map2.containsKey(edge[1]))
                map2.get(edge[1]).add(edge[0]);
            else {
                Set<Integer> set = new HashSet<>();
                set.add(edge[0]);
                map2.put(edge[1], set);
            }
        }

        Integer invalid_node = 0;
        Set<Integer> ancestors = new HashSet<>();
        for (Integer i : map2.keySet()) {
            if (map2.get(i).size() > 1) {
                invalid_node = i;
                ancestors = map2.get(i);
                break;
            }
        }

        int[] res = {};
        boolean last_result = true;

        for (int i = edges.length - 1; i >= 0; i--) {
            boolean loop = check(edges[i]);
            if ((ancestors.contains(edges[i][0]) & edges[i][1] == invalid_node)) {
                if (loop | invalid_node == 0)
                    return edges[i];
                else if (last_result) {
                    res = edges[i];
                    last_result = false;
                }
            }
            if (invalid_node == 0 & loop)
                return edges[i];
        }
        return res;
    }

    private boolean check(int[] edge) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        queue.offer(edge[1]);
        while (!queue.isEmpty()) {
            int num = queue.poll();
            if (num == edge[0])
                return true;
            visited.add(num);
            if (map.containsKey(num)) {
                for (int i : map.get(num))
                    if (!visited.contains(i))
                        queue.offer(i);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] nums = {
            {1, 2},
            {1, 3},
            {2, 3},
        };
        Solution s = new Solution();
        int[] ans = s.findRedundantDirectedConnection(nums);
        for(int item : ans) {
            System.out.print(item + " ");
        }
    }
}
