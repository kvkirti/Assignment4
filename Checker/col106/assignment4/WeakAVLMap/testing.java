import java.util.Vector;
public class testing{
    public static void main(String[] args){
        WeakAVLMap tree = new WeakAVLMap();
        tree.put(1,1);
        tree.put(2,1);
        tree.put(3,1);
        tree.put(4,2);
        // System.out.println("hey");
        tree.remove(1);
        Vector v=tree.BFS();
        for(int i=0;i<v.size();i++){
            System.out.println(v.get(i));
        }


        // tree.put(30886,92777);
        // tree.put(47793,38335);
        // tree.put(60492,16649);
        // tree.put(2362,90027);
        // tree.put(20059,97763);
        // tree.put(89172,55736);  
        // tree.remove(89172);
        // tree.put(33069,98167);
        // tree.remove(47793);
        // tree.remove(84421);
        // tree.remove(2362);
        // tree.put(30886,59956);
        // tree.remove(30886);
        // tree.remove(33069);
        // tree.put(99932,95060);
        // tree.put(10012,36226);
        // tree.put(26652,60756);
        // tree.put(9441,53865); 
        // tree.remove(8117);
        // tree.put(26652,79497);
        // tree.put(55306,64683);
        // tree.put(26652,48829);
        // tree.put(10012,63368);
        // tree.remove(55306);
        // tree.put(92379,97488);
        // tree.remove(9441);
        // tree.remove(60492);
        // tree.put(53275,75407);
        // tree.remove(31011);
        // tree.put(22404,64443);
        // tree.remove(97369);
        // tree.remove(22404);
        // tree.remove(53275);
        // tree.remove(6725);
        // tree.remove(26652);
        // tree.put(38082,8542);
        // tree.remove(10012);
        // tree.remove(38082);
        // tree.put(86708,73416);
        // tree.put(90071,973);
        // tree.remove(20059);
        // tree.put(11340,22090);
        // tree.remove(92379);
        // tree.put(75321,1255);
        // tree.put(11340,73940);
        // tree.remove(86708);
        // tree.put(96658,63920);
        // tree.remove(99932);
        // tree.put(41222,39299);
        // tree.remove(75321);
        // tree.remove(88819);
        // tree.put(11340,85273);
        // tree.put(21860,48142);
        // tree.put(23205,67621);
        // tree.remove(11340);
        // tree.put(2021,22842);
        // tree.remove(8872);
        // tree.put(21648,72890);
        // tree.put(90071,90368);
        // tree.put(73788,49797);
        // tree.remove(23205);
        // // tree.remove(73788);
        // // tree.put(9188,49157);
        // // tree.put(53414,43921);
        // // tree.put(7556,8902);


        // Vector v=tree.BFS();
        // for(int i=0;i<v.size();i++){
        //     System.out.println(v.get(i));
        // }
        // tree.printRank(41222);
        // tree.printRank(21860);
        // tree.printRank(90071);
        // // tree.printRank(9188);
        // // tree.printRank(53414);
        // tree.printRank(96658);
        // tree.printRank(2021);
        // tree.printRank(21648);
        // // tree.printRank(23205);
        // tree.printRank(73788);
        // // tree.printRank(60492);
        // // tree.printRank(99932);
        // // tree.printRank(26652);
        // // tree.printRank(9441);
        // // 
        
    }
}