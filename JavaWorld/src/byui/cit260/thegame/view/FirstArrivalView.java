/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.thegame.view;

/**
 *
 * @author Erik Rybalkin
 */
public class FirstArrivalView extends View{
    
    
        public FirstArrivalView(){
     super("You have arrived. Welcome to Java World.\n" +
                      "1.Exit train and try to find help\n" +
                      "2.Exit train and find the Guru\n" +
                      "3.Check the Map\n"
                        + "4. Visit Store");
    }

     @Override
    public boolean doAction(String value) {
           char choice = Character.toUpperCase(value.charAt(0));
            switch (choice) {
                case '1':
                   
                    break;
                case '2':
                   CustomsView customsView = new CustomsView();
                   customsView.display();
                    break;
                case '3':
                    NoMapView noMapView = new NoMapView();
                    noMapView.display();
                    break;
                case '4':
                    ShopMenuView shopMenuView = new ShopMenuView();
                    shopMenuView.display();
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        return false;
    }

}


