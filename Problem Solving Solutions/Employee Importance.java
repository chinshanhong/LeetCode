/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

class Solution {
    private int res = 0;
    public int getImportance(List<Employee> employees, int id) {
        for(int i = 0; i < employees.size(); i++){
            if(employees.get(i).id == id){
                ArrayList<Integer> visited = new ArrayList<>();
                dfs(employees, employees.get(i).subordinates, visited, employees.get(i).id);
            }
        }
        return res;
    }
    public void dfs(List<Employee> employees, List<Integer> subordinates, ArrayList<Integer> visited, int id){
        if(visited.contains(id)) return;
        visited.add(id);
        res += Helper(employees, id);
        for(int i = 0; i < employees.get(getIndex(employees, id)).subordinates.size(); i++){
            dfs(employees, employees.get(i).subordinates, visited, employees.get(i).id);
        }
    }
    
    public int Helper(List<Employee> employees, int id){
        for(int i = 0; i < employees.size(); i++){
            if(employees.get(i).id == id){
                return employees.get(i).importance;
            }
        }
        return 0;
    }
    public int getIndex(List<Employee> employees, int id){
        for(int i = 0; i < employees.size(); i++){
            if(employees.get(i).id == id){
                return i;
            }
        }
        return 0;
    }
}
