/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thegame.view;

/**
 *
 * @author Rayshorn Richardson
 */
public class AfterShopMenuView extends View{
    
    public AfterShopMenuView(){
        super("What would you like to do?\n" + "S - Return to Shop Menu\n"
                + "I - Enter Inventory\n");
    }
    
    @Override
    public boolean doAction(String value) {
        char choice = Character.toUpperCase(value.charAt(0));
        
        switch(choice){
            case 'I':
                System.out.println("You are entering the Inventory");
                break;
            case 'S':
                System.out.println("You are entering the Shop Menu");
                shopMenu();
                break;
            default:
                System.out.println("You don't know what you want to do");
                afterShopMenu();
                break;
        }
        return true;
    }
    
    public void shopMenu(){
        ShopMenuView shopMenuView = new ShopMenuView();
        shopMenuView.display();
    }
    
    public void afterShopMenu(){
        AfterShopMenuView afterShopMenuView = new AfterShopMenuView();
        afterShopMenuView.display();
    }
    
}
