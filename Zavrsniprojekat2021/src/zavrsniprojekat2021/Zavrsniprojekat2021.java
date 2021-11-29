package zavrsniprojekat2021;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Zavrsniprojekat2021 {

    public static void main(String[] args) throws InterruptedException, IOException {
        Scanner s = new Scanner(System.in);
        int a = JOptionPane.showConfirmDialog(null, "Da li zelite da naucite da pravite geometrijske oblike", null, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (JOptionPane.NO_OPTION == a) {
            JOptionPane.showMessageDialog(null, "Ova igrica nije za vas \n dodjite kada vas bude zanimalo \n kako se prave geometrijski oblici", null, JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        Thread.sleep(2000);
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("Prvi nivo");
        f.setSize(500, 400);
        f.setLocation(50, 20);
        f.setVisible(true);
        f.add(new Prvinivooblik());
        Thread.sleep(3000);
        f.dispose();

        Thread.sleep(2000);

        JFrame f1 = new JFrame();
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setTitle("Drugi nivo");
        f1.setSize(500, 400);
        f1.setLocation(850, 20);
        f1.setVisible(true);
        f1.add(new Druginivooblik());

        Thread.sleep(3000);
        f1.dispose();
        Thread.sleep(2000);

        JFrame f2 = new JFrame();
        f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f2.setTitle("Treci nivo");
        f2.setSize(500, 400);
        f2.setLocation(50, 400);
        f2.setVisible(true);

        Thread.sleep(3000);
        f2.dispose();
        Thread.sleep(2000);

        JFrame f3 = new JFrame();
        f3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f3.setTitle("Cetvrti nivo");
        f3.setSize(500, 400);
        f3.setLocation(850, 400);
        f3.setVisible(true);
        f3.add(new Trecinivooblik());

        Thread.sleep(3000);
        f3.dispose();
        Thread.sleep(2000);

        JFrame f4 = new JFrame();
        f4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f4.setTitle("Peti nivo");
        f4.setSize(500, 400);
        f4.setLocation(500, 250);
        f4.setVisible(true);
        f4.add(new Cetvrtinivooblik());

        Thread.sleep(3000);
        f4.dispose();
        
        System.out.println("Pripremite se, jer test pocinje za :");
        System.out.println("3");
        System.out.println(".\n.");
        Thread.sleep(1000);
        System.out.println("2");
        System.out.println(".\n.");
        Thread.sleep(1000);
        System.out.println("1");
        System.out.println(".\n.");
        Thread.sleep(1000);

        System.out.println("Na kom frejmu se nalazi trougao ?");
        int i=0;
       int b = s.nextInt();
        if(b==4){
            i++;
        }
        System.out.println("Na kom frejmu se nalazi prazan kvadrat ?");
       int c=s.nextInt();
        if(c==1){
            i++;
        }
        System.out.println("Na kom frejmu se nalazi elipsa ?");
       int d=s.nextInt();
        if(d==2){
            i++;
        }
        System.out.println("Na kom frejmu se nalazi pun kvadrat ?");
       int e=s.nextInt();
        if(e==5){
            i++;
        }
        if(i==0){ 
            System.out.println("Veoma ste lose naucili geometrijske oblike");
        }
        if(i==1){
            System.out.println("Dovoljno za polozen ispit, ali morate jos da naporno obradite ovu oblast ");
        FileWriter fw1 = new FileWriter("Geometrijski oblik.txt");
        fw1.write("Polozili ste, ali morate bolje da naucite geometrijske oblike");
        fw1.close();
        }
        if(i==2){
            System.out.println(" Okej je, ali moze to mnogo bolje ");
        FileWriter fw2 = new FileWriter("Geometrijski oblik2.txt");
        fw2.write("Niste losi u pravljenju geometrijskih oblika");
        fw2.close();
        }
        if(i==3){
            System.out.println("Vrlo dobri ste");
        FileWriter fw3 = new FileWriter("Geometrijski oblik3.txt");
        fw3.write("Veoma ste dobri u pravljenju geometrijskih oblika");
        fw3.close();
        }
        if(i==4){
            System.out.println("Odlicni ste");
        FileWriter fw = new FileWriter("Geometrijski oblik4.txt");
        fw.write("Vi ste majstor u pravljenju geometrijskih oblika");
        fw.close();
        }
        
    

    }
}
