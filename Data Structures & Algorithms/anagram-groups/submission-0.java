class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        List<List<String>> list =new ArrayList<>();
        Map<String , List<String>> map = new HashMap<>();
        for(int i = 0; i < n ; i++){
            char[] temp = strs[i].toCharArray();
            Arrays.sort(temp);
            String key = new String(temp);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(strs[i]);
        }
        list.addAll(map.values());
        return list;
    }
}
