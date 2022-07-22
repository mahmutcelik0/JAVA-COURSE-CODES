package LISTANDARRAYLIST;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<>();

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void addGroceryItem(String itemToAdd){
        groceryList.add(itemToAdd);
    }

    public void printGroceryList(){
        System.out.println("YOU HAVE "+ groceryList.size()+" ELEMENTS IN LIST");
        for (int a = 0 ; a < groceryList.size() ; a++){
            System.out.println("YOUR "+(a+1)+". ELEMENT IN LIST IS: "+ groceryList.get(a));
        }
    }

    public void modifyGroceryItem(String newElement){
        int position = findWithIndex(newElement);
        if(position >= 0) modifyGroceryItem(position,newElement);
    }
    private void modifyGroceryItem(int position, String newElement){
        groceryList.set(position,newElement);
        System.out.println("GROCERY ITEM "+ (position+1)+ " HAS BEEN MODIFIED");
    }

    public void removeItem(String elementToRemove){
        int index = findWithIndex(elementToRemove);
        if(index >= 0 ) removeItem(index);
    }
    private void removeItem(int position){
        groceryList.remove(position);
    }

    public String find(String groceryItem){
        return (groceryList.contains(groceryItem) ? "FOUND": "NOT FOUND");
    }

    public boolean findWBoolean(String groceryItem){
        return (groceryList.contains(groceryItem));
    }


    public int findWithIndex(String groceryItem){
        return groceryList.indexOf(groceryItem);
    }
}
