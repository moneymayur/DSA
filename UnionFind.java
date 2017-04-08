public class UnionFind{

public find(parent[] , i){  //Basic implementation where we see if the parent is marked to -1 return the id else, traverse to the value and return its parent
if(parent[i]  == -1)
  return i
else
   find(parent[],parent[i]);
}

public int union(parent[], i , j){// find the parent of the second argument and assign it to the 1st one
int xset = find(parent, i);
int yset = find(parent, j);

parent[xset] = yset;
}



}
