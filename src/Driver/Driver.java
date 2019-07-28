package Driver;

import abstract_factory.*;

import java.util.Scanner;
import VM.*;


public class Driver {
	
	public static char select;
	
public static void main(String[] args) {
		
		while (select != 'Q'){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("CS586 Project Vending Machine\n");
		System.out.println("Press 1 for VM-1");
		System.out.println("Press 2 for VM-2");
		System.out.println("Press Q to quit from the program");
		System.out.println();
		System.out.println("Please make your selection:");
		select = sc.next().charAt(0);
		System.out.println();
		
		if (select == '1'){
		
		cf_vm1 cf1 = new cf_vm1();
		VM_1 vm1 = new VM_1(cf1);
		
		int p;
		int v;
		int n;
		float x;
		
		System.out.print("Vending Machine-1");
		System.out.print("\n");
		System.out.print("MENU of Operations");
		System.out.print("\n");
		System.out.print("0. create(int)");
		System.out.print("\n");
		System.out.print("1. coin(int)");
		System.out.print("\n");
		System.out.print("2. sugar()");
		System.out.print("\n");
		System.out.print("3. tea()");
		System.out.print("\n");
		System.out.print("4. chocolate()");
		System.out.print("\n");
		System.out.print("5. insert_cups(int)");
		System.out.print("\n");
		System.out.print("6. set_price(int)");
		System.out.print("\n");
		System.out.print("7. cancel()");
		System.out.print("\n");
		System.out.print("8. card(float");
		System.out.print("\n");
		System.out.print("9. Quit the program. Press Q");
		System.out.print("\n");
		System.out.print("Please make a note of these operations");
		System.out.print("\n");
		System.out.print("Vending Machine-1 Execution");
		System.out.print("\n");
		Character ch = new Character('1');
		
		
		while (ch != 'Q') {
			System.out.println("\nSelect Operation: ");
			System.out.println("0-create, 1-coin, 2-sugar, 3-tea, 4-chocolate, 5-insert_cups, "
					+ "6-set_price, 7-cancel, 8-card, Q-quit");
			
			ch = sc.next().charAt(0);
			
			switch(ch) 
			{
			case '0':  //create
				System.out.println("operation: create(int p)");
				System.out.println("Enter value of parameter p: ");
				p = sc.nextInt();
				vm1.create(p);
				break;
				
			case '1':  //coin
				System.out.println("Operation: coin(int v)");
				System.out.println("Enter value of parameter v: ");
				v = sc.nextInt();
				vm1.coin(v);
				break;
				
			case '2':  //sugar
			System.out.println("Operation: sugar()");
			vm1.sugar();
			break;
			
			case '3':  //tea
				System.out.println("Operation: tea()");
				vm1.tea();
				break;
				
			case '4':  //chocolate
				System.out.println("Operation: chocolate()");
				vm1.chocolate();
				break;
				
			case '5':  //insert_cups
				System.out.println("Operation: insert_cups(int n)");
				System.out.println("Enter value of parameter n: ");
				n = sc.nextInt();
				vm1.insert_cups(n);
				break;
				
			case '6':  //set_price
				System.out.println("Operation: set_price(int p)");
				System.out.println("Enter value of parameter p: ");
				p = sc.nextInt();
				vm1.set_price(p);
				break;
				
			case '7':  //cancel
				System.out.println("Operation: cancel()");
				vm1.cancel();
				break;
				
			case '8':  //card
				System.out.println("Operation: card(float)");
				System.out.println("Enter value of parameter x: ");
				x = sc.nextFloat();
				vm1.card(x);
				break;
				
			}//end switch
		}//end while
		}// end VM-1
		
		else if (select == '2'){
			
			cf_vm2 cf2 = new cf_vm2();
			VM_2 vm2 = new VM_2(cf2);
			
			float p;
			float v;
			int n;
			
			System.out.print("Vending Machine-2");
			System.out.print("\n");
			System.out.print("MENU of Operations");
			System.out.print("\n");
			System.out.print("0. CREATE(float)");
			System.out.print("\n");
			System.out.print("1. COIN(float)");
			System.out.print("\n");
			System.out.print("2. SUGAR()");
			System.out.print("\n");
			System.out.print("3. CREAM()");
			System.out.print("\n");
			System.out.print("4. COFFEE()");
			System.out.print("\n");
			System.out.print("5. insert_cups(int)");
			System.out.print("\n");
			System.out.print("6. set_price(int)");
			System.out.print("\n");
			System.out.print("7. CANCEL()");
			System.out.print("\n");
			System.out.print("8. Quit the program. Press Q");
			System.out.print("\n");
			System.out.print("Please make a note of these operations");
			System.out.print("\n");
			System.out.print("Vending Machine-2 Execution");
			System.out.print("\n");
			Character ch = new Character('1');
			
			
			while (ch != 'Q') {
				System.out.println("\nSelect Operation: ");
				System.out.println("0-CREATE, 1-COIN, 2-SUGAR, 3-CREAM, 4-COFFEE, 5-insert_cups, "
						+ "6-set_price, 7-cancel, Q-quit");
				
				ch = sc.next().charAt(0);
				
				switch(ch) 
				{
				case '0':  //CREATE
					System.out.println("operation: CREATE(float p)");
					System.out.println("Enter value of parameter p: ");
					p = sc.nextFloat();
					vm2.CREATE(p);
					break;
					
				case '1':  //COIN
					System.out.println("Operation: COIN(float v)");
					System.out.println("Enter value of parameter v: ");
					v = sc.nextFloat();
					vm2.COIN(v);
					break;
					
				case '2':  //SUGAR
				System.out.println("Operation: SUGAR()");
				vm2.SUGAR();
				break;
				
				case '3':  //CREAM
					System.out.println("Operation: CREAM()");
					vm2.CREAM();
					break;
					
				case '4':  //COFFEE
					System.out.println("Operation: COFFEE()");
					vm2.COFFEE();
					break;
					
				case '5':  // insertCups
					System.out.println("Operation: insertCups(int n)");
					System.out.println("Enter value of parameter n: ");
					n = sc.nextInt();
					vm2.insertCups(n);
					break;
					
				case '6':  //setPrice
					System.out.println("Operation: setPrice(float p)");
					System.out.println("Enter value of parameter p: ");
					p = sc.nextFloat();
					vm2.setPrice(p);
					break;
					
				case '7':  //CANCEL
					System.out.println("Operation: CANCEL()");
					vm2.CANCEL();
					break;
					
				}//end switch
			}//end while
		} // end VM_2
		} // end select
		
		System.out.println("\nThank you. Bye!");
	}
}
