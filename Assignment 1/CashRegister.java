import java.util.*;



public class CashRegister{
    public static void main(String[] cmdLn){
        Scanner s = new Scanner(System.in);
        
        
        System.out.print("Hur mycket har du handlat för?: ");
        int cost = s.nextInt();
        System.out.print("Hur mycket ska du betala?: ");
        int pay = s.nextInt();
        int rest = pay - cost;
        int hundreds = rest/100;
        int rest2 = rest-hundreds*100; // eller rest%100
        int fifty = rest2/50;
        int rest3 = rest2-fifty*50;// eller rest2%50
        int twenty = rest3/20;
        int rest4 = rest3-twenty*20; // eller rest3%20
        int ten = rest4/10;
        int rest5 = rest4-ten*10; //eller rest4%10
        int one = rest5/1;
        System.out.println(hundreds + " hundralappar " + fifty + " femtiolappar " + twenty + " tjugolappar " + ten + " tior " + one + " enkronor ");
        
        
    }
    
}
