import java.util.Scanner;
class bill_calculator{
    public static void main(String args[]){
        String item1="idly";
        String item2="dosa";
        String item3="vada";
        int price1=5;
        int price2=10;
        int price3=4;
        Scanner a=new Scanner(System.in);
        System.out.println("-----------------Menu----------------");
        System.out.println("1) Idly\n2) Dosa\n3) Vada");
        System.out.print("How much " + item1 + " you want mam/sir:");
        int quan1=a.nextInt();
        int p1=quan1*price1;
        System.out.println("Item 1 Total: $"+p1);
        System.out.print("How much "+ item2 + " you want mam/sir:");
        int quan2=a.nextInt();
        int p2=quan2*price2;
        System.out.println("Item 2 Total:$"+p2);
        System.out.print("How much "+ item3 + " you want mam/sir:");
        int quan3=a.nextInt();
        int p3=quan3*price3;
        System.out.println("Item 3 Total: $"+p3);
        int subtotal=p1+p2+p3;
        System.out.println("Subtotal: $"+subtotal+".00");
        double gst=0.18*subtotal;
        System.out.println("GST(18%): $"+gst);
        double tax=0.05*subtotal;
        System.out.println("Service Tax(5%): $"+tax);
        double total=subtotal+gst+tax;
        System.out.println("=================Final Bill==================\n$"+total);
    }
}